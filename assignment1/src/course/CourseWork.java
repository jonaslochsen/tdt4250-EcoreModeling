/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.CourseWork#getLectureHours <em>Lecture Hours</em>}</li>
 *   <li>{@link course.CourseWork#getLabHours <em>Lab Hours</em>}</li>
 *   <li>{@link course.CourseWork#getCourseInstance <em>Course Instance</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getCourseWork()
 * @model
 * @generated
 */
public interface CourseWork extends EObject {
	/**
	 * Returns the value of the '<em><b>Lecture Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecture Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecture Hours</em>' attribute.
	 * @see #setLectureHours(int)
	 * @see course.CoursePackage#getCourseWork_LectureHours()
	 * @model required="true"
	 * @generated
	 */
	int getLectureHours();

	/**
	 * Sets the value of the '{@link course.CourseWork#getLectureHours <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecture Hours</em>' attribute.
	 * @see #getLectureHours()
	 * @generated
	 */
	void setLectureHours(int value);

	/**
	 * Returns the value of the '<em><b>Lab Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lab Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lab Hours</em>' attribute.
	 * @see #setLabHours(int)
	 * @see course.CoursePackage#getCourseWork_LabHours()
	 * @model
	 * @generated
	 */
	int getLabHours();

	/**
	 * Sets the value of the '{@link course.CourseWork#getLabHours <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lab Hours</em>' attribute.
	 * @see #getLabHours()
	 * @generated
	 */
	void setLabHours(int value);

	/**
	 * Returns the value of the '<em><b>Course Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.CourseInstance#getCourseWork <em>Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Instance</em>' container reference.
	 * @see #setCourseInstance(CourseInstance)
	 * @see course.CoursePackage#getCourseWork_CourseInstance()
	 * @see course.CourseInstance#getCourseWork
	 * @model opposite="courseWork" required="true" transient="false"
	 * @generated
	 */
	CourseInstance getCourseInstance();

	/**
	 * Sets the value of the '{@link course.CourseWork#getCourseInstance <em>Course Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Instance</em>' container reference.
	 * @see #getCourseInstance()
	 * @generated
	 */
	void setCourseInstance(CourseInstance value);

} // CourseWork
