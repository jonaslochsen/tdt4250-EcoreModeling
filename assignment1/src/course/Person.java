/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Person#getName <em>Name</em>}</li>
 *   <li>{@link course.Person#getEmployment <em>Employment</em>}</li>
 *   <li>{@link course.Person#getStudies <em>Studies</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
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
	 * @see course.CoursePackage#getPerson_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employment</b></em>' reference list.
	 * The list contents are of type {@link course.Employment}.
	 * It is bidirectional and its opposite is '{@link course.Employment#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment</em>' reference list.
	 * @see course.CoursePackage#getPerson_Employment()
	 * @see course.Employment#getEmployee
	 * @model opposite="employee" required="true"
	 * @generated
	 */
	EList<Employment> getEmployment();

	/**
	 * Returns the value of the '<em><b>Studies</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link course.Studies#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Studies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studies</em>' containment reference.
	 * @see #setStudies(Studies)
	 * @see course.CoursePackage#getPerson_Studies()
	 * @see course.Studies#getStudent
	 * @model opposite="student" containment="true"
	 * @generated
	 */
	Studies getStudies();

	/**
	 * Sets the value of the '{@link course.Person#getStudies <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studies</em>' containment reference.
	 * @see #getStudies()
	 * @generated
	 */
	void setStudies(Studies value);
	
	void addEmployment(Employment e);

} // Person
