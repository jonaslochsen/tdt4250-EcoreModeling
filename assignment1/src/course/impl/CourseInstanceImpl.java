/**
 */
package course.impl;

import course.Course;
import course.CourseInstance;
import course.CoursePackage;
import course.CourseWork;
import course.Evaluation;
import course.Organisation;
import course.Timetable;

import course.semesterType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.CourseInstanceImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link course.impl.CourseInstanceImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link course.impl.CourseInstanceImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link course.impl.CourseInstanceImpl#getCourseWork <em>Course Work</em>}</li>
 *   <li>{@link course.impl.CourseInstanceImpl#getTimeTable <em>Time Table</em>}</li>
 *   <li>{@link course.impl.CourseInstanceImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstanceImpl extends MinimalEObjectImpl.Container implements CourseInstance {
	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected Organisation organisation;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Evaluation evaluation;

	/**
	 * The cached value of the '{@link #getCourseWork() <em>Course Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseWork()
	 * @generated
	 * @ordered
	 */
	protected CourseWork courseWork;

	/**
	 * The cached value of the '{@link #getTimeTable() <em>Time Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTable()
	 * @generated
	 * @ordered
	 */
	protected Timetable timeTable;

	/**
	 * The default value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected static final semesterType SEMESTER_EDEFAULT = semesterType.SPRING;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected semesterType semester = SEMESTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.COURSE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getCourse() {
		if (eContainerFeatureID() != CoursePackage.COURSE_INSTANCE__COURSE) return null;
		return (Course)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourse, CoursePackage.COURSE_INSTANCE__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourse(Course newCourse) {
		if (newCourse != eInternalContainer() || (eContainerFeatureID() != CoursePackage.COURSE_INSTANCE__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, CoursePackage.COURSE__COURSE_INSTANCES, Course.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation getOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(Organisation newOrganisation, NotificationChain msgs) {
		Organisation oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__ORGANISATION, oldOrganisation, newOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(Organisation newOrganisation) {
		if (newOrganisation != organisation) {
			NotificationChain msgs = null;
			if (organisation != null)
				msgs = ((InternalEObject)organisation).eInverseRemove(this, CoursePackage.ORGANISATION__COURSE_INSTANCE, Organisation.class, msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject)newOrganisation).eInverseAdd(this, CoursePackage.ORGANISATION__COURSE_INSTANCE, Organisation.class, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__ORGANISATION, newOrganisation, newOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluation(Evaluation newEvaluation, NotificationChain msgs) {
		Evaluation oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__EVALUATION, oldEvaluation, newEvaluation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Evaluation newEvaluation) {
		if (newEvaluation != evaluation) {
			NotificationChain msgs = null;
			if (evaluation != null)
				msgs = ((InternalEObject)evaluation).eInverseRemove(this, CoursePackage.EVALUATION__COURSE_INSTANCE, Evaluation.class, msgs);
			if (newEvaluation != null)
				msgs = ((InternalEObject)newEvaluation).eInverseAdd(this, CoursePackage.EVALUATION__COURSE_INSTANCE, Evaluation.class, msgs);
			msgs = basicSetEvaluation(newEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__EVALUATION, newEvaluation, newEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWork getCourseWork() {
		return courseWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseWork(CourseWork newCourseWork, NotificationChain msgs) {
		CourseWork oldCourseWork = courseWork;
		courseWork = newCourseWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__COURSE_WORK, oldCourseWork, newCourseWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseWork(CourseWork newCourseWork) {
		if (newCourseWork != courseWork) {
			NotificationChain msgs = null;
			if (courseWork != null)
				msgs = ((InternalEObject)courseWork).eInverseRemove(this, CoursePackage.COURSE_WORK__COURSE_INSTANCE, CourseWork.class, msgs);
			if (newCourseWork != null)
				msgs = ((InternalEObject)newCourseWork).eInverseAdd(this, CoursePackage.COURSE_WORK__COURSE_INSTANCE, CourseWork.class, msgs);
			msgs = basicSetCourseWork(newCourseWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__COURSE_WORK, newCourseWork, newCourseWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable getTimeTable() {
		return timeTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTable(Timetable newTimeTable, NotificationChain msgs) {
		Timetable oldTimeTable = timeTable;
		timeTable = newTimeTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__TIME_TABLE, oldTimeTable, newTimeTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeTable(Timetable newTimeTable) {
		if (newTimeTable != timeTable) {
			NotificationChain msgs = null;
			if (timeTable != null)
				msgs = ((InternalEObject)timeTable).eInverseRemove(this, CoursePackage.TIMETABLE__COURSE_INSTANCE, Timetable.class, msgs);
			if (newTimeTable != null)
				msgs = ((InternalEObject)newTimeTable).eInverseAdd(this, CoursePackage.TIMETABLE__COURSE_INSTANCE, Timetable.class, msgs);
			msgs = basicSetTimeTable(newTimeTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__TIME_TABLE, newTimeTable, newTimeTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public semesterType getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemester(semesterType newSemester) {
		semesterType oldSemester = semester;
		semester = newSemester == null ? SEMESTER_EDEFAULT : newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_INSTANCE__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.COURSE_INSTANCE__COURSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourse((Course)otherEnd, msgs);
			case CoursePackage.COURSE_INSTANCE__ORGANISATION:
				if (organisation != null)
					msgs = ((InternalEObject)organisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursePackage.COURSE_INSTANCE__ORGANISATION, null, msgs);
				return basicSetOrganisation((Organisation)otherEnd, msgs);
			case CoursePackage.COURSE_INSTANCE__EVALUATION:
				if (evaluation != null)
					msgs = ((InternalEObject)evaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursePackage.COURSE_INSTANCE__EVALUATION, null, msgs);
				return basicSetEvaluation((Evaluation)otherEnd, msgs);
			case CoursePackage.COURSE_INSTANCE__COURSE_WORK:
				if (courseWork != null)
					msgs = ((InternalEObject)courseWork).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursePackage.COURSE_INSTANCE__COURSE_WORK, null, msgs);
				return basicSetCourseWork((CourseWork)otherEnd, msgs);
			case CoursePackage.COURSE_INSTANCE__TIME_TABLE:
				if (timeTable != null)
					msgs = ((InternalEObject)timeTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursePackage.COURSE_INSTANCE__TIME_TABLE, null, msgs);
				return basicSetTimeTable((Timetable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.COURSE_INSTANCE__COURSE:
				return basicSetCourse(null, msgs);
			case CoursePackage.COURSE_INSTANCE__ORGANISATION:
				return basicSetOrganisation(null, msgs);
			case CoursePackage.COURSE_INSTANCE__EVALUATION:
				return basicSetEvaluation(null, msgs);
			case CoursePackage.COURSE_INSTANCE__COURSE_WORK:
				return basicSetCourseWork(null, msgs);
			case CoursePackage.COURSE_INSTANCE__TIME_TABLE:
				return basicSetTimeTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CoursePackage.COURSE_INSTANCE__COURSE:
				return eInternalContainer().eInverseRemove(this, CoursePackage.COURSE__COURSE_INSTANCES, Course.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursePackage.COURSE_INSTANCE__COURSE:
				return getCourse();
			case CoursePackage.COURSE_INSTANCE__ORGANISATION:
				return getOrganisation();
			case CoursePackage.COURSE_INSTANCE__EVALUATION:
				return getEvaluation();
			case CoursePackage.COURSE_INSTANCE__COURSE_WORK:
				return getCourseWork();
			case CoursePackage.COURSE_INSTANCE__TIME_TABLE:
				return getTimeTable();
			case CoursePackage.COURSE_INSTANCE__SEMESTER:
				return getSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoursePackage.COURSE_INSTANCE__COURSE:
				setCourse((Course)newValue);
				return;
			case CoursePackage.COURSE_INSTANCE__ORGANISATION:
				setOrganisation((Organisation)newValue);
				return;
			case CoursePackage.COURSE_INSTANCE__EVALUATION:
				setEvaluation((Evaluation)newValue);
				return;
			case CoursePackage.COURSE_INSTANCE__COURSE_WORK:
				setCourseWork((CourseWork)newValue);
				return;
			case CoursePackage.COURSE_INSTANCE__TIME_TABLE:
				setTimeTable((Timetable)newValue);
				return;
			case CoursePackage.COURSE_INSTANCE__SEMESTER:
				setSemester((semesterType)newValue);
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
			case CoursePackage.COURSE_INSTANCE__COURSE:
				setCourse((Course)null);
				return;
			case CoursePackage.COURSE_INSTANCE__ORGANISATION:
				setOrganisation((Organisation)null);
				return;
			case CoursePackage.COURSE_INSTANCE__EVALUATION:
				setEvaluation((Evaluation)null);
				return;
			case CoursePackage.COURSE_INSTANCE__COURSE_WORK:
				setCourseWork((CourseWork)null);
				return;
			case CoursePackage.COURSE_INSTANCE__TIME_TABLE:
				setTimeTable((Timetable)null);
				return;
			case CoursePackage.COURSE_INSTANCE__SEMESTER:
				setSemester(SEMESTER_EDEFAULT);
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
			case CoursePackage.COURSE_INSTANCE__COURSE:
				return getCourse() != null;
			case CoursePackage.COURSE_INSTANCE__ORGANISATION:
				return organisation != null;
			case CoursePackage.COURSE_INSTANCE__EVALUATION:
				return evaluation != null;
			case CoursePackage.COURSE_INSTANCE__COURSE_WORK:
				return courseWork != null;
			case CoursePackage.COURSE_INSTANCE__TIME_TABLE:
				return timeTable != null;
			case CoursePackage.COURSE_INSTANCE__SEMESTER:
				return semester != SEMESTER_EDEFAULT;
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
		result.append(" (semester: ");
		result.append(semester);
		result.append(')');
		return result.toString();
	}

} //CourseInstanceImpl
