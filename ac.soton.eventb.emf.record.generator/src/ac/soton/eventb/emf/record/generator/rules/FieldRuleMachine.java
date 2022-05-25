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
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordPackage;

/**
 * <p>
 * Generate standard Event-B for a field of a record that is in a machine
 * </p>
 * 
 * @author asiehsalehi, cfs
 *
 */
public class FieldRuleMachine extends AbstractFieldRule implements IRule {
	protected static final EReference variables = MachinePackage.Literals.MACHINE__VARIABLES;
	protected static final EReference invariants = MachinePackage.Literals.MACHINE__INVARIANTS;

	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		//check we have a Field in a record in a machine
		if(	sourceElement instanceof Field &
			((Field)sourceElement).getContaining(RecordPackage.Literals.RECORD)!=null &
			((Field)sourceElement).getContaining(MachinePackage.Literals.MACHINE)!=null)
			return true;	
		else
			return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		Field	field = (Field) sourceElement;
	    Record 	record = (Record) field.getContaining(RecordPackage.Literals.RECORD);
	    Machine machine = (Machine)record.getContaining(MachinePackage.Literals.MACHINE); 		
	
	    //generate a variable for the field
 	    Variable fieldVariable = (Variable) Make.variable(field.getName(), "generated for record field");
    	ret.add(Make.descriptor(machine, variables, fieldVariable, 0));
	   
    	//if the field's type is set, generate an invariant to declare the type of the variable representing the field
    	// (Note that a fields type may be left unset when it is a retained field in a refined class)
    	if (field.getType() != null && field.getType().trim().length()>0) { 
	 	    Invariant invariant = Make.invariant(
	 	    		"typeof_"+ record.getName() + "_" + field.getName(),
	 	    		false,
	 	    		field.getName() + " \u2208 " + record.getName() + getRelationSymbol(field) + field.getType(),
	 	    		"generated for record field"); 
	 	    ret.add(Make.descriptor(machine, invariants, invariant, 0));
    	}
	    
		return ret;		
	}

}
