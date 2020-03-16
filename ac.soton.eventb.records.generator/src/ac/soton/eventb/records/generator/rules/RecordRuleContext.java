/*******************************************************************************
 * Copyright (c) 2017 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.records.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context. CarrierSet;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.records.Field;
import ac.soton.eventb.records.Record;


/**
 * <p>
 * Implementation of {@link AbstractRule} for translating record into invariant
 * </p>
 * 
 * @author asiehsalehi
 * @version 0.1
 * @see TranslationDescriptor
 * @since 0.1.0
 */
public class RecordRuleContext extends AbstractRule implements IRule {
	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;
	
	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		if(sourceElement instanceof Record)
			return true;	
		else
			return false;
	}
	
	@Override
	public boolean dependenciesOK(EObject sourceElement, final List<TranslationDescriptor> translatedElements) throws Exception  {
		return true;
	}
	
	@Override
	public boolean fireLate() {
		return false;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		ArrayList <Constant> cnstList = new ArrayList<Constant>();
		ArrayList <Axiom> axmList = new ArrayList<Axiom>();
	    Context sourceContext = (Context)sourceElement.eContainer(); 
		
	    Record r = (Record) sourceElement;
	    String recordName = r.getName();
	    
	    //constants for record
	    if (r.getSubsets() != null) {
	    	if (r.getName()!=r.getSubsets().getName()) {
	    		String recordCnstCmt = "record translation constant";
	    		Constant recordCnst = (Constant) Make.constant(recordName, recordCnstCmt);
	    		cnstList.add(recordCnst);
	    	}
	    }
	    //set for not extending record
	    else {
	    	String setName = recordName;
	    	CarrierSet recordSet = (CarrierSet) Make.set(setName , "record translation set");
	    	sourceContext.getSets().add(recordSet);
	    }
	    
	    //constants for fields
	    EList<Field> fields = r.getFields();
	    
	    for (Field f : fields) {
	    	String cnstName = f.getName();
	 	    String cnstCmt = "record field translation constant";
	 	    Constant cnst = (Constant) Make.constant(cnstName, cnstCmt);
	 	    cnstList.add(cnst);
	    }
	    sourceContext.getConstants().addAll(cnstList);
	   
	    //axms for record
	    String recordAxmName = "axm_" + r.getName();
	    String recordAxmPred = "";
	    if (r.getSubsets() != null) {
	    		if (r.getName()!=r.getSubsets().getName())  {
	    	recordAxmPred = r.getName() + " \u2286 " + r.getSubsets().getName();
	    	String recordAxmCmt = "record translation axoim";
	    	Axiom recordAxm = Make.axiom(recordAxmName, false, recordAxmPred, recordAxmCmt);
	    	axmList.add(recordAxm);
	    		}
	    }
	    
	    //axm for each record field	    
	    for (Field f : fields) {
	    	String axmName = "axm_"+ recordName + "_" + f.getName();
	    	String multiplicity = f.getMultiplicity().getName();
	    	String type = "";
	    	if (multiplicity.equals("ONE"))
	    		type = " \u2192 ";
	    	else if (multiplicity.equals("MANY"))
	    		type = " \u2194 ";
	    	else if (multiplicity.equals("OPTIONAL"))
	    		type = " \u21f8 ";
	    	else 
	    		throw new Exception("record field multiplicity not defined");
	    		
	 	    String axmPred = f.getName() + " \u2208 " + recordName + type + f.getType();
	 	    String axmCmt = "record field translation axiom";
	 	    Axiom axm = Make.axiom(axmName, false,axmPred, axmCmt);
	 	    axmList.add(axm); 
	 	    ret.add(Make.descriptor(sourceContext, axioms, axm, 0));
	    }
	    //sourceContext.getAxioms().addAll(axmList);
	    
		// No need to find the project, using null will add it to the current project
	    //ret.add(Make.descriptor(null, components, sourceContext, 1));
	
		return ret;	
	}

	
	

}
