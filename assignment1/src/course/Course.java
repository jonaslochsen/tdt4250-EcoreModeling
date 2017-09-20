/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Course#getCode <em>Code</em>}</li>
 *   <li>{@link course.Course#getName <em>Name</em>}</li>
 *   <li>{@link course.Course#getContent <em>Content</em>}</li>
 *   <li>{@link course.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link course.Course#getStudyPrograms <em>Study Programs</em>}</li>
 *   <li>{@link course.Course#getCourseInstances <em>Course Instances</em>}</li>
 *   <li>{@link course.Course#getDepartment <em>Department</em>}</li>
 *   <li>{@link course.Course#getPreRequisities <em>Pre Requisities</em>}</li>
 *   <li>{@link course.Course#getCourseReductions <em>Course Reductions</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see course.CoursePackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link course.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

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
	 * @see course.CoursePackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see course.CoursePackage#getCourse_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link course.Course#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

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
	 * @see course.CoursePackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	double getCredits();

	/**
	 * Sets the value of the '{@link course.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(double value);

	/**
	 * Returns the value of the '<em><b>Study Programs</b></em>' reference list.
	 * The list contents are of type {@link course.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Programs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Programs</em>' reference list.
	 * @see course.CoursePackage#getCourse_StudyPrograms()
	 * @model
	 * @generated
	 */
	EList<StudyProgram> getStudyPrograms();

	/**
	 * Returns the value of the '<em><b>Course Instances</b></em>' containment reference list.
	 * The list contents are of type {@link course.CourseInstance}.
	 * It is bidirectional and its opposite is '{@link course.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Instances</em>' containment reference list.
	 * @see course.CoursePackage#getCourse_CourseInstances()
	 * @see course.CourseInstance#getCourse
	 * @model opposite="course" containment="true"
	 * @generated
	 */
	EList<CourseInstance> getCourseInstances();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Department</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see course.CoursePackage#getCourse_Department()
	 * @see course.Department#getCourses
	 * @model opposite="courses" required="true" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link course.Course#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Pre Requisities</b></em>' reference list.
	 * The list contents are of type {@link course.Course}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Requisities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Requisities</em>' reference list.
	 * @see course.CoursePackage#getCourse_PreRequisities()
	 * @model
	 * @generated
	 */
	EList<Course> getPreRequisities();

	/**
	 * Returns the value of the '<em><b>Course Reductions</b></em>' containment reference list.
	 * The list contents are of type {@link course.CoursePointReduction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Reductions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Reductions</em>' containment reference list.
	 * @see course.CoursePackage#getCourse_CourseReductions()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoursePointReduction> getCourseReductions();
	
	void addCourseReduction(CoursePointReduction e);

} // Course
