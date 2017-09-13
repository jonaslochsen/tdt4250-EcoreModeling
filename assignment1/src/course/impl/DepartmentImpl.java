/**
 */
package course.impl;

import course.Course;
import course.CoursePackage;
import course.Department;
import course.Faculty;
import course.StudyProgram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.DepartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.DepartmentImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link course.impl.DepartmentImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link course.impl.DepartmentImpl#getStudyPrograms <em>Study Programs</em>}</li>
 *   <li>{@link course.impl.DepartmentImpl#getFaculty <em>Faculty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
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
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getStudyPrograms() <em>Study Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyPrograms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.DEPARTMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.DEPARTMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.DEPARTMENT__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentWithInverseEList<Course>(Course.class, this, CoursePackage.DEPARTMENT__COURSES, CoursePackage.COURSE__DEPARTMENT);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyPrograms() {
		if (studyPrograms == null) {
			studyPrograms = new EObjectContainmentEList<StudyProgram>(StudyProgram.class, this, CoursePackage.DEPARTMENT__STUDY_PROGRAMS);
		}
		return studyPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculty getFaculty() {
		if (eContainerFeatureID() != CoursePackage.DEPARTMENT__FACULTY) return null;
		return (Faculty)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaculty(Faculty newFaculty, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFaculty, CoursePackage.DEPARTMENT__FACULTY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaculty(Faculty newFaculty) {
		if (newFaculty != eInternalContainer() || (eContainerFeatureID() != CoursePackage.DEPARTMENT__FACULTY && newFaculty != null)) {
			if (EcoreUtil.isAncestor(this, newFaculty))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFaculty != null)
				msgs = ((InternalEObject)newFaculty).eInverseAdd(this, CoursePackage.FACULTY__DEPARTMENTS, Faculty.class, msgs);
			msgs = basicSetFaculty(newFaculty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.DEPARTMENT__FACULTY, newFaculty, newFaculty));
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
			case CoursePackage.DEPARTMENT__COURSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourses()).basicAdd(otherEnd, msgs);
			case CoursePackage.DEPARTMENT__FACULTY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFaculty((Faculty)otherEnd, msgs);
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
			case CoursePackage.DEPARTMENT__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case CoursePackage.DEPARTMENT__STUDY_PROGRAMS:
				return ((InternalEList<?>)getStudyPrograms()).basicRemove(otherEnd, msgs);
			case CoursePackage.DEPARTMENT__FACULTY:
				return basicSetFaculty(null, msgs);
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
			case CoursePackage.DEPARTMENT__FACULTY:
				return eInternalContainer().eInverseRemove(this, CoursePackage.FACULTY__DEPARTMENTS, Faculty.class, msgs);
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
			case CoursePackage.DEPARTMENT__NAME:
				return getName();
			case CoursePackage.DEPARTMENT__SHORT_NAME:
				return getShortName();
			case CoursePackage.DEPARTMENT__COURSES:
				return getCourses();
			case CoursePackage.DEPARTMENT__STUDY_PROGRAMS:
				return getStudyPrograms();
			case CoursePackage.DEPARTMENT__FACULTY:
				return getFaculty();
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
			case CoursePackage.DEPARTMENT__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.DEPARTMENT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case CoursePackage.DEPARTMENT__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.DEPARTMENT__STUDY_PROGRAMS:
				getStudyPrograms().clear();
				getStudyPrograms().addAll((Collection<? extends StudyProgram>)newValue);
				return;
			case CoursePackage.DEPARTMENT__FACULTY:
				setFaculty((Faculty)newValue);
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
			case CoursePackage.DEPARTMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.DEPARTMENT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case CoursePackage.DEPARTMENT__COURSES:
				getCourses().clear();
				return;
			case CoursePackage.DEPARTMENT__STUDY_PROGRAMS:
				getStudyPrograms().clear();
				return;
			case CoursePackage.DEPARTMENT__FACULTY:
				setFaculty((Faculty)null);
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
			case CoursePackage.DEPARTMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.DEPARTMENT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case CoursePackage.DEPARTMENT__COURSES:
				return courses != null && !courses.isEmpty();
			case CoursePackage.DEPARTMENT__STUDY_PROGRAMS:
				return studyPrograms != null && !studyPrograms.isEmpty();
			case CoursePackage.DEPARTMENT__FACULTY:
				return getFaculty() != null;
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
		result.append(", shortName: ");
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
