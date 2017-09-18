/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.CourseInstance#getCourse <em>Course</em>}</li>
 *   <li>{@link course.CourseInstance#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link course.CourseInstance#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link course.CourseInstance#getCourseWork <em>Course Work</em>}</li>
 *   <li>{@link course.CourseInstance#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link course.CourseInstance#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getCourseInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scheduledHours'"
 * @generated
 */
public interface CourseInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Course#getCourseInstances <em>Course Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' container reference.
	 * @see #setCourse(Course)
	 * @see course.CoursePackage#getCourseInstance_Course()
	 * @see course.Course#getCourseInstances
	 * @model opposite="courseInstances" required="true" transient="false"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link course.CourseInstance#getCourse <em>Course</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' container reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link course.Organisation#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' containment reference.
	 * @see #setOrganisation(Organisation)
	 * @see course.CoursePackage#getCourseInstance_Organisation()
	 * @see course.Organisation#getCourseInstance
	 * @model opposite="courseInstance" containment="true" required="true"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link course.CourseInstance#getOrganisation <em>Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' containment reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link course.Evaluation#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference.
	 * @see #setEvaluation(Evaluation)
	 * @see course.CoursePackage#getCourseInstance_Evaluation()
	 * @see course.Evaluation#getCourseInstance
	 * @model opposite="courseInstance" containment="true" required="true"
	 * @generated
	 */
	Evaluation getEvaluation();

	/**
	 * Sets the value of the '{@link course.CourseInstance#getEvaluation <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' containment reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Evaluation value);

	/**
	 * Returns the value of the '<em><b>Course Work</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link course.CourseWork#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Work</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Work</em>' containment reference.
	 * @see #setCourseWork(CourseWork)
	 * @see course.CoursePackage#getCourseInstance_CourseWork()
	 * @see course.CourseWork#getCourseInstance
	 * @model opposite="courseInstance" containment="true" required="true"
	 * @generated
	 */
	CourseWork getCourseWork();

	/**
	 * Sets the value of the '{@link course.CourseInstance#getCourseWork <em>Course Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Work</em>' containment reference.
	 * @see #getCourseWork()
	 * @generated
	 */
	void setCourseWork(CourseWork value);

	/**
	 * Returns the value of the '<em><b>Time Table</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link course.Timetable#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Table</em>' containment reference.
	 * @see #setTimeTable(Timetable)
	 * @see course.CoursePackage#getCourseInstance_TimeTable()
	 * @see course.Timetable#getCourseInstance
	 * @model opposite="courseInstance" containment="true" required="true"
	 * @generated
	 */
	Timetable getTimeTable();

	/**
	 * Sets the value of the '{@link course.CourseInstance#getTimeTable <em>Time Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Table</em>' containment reference.
	 * @see #getTimeTable()
	 * @generated
	 */
	void setTimeTable(Timetable value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link course.semesterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see course.semesterType
	 * @see #setSemester(semesterType)
	 * @see course.CoursePackage#getCourseInstance_Semester()
	 * @model required="true"
	 * @generated
	 */
	semesterType getSemester();

	/**
	 * Sets the value of the '{@link course.CourseInstance#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see course.semesterType
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(semesterType value);

} // CourseInstance
