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
package ac.soton.eventb.emf.record;

import ac.soton.eventb.emf.core.extension.coreextension.Type;
import org.eventb.emf.core.EventBNamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.record.Field#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.record.RecordPackage#getField()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='fieldsHaveTypesUnlessRefined'"
 * @generated
 */
public interface Field extends EventBNamedCommentedElement, Type {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"ONE"</code>.
	 * The literals are from the enumeration {@link ac.soton.eventb.emf.record.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see ac.soton.eventb.emf.record.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getField_Multiplicity()
	 * @model default="ONE"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Field#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see ac.soton.eventb.emf.record.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // Field
