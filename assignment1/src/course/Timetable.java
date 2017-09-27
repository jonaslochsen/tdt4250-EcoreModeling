/**
 */
package course;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link course.Timetable#getCourseInstance <em>Course Instance</em>}</li>
 *   <li>{@link course.Timetable#getTimetableEntry <em>Timetable Entry</em>}</li>
 * </ul>
 *
 * @see course.CoursePackage#getTimetable()
 * @model
 * @generated
 */
public interface Timetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link course.CourseInstance#getTimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Instance</em>' container reference.
	 * @see #setCourseInstance(CourseInstance)
	 * @see course.CoursePackage#getTimetable_CourseInstance()
	 * @see course.CourseInstance#getTimeTable
	 * @model opposite="timeTable" required="true" transient="false"
	 * @generated
	 */
	CourseInstance getCourseInstance();

	/**
	 * Sets the value of the '{@link course.Timetable#getCourseInstance <em>Course Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Instance</em>' container reference.
	 * @see #getCourseInstance()
	 * @generated
	 */
	void setCourseInstance(CourseInstance value);

	/**
	 * Returns the value of the '<em><b>Timetable Entry</b></em>' containment reference list.
	 * The list contents are of type {@link course.TimetableEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timetable Entry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetable Entry</em>' containment reference list.
	 * @see course.CoursePackage#getTimetable_TimetableEntry()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimetableEntry> getTimetableEntry();
	
	void addTimetableEntry(TimetableEntry e);

} // Timetable
