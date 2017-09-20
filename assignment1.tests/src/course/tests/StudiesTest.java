/**
 */
package course.tests;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import course.Course;
import course.CourseFactory;
import course.CourseInstance;
import course.Employment;
import course.Organisation;
import course.Person;
import course.Studies;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Studies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link course.Studies#getCurrentCourses() <em>Current Courses</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link course.Studies#signUpForExam(course.CourseInstance) <em>Sign Up For Exam</em>}</li>
 *   <li>{@link course.Studies#signOffFromExam(course.CourseInstance) <em>Sign Off From Exam</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class StudiesTest extends TestCase {

	/**
	 * The fixture for this Studies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studies fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudiesTest.class);
	}

	/**
	 * Constructs a new Studies test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Studies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Studies fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Studies test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Studies getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CourseFactory.eINSTANCE.createStudies());
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
	 * Tests the '{@link course.Studies#getCurrentCourses() <em>Current Courses</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Studies#getCurrentCourses()
	 * @generated NOT
	 */
	public void testGetCurrentCourses() {
		Person testPerson = CourseFactory.eINSTANCE.createPerson();
		Employment testEmployment = CourseFactory.eINSTANCE.createEmployment();
		Organisation testOrganisation = CourseFactory.eINSTANCE.createOrganisation();
		CourseInstance testInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		
		testEmployment.setOrganisation(testOrganisation);
		testInstance.setCourse(testCourse);
		testOrganisation.setCourseInstance(testInstance);
		testEmployment.setEmployee(testPerson);
		
		EList<CourseInstance> testInstances = new BasicEList<CourseInstance>();
		
		getFixture().setStudent(testPerson);
		
		assertEquals(testInstances, getFixture().getCurrentCourses());
		
	}

	/**
	 * Tests the '{@link course.Studies#setCurrentCourses(org.eclipse.emf.common.util.EList) <em>Current Courses</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Studies#setCurrentCourses(org.eclipse.emf.common.util.EList)
	 * @generated NOT
	 */
	public void testSetCurrentCourses() {}

	/**
	 * Tests the '{@link course.Studies#signUpForExam(course.CourseInstance) <em>Sign Up For Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Studies#signUpForExam(course.CourseInstance)
	 * @generated NOT
	 */
	public void testSignUpForExam__CourseInstance() {
		CourseInstance testInstance = CourseFactory.eINSTANCE.createCourseInstance();
		getFixture().signUpForExam(testInstance);
		
		assertTrue(getFixture().getExams().contains(testInstance));
		}

	/**
	 * Tests the '{@link course.Studies#signOffFromExam(course.CourseInstance) <em>Sign Off From Exam</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Studies#signOffFromExam(course.CourseInstance)
	 * @generated NOT
	 */
	public void testSignOffFromExam__CourseInstance() {
		Person testPerson = CourseFactory.eINSTANCE.createPerson();
		Employment testEmployment = CourseFactory.eINSTANCE.createEmployment();
		Organisation testOrganisation = CourseFactory.eINSTANCE.createOrganisation();
		CourseInstance testInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		
		testEmployment.setOrganisation(testOrganisation);
		
		testInstance.setCourse(testCourse);
		testOrganisation.setCourseInstance(testInstance);
		testEmployment.setEmployee(testPerson);
		testPerson.addEmployment(testEmployment);
		System.out.println(testPerson.getEmployment());
		
		getFixture().signUpForExam(testInstance);
		
		getFixture().signOffFromExam(testInstance);
		
		assertEquals(new BasicEList<CourseInstance>(), getFixture().getExams());
		
		assertTrue(!getFixture().getCurrentCourses().contains(testInstance));
		
	}

} //StudiesTest
