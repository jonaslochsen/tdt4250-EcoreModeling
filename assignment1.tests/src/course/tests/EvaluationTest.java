/**
 */
package course.tests;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import course.Course;
import course.CourseFactory;
import course.CourseInstance;
import course.CoursePointReduction;
import course.Department;
import course.Evaluation;
import course.Person;
import course.Studies;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link course.Evaluation#completeExam(course.Studies) <em>Complete Exam</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EvaluationTest extends TestCase {

	/**
	 * The fixture for this Evaluation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Evaluation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluationTest.class);
	}

	/**
	 * Constructs a new Evaluation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Evaluation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Evaluation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Evaluation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Evaluation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		Evaluation exampleEvaluation = CourseFactory.eINSTANCE.createEvaluation();
		
		setFixture(exampleEvaluation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link course.Evaluation#completeExam(course.Studies) <em>Complete Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Evaluation#completeExam(course.Studies)
	 * @generated NOT
	 */
	public void testCompleteExam__Studies() {
		Person examplePerson = CourseFactory.eINSTANCE.createPerson();
		Studies exampleStudies = CourseFactory.eINSTANCE.createStudies();
		Course exampleCourse = CourseFactory.eINSTANCE.createCourse();
		Course sif8060 = CourseFactory.eINSTANCE.createCourse();
		Department exampleDepartment = CourseFactory.eINSTANCE.createDepartment();
		CourseInstance exampleInstance = CourseFactory.eINSTANCE.createCourseInstance();
		CoursePointReduction examplePointReduction = CourseFactory.eINSTANCE.createCoursePointReduction();
		exampleDepartment.setName("Of Computer Science");
		exampleCourse.setCode("TDT4250");
		exampleCourse.setName("Advanced Software Design");
		exampleCourse.setCredits(7.5);
		exampleCourse.setDepartment(exampleDepartment);
		sif8060.setCode("SIF8060");
		sif8060.setName("Modelling Information Systems");
		sif8060.setCredits(7.5);
		sif8060.setDepartment(exampleDepartment);
		exampleInstance.setCourse(exampleCourse);
		exampleInstance.setEvaluation(getFixture());
		exampleStudies.setStudent(examplePerson);
		examplePointReduction.setCourse(sif8060);
		examplePointReduction.setReduction(7.5);
		exampleCourse.addCourseReduction(examplePointReduction);
		
		
		EList<CourseInstance> exampleCurrentCourses = new BasicEList<CourseInstance>();
		exampleCurrentCourses.add(exampleInstance);
		exampleStudies.setExams(exampleCurrentCourses);
		
		getFixture().completeExam(exampleStudies);
		
		// Check to see that the student has passed the course.
		assertTrue(exampleStudies.getPastCourses().contains(exampleCourse));
		
		// Check to see that the course instance has been removed from the students current courses.
		assertTrue(!exampleStudies.getCurrentCourses().contains(exampleInstance));
		
		// Check to see that the student has received correct amount of credits.
		assertEquals(7.5, exampleStudies.getCredits());
		
		//Check to see if student receives no credits due to points reduction.
		BasicEList<Course> pastCourses = new BasicEList<Course>();
		pastCourses.add(sif8060);
		exampleStudies.setPastCourses(pastCourses);
		exampleStudies.setCredits(7.5);
		
		EList<CourseInstance> exampleCurrentCourses1 = new BasicEList<CourseInstance>();
		exampleCurrentCourses1.add(exampleInstance);
		exampleStudies.setExams(exampleCurrentCourses1);
		
		
		exampleStudies.setExams(exampleCurrentCourses1);
		
		getFixture().completeExam(exampleStudies);
		
		assertEquals(7.5, exampleStudies.getCredits());
		
		
		
	}

} //EvaluationTest
