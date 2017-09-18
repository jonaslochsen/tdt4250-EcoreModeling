/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Employment#getEmployment <em>Employment</em>}</li>
 *   <li>{@link course.Employment#getEmployee <em>Employee</em>}</li>
 *   <li>{@link course.Employment#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getEmployment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotBeStudentAndTAInSameCourse'"
 * @generated
 */
public interface Employment extends EObject {
	/**
	 * Returns the value of the '<em><b>Employment</b></em>' attribute list.
	 * The list contents are of type {@link course.TypeOfEmployment}.
	 * The literals are from the enumeration {@link course.TypeOfEmployment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employment</em>' attribute list.
	 * @see course.TypeOfEmployment
	 * @see course.CoursePackage#getEmployment_Employment()
	 * @model required="true"
	 * @generated
	 */
	EList<TypeOfEmployment> getEmployment();

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link course.Person#getEmployment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference.
	 * @see #setEmployee(Person)
	 * @see course.CoursePackage#getEmployment_Employee()
	 * @see course.Person#getEmployment
	 * @model opposite="employment" required="true"
	 * @generated
	 */
	Person getEmployee();

	/**
	 * Sets the value of the '{@link course.Employment#getEmployee <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee</em>' reference.
	 * @see #getEmployee()
	 * @generated
	 */
	void setEmployee(Person value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.Organisation#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' container reference.
	 * @see #setOrganisation(Organisation)
	 * @see course.CoursePackage#getEmployment_Organisation()
	 * @see course.Organisation#getEmployees
	 * @model opposite="employees" required="true" transient="false"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link course.Employment#getOrganisation <em>Organisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' container reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

} // Employment
