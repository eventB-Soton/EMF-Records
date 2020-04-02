/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.eventb.records;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ac.soton.eventb.records.RecordsFactory
 * @model kind="package"
 * @generated
 */
public interface RecordsPackage extends EPackage {
	
	/**
	 * 
	 */
	String RECORD_EXTENSION_ID = "ac.soton.eventb.records";
			
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "records";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/records/2019";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "records";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecordsPackage eINSTANCE = ac.soton.eventb.records.impl.RecordsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.records.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.records.impl.RecordImpl
	 * @see ac.soton.eventb.records.impl.RecordsPackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ANNOTATIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXTENSIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ATTRIBUTES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__REFERENCE = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__LOCAL_GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__INTERNAL_ID = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__COMMENT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ELABORATES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ELABORATES;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__DATA_KIND = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__DATA_KIND;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EXTENSION_ID = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__SUBSETS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__FIELDS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.records.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.records.impl.FieldImpl
	 * @see ac.soton.eventb.records.impl.RecordsPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ANNOTATIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__EXTENSIONS = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ATTRIBUTES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__REFERENCE = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LOCAL_GENERATED = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__INTERNAL_ID = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__COMMENT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elaborates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ELABORATES = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__ELABORATES;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DATA_KIND = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT__DATA_KIND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MULTIPLICITY = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = CoreextensionPackage.EVENT_BNAMED_COMMENTED_DATA_ELABORATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.records.Multiplicity <em>Multiplicity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.records.Multiplicity
	 * @see ac.soton.eventb.records.impl.RecordsPackageImpl#getMultiplicity()
	 * @generated
	 */
	int MULTIPLICITY = 2;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.records.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see ac.soton.eventb.records.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.records.Record#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsets</em>'.
	 * @see ac.soton.eventb.records.Record#getSubsets()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Subsets();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.records.Record#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see ac.soton.eventb.records.Record#getFields()
	 * @see #getRecord()
	 * @generated
	 */
	EReference getRecord_Fields();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.records.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see ac.soton.eventb.records.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.records.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ac.soton.eventb.records.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.records.Field#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ac.soton.eventb.records.Field#getMultiplicity()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Multiplicity();

	/**
	 * Returns the meta object for enum '{@link ac.soton.eventb.records.Multiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity</em>'.
	 * @see ac.soton.eventb.records.Multiplicity
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
	RecordsFactory getRecordsFactory();

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
		 * The meta object literal for the '{@link ac.soton.eventb.records.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.records.impl.RecordImpl
		 * @see ac.soton.eventb.records.impl.RecordsPackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Subsets</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__SUBSETS = eINSTANCE.getRecord_Subsets();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD__FIELDS = eINSTANCE.getRecord_Fields();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.records.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.records.impl.FieldImpl
		 * @see ac.soton.eventb.records.impl.RecordsPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__MULTIPLICITY = eINSTANCE.getField_Multiplicity();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.records.Multiplicity <em>Multiplicity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.records.Multiplicity
		 * @see ac.soton.eventb.records.impl.RecordsPackageImpl#getMultiplicity()
		 * @generated
		 */
		EEnum MULTIPLICITY = eINSTANCE.getMultiplicity();

	}

} //RecordsPackage
