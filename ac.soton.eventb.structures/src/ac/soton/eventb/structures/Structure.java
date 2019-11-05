/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.eventb.structures;

import ac.soton.eventb.emf.core.extension.coreextension.EventBNamedCommentedDataElaborationElement;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.AbstractExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.structures.Structure#getSubsets <em>Subsets</em>}</li>
 *   <li>{@link ac.soton.eventb.structures.Structure#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.structures.StructuresPackage#getStructure()
 * @model annotation="org.eventb.emf.core.extendedMetaClasses"
 * @generated
 */
public interface Structure extends EventBNamedCommentedDataElaborationElement, AbstractExtension {
	/**
	 * Returns the value of the '<em><b>Subsets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsets</em>' reference.
	 * @see #setSubsets(Structure)
	 * @see ac.soton.eventb.structures.StructuresPackage#getStructure_Subsets()
	 * @model
	 * @generated
	 */
	Structure getSubsets();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.structures.Structure#getSubsets <em>Subsets</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsets</em>' reference.
	 * @see #getSubsets()
	 * @generated
	 */
	void setSubsets(Structure value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link ac.soton.eventb.structures.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see ac.soton.eventb.structures.StructuresPackage#getStructure_Fields()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Structure
