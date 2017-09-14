/**
 */
package course.impl;

import course.CoursePackage;
import course.Employment;
import course.Person;
import course.Studies;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.PersonImpl#getEmployment <em>Employment</em>}</li>
 *   <li>{@link course.impl.PersonImpl#getStudies <em>Studies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployment() <em>Employment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Employment> employment;

	/**
	 * The cached value of the '{@link #getStudies() <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudies()
	 * @generated
	 * @ordered
	 */
	protected Studies studies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employment> getEmployment() {
		if (employment == null) {
			employment = new EObjectWithInverseResolvingEList<Employment>(Employment.class, this, CoursePackage.PERSON__EMPLOYMENT, CoursePackage.EMPLOYMENT__EMPLOYEE);
		}
		return employment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Studies getStudies() {
		return studies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudies(Studies newStudies, NotificationChain msgs) {
		Studies oldStudies = studies;
		studies = newStudies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CoursePackage.PERSON__STUDIES, oldStudies, newStudies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudies(Studies newStudies) {
		if (newStudies != studies) {
			NotificationChain msgs = null;
			if (studies != null)
				msgs = ((InternalEObject)studies).eInverseRemove(this, CoursePackage.STUDIES__STUDENT, Studies.class, msgs);
			if (newStudies != null)
				msgs = ((InternalEObject)newStudies).eInverseAdd(this, CoursePackage.STUDIES__STUDENT, Studies.class, msgs);
			msgs = basicSetStudies(newStudies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.PERSON__STUDIES, newStudies, newStudies));
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
			case CoursePackage.PERSON__EMPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployment()).basicAdd(otherEnd, msgs);
			case CoursePackage.PERSON__STUDIES:
				if (studies != null)
					msgs = ((InternalEObject)studies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CoursePackage.PERSON__STUDIES, null, msgs);
				return basicSetStudies((Studies)otherEnd, msgs);
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
			case CoursePackage.PERSON__EMPLOYMENT:
				return ((InternalEList<?>)getEmployment()).basicRemove(otherEnd, msgs);
			case CoursePackage.PERSON__STUDIES:
				return basicSetStudies(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoursePackage.PERSON__NAME:
				return getName();
			case CoursePackage.PERSON__EMPLOYMENT:
				return getEmployment();
			case CoursePackage.PERSON__STUDIES:
				return getStudies();
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
			case CoursePackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.PERSON__EMPLOYMENT:
				getEmployment().clear();
				getEmployment().addAll((Collection<? extends Employment>)newValue);
				return;
			case CoursePackage.PERSON__STUDIES:
				setStudies((Studies)newValue);
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
			case CoursePackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.PERSON__EMPLOYMENT:
				getEmployment().clear();
				return;
			case CoursePackage.PERSON__STUDIES:
				setStudies((Studies)null);
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
			case CoursePackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.PERSON__EMPLOYMENT:
				return employment != null && !employment.isEmpty();
			case CoursePackage.PERSON__STUDIES:
				return studies != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
