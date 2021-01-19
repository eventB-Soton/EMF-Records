/*******************************************************************************
 * Copyright (c) 2020, 2021 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package ac.soton.eventb.records.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;


/**
 * <p>
 * Implementation of {@link AbstractRule} for translating record into invariant
 * </p>
 * 
 * @author asiehsalehi
 * @version 0.1.1
 * @see TranslationDescriptor
 * @since 0.1.0
 */
public class RecordRuleMachine extends AbstractRule implements IRule {
	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;
	
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
		ArrayList <Invariant> invList = new ArrayList<Invariant>();
		ArrayList <Variable> varList = new ArrayList<Variable>();
	    Machine sourceMachine = (Machine)sourceElement.eContainer(); 
		
	    Record r = (Record) sourceElement;
	    String recordName = r.getName();
	    
	    //var for record
	    if (r.getSubsets()!=null && r.getSubsets().getName()!=r.getName()) {
	    	String recordVarCmt = "record translation variable";
	    	Variable recordVar = Make.variable(recordName, recordVarCmt);
	    	varList.add(recordVar);
	    }
	    
	    //vars for fields
	    EList<Field> fields = r.getFields();
	    
	    for (Field f : fields) {
	    	String varName = f.getName();
	 	    String varCmt = "record field translation variable";
	 	   Variable var = Make.variable(varName, varCmt);
		    varList.add(var);
	    }
	    sourceMachine.getVariables().addAll(varList);
	   
	    //inv for record
	    if (r.getSubsets()!=null) {
	    	if (r.getSubsets().getName()!=r.getName()) {
	    	String recordInvName = "inv_" + r.getName();
	    	String recordInvPred = "";
	    //if (r.getSubsets() != null) 
	    	recordInvPred = r.getName() + " \u2286 " + r.getSubsets().getName();
	    //set for not extending record
	    //else {
	    	//String setName = recordName + "_SET";
	    	//CarrierSet recordSet = (CarrierSet) Make.set(setName , "record translation set");
	    	//EList<CarrierSet> sets = sourceMachine.getSees().get(0).getSets();
	    	//boolean setExist = false;
	    	//for (CarrierSet s : sets)
	    		//if (s.getName().equals(setName))
	    			//setExist = true;
	    	
	    	//if (!setExist)
	    		//sourceMachine.getSees().get(0).getSets().add(recordSet);
	    	
	    	//recordInvPred = r.getName() + " \u2286 " + setName;
	    //}
	    	String recordInvCmt = "record translation invariant";
	    	Invariant recordInv = Make.invariant(recordInvName, false, recordInvPred, recordInvCmt);
	    	invList.add(recordInv);
	    	}
		}
	    
	    //inv for each record field	    
	    for (Field f : fields) {
	    	String invName = "inv_"+ recordName + "_" + f.getName();
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
	    		
	 	    String invPred = f.getName() + " \u2208 " + recordName + type + f.getType();
	 	    String invCmt = "record field translation invariant";
	 	    Invariant inv = Make.invariant(invName, false, invPred, invCmt);
	 	    invList.add(inv);
	    }
		sourceMachine.getInvariants().addAll(invList);
		
		return ret;	
	}

	
	

}
