/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Studies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Studies#getStudent <em>Student</em>}</li>
 *   <li>{@link course.Studies#getCurrentCourses <em>Current Courses</em>}</li>
 *   <li>{@link course.Studies#getExams <em>Exams</em>}</li>
 *   <li>{@link course.Studies#getCredits <em>Credits</em>}</li>
 *   <li>{@link course.Studies#getPastCourses <em>Past Courses</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getStudies()
 * @model
 * @generated
 */
public interface Studies extends EObject {
	/**
	 * Returns the value of the '<em><b>Past Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Past Courses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past Courses</em>' attribute.
	 * @see #setPastCourses(EList)
	 * @see course.CoursePackage#getStudies_PastCourses()
	 * @model required="true" many="false" transient="true"
	 * @generated NOT
	 */
	EList<Course> getPastCourses();

	/**
	 * Sets the value of the '{@link course.Studies#getPastCourses <em>Past Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Past Courses</em>' attribute.
	 * @see #getPastCourses()
	 * @generated NOT
	 */
	void setPastCourses(EList<Course> value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Person#getStudies <em>Studies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' container reference.
	 * @see #setStudent(Person)
	 * @see course.CoursePackage#getStudies_Student()
	 * @see course.Person#getStudies
	 * @model opposite="studies" required="true" transient="false"
	 * @generated
	 */
	Person getStudent();

	/**
	 * Sets the value of the '{@link course.Studies#getStudent <em>Student</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' container reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Person value);

	/**
	 * Returns the value of the '<em><b>Current Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Courses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Courses</em>' attribute.
	 * @see #setCurrentCourses(EList)
	 * @see course.CoursePackage#getStudies_CurrentCourses()
	 * @model required="true" many="false" transient="true" volatile="true" derived="true"
	 * @generated NOT
	 */
	EList<CourseInstance> getCurrentCourses();

	/**
	 * Returns the value of the '<em><b>Exams</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exams</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exams</em>' attribute.
	 * @see #setExams(EList)
	 * @see course.CoursePackage#getStudies_Exams()
	 * @model required="true" many="false" transient="true"
	 * @generated NOT
	 */
	EList<CourseInstance> getExams();

	/**
	 * Sets the value of the '{@link course.Studies#getExams <em>Exams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exams</em>' attribute.
	 * @see #getExams()
	 * @generated NOT
	 */
	void setExams(EList<CourseInstance> value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(double)
	 * @see course.CoursePackage#getStudies_Credits()
	 * @model required="true"
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link course.Studies#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model courseInstanceRequired="true"
	 * @generated
	 */
	void signUpForExam(CourseInstance courseInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model courseInstanceRequired="true"
	 * @generated
	 */
	void signOffFromExam(CourseInstance courseInstance);
	
	//Helper method for test cases
	void addExam(CourseInstance courseInstance);

} // Studies
