/**
 */
package course.impl;

import course.CourseInstance;
import course.CoursePackage;
import course.Employment;
import course.Organisation;

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
 *   <li>{@link course.impl.OrganisationImpl#getCourseInstance <em>Course Instance</em>}</li>
 *   <li>{@link course.impl.OrganisationImpl#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends MinimalEObjectImpl.Container implements Organisation {
	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Employment> employees;

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
	public EList<Employment> getEmployees() {
		if (employees == null) {
			employees = new EObjectContainmentWithInverseEList<Employment>(Employment.class, this, CoursePackage.ORGANISATION__EMPLOYEES, CoursePackage.EMPLOYMENT__ORGANISATION);
		}
		return employees;
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourseInstance((CourseInstance)otherEnd, msgs);
			case CoursePackage.ORGANISATION__EMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployees()).basicAdd(otherEnd, msgs);
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				return basicSetCourseInstance(null, msgs);
			case CoursePackage.ORGANISATION__EMPLOYEES:
				return ((InternalEList<?>)getEmployees()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				return getCourseInstance();
			case CoursePackage.ORGANISATION__EMPLOYEES:
				return getEmployees();
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)newValue);
				return;
			case CoursePackage.ORGANISATION__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Employment>)newValue);
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				setCourseInstance((CourseInstance)null);
				return;
			case CoursePackage.ORGANISATION__EMPLOYEES:
				getEmployees().clear();
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
			case CoursePackage.ORGANISATION__COURSE_INSTANCE:
				return getCourseInstance() != null;
			case CoursePackage.ORGANISATION__EMPLOYEES:
				return employees != null && !employees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganisationImpl
