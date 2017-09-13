/**
 */
package course.impl;

import course.CourseInstance;
import course.CoursePackage;
import course.CourseWork;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.CourseWorkImpl#getLectureHours <em>Lecture Hours</em>}</li>
 *   <li>{@link course.impl.CourseWorkImpl#getLabHours <em>Lab Hours</em>}</li>
 *   <li>{@link course.impl.CourseWorkImpl#getCourseInstance <em>Course Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseWorkImpl extends MinimalEObjectImpl.Container implements CourseWork {
	/**
	 * The default value of the '{@link #getLectureHours() <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHours()
	 * @generated
	 * @ordered
	 */
	protected static final int LECTURE_HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLectureHours() <em>Lecture Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLectureHours()
	 * @generated
	 * @ordered
	 */
	protected int lectureHours = LECTURE_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabHours() <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabHours()
	 * @generated
	 * @ordered
	 */
	protected static final int LAB_HOURS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLabHours() <em>Lab Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabHours()
	 * @generated
	 * @ordered
	 */
	protected int labHours = LAB_HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseWorkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.COURSE_WORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLectureHours() {
		return lectureHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLectureHours(int newLectureHours) {
		int oldLectureHours = lectureHours;
		lectureHours = newLectureHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_WORK__LECTURE_HOURS, oldLectureHours, lectureHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLabHours() {
		return labHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabHours(int newLabHours) {
		int oldLabHours = labHours;
		labHours = newLabHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_WORK__LAB_HOURS, oldLabHours, labHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourseInstance() {
		if (eContainerFeatureID() != CoursePackage.COURSE_WORK__COURSE_INSTANCE) return null;
		return (CourseInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseInstance(CourseInstance newCourseInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourseInstance, CoursePackage.COURSE_WORK__COURSE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseInstance(CourseInstance newCourseInstance) {
		if (newCourseInstance != eInternalContainer() || (eContainerFeatureID() != CoursePackage.COURSE_WORK__COURSE_INSTANCE && newCourseInstance != null)) {
			if (EcoreUtil.isAncestor(this, newCourseInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseInstance != null)
				msgs = ((InternalEObject)newCourseInstance).eInverseAdd(this, CoursePackage.COURSE_INSTANCE__COURSE_WORK, CourseInstance.class, msgs);
			msgs = basicSetCourseInstance(newCourseInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE_WORK__COURSE_INSTANCE, newCourseInstance, newCourseInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourseInstance((CourseInstance)otherEnd, msgs);
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
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				return basicSetCourseInstance(null, msgs);
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
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, CoursePackage.COURSE_INSTANCE__COURSE_WORK, CourseInstance.class, msgs);
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
			case CoursePackage.COURSE_WORK__LECTURE_HOURS:
				return getLectureHours();
			case CoursePackage.COURSE_WORK__LAB_HOURS:
				return getLabHours();
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				return getCourseInstance();
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
			case CoursePackage.COURSE_WORK__LECTURE_HOURS:
				setLectureHours((Integer)newValue);
				return;
			case CoursePackage.COURSE_WORK__LAB_HOURS:
				setLabHours((Integer)newValue);
				return;
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)newValue);
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
			case CoursePackage.COURSE_WORK__LECTURE_HOURS:
				setLectureHours(LECTURE_HOURS_EDEFAULT);
				return;
			case CoursePackage.COURSE_WORK__LAB_HOURS:
				setLabHours(LAB_HOURS_EDEFAULT);
				return;
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)null);
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
			case CoursePackage.COURSE_WORK__LECTURE_HOURS:
				return lectureHours != LECTURE_HOURS_EDEFAULT;
			case CoursePackage.COURSE_WORK__LAB_HOURS:
				return labHours != LAB_HOURS_EDEFAULT;
			case CoursePackage.COURSE_WORK__COURSE_INSTANCE:
				return getCourseInstance() != null;
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
		result.append(" (lectureHours: ");
		result.append(lectureHours);
		result.append(", labHours: ");
		result.append(labHours);
		result.append(')');
		return result.toString();
	}

} //CourseWorkImpl
