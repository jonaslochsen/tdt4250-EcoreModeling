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

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Studies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudiesImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link course.impl.StudiesImpl#getCurrentCourses <em>Current Courses</em>}</li>
 *   <li>{@link course.impl.StudiesImpl#getExams <em>Exams</em>}</li>
 *   <li>{@link course.impl.StudiesImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link course.impl.StudiesImpl#getPastCourses <em>Past Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudiesImpl extends MinimalEObjectImpl.Container implements Studies {
	/**
	 * The cached value of the '{@link #getExams() <em>Exams</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExams()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<CourseInstance> exams;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDITS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected double credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPastCourses() <em>Past Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastCourses()
	 * @generated NOT
	 * @ordered
	 */
	protected EList<Course> pastCourses = new BasicEList<Course>();

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
	 * @generated NOT
	 */
	public EList<Course> getPastCourses() {
		return pastCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setPastCourses(EList<Course> newPastCourses) {
		EList<Course> oldPastCourses = pastCourses;
		pastCourses = newPastCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDIES__PAST_COURSES, oldPastCourses, pastCourses));
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
	 * @generated NOT
	 */
	public void setCurrentCourses(EList<CourseInstance> newCurrentCourses) {
		// TODO: implement this method to set the 'Current Courses' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CourseInstance> getExams() {
		return exams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setExams(EList<CourseInstance> newExams) {
		EList<CourseInstance> oldExams = exams;
		exams = newExams;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDIES__EXAMS, oldExams, exams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(double newCredits) {
		double oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDIES__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void signUpForExam(CourseInstance courseInstance) {
		if (!exams.contains(courseInstance)) {
			exams.add(courseInstance);
		}else {
			throw new IllegalArgumentException("Cannot sign up for an exam that the student has already signed up for.");
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void signOffFromExam(CourseInstance courseInstance) {
		if (exams.contains(courseInstance)) {
			exams.remove(courseInstance);
		}else {
			throw new IllegalArgumentException("Cannot sign off from an exam that the student has not signed up for.");
		}	
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
			case CoursePackage.STUDIES__STUDENT:
				return getStudent();
			case CoursePackage.STUDIES__CURRENT_COURSES:
				return getCurrentCourses();
			case CoursePackage.STUDIES__EXAMS:
				return getExams();
			case CoursePackage.STUDIES__CREDITS:
				return getCredits();
			case CoursePackage.STUDIES__PAST_COURSES:
				return getPastCourses();
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
			case CoursePackage.STUDIES__STUDENT:
				setStudent((Person)newValue);
				return;
			case CoursePackage.STUDIES__CURRENT_COURSES:
				setCurrentCourses((EList)newValue);
				return;
			case CoursePackage.STUDIES__EXAMS:
				setExams((EList)newValue);
				return;
			case CoursePackage.STUDIES__CREDITS:
				setCredits((Double)newValue);
				return;
			case CoursePackage.STUDIES__PAST_COURSES:
				setPastCourses((EList)newValue);
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
			case CoursePackage.STUDIES__STUDENT:
				setStudent((Person)null);
				return;
			case CoursePackage.STUDIES__CURRENT_COURSES:
				setCurrentCourses((EList)null);
				return;
			case CoursePackage.STUDIES__EXAMS:
				setExams((EList)null);
				return;
			case CoursePackage.STUDIES__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case CoursePackage.STUDIES__PAST_COURSES:
				setPastCourses((EList)null);
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
			case CoursePackage.STUDIES__STUDENT:
				return getStudent() != null;
			case CoursePackage.STUDIES__CURRENT_COURSES:
				return getCurrentCourses() != null;
			case CoursePackage.STUDIES__EXAMS:
				return exams != null;
			case CoursePackage.STUDIES__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case CoursePackage.STUDIES__PAST_COURSES:
				return pastCourses != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CoursePackage.STUDIES___SIGN_UP_FOR_EXAM__COURSEINSTANCE:
				signUpForExam((CourseInstance)arguments.get(0));
				return null;
			case CoursePackage.STUDIES___SIGN_OFF_FROM_EXAM__COURSEINSTANCE:
				signOffFromExam((CourseInstance)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (exams: ");
		result.append(exams);
		result.append(", credits: ");
		result.append(credits);
		result.append(", pastCourses: ");
		result.append(pastCourses);
		result.append(')');
		return result.toString();
	}

} //StudiesImpl
