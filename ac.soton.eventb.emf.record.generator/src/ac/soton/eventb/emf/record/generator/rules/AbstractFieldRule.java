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

import ac.soton.emf.translator.eventb.rules.AbstractEventBGeneratorRule;
import ac.soton.eventb.emf.record.Field;

/**
 *  contains methods useful in rules that deal with fields of records
 *  
 * @author cfs
 *
 */
public abstract class AbstractFieldRule extends AbstractEventBGeneratorRule {

	/**
	 * Returns the Event-B unicode symbol to use as the relation kind 
	 * in the type declaration of a field
	 * @param field
	 * @param record
	 * @return
	 * @throws Exception
	 */
	protected String getRelationSymbol(Field field) throws Exception {
		String multiplicity = field.getMultiplicity().getName();
		if (multiplicity.equals("ONE"))
			return " \u2192 ";
		else if (multiplicity.equals("MANY"))
			return " \u2194 ";
		else if (multiplicity.equals("OPTIONAL"))
			return " \u21f8 ";
		else 
			throw new Exception(
					"Unrecognized multiplicity setting in Field "+field.getName());
	}
	
}