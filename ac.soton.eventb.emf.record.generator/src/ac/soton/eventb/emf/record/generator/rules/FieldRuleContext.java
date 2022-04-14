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
package ac.soton.eventb.emf.record.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.Constant;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordPackage;

/**
 * <p>
 * Generate standard Event-B for a field of a record that is in a context
 * </p>
 * 
 * @author asiehsalehi, cfs
 *
 */
public class FieldRuleContext extends AbstractFieldRule implements IRule {
	protected static final EReference sets = ContextPackage.Literals.CONTEXT__SETS;
	protected static final EReference constants = ContextPackage.Literals.CONTEXT__CONSTANTS;
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;

	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		//check we have a Field in a record in a context
		if(	sourceElement instanceof Field &
			((Field)sourceElement).getContaining(RecordPackage.Literals.RECORD)!=null &
			((Field)sourceElement).getContaining(ContextPackage.Literals.CONTEXT)!=null)
			return true;	
		else
			return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		Field	field = (Field) sourceElement;
	    Record 	record = (Record) (field).getContaining(RecordPackage.Literals.RECORD);
	    Context context = (Context)record.getContaining(ContextPackage.Literals.CONTEXT); 		
	
	    //generate a constant for the field
 	    Constant fieldConstant = (Constant) Make.constant(field.getName(), "generated for record field");
    	ret.add(Make.descriptor(context, constants, fieldConstant, 0));
	   
	    //generate an axiom to declare the type of the constant representing the field   
 	    Axiom axiom = Make.axiom(
 	    		"axm_"+ record.getName() + "_" + field.getName(),
 	    		false,
 	    		field.getName() + " \u2208 " + record.getName() + getRelationSymbol(field) + field.getType(),
 	    		"generated for record field"); 
 	    ret.add(Make.descriptor(context, axioms, axiom, 0));
	    
		return ret;		
	}
	
}
