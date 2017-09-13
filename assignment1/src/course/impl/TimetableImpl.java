/**
 */
package course.impl;

import course.CourseInstance;
import course.CoursePackage;
import course.Timetable;
import course.TimetableEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.TimetableImpl#getCourseInstance <em>Course Instance</em>}</li>
 *   <li>{@link course.impl.TimetableImpl#getTimetableEntry <em>Timetable Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends MinimalEObjectImpl.Container implements Timetable {
	/**
	 * The cached value of the '{@link #getTimetableEntry() <em>Timetable Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetableEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<TimetableEntry> timetableEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourseInstance() {
		if (eContainerFeatureID() != CoursePackage.TIMETABLE__COURSE_INSTANCE) return null;
		return (CourseInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseInstance(CourseInstance newCourseInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourseInstance, CoursePackage.TIMETABLE__COURSE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseInstance(CourseInstance newCourseInstance) {
		if (newCourseInstance != eInternalContainer() || (eContainerFeatureID() != CoursePackage.TIMETABLE__COURSE_INSTANCE && newCourseInstance != null)) {
			if (EcoreUtil.isAncestor(this, newCourseInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseInstance != null)
				msgs = ((InternalEObject)newCourseInstance).eInverseAdd(this, CoursePackage.COURSE_INSTANCE__TIME_TABLE, CourseInstance.class, msgs);
			msgs = basicSetCourseInstance(newCourseInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.TIMETABLE__COURSE_INSTANCE, newCourseInstance, newCourseInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimetableEntry> getTimetableEntry() {
		if (timetableEntry == null) {
			timetableEntry = new EObjectContainmentEList<TimetableEntry>(TimetableEntry.class, this, CoursePackage.TIMETABLE__TIMETABLE_ENTRY);
		}
		return timetableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
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
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
				return basicSetCourseInstance(null, msgs);
			case CoursePackage.TIMETABLE__TIMETABLE_ENTRY:
				return ((InternalEList<?>)getTimetableEntry()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, CoursePackage.COURSE_INSTANCE__TIME_TABLE, CourseInstance.class, msgs);
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
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
				return getCourseInstance();
			case CoursePackage.TIMETABLE__TIMETABLE_ENTRY:
				return getTimetableEntry();
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
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)newValue);
				return;
			case CoursePackage.TIMETABLE__TIMETABLE_ENTRY:
				getTimetableEntry().clear();
				getTimetableEntry().addAll((Collection<? extends TimetableEntry>)newValue);
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
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)null);
				return;
			case CoursePackage.TIMETABLE__TIMETABLE_ENTRY:
				getTimetableEntry().clear();
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
			case CoursePackage.TIMETABLE__COURSE_INSTANCE:
				return getCourseInstance() != null;
			case CoursePackage.TIMETABLE__TIMETABLE_ENTRY:
				return timetableEntry != null && !timetableEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimetableImpl
