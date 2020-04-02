/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.eventb.records;

import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.records.Field#getType <em>Type</em>}</li>
 *   <li>{@link ac.soton.eventb.records.Field#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.records.RecordsPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EventBNamedCommentedDataElaborationElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ac.soton.eventb.records.RecordsPackage#getField_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.records.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"ONE"</code>.
	 * The literals are from the enumeration {@link ac.soton.eventb.records.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see ac.soton.eventb.records.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see ac.soton.eventb.records.RecordsPackage#getField_Multiplicity()
	 * @model default="ONE"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.records.Field#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see ac.soton.eventb.records.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

} // Field
