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
 *   <li>{@link course.Organisation#getCourseCoordinator <em>Course Coordinator</em>}</li>
 *   <li>{@link course.Organisation#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link course.Organisation#getTa <em>Ta</em>}</li>
 *   <li>{@link course.Organisation#getCourseInstance <em>Course Instance</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Coordinator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link course.CourseCoordinator#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Coordinator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Coordinator</em>' containment reference.
	 * @see #setCourseCoordinator(CourseCoordinator)
	 * @see course.CoursePackage#getOrganisation_CourseCoordinator()
	 * @see course.CourseCoordinator#getOrganisation
	 * @model opposite="organisation" containment="true" required="true"
	 * @generated
	 */
	CourseCoordinator getCourseCoordinator();

	/**
	 * Sets the value of the '{@link course.Organisation#getCourseCoordinator <em>Course Coordinator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Coordinator</em>' containment reference.
	 * @see #getCourseCoordinator()
	 * @generated
	 */
	void setCourseCoordinator(CourseCoordinator value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' containment reference list.
	 * The list contents are of type {@link course.Lecturer}.
	 * It is bidirectional and its opposite is '{@link course.Lecturer#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lecturer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' containment reference list.
	 * @see course.CoursePackage#getOrganisation_Lecturer()
	 * @see course.Lecturer#getOrganisation
	 * @model opposite="organisation" containment="true" required="true"
	 * @generated
	 */
	EList<Lecturer> getLecturer();

	/**
	 * Returns the value of the '<em><b>Ta</b></em>' containment reference list.
	 * The list contents are of type {@link course.TA}.
	 * It is bidirectional and its opposite is '{@link course.TA#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ta</em>' containment reference list.
	 * @see course.CoursePackage#getOrganisation_Ta()
	 * @see course.TA#getOrganisation
	 * @model opposite="organisation" containment="true"
	 * @generated
	 */
	EList<TA> getTa();

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

} // Organisation
