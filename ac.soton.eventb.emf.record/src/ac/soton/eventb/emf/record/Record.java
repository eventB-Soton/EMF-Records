/**
 * Copyright (c) 2020
 * University of Southampton.
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.record;

import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.AbstractExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getSubsets <em>Subsets</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord()
 * @model annotation="org.eventb.emf.core.extendedMetaClasses"
 * @generated
 */
public interface Record extends EventBNamedCommentedDataElaborationElement, AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Subsets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsets</em>' reference.
	 * @see #setSubsets(Record)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Subsets()
	 * @model
	 * @generated
	 */
	Record getSubsets();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Record#getSubsets <em>Subsets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsets</em>' reference.
	 * @see #getSubsets()
	 * @generated
	 */
	void setSubsets(Record value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.record.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Record
