/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.TimetableEntry#getDay <em>Day</em>}</li>
 *   <li>{@link course.TimetableEntry#getRoom <em>Room</em>}</li>
 *   <li>{@link course.TimetableEntry#getTime <em>Time</em>}</li>
 *   <li>{@link course.TimetableEntry#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link course.TimetableEntry#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getTimetableEntry()
 * @model
 * @generated
 */
public interface TimetableEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * The literals are from the enumeration {@link course.DayOfWeek}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see course.DayOfWeek
	 * @see #setDay(DayOfWeek)
	 * @see course.CoursePackage#getTimetableEntry_Day()
	 * @model required="true"
	 * @generated
	 */
	DayOfWeek getDay();

	/**
	 * Sets the value of the '{@link course.TimetableEntry#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see course.DayOfWeek
	 * @see #getDay()
	 * @generated
	 */
	void setDay(DayOfWeek value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' attribute.
	 * @see #setRoom(String)
	 * @see course.CoursePackage#getTimetableEntry_Room()
	 * @model required="true"
	 * @generated
	 */
	String getRoom();

	/**
	 * Sets the value of the '{@link course.TimetableEntry#getRoom <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' attribute.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see course.CoursePackage#getTimetableEntry_Time()
	 * @model required="true"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link course.TimetableEntry#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' reference list.
	 * The list contents are of type {@link course.StudyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Study Program</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' reference list.
	 * @see course.CoursePackage#getTimetableEntry_StudyProgram()
	 * @model
	 * @generated
	 */
	EList<StudyProgram> getStudyProgram();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link course.TypeOfInstruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see course.TypeOfInstruction
	 * @see #setType(TypeOfInstruction)
	 * @see course.CoursePackage#getTimetableEntry_Type()
	 * @model
	 * @generated
	 */
	TypeOfInstruction getType();

	/**
	 * Sets the value of the '{@link course.TimetableEntry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see course.TypeOfInstruction
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfInstruction value);

} // TimetableEntry
