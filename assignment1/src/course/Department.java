/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Department#getName <em>Name</em>}</li>
 *   <li>{@link course.Department#getShortName <em>Short Name</em>}</li>
 *   <li>{@link course.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link course.Department#getStudyPrograms <em>Study Programs</em>}</li>
 *   <li>{@link course.Department#getFaculty <em>Faculty</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see course.CoursePackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see course.CoursePackage#getDepartment_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link course.Department#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link course.Course}.
	 * It is bidirectional and its opposite is '{@link course.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Courses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see course.CoursePackage#getDepartment_Courses()
	 * @see course.Course#getDepartment
	 * @model opposite="department" containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Study Programs</b></em>' containment reference list.
	 * The list contents are of type {@link course.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Programs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Programs</em>' containment reference list.
	 * @see course.CoursePackage#getDepartment_StudyPrograms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StudyProgram> getStudyPrograms();

	/**
	 * Returns the value of the '<em><b>Faculty</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Faculty#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faculty</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty</em>' container reference.
	 * @see #setFaculty(Faculty)
	 * @see course.CoursePackage#getDepartment_Faculty()
	 * @see course.Faculty#getDepartments
	 * @model opposite="departments" required="true" transient="false"
	 * @generated
	 */
	Faculty getFaculty();

	/**
	 * Sets the value of the '{@link course.Department#getFaculty <em>Faculty</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty</em>' container reference.
	 * @see #getFaculty()
	 * @generated
	 */
	void setFaculty(Faculty value);

} // Department
