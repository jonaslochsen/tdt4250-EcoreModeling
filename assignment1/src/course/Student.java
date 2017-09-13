/**
 */
package course;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Student#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link course.Student#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends Person {
	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.StudyProgram#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Program</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' container reference.
	 * @see #setStudyProgram(StudyProgram)
	 * @see course.CoursePackage#getStudent_StudyProgram()
	 * @see course.StudyProgram#getStudents
	 * @model opposite="students" required="true" transient="false"
	 * @generated
	 */
	StudyProgram getStudyProgram();

	/**
	 * Sets the value of the '{@link course.Student#getStudyProgram <em>Study Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Program</em>' container reference.
	 * @see #getStudyProgram()
	 * @generated
	 */
	void setStudyProgram(StudyProgram value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' reference list.
	 * The list contents are of type {@link course.Evaluation}.
	 * It is bidirectional and its opposite is '{@link course.Evaluation#getRegisteredStudents <em>Registered Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' reference list.
	 * @see course.CoursePackage#getStudent_Evaluation()
	 * @see course.Evaluation#getRegisteredStudents
	 * @model opposite="registeredStudents"
	 * @generated
	 */
	EList<Evaluation> getEvaluation();

} // Student
