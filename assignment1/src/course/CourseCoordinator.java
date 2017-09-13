/**
 */
package course;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.CourseCoordinator#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getCourseCoordinator()
 * @model
 * @generated
 */
public interface CourseCoordinator extends Person {
	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Organisation#getCourseCoordinator <em>Course Coordinator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' container reference.
	 * @see #setOrganisation(Organisation)
	 * @see course.CoursePackage#getCourseCoordinator_Organisation()
	 * @see course.Organisation#getCourseCoordinator
	 * @model opposite="courseCoordinator" required="true" transient="false"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link course.CourseCoordinator#getOrganisation <em>Organisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' container reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

} // CourseCoordinator
