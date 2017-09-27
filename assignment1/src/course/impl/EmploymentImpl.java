/**
 */
package course.impl;

import course.CoursePackage;
import course.Employment;
import course.Organisation;
import course.Person;
import course.TypeOfEmployment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.EmploymentImpl#getEmployment <em>Employment</em>}</li>
 *   <li>{@link course.impl.EmploymentImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link course.impl.EmploymentImpl#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploymentImpl extends MinimalEObjectImpl.Container implements Employment {
	/**
	 * The cached value of the '{@link #getEmployment() <em>Employment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployment()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeOfEmployment> employment;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected Person employee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.EMPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOfEmployment> getEmployment() {
		if (employment == null) {
			employment = new EDataTypeUniqueEList<TypeOfEmployment>(TypeOfEmployment.class, this, CoursePackage.EMPLOYMENT__EMPLOYMENT);
		}
		return employment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getEmployee() {
		if (employee != null && employee.eIsProxy()) {
			InternalEObject oldEmployee = (InternalEObject)employee;
			employee = (Person)eResolveProxy(oldEmployee);
			if (employee != oldEmployee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoursePackage.EMPLOYMENT__EMPLOYEE, oldEmployee, employee));
			}
		}
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetEmployee() {
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmployee(Person newEmployee, NotificationChain msgs) {
		Person oldEmployee = employee;
		employee = newEmployee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.EMPLOYMENT__EMPLOYEE, oldEmployee, newEmployee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployee(Person newEmployee) {
		if (newEmployee != employee) {
			NotificationChain msgs = null;
			if (employee != null)
				msgs = ((InternalEObject)employee).eInverseRemove(this, CoursePackage.PERSON__EMPLOYMENT, Person.class, msgs);
			if (newEmployee != null)
				msgs = ((InternalEObject)newEmployee).eInverseAdd(this, CoursePackage.PERSON__EMPLOYMENT, Person.class, msgs);
			msgs = basicSetEmployee(newEmployee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.EMPLOYMENT__EMPLOYEE, newEmployee, newEmployee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation getOrganisation() {
		if (eContainerFeatureID() != CoursePackage.EMPLOYMENT__ORGANISATION) return null;
		return (Organisation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganisation(Organisation newOrganisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOrganisation, CoursePackage.EMPLOYMENT__ORGANISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(Organisation newOrganisation) {
		if (newOrganisation != eInternalContainer() || (eContainerFeatureID() != CoursePackage.EMPLOYMENT__ORGANISATION && newOrganisation != null)) {
			if (EcoreUtil.isAncestor(this, newOrganisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOrganisation != null)
				msgs = ((InternalEObject)newOrganisation).eInverseAdd(this, CoursePackage.ORGANISATION__EMPLOYEES, Organisation.class, msgs);
			msgs = basicSetOrganisation(newOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.EMPLOYMENT__ORGANISATION, newOrganisation, newOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.EMPLOYMENT__EMPLOYEE:
				if (employee != null)
					msgs = ((InternalEObject)employee).eInverseRemove(this, CoursePackage.PERSON__EMPLOYMENT, Person.class, msgs);
				return basicSetEmployee((Person)otherEnd, msgs);
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOrganisation((Organisation)otherEnd, msgs);
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
			case CoursePackage.EMPLOYMENT__EMPLOYEE:
				return basicSetEmployee(null, msgs);
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				return basicSetOrganisation(null, msgs);
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
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				return eInternalContainer().eInverseRemove(this, CoursePackage.ORGANISATION__EMPLOYEES, Organisation.class, msgs);
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
			case CoursePackage.EMPLOYMENT__EMPLOYMENT:
				return getEmployment();
			case CoursePackage.EMPLOYMENT__EMPLOYEE:
				if (resolve) return getEmployee();
				return basicGetEmployee();
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				return getOrganisation();
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
			case CoursePackage.EMPLOYMENT__EMPLOYMENT:
				getEmployment().clear();
				getEmployment().addAll((Collection<? extends TypeOfEmployment>)newValue);
				return;
			case CoursePackage.EMPLOYMENT__EMPLOYEE:
				setEmployee((Person)newValue);
				return;
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				setOrganisation((Organisation)newValue);
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
			case CoursePackage.EMPLOYMENT__EMPLOYMENT:
				getEmployment().clear();
				return;
			case CoursePackage.EMPLOYMENT__EMPLOYEE:
				setEmployee((Person)null);
				return;
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				setOrganisation((Organisation)null);
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
			case CoursePackage.EMPLOYMENT__EMPLOYMENT:
				return employment != null && !employment.isEmpty();
			case CoursePackage.EMPLOYMENT__EMPLOYEE:
				return employee != null;
			case CoursePackage.EMPLOYMENT__ORGANISATION:
				return getOrganisation() != null;
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
		result.append(" (employment: ");
		result.append(employment);
		result.append(')');
		return result.toString();
	}
	
	// Validation test helper method
	public void setEmployment() {
		
	}
	

} //EmploymentImpl
