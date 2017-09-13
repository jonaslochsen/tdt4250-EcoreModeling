/**
 */
package course.impl;

import course.CourseCoordinator;
import course.CourseInstance;
import course.CoursePackage;
import course.Lecturer;
import course.Organisation;
import course.TA;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.OrganisationImpl#getCourseCoordinator <em>Course Coordinator</em>}</li>
 *   <li>{@link course.impl.OrganisationImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link course.impl.OrganisationImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link course.impl.OrganisationImpl#getCourseInstance <em>Course Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends MinimalEObjectImpl.Container implements Organisation {
	/**
	 * The cached value of the '{@link #getCourseCoordinator() <em>Course Coordinator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCoordinator()
	 * @generated
	 * @ordered
	 */
	protected CourseCoordinator courseCoordinator;

	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected EList<Lecturer> lecturer;

	/**
	 * The cached value of the '{@link #getTa() <em>Ta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTa()
	 * @generated
	 * @ordered
	 */
	protected EList<TA> ta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseCoordinator getCourseCoordinator() {
		return courseCoordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseCoordinator(CourseCoordinator newCourseCoordinator, NotificationChain msgs) {
		CourseCoordinator oldCourseCoordinator = courseCoordinator;
		courseCoordinator = newCourseCoordinator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.ORGANISATION__COURSE_COORDINATOR, oldCourseCoordinator, newCourseCoordinator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCoordinator(CourseCoordinator newCourseCoordinator) {
		if (newCourseCoordinator != courseCoordinator) {
			NotificationChain msgs = null;
			if (courseCoordinator != null)
				msgs = ((InternalEObject)courseCoordinator).eInverseRemove(this, CoursePackage.COURSE_COORDINATOR__ORGANISATION, CourseCoordinator.class, msgs);
			if (newCourseCoordinator != null)
				msgs = ((InternalEObject)newCourseCoordinator).eInverseAdd(this, CoursePackage.COURSE_COORDINATOR__ORGANISATION, CourseCoordinator.class, msgs);
			msgs = basicSetCourseCoordinator(newCourseCoordinator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.ORGANISATION__COURSE_COORDINATOR, newCourseCoordinator, newCourseCoordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lecturer> getLecturer() {
		if (lecturer == null) {
			lecturer = new EObjectContainmentWithInverseEList<Lecturer>(Lecturer.class, this, CoursePackage.ORGANISATION__LECTURER, CoursePackage.LECTURER__ORGANISATION);
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TA> getTa() {
		if (ta == null) {
			ta = new EObjectContainmentWithInverseEList<TA>(TA.class, this, CoursePackage.ORGANISATION__TA, CoursePackage.TA__ORGANISATION);
		}
		return ta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourseInstance() {
		if (eContainerFeatureID() != CoursePackage.ORGANISATION__COURSE_INSTANCE) return null;
		return (CourseInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseInstance(CourseInstance newCourseInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourseInstance, CoursePackage.ORGANISATION__COURSE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseInstance(CourseInstance newCourseInstance) {
		if (newCourseInstance != eInternalContainer() || (eContainerFeatureID() != CoursePackage.ORGANISATION__COURSE_INSTANCE && newCourseInstance != null)) {
			if (EcoreUtil.isAncestor(this, newCourseInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseInstance != null)
				msgs = ((InternalEObject)newCourseInstance).eInverseAdd(this, CoursePackage.COURSE_INSTANCE__ORGANISATION, CourseInstance.class, msgs);
			msgs = basicSetCourseInstance(newCourseInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.ORGANISATION__COURSE_INSTANCE, newCourseInstance, newCourseInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.ORGANISATION__COURSE_COORDINATOR:
				if (courseCoordinator != null)
					msgs = ((InternalEObject)courseCoordinator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursePackage.ORGANISATION__COURSE_COORDINATOR, null, msgs);
				return basicSetCourseCoordinator((CourseCoordinator)otherEnd, msgs);
			case CoursePackage.ORGANISATION__LECTURER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLecturer()).basicAdd(otherEnd, msgs);
			case CoursePackage.ORGANISATION__TA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTa()).basicAdd(otherEnd, msgs);
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
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
			case CoursePackage.ORGANISATION__COURSE_COORDINATOR:
				return basicSetCourseCoordinator(null, msgs);
			case CoursePackage.ORGANISATION__LECTURER:
				return ((InternalEList<?>)getLecturer()).basicRemove(otherEnd, msgs);
			case CoursePackage.ORGANISATION__TA:
				return ((InternalEList<?>)getTa()).basicRemove(otherEnd, msgs);
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, CoursePackage.COURSE_INSTANCE__ORGANISATION, CourseInstance.class, msgs);
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
			case CoursePackage.ORGANISATION__COURSE_COORDINATOR:
				return getCourseCoordinator();
			case CoursePackage.ORGANISATION__LECTURER:
				return getLecturer();
			case CoursePackage.ORGANISATION__TA:
				return getTa();
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				return getCourseInstance();
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
			case CoursePackage.ORGANISATION__COURSE_COORDINATOR:
				setCourseCoordinator((CourseCoordinator)newValue);
				return;
			case CoursePackage.ORGANISATION__LECTURER:
				getLecturer().clear();
				getLecturer().addAll((Collection<? extends Lecturer>)newValue);
				return;
			case CoursePackage.ORGANISATION__TA:
				getTa().clear();
				getTa().addAll((Collection<? extends TA>)newValue);
				return;
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
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
			case CoursePackage.ORGANISATION__COURSE_COORDINATOR:
				setCourseCoordinator((CourseCoordinator)null);
				return;
			case CoursePackage.ORGANISATION__LECTURER:
				getLecturer().clear();
				return;
			case CoursePackage.ORGANISATION__TA:
				getTa().clear();
				return;
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
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
			case CoursePackage.ORGANISATION__COURSE_COORDINATOR:
				return courseCoordinator != null;
			case CoursePackage.ORGANISATION__LECTURER:
				return lecturer != null && !lecturer.isEmpty();
			case CoursePackage.ORGANISATION__TA:
				return ta != null && !ta.isEmpty();
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				return getCourseInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganisationImpl
