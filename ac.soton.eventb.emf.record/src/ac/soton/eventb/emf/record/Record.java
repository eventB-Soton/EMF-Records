/*******************************************************************************
 * Copyright (c) 2020 University of Southampton.
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
 *   <li>{@link ac.soton.eventb.emf.record.Record#getInherits <em>Inherits</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getFields <em>Fields</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getRefines <em>Refines</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#isExtended <em>Extended</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord()
 * @model annotation="org.eventb.emf.core.extendedMetaClasses"
 * @generated
 */
public interface Record extends EventBNamedCommentedDataElaborationElement, AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Inherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits</em>' reference.
	 * @see #setInherits(Record)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Inherits()
	 * @model
	 * @generated
	 */
	Record getInherits();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Record#getInherits <em>Inherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherits</em>' reference.
	 * @see #getInherits()
	 * @generated
	 */
	void setInherits(Record value);

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
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.record.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Constraints()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(Record)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Refines()
	 * @model
	 * @generated
	 */
	Record getRefines();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Record#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(Record value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended</em>' attribute.
	 * @see #setExtended(boolean)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Extended()
	 * @model default="false"
	 * @generated
	 */
	boolean isExtended();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Record#isExtended <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' attribute.
	 * @see #isExtended()
	 * @generated
	 */
	void setExtended(boolean value);

	/******** CUSTOM CODE... NOT GENERATED ***/
	/**
	 * Returns the value of the name to be used for 'self' in constraints contained by the record
	 * @custom
	 * @since 1.0
	 */
	String getSelfName();
	
} // Record
