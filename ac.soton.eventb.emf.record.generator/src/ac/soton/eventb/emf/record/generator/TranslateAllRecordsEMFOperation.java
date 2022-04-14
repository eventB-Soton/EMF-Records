/*******************************************************************************
 * Copyright (c) 2022, 2022 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.record.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.transaction.Transaction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;

import ac.soton.emf.translator.TranslatorFactory;

/**
 * This command searches the given sourceElement for records that can be translated.
 * If any they are validated using the registered validator  and if ok, 
 * translated using the registered translator
 * 
 * following execution, a report can be retrieved using getReport()
 * 
 * @author cfs
 * @since 4.0
 *
 */
public class TranslateAllRecordsEMFOperation extends AbstractEMFOperation {
	
	final static String PLUGIN_ID = "ac.soton.eventb.emf.record.generator";
	final static String RECORD_GENERATOR_COMMAND_ID = "ac.soton.eventb.emf.record.generator.translateAllRecords"; //as in extension point for record translator
	
	final static String commandTitle = "Translate All Records";
	final static String ValidationFailedMessage = "Translation cancelled because validation failed with the following errors : \n";
	final static String CannotTranslateMessage = "Translation cancelled because there is no translator\n";

	List<EventBNamedCommentedComponentElement> generateList = new ArrayList<EventBNamedCommentedComponentElement>();
	TranslatorFactory factory;
	String report = null;

	public TranslateAllRecordsEMFOperation(TransactionalEditingDomain editingDomain, EventBElement sourceElement) {
		super(editingDomain, commandTitle, null);
		setOptions(Collections.singletonMap(Transaction.OPTION_UNPROTECTED, Boolean.TRUE));
		try {
			//get the translator factory
			factory = TranslatorFactory.getFactory();
			//get the Event-B component to be translated 
			final EventBNamedCommentedComponentElement root = (EventBNamedCommentedComponentElement) sourceElement.getContaining(CorePackage.Literals.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT);
			generateList.add(root);
			report = commandTitle+" in "+root.getName() ;
		} catch (CoreException e) {
			factory = null;
			generateList = null;
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean canExecute(){
		return factory != null && generateList != null && generateList.size()>0;
	}	
	
	@Override
	public boolean canRedo(){
		return false;
	}

	@Override
	public boolean canUndo(){
		return false;
	}
	
	@Override
	protected  IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		IStatus[] statusArray = new IStatus[generateList.size()];
		int i = 0;
		SubMonitor submonitor = SubMonitor.convert(monitor, "Translating All Records", 3*generateList.size());								
		for (EventBNamedCommentedComponentElement sourceComponent: generateList){
			String componentName = sourceComponent.getName();
			IStatus status;
			report = report +"\n"+sourceComponent.eClass().getName()+" :"+componentName+" - ";

			if (factory != null && factory.canTranslate(RECORD_GENERATOR_COMMAND_ID, sourceComponent.eClass())){
				submonitor.setTaskName("Validating "+sourceComponent.eClass().getName()+" : "+sourceComponent.getName());
				status = validate(sourceComponent, submonitor.newChild(1));
				if (status.isOK()){
					submonitor.setTaskName("Translating Records in : "+sourceComponent.getName());
					status = factory.translate(getEditingDomain(), sourceComponent, RECORD_GENERATOR_COMMAND_ID, submonitor.newChild(2));
				}
				submonitor.worked(2);

			}else{
				status = new Status(IStatus.CANCEL, PLUGIN_ID, CannotTranslateMessage );
			}
			report = report+status.getMessage();
			statusArray[i++]=status;
		}
		return new MultiStatus(PLUGIN_ID, 
				statusArray.length==0 ? IStatus.OK : IStatus.ERROR,
				statusArray, report, null) ;
	}

	/**
	 * validation of a particular diagram.
	 * called before translation
	 * 
	 * @param sourceElement
	 * @param monitor
	 * @return
	 * @throws ExecutionException
	 */
	protected IStatus validate(EventBElement sourceElement, IProgressMonitor monitor) throws ExecutionException {
		IStatus status;
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(sourceElement);
		if (diagnostic.getSeverity() == Diagnostic.ERROR || diagnostic.getSeverity() == Diagnostic.WARNING){
		// didn't validate so show feedback
			String errors = diagnostic.getMessage()+"\n";
		    for (Diagnostic ch : diagnostic.getChildren()){
		    	errors = errors+ch.getMessage()+"\n";
		    }
		    status = new Status(IStatus.INFO, PLUGIN_ID, ValidationFailedMessage+errors );
		}else{
		    status = Status.OK_STATUS;
		}
		monitor.done();
		return status;
	}

}