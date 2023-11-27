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
package ac.soton.eventb.emf.record.util;

import ac.soton.eventb.emf.record.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.machine.Machine;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * @since 1.0
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.record.RecordPackage
 * @generated
 */
public class RecordValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RecordValidator INSTANCE = new RecordValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ac.soton.eventb.emf.record";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RecordPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RecordPackage.RECORD:
				return validateRecord((Record)value, diagnostics, context);
			case RecordPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case RecordPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case RecordPackage.MULTIPLICITY:
				return validateMultiplicity((Multiplicity)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @since 1.1
	 */
	public boolean validateRecord(Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(record, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(record, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecord_mustHaveAName(record, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecord_exclusive_extendsRefinesInherits(record, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecord_refinedOnlyInMachines(record, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecord_noNewRecordsInMachines(record, diagnostics, context);
		return result;
	}


	/**
	 * Validates the mustHaveAName constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * A record must have a name
	 * <!-- end-user-doc -->
	 * @generated not
	 * @since 1.1
	 */
	public boolean validateRecord_mustHaveAName(Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (record.getName()==null || record.getName().trim().length()==0) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "record must have a name", getObjectLabel(record, context) },
						 new Object[] { record },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the exclusive_extendsRefinesInherits constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * inherits, extended and refined attributes are mutually exclusive
	 * <!-- end-user-doc -->
	 * @generated not
	 * @since 1.1
	 */
	public boolean validateRecord_exclusive_extendsRefinesInherits(Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (
				record.getInheritsNames().size()>0 && (record.isExtended() || record.isRefined())
				|| (record.isExtended() && record.isRefined())
				) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Only one of inherits, extended or refined may be set", getObjectLabel(record, context) },
						 new Object[] { record },
						 context));
			}
			return false;
		}
		return true;
	}


	/**
	 * Validates the refinedOnlyInMachines constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 * @since 1.1
	 */
	public boolean validateRecord_refinedOnlyInMachines(Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!record.isRefined()) return true;
		EventBObject component = record.getContaining(CorePackage.Literals.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT);
		if (component==null) return true; //don't validate until record is put in a component		
		if (!(component instanceof Machine)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "refinedOnlyInMachines", getObjectLabel(record, context) },
						 new Object[] { record },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the noNewRecordsInMachines constraint of '<em>Record</em>'.
	 * <!-- begin-user-doc -->
	 * A record that is in a machine must either inherit, extend or refine
	 * <!-- end-user-doc -->
	 * @generated not
	 * @since 1.1
	 */
	public boolean validateRecord_noNewRecordsInMachines(Record record, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (record.isRefined() || record.isExtended() || record.getInheritsNames().size()>0) return true;
		EventBObject component = record.getContaining(CorePackage.Literals.EVENT_BNAMED_COMMENTED_COMPONENT_ELEMENT);
		if (component==null) return true; //don't validate until record is put in a component		
		if (component instanceof Machine) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "noNewRecordsInMachines", getObjectLabel(record, context) },
						 new Object[] { record },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(field, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(field, diagnostics, context);
		if (result || diagnostics != null) result &= validateField_fieldsHaveTypesUnlessRefined(field, diagnostics, context);
		return result;
	}

	/**
	 * Validates the fieldsHaveTypesUnlessRefined constraint of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * only fields in refined records may have no type
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean validateField_fieldsHaveTypesUnlessRefined(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		Record record = (Record) field.eContainer();
		if (record.isRefined()) return true;
		if (field.getType()==null || field.getType().trim().length()==0) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "Unless in a refined record, fields must have types", getObjectLabel(field, context) },
						 new Object[] { field },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicity(Multiplicity multiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RecordValidator
