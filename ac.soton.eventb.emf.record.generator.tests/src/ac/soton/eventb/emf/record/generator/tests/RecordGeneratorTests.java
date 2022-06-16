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
package ac.soton.eventb.emf.record.generator.tests;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eventb.core.IEventBProject;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EventBEMFUtils;
import org.eventb.emf.persistence.tests.AbstractEventBEMFTests;
import org.junit.Test;
import org.rodinp.core.IRodinFile;

import ac.soton.emf.translator.TranslatorFactory;
import ac.soton.eventb.emf.record.Constraint;
import ac.soton.eventb.emf.record.Field;
import ac.soton.eventb.emf.record.Multiplicity;
import ac.soton.eventb.emf.record.Record;
import ac.soton.eventb.emf.record.RecordFactory;
import ac.soton.eventb.emf.record.generator.TranslateAllRecordsEMFOperation;
import ch.ethz.eventb.utils.EventBUtils;

public class RecordGeneratorTests extends AbstractEventBEMFTests {

	private IEventBProject prj;
	private Context x0;
	private Context x1;
	private Machine m0;
	//private Event m0_init;
	private Machine m1;
	//private Event m1_init;
	
	private TranslatorFactory factory;
	
	private String commandID;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see ch.ethz.eventb.utils.tests.AbstractEventBTests#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp(); //this sets up the emfRodinDB and editing domain
		factory = TranslatorFactory.getFactory();
		commandID = TranslateAllRecordsEMFOperation.RECORD_GENERATOR_COMMAND_ID;
		//set up some machines and contexts to put the test records in
		prj = EventBUtils.createEventBProject("P", nullMonitor);
		x0 = EventBEMFUtils.createContext(emfRodinDB, prj, "x0");
		x1 = EventBEMFUtils.createContext(emfRodinDB, prj, "x1");
		x1.getExtendsNames().add("x0");
		m0 = EventBEMFUtils.createMachine(emfRodinDB, prj, "m0");
		//m0_init = EventBEMFUtils.createEvent(domain, m0, IEvent.INITIALISATION);
		m0.getSeesNames().add("x0");
		m1 = EventBEMFUtils.createMachine(emfRodinDB, prj, "m1");
		//m1_init = EventBEMFUtils.createEvent(domain, m1, IEvent.INITIALISATION);
		m1.getSeesNames().add("x1");
	}

	//////////////////////////Records in a CONTEXT//////////////////////////
	/**
	 * Test the generation of a basic record in a context (i.e. does not inherit from any other record)
	 * The record has three fields to test the three multiplicity options
	 * The record has two constraints one of which is a theorem. Both involve the default self name 'self'.
	 * It should generate a carrier set and three constants for the fields and three axioms to give the
	 *  types of each field.
	 *  A further two axioms (one of which is a theorem) should be generated for the two constraints and
	 *   the predicates of these should be universally quantified over all instances of the record using
	 *   the default self name 'self' as the local variable. 
	 */
	@Test
	public void testBasicContextRecordWithFieldsAndConstraints() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			addConstraintToRecord(r1,"constraint1","F3(self) = F1(self)", false);
			addConstraintToRecord(r1,"constraint2","F3(self) = F2(self)", true);
			x0.getOrderedChildren().add(r1);
			translate(x0);
			//check the results
			testContextCarrierSets("Incorrect carrier sets", x0, "R1");
			testContextConstants("Incorrect constants", x0, "F1", "F2", "F3");
			testContextAxioms("Incorrect axioms",x0, 
				"typeof_R1_F1:F1 ∈ R1 ↔ BOOL:false",
				"typeof_R1_F2:F2 ∈ R1 → BOOL:false",
				"typeof_R1_F3:F3 ∈ R1 ⇸ BOOL:false",
				"constraint1:∀self·self∈R1 ⇒ (F3(self) = F1(self)):false",
				"constraint2:∀self·self∈R1 ⇒ (F3(self) = F2(self)):true"
				);

		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}


	/**
	 * Test the generation of an extended record in a context 
	 * (i.e. does not inherit from any other record but extends one with the same name
	 *  in the seen contexts)
	 * The record has three fields to test the three multiplicity options
	 * The record has two constraints one of which is a theorem. Both involve the default self name 'self'.
	 * The self name has been changed to 'this' and does not match that used in the constraints
	 * It should not generate any carrier sets but should generate three constants for the fields and
	 *  three axioms to give the types of each field
	 * Two axioms should be generated for the constraints but they will not be universally quantified due to the 
	 *  mismatched self name
	 */
	@Test
	public void testExtendedContextRecordWithFields() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r1e = createTestRecord("R1","F4","F5","F6");
			addConstraintToRecord(r1e,"constraint3","F6(self) = F4(self)", false);
			addConstraintToRecord(r1e,"constraint4","F6(self) = F5(self)", true);
			r1e.setSelfName("this");
			r1e.setExtended(true);
			x1.getOrderedChildren().add(r1e);
			translate(x1);
			//check the results
			testContextCarrierSets("x1 should not contain any carrier sets", x1);
			testContextConstants("Incorrect constants", x1, "F4", "F5", "F6");
			testContextAxioms("Incorrect axioms",x1, 
				"typeof_R1_F4:F4 ∈ R1 ↔ BOOL:false",
				"typeof_R1_F5:F5 ∈ R1 → BOOL:false",
				"typeof_R1_F6:F6 ∈ R1 ⇸ BOOL:false",
				"constraint3:F6(self) = F4(self):false",
				"constraint4:F6(self) = F5(self):true"
				);

		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}
	
	/**
	 * Test the generation of an inherited record in a context 
	 * (i.e. inherits from a record with a different name
	 *  in the extended contexts)
	 * The record has three fields to test the three multiplicity options
	 * The record has two constraints one of which is a theorem. Both use an alternative self name 'this'
	 * The self name has been changed to 'this' and matches that used in the constraints
	 * It should generate a constant that is a subset of the inherited record 
	 * and generate three constants for the fields and
	 *  three axioms to give the types of each field
	 * Two axioms should be generated for the constraints and they will be universally quantified 
	 * using the changed self name, "this"
	 */
	@Test
	public void testInheritedContextRecordWithFields() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r2 = createTestRecord("R2","F4","F5","F6");
			r2.getInheritsNames().add("R1");
			addConstraintToRecord(r2,"constraint5","F6(this) = F4(this)", false);
			addConstraintToRecord(r2,"constraint6","F6(this) = F5(this)", true);
			r2.setSelfName("this");
			x1.getOrderedChildren().add(r2);
			translate(x1);
			//check the results
			testContextCarrierSets("x1 should not contain any carrier sets", x1);
			testContextConstants("Incorrect constants", x1, "R2", "F4", "F5", "F6");
			testContextAxioms("Incorrect axioms",x1, 
				"typeof_R2:R2 ⊆ R1:false",
				"typeof_R2_F4:F4 ∈ R2 ↔ BOOL:false",
				"typeof_R2_F5:F5 ∈ R2 → BOOL:false",
				"typeof_R2_F6:F6 ∈ R2 ⇸ BOOL:false",
				"constraint5:∀this·this∈R2 ⇒ (F6(this) = F4(this)):false",
				"constraint6:∀this·this∈R2 ⇒ (F6(this) = F5(this)):true"
				);

		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}
	
	/**
	 * Test the order of the generated elements in the orderedChildren of the context
	 * The record has three records each with 3 fields. 
	 * The second record inherits from the first one
	 * The third record inherits from the second and has two extra constraints.
	 * We expect a set for the first record, constants for each record and field, axioms for the typing of each record 
	 * and each field plus axioms for the two constraints.
	 * 
	 * The ordering is checked in the orderedChildren containment. We expect the generated elements to be placed before the
	 * record they have been generated from and for each record, the set/constant for the record followed by its type invariant
	 *  followed by a variable and type invariant for each field, followed by the extra constraint invariants
	 */
	@Test
	public void testOrderOfChildrenInContext() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r2 = createTestRecord("R2","F4","F5","F6");
			r2.getInheritsNames().add("R1");
			x0.getOrderedChildren().add(r2);
			Record r3 = createTestRecord("R3","F7", "F8", "F9");
			addConstraintToRecord(r3,"constraint10","F7(this) = F4(this)", false);
			addConstraintToRecord(r3,"constraint11","F8(this) = F5(this)", true);
			r3.setSelfName("this");
			r3.getInheritsNames().add("R2");
			x0.getOrderedChildren().add(r3);
			
			translate(x0);
			//check the results
			testContextCarrierSets("Incorrect sets", x0, "R1");
			testContextConstants("Incorrect constants", x0, "F1", "F2", "F3", "R2", "F4", "F5","F6", "R3", "F7", "F8", "F9"); 
			testContextAxioms("Incorrect axioms",x0,
					"typeof_R1_F1:F1 ∈ R1 ↔ BOOL:false",
					"typeof_R1_F2:F2 ∈ R1 → BOOL:false",
					"typeof_R1_F3:F3 ∈ R1 ⇸ BOOL:false",
					"typeof_R2:R2 ⊆ R1:false",
					"typeof_R2_F4:F4 ∈ R2 ↔ BOOL:false",
					"typeof_R2_F5:F5 ∈ R2 → BOOL:false",
					"typeof_R2_F6:F6 ∈ R2 ⇸ BOOL:false",
					"typeof_R3:R3 ⊆ R2:false",
					"typeof_R3_F7:F7 ∈ R3 ↔ BOOL:false",
					"typeof_R3_F8:F8 ∈ R3 → BOOL:false",
					"typeof_R3_F9:F9 ∈ R3 ⇸ BOOL:false",
					"constraint10:∀this·this∈R3 ⇒ (F7(this) = F4(this)):false",
					"constraint11:∀this·this∈R3 ⇒ (F8(this) = F5(this)):true"
				);
			testOrderedChildren("Incorrect order of generated elements", x0,
					"CarrierSet:R1",
					"Constant:F1",
					"Axiom:typeof_R1_F1",
					"Constant:F2",
					"Axiom:typeof_R1_F2",
					"Constant:F3",
					"Axiom:typeof_R1_F3",
					"Record:R1",					
					"Constant:R2", 
					"Axiom:typeof_R2",
					"Constant:F4",
					"Axiom:typeof_R2_F4",
					"Constant:F5",
					"Axiom:typeof_R2_F5",
					"Constant:F6",
					"Axiom:typeof_R2_F6",
					"Record:R2",
					"Constant:R3",
					"Axiom:typeof_R3",
					"Constant:F7",
					"Axiom:typeof_R3_F7",
					"Constant:F8",
					"Axiom:typeof_R3_F8",
					"Constant:F9",
					"Axiom:typeof_R3_F9",
					"Axiom:constraint10",
					"Axiom:constraint11",
					"Record:R3"
					);
			
		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}

	//////////////////////////Records in a MACHINE//////////////////////////
	/**
	 * Test the generation of an extended record in a machine 
	 * (i.e. does not inherit from any other context but one with the same name exists
	 *  in the seen contexts)
	 * The record has three fields to test the three multiplicity options
	 * The record has two constraints one of which is a theorem. Both involve the default self name 'self'.
	 * It should not generate anything for the record itself but should generate three variables
	 *  for the new fields and three invariants to give the types of each field
	 * A further two invariants (one of which is a theorem) should be generated for the two constraints and
	 *   the predicates of these should be universally quantified over all instances of the record using
	 *   the default self name 'self' as the local variable. 
	 */
	@Test
	public void testExtendedMachineRecordWithFields() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r1e = createTestRecord("R1","F4","F5","F6");
			addConstraintToRecord(r1e,"constraint6","F6(self) = F4(self)", false);
			addConstraintToRecord(r1e,"constraint7","F6(self) = F5(self)", true);
			r1e.setExtended(true);
			m0.getOrderedChildren().add(r1e);
			translate(m0);
			//check the results
			testMachineVariables("Incorrect variables", m0, "F4", "F5", "F6");
			testMachineInvariants("Incorrect axioms",m0, 
				"typeof_R1_F4:F4 ∈ R1 ↔ BOOL:false",
				"typeof_R1_F5:F5 ∈ R1 → BOOL:false",
				"typeof_R1_F6:F6 ∈ R1 ⇸ BOOL:false",
				"constraint6:∀self·self∈R1 ⇒ (F6(self) = F4(self)):false",
				"constraint7:∀self·self∈R1 ⇒ (F6(self) = F5(self)):true"
				);

		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}
	
	/**
	 * Test the generation of an inherited record in a machine 
	 * (i.e. inherits from a record with a different name
	 *  in a seen contexts)
	 * The record has three fields to test the three multiplicity options
	 * The record has two constraints one of which is a theorem. Both involve the default self name 'self'.
	 * The self name has been changed to 'this' and does not match that used in the constraints
	 * It should generate a variable that is a subset of the inherited record 
	 * and generate three variables for the fields and three invariants to give the types of each field.
	 * Two invariants should be generated for the constraints but they will not be universally quantified
	 *  due to the mismatched self name
	 */
	@Test
	public void testInheritedMachineRecordWithFields() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r2 = createTestRecord("R2","F4","F5","F6");
			addConstraintToRecord(r2,"constraint8","F6(self) = F4(self)", false);
			addConstraintToRecord(r2,"constraint9","F6(self) = F5(self)", true);
			r2.setSelfName("this");
			r2.getInheritsNames().add("R1");
			m0.getOrderedChildren().add(r2);
			translate(m0);
			//check the results
			testMachineVariables("Incorrect variables", m0, "R2", "F4", "F5", "F6");
			testMachineInvariants("Incorrect axioms",m0,
				"typeof_R2:R2 ⊆ R1:false",
				"typeof_R2_F4:F4 ∈ R2 ↔ BOOL:false",
				"typeof_R2_F5:F5 ∈ R2 → BOOL:false",
				"typeof_R2_F6:F6 ∈ R2 ⇸ BOOL:false",
				"constraint8:F6(self) = F4(self):false",
				"constraint9:F6(self) = F5(self):true"
				);
		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}
	
	/**
	 * Test the generation of a refined record in a machine 
	 * (i.e. refines from a record with a different name in a refined machine)
	 * The record has three fields to test the three multiplicity options.
	 * The record has two constraints one of which is a theorem. Both use an alternative self name 'this'.
	 * The self name has been changed to 'this' and matches that used in the constraints.
	 * It should generate an untyped variable for the record itself but should generate three variables
	 * for the new fields and three invariants to give the types of each field.
	 * In addition, it should generate 2 variables for the retained fields of the abstract record
	 * but these have no type invariant. 
	 * One abstract field is dropped (has no generated variable) and a constraint gives the gluing invariant
	 * Two invariants should be generated for the constraints and they will be universally quantified 
	 * using the changed self name, "this".
	 */
	@Test
	public void testRefinedMachineRecordWithFields() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r2 = createTestRecord("R2","F4","F5","F6");
			r2.getInheritsNames().add("R1");
			m0.getOrderedChildren().add(r2);
			Record r3 = createTestRecord("R2","F7", "F8", "F9");
			addFieldToRecord(r3,"F5", null, null);
			addFieldToRecord(r3,"F6", null, null);
			addConstraintToRecord(r3,"constraint10","F7(this) = F4(this)", false);
			addConstraintToRecord(r3,"constraint11","F8(this) = F5(this)", true);
			r3.setSelfName("this");
			r3.setRefined(true);
			m1.getOrderedChildren().add(r3);
			
			translate(m1);
			//check the results
			testMachineVariables("Incorrect variables", m1, "R2", "F7", "F8", "F9", "F5", "F6");
			testMachineInvariants("Incorrect invariants",m1,
				"typeof_R2_F7:F7 ∈ R2 ↔ BOOL:false",
				"typeof_R2_F8:F8 ∈ R2 → BOOL:false",
				"typeof_R2_F9:F9 ∈ R2 ⇸ BOOL:false",
				"constraint10:∀this·this∈R2 ⇒ (F7(this) = F4(this)):false",
				"constraint11:∀this·this∈R2 ⇒ (F8(this) = F5(this)):true"
				);
		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}
	

	
	/**
	 * Test the order of the generated elements in the orderedChildren of the machine
	 * The record has two records each with 3 fields. 
	 * The first record inherits from one in a context and the 
	 * second record inherits from the first and has two extra constraints.
	 * We expect variables for each record and field, invariants for the typing of each record 
	 * and each field plus invariants for the two constraints.
	 * 
	 * The ordering is checked in the orderedChildren containment. We expect the generated elements to be placed before the
	 * record they have been generated from and for each record, the variable for the record followed by its type invariant
	 *  followed by a variable and type invariant for each field, followed by the extra constraint invariants
	 */
	@Test
	public void testOrderOfChildrenInMachine() {
		try {
			//set up the test
			Record r1 = createTestRecord("R1","F1","F2","F3");
			x0.getOrderedChildren().add(r1);
			Record r2 = createTestRecord("R2","F4","F5","F6");
			r2.getInheritsNames().add("R1");
			m0.getOrderedChildren().add(r2);
			Record r3 = createTestRecord("R3","F7", "F8", "F9");
			addConstraintToRecord(r3,"constraint10","F7(this) = F4(this)", false);
			addConstraintToRecord(r3,"constraint11","F8(this) = F5(this)", true);
			r3.setSelfName("this");
			r3.getInheritsNames().add("R2");
			m0.getOrderedChildren().add(r3);
			
			translate(m0);
			//check the results
			testMachineVariables("Incorrect variables", m0, "R2", "F4", "F5","F6", "R3", "F7", "F8", "F9"); 
			testMachineInvariants("Incorrect invariants",m0,
					"typeof_R2:R2 ⊆ R1:false",
					"typeof_R2_F4:F4 ∈ R2 ↔ BOOL:false",
					"typeof_R2_F5:F5 ∈ R2 → BOOL:false",
					"typeof_R2_F6:F6 ∈ R2 ⇸ BOOL:false",
					"typeof_R3:R3 ⊆ R2:false",
					"typeof_R3_F7:F7 ∈ R3 ↔ BOOL:false",
					"typeof_R3_F8:F8 ∈ R3 → BOOL:false",
					"typeof_R3_F9:F9 ∈ R3 ⇸ BOOL:false",
					"constraint10:∀this·this∈R3 ⇒ (F7(this) = F4(this)):false",
					"constraint11:∀this·this∈R3 ⇒ (F8(this) = F5(this)):true"
				);
			testOrderedChildren("Incorrect order of generated elements", m0,
					"Variable:R2", 
					"Invariant:typeof_R2",
					"Variable:F4",
					"Invariant:typeof_R2_F4",
					"Variable:F5",
					"Invariant:typeof_R2_F5",
					"Variable:F6",
					"Invariant:typeof_R2_F6",
					"Record:R2",
					"Variable:R3",
					"Invariant:typeof_R3",
					"Variable:F7",
					"Invariant:typeof_R3_F7",
					"Variable:F8",
					"Invariant:typeof_R3_F8",
					"Variable:F9",
					"Invariant:typeof_R3_F9",
					"Invariant:constraint10",
					"Invariant:constraint11",
					"Record:R3"
					);
			
		} catch (ExecutionException e) {
			failUnexpectedException(e);
		}
	}
	


	/////////////////////////////utility methods used in the tests ///////////////////////////
	/**
	 * 
	 * runs the record translator to translate all records in the given component
	 * then reloads the component so that it contains the results.
	 * 
	 * @param component 
	 * @return
	 * @throws ExecutionException
	 */
	private void translate(EventBNamedCommentedComponentElement component) throws ExecutionException {
		//check the component can be translated
		assertTrue("Factory must be able to translate the component",
			factory.canTranslate(commandID, component.eClass()));
		//translate
		IStatus status = factory.translate(domain, component, commandID, new NullProgressMonitor());
		assertTrue("The status should be OK", status.isOK());
		//test the generated component exists.
		IRodinFile rodinFile = 
				component instanceof Machine? 
						prj.getMachineFile(component.getName()) :
				component instanceof Context? 
						prj.getContextFile(component.getName()) :
				null;
		assertTrue("Rodin file should exist", rodinFile.exists());
		//reload it
		component = (EventBNamedCommentedComponentElement) emfRodinDB.loadElement(rodinFile.getRoot());
	}

			
	/**
	 * creates a record for testing with 3 fields with different multiplicity options
	 * @param recordName - name of the record
	 * @param field1 - name of the first field
	 * @param field2 - name of the second field
	 * @param field3 - name of the third field
	 * @return
	 */
	private Record createTestRecord(String recordName, String field1, String field2, String field3) {
		Record r = RecordFactory.eINSTANCE.createRecord();
		r.setName(recordName);
		addFieldToRecord(r,field1, "BOOL", Multiplicity.MANY);
		addFieldToRecord(r,field2, "BOOL", Multiplicity.ONE);
		addFieldToRecord(r,field3, "BOOL", Multiplicity.OPTIONAL);
		return r;
	}			
			
	/**
	 * adds a field to the given record
	 * @param record to which the field will be added
	 * @param name of the field
	 * @param type of the field
	 * @param multiplicity of the field
	 */
	private void addFieldToRecord(Record record, String name, String type, Multiplicity multiplicity) {
		Field field = RecordFactory.eINSTANCE.createField();
		field.setName(name);
		field.setType(type);
		field.setMultiplicity(multiplicity);
		record.getOrderedChildren().add(field);
	}
	
	/**
	 * adds a constraint to the given record
	 * @param record to which the constraint will be added
	 * @param label of the constraint
	 * @param predicate of the constraint
	 * @param theorem - whether the constraint is a theorem or not
	 */
	private void addConstraintToRecord(Record record, String label, String predicate, boolean theorem) {
		Constraint constraint = RecordFactory.eINSTANCE.createConstraint();
		constraint.setName(label);
		constraint.setPredicate(predicate);
		constraint.setTheorem(theorem);
		record.getOrderedChildren().add(constraint);
	}

}
