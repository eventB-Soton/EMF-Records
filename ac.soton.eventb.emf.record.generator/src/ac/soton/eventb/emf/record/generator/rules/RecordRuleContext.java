/*******************************************************************************
 * Copyright (c) 2020, 2022 University of Southampton.
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
package ac.soton.eventb.emf.record.generator.rules;

import java.util.ArrayList;
import java.util.List;

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
import ac.soton.eventb.emf.record.Record;

/**
 * <p>
 * Generate standard Event-B for a record that is in a context
 * </p>
 * 
 * @author asiehsalehi, cfs
 * 
 */
public class RecordRuleContext extends AbstractRule implements IRule {
	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;
	protected static final EReference sets = ContextPackage.Literals.CONTEXT__SETS;
	protected static final EReference constants = ContextPackage.Literals.CONTEXT__CONSTANTS;
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;
	
	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		//check we have a record in a context
		if(sourceElement instanceof Record & 
				((Record)sourceElement).getContaining(ContextPackage.Literals.CONTEXT)!=null)
			return true;	
		else
			return false;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

	    Record record = (Record) sourceElement;
	    Context context = (Context)record.getContaining(ContextPackage.Literals.CONTEXT); 		

	    if (!record.isExtended()){
		    if (record.getInheritsNames().size()==0) {
			    //generate a carrier set for a new record that does not inherit
		    	CarrierSet recordSet = (CarrierSet) Make.set(record.getName() , "generated for new record");
		    	ret.add(Make.descriptor(context, sets, recordSet, 0));
		    }else {
			    //generate a constant and axiom for a new record that inherits (i.e. is a subset of) another
		    	
		    	Constant recordConstant = (Constant) Make.constant(record.getName(), "generated for inheriting record");
		    	ret.add(Make.descriptor(context, constants, recordConstant, 0));
		    	
		    	Axiom recordAxiom = Make.axiom("typeof_"+record.getName(), false,
		    						record.getName() + " \u2286 " + record.getInheritsNames().get(0),
		    						"generated for inheriting record");
		    	ret.add(Make.descriptor(context, axioms, recordAxiom, 0));
		    }
	    }
	
		return ret;	
	}

}
