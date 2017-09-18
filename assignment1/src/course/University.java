/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.University#getName <em>Name</em>}</li>
 *   <li>{@link course.University#getFaculties <em>Faculties</em>}</li>
 *   <li>{@link course.University#getPeople <em>People</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
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
	 * @see course.CoursePackage#getUniversity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link course.University#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Faculties</b></em>' containment reference list.
	 * The list contents are of type {@link course.Faculty}.
	 * It is bidirectional and its opposite is '{@link course.Faculty#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faculties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculties</em>' containment reference list.
	 * @see course.CoursePackage#getUniversity_Faculties()
	 * @see course.Faculty#getUniversity
	 * @model opposite="university" containment="true"
	 * @generated
	 */
	EList<Faculty> getFaculties();

	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link course.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see course.CoursePackage#getUniversity_People()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Person> getPeople();

} // University
