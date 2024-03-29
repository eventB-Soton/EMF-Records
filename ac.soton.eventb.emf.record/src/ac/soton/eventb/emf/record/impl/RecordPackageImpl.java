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

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;

import ac.soton.eventb.emf.record.Constraint;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Multiplicity;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordFactory;
import ac.soton.eventb.emf.record.RecordPackage;

import ac.soton.eventb.emf.record.util.RecordValidator;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

import org.eventb.emf.core.context.ContextPackage;

import org.eventb.emf.core.machine.MachinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordPackageImpl extends EPackageImpl implements RecordPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.eventb.emf.record.RecordPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RecordPackageImpl() {
		super(eNS_URI, RecordFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RecordPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RecordPackage init() {
		if (isInited) return (RecordPackage)EPackage.Registry.INSTANCE.getEPackage(RecordPackage.eNS_URI);

		// Obtain or create and register package
		RecordPackageImpl theRecordPackage = (RecordPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RecordPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RecordPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		CoreextensionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRecordPackage.createPackageContents();

		// Initialize created meta-data
		theRecordPackage.initializePackageContents();

//FIXME XText is causing a problem with validation 
		
		// Register package validator
//		EValidator.Registry.INSTANCE.put
//			(theRecordPackage, 
//			 new EValidator.Descriptor() {
//				 public EValidator getEValidator() {
//					 return RecordValidator.INSTANCE;
//				 }
//			 });

		// Mark meta-data to indicate it can't be changed
		theRecordPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RecordPackage.eNS_URI, theRecordPackage);
		return theRecordPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecord() {
		return recordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Fields() {
		return (EReference)recordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecord_Constraints() {
		return (EReference)recordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_InheritsNames() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_SelfName() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Extended() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecord_Refined() {
		return (EAttribute)recordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Multiplicity() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordFactory getRecordFactory() {
		return (RecordFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		recordEClass = createEClass(RECORD);
		createEReference(recordEClass, RECORD__FIELDS);
		createEReference(recordEClass, RECORD__CONSTRAINTS);
		createEAttribute(recordEClass, RECORD__INHERITS_NAMES);
		createEAttribute(recordEClass, RECORD__SELF_NAME);
		createEAttribute(recordEClass, RECORD__EXTENDED);
		createEAttribute(recordEClass, RECORD__REFINED);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__MULTIPLICITY);

		constraintEClass = createEClass(CONSTRAINT);

		// Create enums
		multiplicityEEnum = createEEnum(MULTIPLICITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CoreextensionPackage theCoreextensionPackage = (CoreextensionPackage)EPackage.Registry.INSTANCE.getEPackage(CoreextensionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recordEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		recordEClass.getESuperTypes().add(theCorePackage.getAbstractExtension());
		fieldEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		fieldEClass.getESuperTypes().add(theCoreextensionPackage.getType());
		constraintEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedDerivedPredicateElement());

		// Initialize classes and features; add operations and parameters
		initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecord_Fields(), this.getField(), null, "fields", null, 0, -1, Record.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRecord_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, Record.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecord_InheritsNames(), theEcorePackage.getEString(), "inheritsNames", null, 0, -1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecord_SelfName(), ecorePackage.getEString(), "selfName", "self", 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecord_Extended(), ecorePackage.getEBoolean(), "extended", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecord_Refined(), ecorePackage.getEBoolean(), "refined", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Multiplicity(), this.getMultiplicity(), "multiplicity", "ONE", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.OPTIONAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eventb.emf.core.extendedMetaClasses
		createOrgAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eventb.emf.core.extendedMetaClasses</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eventb.emf.core.extendedMetaClasses";		
		addAnnotation
		  (recordEClass, 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(MachinePackage.eNS_URI).appendFragment("//machine/Machine"),
			 URI.createURI(ContextPackage.eNS_URI).appendFragment("//context/Context")
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * @since 1.0
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (recordEClass, 
		   source, 
		   new String[] {
			 "constraints", "mustHaveAName exclusive_extendsRefinesInherits refinedOnlyInMachines noNewRecordsInMachines"
		   });		
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "constraints", "fieldsHaveTypesUnlessRefined"
		   });
	}

} //RecordPackageImpl
