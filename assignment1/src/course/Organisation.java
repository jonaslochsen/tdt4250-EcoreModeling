/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Organisation#getCourseInstance <em>Course Instance</em>}</li>
 *   <li>{@link course.Organisation#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.CourseInstance#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Instance</em>' container reference.
	 * @see #setCourseInstance(CourseInstance)
	 * @see course.CoursePackage#getOrganisation_CourseInstance()
	 * @see course.CourseInstance#getOrganisation
	 * @model opposite="organisation" transient="false"
	 * @generated
	 */
	CourseInstance getCourseInstance();

	/**
	 * Sets the value of the '{@link course.Organisation#getCourseInstance <em>Course Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Instance</em>' container reference.
	 * @see #getCourseInstance()
	 * @generated
	 */
	void setCourseInstance(CourseInstance value);

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link course.Employment}.
	 * It is bidirectional and its opposite is '{@link course.Employment#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see course.CoursePackage#getOrganisation_Employees()
	 * @see course.Employment#getOrganisation
	 * @model opposite="organisation" containment="true"
	 * @generated
	 */
	EList<Employment> getEmployees();

} // Organisation
