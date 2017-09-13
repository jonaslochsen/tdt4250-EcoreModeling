/**
 */
package course.impl;

import course.CoursePackage;
import course.DayOfWeek;
import course.StudyProgram;
import course.TimetableEntry;
import course.TypeOfInstruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.TimetableEntryImpl#getDay <em>Day</em>}</li>
 *   <li>{@link course.impl.TimetableEntryImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link course.impl.TimetableEntryImpl#getTime <em>Time</em>}</li>
 *   <li>{@link course.impl.TimetableEntryImpl#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link course.impl.TimetableEntryImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableEntryImpl extends MinimalEObjectImpl.Container implements TimetableEntry {
	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final DayOfWeek DAY_EDEFAULT = DayOfWeek.MONDAY;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected DayOfWeek day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected String room = ROOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyProgram() <em>Study Program</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyProgram;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeOfInstruction TYPE_EDEFAULT = TypeOfInstruction.LAB;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeOfInstruction type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.TIMETABLE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(DayOfWeek newDay) {
		DayOfWeek oldDay = day;
		day = newDay == null ? DAY_EDEFAULT : newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.TIMETABLE_ENTRY__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(String newRoom) {
		String oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.TIMETABLE_ENTRY__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.TIMETABLE_ENTRY__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyProgram() {
		if (studyProgram == null) {
			studyProgram = new EObjectResolvingEList<StudyProgram>(StudyProgram.class, this, CoursePackage.TIMETABLE_ENTRY__STUDY_PROGRAM);
		}
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfInstruction getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeOfInstruction newType) {
		TypeOfInstruction oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.TIMETABLE_ENTRY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursePackage.TIMETABLE_ENTRY__DAY:
				return getDay();
			case CoursePackage.TIMETABLE_ENTRY__ROOM:
				return getRoom();
			case CoursePackage.TIMETABLE_ENTRY__TIME:
				return getTime();
			case CoursePackage.TIMETABLE_ENTRY__STUDY_PROGRAM:
				return getStudyProgram();
			case CoursePackage.TIMETABLE_ENTRY__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursePackage.TIMETABLE_ENTRY__DAY:
				setDay((DayOfWeek)newValue);
				return;
			case CoursePackage.TIMETABLE_ENTRY__ROOM:
				setRoom((String)newValue);
				return;
			case CoursePackage.TIMETABLE_ENTRY__TIME:
				setTime((String)newValue);
				return;
			case CoursePackage.TIMETABLE_ENTRY__STUDY_PROGRAM:
				getStudyProgram().clear();
				getStudyProgram().addAll((Collection<? extends StudyProgram>)newValue);
				return;
			case CoursePackage.TIMETABLE_ENTRY__TYPE:
				setType((TypeOfInstruction)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoursePackage.TIMETABLE_ENTRY__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case CoursePackage.TIMETABLE_ENTRY__ROOM:
				setRoom(ROOM_EDEFAULT);
				return;
			case CoursePackage.TIMETABLE_ENTRY__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case CoursePackage.TIMETABLE_ENTRY__STUDY_PROGRAM:
				getStudyProgram().clear();
				return;
			case CoursePackage.TIMETABLE_ENTRY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoursePackage.TIMETABLE_ENTRY__DAY:
				return day != DAY_EDEFAULT;
			case CoursePackage.TIMETABLE_ENTRY__ROOM:
				return ROOM_EDEFAULT == null ? room != null : !ROOM_EDEFAULT.equals(room);
			case CoursePackage.TIMETABLE_ENTRY__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case CoursePackage.TIMETABLE_ENTRY__STUDY_PROGRAM:
				return studyProgram != null && !studyProgram.isEmpty();
			case CoursePackage.TIMETABLE_ENTRY__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (day: ");
		result.append(day);
		result.append(", room: ");
		result.append(room);
		result.append(", time: ");
		result.append(time);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TimetableEntryImpl
