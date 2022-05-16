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

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.record.RecordFactory
 * @model kind="package"
 * @generated
 */
public interface RecordPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "record";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/record/2022";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "record";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecordPackage eINSTANCE = ac.soton.eventb.emf.record.impl.RecordPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.record.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.record.impl.RecordImpl
	 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ANNOTATIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXTENSIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ATTRIBUTES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__REFERENCE = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__LOCAL_GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__INTERNAL_ID = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Ordered Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ORDERED_CHILDREN = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ORDERED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COMMENT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ELABORATES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ELABORATES;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DATA_KIND = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__DATA_KIND;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXTENSION_ID = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELDS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CONSTRAINTS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inherits Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__INHERITS_NAMES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Self Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SELF_NAME = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXTENDED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Refined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__REFINED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.record.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.record.impl.FieldImpl
	 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EXTENSIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ATTRIBUTES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REFERENCE = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LOCAL_GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INTERNAL_ID = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Ordered Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ORDERED_CHILDREN = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ORDERED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ELABORATES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ELABORATES;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATA_KIND = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__DATA_KIND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MULTIPLICITY = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.record.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.record.impl.ConstraintImpl
	 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Ordered Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ORDERED_CHILDREN = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ORDERED_CHILDREN;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Theorem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__THEOREM = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__THEOREM;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.record.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.record.Multiplicity
	 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 3;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.record.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see ac.soton.eventb.emf.record.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.record.Record#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ac.soton.eventb.emf.record.Record#getFields()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.record.Record#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ac.soton.eventb.emf.record.Record#getConstraints()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Constraints();

	/**
	 * Returns the meta object for the attribute list '{@link ac.soton.eventb.emf.record.Record#getInheritsNames <em>Inherits Names</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inherits Names</em>'.
	 * @see ac.soton.eventb.emf.record.Record#getInheritsNames()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_InheritsNames();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.record.Record#getSelfName <em>Self Name</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Name</em>'.
	 * @see ac.soton.eventb.emf.record.Record#getSelfName()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_SelfName();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.record.Record#isExtended <em>Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended</em>'.
	 * @see ac.soton.eventb.emf.record.Record#isExtended()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Extended();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.record.Record#isRefined <em>Refined</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refined</em>'.
	 * @see ac.soton.eventb.emf.record.Record#isRefined()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Refined();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.record.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see ac.soton.eventb.emf.record.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.emf.record.Field#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ac.soton.eventb.emf.record.Field#getMultiplicity()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Multiplicity();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.record.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ac.soton.eventb.emf.record.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for enum '{@link ac.soton.eventb.emf.record.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see ac.soton.eventb.emf.record.Multiplicity
	 * @generated
	 */
	EEnum getMultiplicity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RecordFactory getRecordFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.record.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.record.impl.RecordImpl
		 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__FIELDS = eINSTANCE.getRecord_Fields();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * @since 1.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__CONSTRAINTS = eINSTANCE.getRecord_Constraints();

		/**
		 * The meta object literal for the '<em><b>Inherits Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * @since 1.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__INHERITS_NAMES = eINSTANCE.getRecord_InheritsNames();

		/**
		 * The meta object literal for the '<em><b>Self Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 1.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__SELF_NAME = eINSTANCE.getRecord_SelfName();

		/**
		 * The meta object literal for the '<em><b>Extended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 1.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__EXTENDED = eINSTANCE.getRecord_Extended();

		/**
		 * The meta object literal for the '<em><b>Refined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * @since 1.0
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__REFINED = eINSTANCE.getRecord_Refined();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.record.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.record.impl.FieldImpl
		 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MULTIPLICITY = eINSTANCE.getField_Multiplicity();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.record.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * @since 1.0
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.record.impl.ConstraintImpl
		 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.record.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.record.Multiplicity
		 * @see ac.soton.eventb.emf.record.impl.RecordPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

	}

} //RecordPackage
