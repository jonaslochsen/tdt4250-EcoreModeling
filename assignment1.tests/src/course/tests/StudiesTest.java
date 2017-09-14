/**
 */
package course.tests;

import course.CourseFactory;
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
	 * @generated
	 */
	public void testGetCurrentCourses() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link course.Studies#setCurrentCourses(org.eclipse.emf.common.util.EList) <em>Current Courses</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.Studies#setCurrentCourses(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testSetCurrentCourses() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //StudiesTest
