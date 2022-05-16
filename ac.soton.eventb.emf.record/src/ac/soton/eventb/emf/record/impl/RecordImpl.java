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
package ac.soton.eventb.emf.record.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.CorePackage;

import ac.soton.eventb.emf.core.extension.coreextension.impl.EventBNamedCommentedDataElaborationElementImpl;
import ac.soton.eventb.emf.record.Constraint;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#getExtensionId <em>Extension Id</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#getInheritsNames <em>Inherits Names</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#getSelfName <em>Self Name</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#isExtended <em>Extended</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.record.impl.RecordImpl#isRefined <em>Refined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordImpl extends EventBNamedCommentedDataElaborationElementImpl implements Record {
	/**
	 * The default value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtensionId() <em>Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionId()
	 * @generated
	 * @ordered
	 */
	protected String extensionId = EXTENSION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInheritsNames() <em>Inherits Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #getInheritsNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inheritsNames;

	/**
	 * The default value of the '{@link #getSelfName() <em>Self Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #getSelfName()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_NAME_EDEFAULT = "self";

	/**
	 * The cached value of the '{@link #getSelfName() <em>Self Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #getSelfName()
	 * @generated
	 * @ordered
	 */
	protected String selfName = SELF_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefines() <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefines()
	 * @generated
	 * @ordered
	 */
	/**
	 * @since 1.0
	 */
	protected Record refines;

	/**
	 * The default value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTENDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtended() <em>Extended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #isExtended()
	 * @generated
	 * @ordered
	 */
	protected boolean extended = EXTENDED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRefined() <em>Refined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #isRefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefined() <em>Refined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see #isRefined()
	 * @generated
	 * @ordered
	 */
	protected boolean refined = REFINED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecordPackage.Literals.RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionId() {
		return extensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionId(String newExtensionId) {
		String oldExtensionId = extensionId;
		extensionId = newExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD__EXTENSION_ID, oldExtensionId, extensionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Derives a notifying containment EList of Field from the orderedChildren of this element
	 * The list can be modified and children will be updated to match.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<Field> getFields() {
		return getDerivedChildren(Field.class, RecordPackage.RECORD__FIELDS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Derives a notifying containment EList of constraints from the orderedChildren of this element
	 * The list can be modified and children will be updated to match.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public EList<Constraint> getConstraints() {
		return getDerivedChildren(Constraint.class, RecordPackage.RECORD__CONSTRAINTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInheritsNames() {
		if (inheritsNames == null) {
			inheritsNames = new EDataTypeUniqueEList<String>(String.class, this, RecordPackage.RECORD__INHERITS_NAMES);
		}
		return inheritsNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelfName() {
		return selfName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfName(String newSelfName) {
		String oldSelfName = selfName;
		selfName = newSelfName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD__SELF_NAME, oldSelfName, selfName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtended(boolean newExtended) {
		boolean oldExtended = extended;
		extended = newExtended;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD__EXTENDED, oldExtended, extended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefined() {
		return refined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefined(boolean newRefined) {
		boolean oldRefined = refined;
		refined = newRefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecordPackage.RECORD__REFINED, oldRefined, refined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecordPackage.RECORD__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case RecordPackage.RECORD__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecordPackage.RECORD__EXTENSION_ID:
				return getExtensionId();
			case RecordPackage.RECORD__FIELDS:
				return getFields();
			case RecordPackage.RECORD__CONSTRAINTS:
				return getConstraints();
			case RecordPackage.RECORD__INHERITS_NAMES:
				return getInheritsNames();
			case RecordPackage.RECORD__SELF_NAME:
				return getSelfName();
			case RecordPackage.RECORD__EXTENDED:
				return isExtended();
			case RecordPackage.RECORD__REFINED:
				return isRefined();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecordPackage.RECORD__EXTENSION_ID:
				setExtensionId((String)newValue);
				return;
			case RecordPackage.RECORD__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case RecordPackage.RECORD__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case RecordPackage.RECORD__INHERITS_NAMES:
				getInheritsNames().clear();
				getInheritsNames().addAll((Collection<? extends String>)newValue);
				return;
			case RecordPackage.RECORD__SELF_NAME:
				setSelfName((String)newValue);
				return;
			case RecordPackage.RECORD__EXTENDED:
				setExtended((Boolean)newValue);
				return;
			case RecordPackage.RECORD__REFINED:
				setRefined((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecordPackage.RECORD__EXTENSION_ID:
				setExtensionId(EXTENSION_ID_EDEFAULT);
				return;
			case RecordPackage.RECORD__FIELDS:
				getFields().clear();
				return;
			case RecordPackage.RECORD__CONSTRAINTS:
				getConstraints().clear();
				return;
			case RecordPackage.RECORD__INHERITS_NAMES:
				getInheritsNames().clear();
				return;
			case RecordPackage.RECORD__SELF_NAME:
				setSelfName(SELF_NAME_EDEFAULT);
				return;
			case RecordPackage.RECORD__EXTENDED:
				setExtended(EXTENDED_EDEFAULT);
				return;
			case RecordPackage.RECORD__REFINED:
				setRefined(REFINED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecordPackage.RECORD__EXTENSION_ID:
				return EXTENSION_ID_EDEFAULT == null ? extensionId != null : !EXTENSION_ID_EDEFAULT.equals(extensionId);
			case RecordPackage.RECORD__FIELDS:
				return !getFields().isEmpty();
			case RecordPackage.RECORD__CONSTRAINTS:
				return !getConstraints().isEmpty();
			case RecordPackage.RECORD__INHERITS_NAMES:
				return inheritsNames != null && !inheritsNames.isEmpty();
			case RecordPackage.RECORD__SELF_NAME:
				return SELF_NAME_EDEFAULT == null ? selfName != null : !SELF_NAME_EDEFAULT.equals(selfName);
			case RecordPackage.RECORD__EXTENDED:
				return extended != EXTENDED_EDEFAULT;
			case RecordPackage.RECORD__REFINED:
				return refined != REFINED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (derivedFeatureID) {
				case RecordPackage.RECORD__EXTENSION_ID: return CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractExtension.class) {
			switch (baseFeatureID) {
				case CorePackage.ABSTRACT_EXTENSION__EXTENSION_ID: return RecordPackage.RECORD__EXTENSION_ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extensionId: ");
		result.append(extensionId);
		result.append(", inheritsNames: ");
		result.append(inheritsNames);
		result.append(", selfName: ");
		result.append(selfName);
		result.append(", extended: ");
		result.append(extended);
		result.append(", refined: ");
		result.append(refined);
		result.append(')');
		return result.toString();
	}

} //RecordImpl
