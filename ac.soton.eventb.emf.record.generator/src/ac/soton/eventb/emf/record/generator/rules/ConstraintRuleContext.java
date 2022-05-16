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
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.record.Constraint;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordPackage;

/**
 * <p>
 * Generate standard Event-B for a constraint of a record that is in a context
 * </p>
 * 
 * @author asiehsalehi, cfs
 *
 */
public class ConstraintRuleContext extends AbstractRule implements IRule {
	protected static final EReference axioms = ContextPackage.Literals.CONTEXT__AXIOMS;
	private static final String IDENTIFIER_SEPARATOR = "\\W+";

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();

	    Constraint constraint = (Constraint) sourceElement;
	    Record record = (Record) constraint.getContaining(RecordPackage.Literals.RECORD);
	    Context context = (Context)record.getContaining(ContextPackage.Literals.CONTEXT); 		
		
	    
    	Axiom recordAxiom = Make.axiom(
    			constraint.getName(), 
    			constraint.isTheorem(),
				quantify(constraint,record),
				"generated for record constraint");
    	ret.add(Make.descriptor(context, axioms, recordAxiom, 0));
	    
	    return ret;	
	}

	private String quantify(Constraint constraint, Record record) {
		for (String t : constraint.getPredicate().split(IDENTIFIER_SEPARATOR)) {
			if (t.equals(record.getSelfName())) {
				return "\u2200"+record.getSelfName()+"\u00b7"+record.getSelfName()+"\u2208"+record.getName()+" \u21d2 ("+constraint.getPredicate()+")";				
			}
		}
		return constraint.getPredicate();
	}
	
}
