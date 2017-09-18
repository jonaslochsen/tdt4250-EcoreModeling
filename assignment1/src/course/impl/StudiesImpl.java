/**
 */
package course.impl;

import course.Course;
import course.CourseInstance;
import course.CoursePackage;
import course.Employment;
import course.Person;
import course.Studies;
import course.TypeOfEmployment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudiesImpl#getPastCourses <em>Past Courses</em>}</li>
 *   <li>{@link course.impl.StudiesImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link course.impl.StudiesImpl#getCurrentCourses <em>Current Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudiesImpl extends MinimalEObjectImpl.Container implements Studies {
	/**
	 * The cached value of the '{@link #getPastCourses() <em>Past Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> pastCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.STUDIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getPastCourses() {
		if (pastCourses == null) {
			pastCourses = new EObjectResolvingEList<Course>(Course.class, this, CoursePackage.STUDIES__PAST_COURSES);
		}
		return pastCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getStudent() {
		if (eContainerFeatureID() != CoursePackage.STUDIES__STUDENT) return null;
		return (Person)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudent(Person newStudent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudent, CoursePackage.STUDIES__STUDENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudent(Person newStudent) {
		if (newStudent != eInternalContainer() || (eContainerFeatureID() != CoursePackage.STUDIES__STUDENT && newStudent != null)) {
			if (EcoreUtil.isAncestor(this, newStudent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudent != null)
				msgs = ((InternalEObject)newStudent).eInverseAdd(this, CoursePackage.PERSON__STUDIES, Person.class, msgs);
			msgs = basicSetStudent(newStudent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDIES__STUDENT, newStudent, newStudent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * CONTRACT:
	 * Returns the student's current courses, the returned list will be empty if the person has no current courses registred.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CourseInstance> getCurrentCourses() {
		EList<Employment> thisEmployment = this.getStudent().getEmployment();
		EList<CourseInstance> currentCourses = new BasicEList<>();
		for (Employment employment : thisEmployment) {
			if (employment.getEmployment().contains(TypeOfEmployment.STUDENT)) {
				currentCourses.add(employment.getOrganisation().getCourseInstance());
			}
		}
		return currentCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCourses(EList<CourseInstance> newCurrentCourses) {
		// TODO: implement this method to set the 'Current Courses' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.STUDIES__STUDENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudent((Person)otherEnd, msgs);
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
			case CoursePackage.STUDIES__STUDENT:
				return basicSetStudent(null, msgs);
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
			case CoursePackage.STUDIES__STUDENT:
				return eInternalContainer().eInverseRemove(this, CoursePackage.PERSON__STUDIES, Person.class, msgs);
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
			case CoursePackage.STUDIES__PAST_COURSES:
				return getPastCourses();
			case CoursePackage.STUDIES__STUDENT:
				return getStudent();
			case CoursePackage.STUDIES__CURRENT_COURSES:
				return getCurrentCourses();
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
			case CoursePackage.STUDIES__PAST_COURSES:
				getPastCourses().clear();
				getPastCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.STUDIES__STUDENT:
				setStudent((Person)newValue);
				return;
			case CoursePackage.STUDIES__CURRENT_COURSES:
				setCurrentCourses((EList<CourseInstance>)newValue);
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
			case CoursePackage.STUDIES__PAST_COURSES:
				getPastCourses().clear();
				return;
			case CoursePackage.STUDIES__STUDENT:
				setStudent((Person)null);
				return;
			case CoursePackage.STUDIES__CURRENT_COURSES:
				setCurrentCourses((EList<CourseInstance>)null);
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
			case CoursePackage.STUDIES__PAST_COURSES:
				return pastCourses != null && !pastCourses.isEmpty();
			case CoursePackage.STUDIES__STUDENT:
				return getStudent() != null;
			case CoursePackage.STUDIES__CURRENT_COURSES:
				return getCurrentCourses() != null;
		}
		return super.eIsSet(featureID);
	}

} //StudiesImpl
