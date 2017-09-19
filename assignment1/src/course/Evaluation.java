/**
 */
package course;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Evaluation#getExam <em>Exam</em>}</li>
 *   <li>{@link course.Evaluation#getProject <em>Project</em>}</li>
 *   <li>{@link course.Evaluation#getAssigments <em>Assigments</em>}</li>
 *   <li>{@link course.Evaluation#getCourseInstance <em>Course Instance</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getEvaluation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='evaluationMustSumToOne'"
 * @generated
 */
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Exam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' attribute.
	 * @see #setExam(int)
	 * @see course.CoursePackage#getEvaluation_Exam()
	 * @model required="true"
	 * @generated
	 */
	int getExam();

	/**
	 * Sets the value of the '{@link course.Evaluation#getExam <em>Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam</em>' attribute.
	 * @see #getExam()
	 * @generated
	 */
	void setExam(int value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(int)
	 * @see course.CoursePackage#getEvaluation_Project()
	 * @model required="true"
	 * @generated
	 */
	int getProject();

	/**
	 * Sets the value of the '{@link course.Evaluation#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(int value);

	/**
	 * Returns the value of the '<em><b>Assigments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigments</em>' attribute.
	 * @see #setAssigments(int)
	 * @see course.CoursePackage#getEvaluation_Assigments()
	 * @model required="true"
	 * @generated
	 */
	int getAssigments();

	/**
	 * Sets the value of the '{@link course.Evaluation#getAssigments <em>Assigments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigments</em>' attribute.
	 * @see #getAssigments()
	 * @generated
	 */
	void setAssigments(int value);

	/**
	 * Returns the value of the '<em><b>Course Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.CourseInstance#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Instance</em>' container reference.
	 * @see #setCourseInstance(CourseInstance)
	 * @see course.CoursePackage#getEvaluation_CourseInstance()
	 * @see course.CourseInstance#getEvaluation
	 * @model opposite="evaluation" transient="false"
	 * @generated
	 */
	CourseInstance getCourseInstance();

	/**
	 * Sets the value of the '{@link course.Evaluation#getCourseInstance <em>Course Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Instance</em>' container reference.
	 * @see #getCourseInstance()
	 * @generated
	 */
	void setCourseInstance(CourseInstance value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model studentRequired="true"
	 * @generated
	 */
	void completeExam(Studies student);

} // Evaluation
