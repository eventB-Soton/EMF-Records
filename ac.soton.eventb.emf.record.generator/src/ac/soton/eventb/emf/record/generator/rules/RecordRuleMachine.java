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
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variable;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
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
public class RecordRuleMachine extends AbstractRule implements IRule {
	protected static final EReference variables = MachinePackage.Literals.MACHINE__VARIABLES;
	protected static final EReference invariants = MachinePackage.Literals.MACHINE__INVARIANTS;
	
	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		//check we have a record in a machine and that it either inherits or refines
		// note that you cannot have a record in a machine that neither inherits nor refines another record
		if	(!(sourceElement instanceof Record)) return false;
		if	(((Record)sourceElement).getContaining(MachinePackage.Literals.MACHINE)==null) return false;
		if	(((Record)sourceElement).getInherits()==null && ((Record)sourceElement).getRefines()==null) return false;
		return true;	
	}
	
	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {	
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
	    Record 	record = (Record)sourceElement;
	    Machine machine = (Machine)record.getContaining(MachinePackage.Literals.MACHINE); 
	    
		//generate a variable and invariant for a new record that inherits (subsets) another
	    if (record.getInherits() instanceof Record) {
	    	Variable recordVariable = Make.variable(record.getName(), "generated for inheriting record");
	    	ret.add(Make.descriptor(machine, variables, recordVariable, 0));
	    	
	    	Invariant recordInvariant = Make.invariant(
	    			"inv_" + record.getName(), 
	    			false, 
	    			record.getName() + " \u2286 " + record.getInherits().getName(),
	    			"generated for inheriting record");
	    	ret.add(Make.descriptor(machine, invariants, recordInvariant, 0));
	    	
	    }else 
	    	//if it refines a record that is in a machine, we need to repeat the abstract variable (but no invariant is needed)
	    	if (record.getRefines() instanceof Record && 
	    		((Record)record.getRefines()).getContaining(CorePackage.Literals.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT) instanceof Machine)  
	    	 {
		    	Variable recordVariable = Make.variable(record.getName(), "generated for refined record");
		    	ret.add(Make.descriptor(machine, variables, recordVariable, 0));
	    	 }
		
		return ret;	
	}

}
