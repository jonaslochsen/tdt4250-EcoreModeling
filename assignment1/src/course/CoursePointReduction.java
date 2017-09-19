/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.CoursePointReduction#getReduction <em>Reduction</em>}</li>
 *   <li>{@link course.CoursePointReduction#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getCoursePointReduction()
 * @model
 * @generated
 */
public interface CoursePointReduction extends EObject {
	/**
	 * Returns the value of the '<em><b>Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduction</em>' attribute.
	 * @see #setReduction(double)
	 * @see course.CoursePackage#getCoursePointReduction_Reduction()
	 * @model required="true"
	 * @generated
	 */
	double getReduction();

	/**
	 * Sets the value of the '{@link course.CoursePointReduction#getReduction <em>Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduction</em>' attribute.
	 * @see #getReduction()
	 * @generated
	 */
	void setReduction(double value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see course.CoursePackage#getCoursePointReduction_Course()
	 * @model required="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link course.CoursePointReduction#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CoursePointReduction
