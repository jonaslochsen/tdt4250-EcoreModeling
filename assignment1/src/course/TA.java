/**
 */
package course;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.TA#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getTA()
 * @model
 * @generated
 */
public interface TA extends Person {
	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Organisation#getTa <em>Ta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' container reference.
	 * @see #setOrganisation(Organisation)
	 * @see course.CoursePackage#getTA_Organisation()
	 * @see course.Organisation#getTa
	 * @model opposite="ta" required="true" transient="false"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link course.TA#getOrganisation <em>Organisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' container reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

} // TA
