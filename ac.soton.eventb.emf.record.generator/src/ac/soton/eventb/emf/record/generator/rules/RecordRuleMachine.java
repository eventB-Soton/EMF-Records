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
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.record.Record;


/**
 * <p>
 * Generate standard Event-B for a record that is in a machine
 * </p>
 * 
 * @author asiehsalehi, cfs
 * 
 */
public class RecordRuleMachine extends AbstractEventBGeneratorRule implements IRule {
	
	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		//check we have a record in a machine and that it either inherits or refines
		if	(!(sourceElement instanceof Record)) return false;
		Record record = (Record)sourceElement;
		if (record.getContaining(MachinePackage.Literals.MACHINE)==null) return false;
		if (record.getInheritsNames()==null && !(record.isRefined())  && !record.isExtended()) return false;
		return true;
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {	
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
	    Record 	record = (Record)sourceElement;
	    Machine machine = (Machine)record.getContaining(MachinePackage.Literals.MACHINE); 
	    
    	//For all cases we need to generate a variable for the record instances.
	    //If the record refines or extends another record, we need to repeat the abstract variable (but no invariant is needed)
	    //If the record inherits we need a new variable with a ttype invariant
	    
    	Variable recordVariable = Make.variable(record.getName(), "generated for record");
    	ret.add(Make.descriptor(machine, orderedChildren, recordVariable, record, 0, sourceElement));
    
		if (record.getInheritsNames().size() >0 && !record.isExtended() && !record.isRefined()) {
			//if the new record inherits, generate an invariant to subset the inherited record 
			//(it should inherit in a machine, if not we leave it to cause a Rodin error)
	    	Invariant recordInvariant = Make.invariant(
	    			"typeof_" + record.getName(), 
	    			false, 
	    			record.getName() + " \u2286 " + record.getInheritsNames().get(0),
	    			"generated for inheriting record");
	    	ret.add(Make.descriptor(machine, orderedChildren, recordInvariant, record, 0, sourceElement));
	    } 
		return ret;	
	}

}
