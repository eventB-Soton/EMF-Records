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
 *   <li>{@link ac.soton.eventb.emf.record.Record#getFields <em>Fields</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getInheritsNames <em>Inherits Names</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#getSelfName <em>Self Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.Record#isRefined <em>Refined</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord()
 * @model annotation="org.eventb.emf.core.extendedMetaClasses"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustHaveAName exclusive_extendsRefinesInherits refinedOnlyInMachines noNewRecordsInMachines'"
 * @generated
 */
public interface Record extends EventBNamedCommentedDataElaborationElement, AbstractExtension {
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
	 * Returns the value of the '<em><b>Inherits Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits Names</em>' attribute list.
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_InheritsNames()
	 * @model
	 * @generated
	 */
	EList<String> getInheritsNames();

/**
	 * Returns the value of the '<em><b>Self Name</b></em>' attribute.
	 * The default value is <code>"self"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the value of the name to be used for 'self' in constraints contained by the record
	 * </p>
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Name</em>' attribute.
	 * @see #setSelfName(String)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_SelfName()
	 * @model default="self"
	 * @generated
	 */
	String getSelfName();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Record#getSelfName <em>Self Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the value of the name to be used for 'self' in constraints contained by the record
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Name</em>' attribute.
	 * @see #getSelfName()
	 * @generated
	 */
	void setSelfName(String value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' attribute.
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
	 * @model
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

	/**
	 * Returns the value of the '<em><b>Refined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * @since 1.0
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined</em>' attribute.
	 * @see #setRefined(boolean)
	 * @see ac.soton.eventb.emf.record.RecordPackage#getRecord_Refined()
	 * @model
	 * @generated
	 */
	boolean isRefined();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.record.Record#isRefined <em>Refined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined</em>' attribute.
	 * @see #isRefined()
	 * @generated
	 */
	void setRefined(boolean value);
	
} // Record
