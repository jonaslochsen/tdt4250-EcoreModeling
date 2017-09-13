/**
 */
package course.impl;

import course.Course;
import course.CourseInstance;
import course.CoursePackage;
import course.Department;
import course.StudyProgram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getContent <em>Content</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getRequiredPreCond <em>Required Pre Cond</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getRecommendedPreCond <em>Recommended Pre Cond</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getStudyPrograms <em>Study Programs</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getCourseInstances <em>Course Instances</em>}</li>
 *   <li>{@link course.impl.CourseImpl#getDepartment <em>Department</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

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
	 * The cached value of the '{@link #getRequiredPreCond() <em>Required Pre Cond</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredPreCond()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> requiredPreCond;

	/**
	 * The cached value of the '{@link #getRecommendedPreCond() <em>Recommended Pre Cond</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedPreCond()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> recommendedPreCond;

	/**
	 * The cached value of the '{@link #getStudyPrograms() <em>Study Programs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyPrograms;

	/**
	 * The cached value of the '{@link #getCourseInstances() <em>Course Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstance> courseInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE__CONTENT, oldContent, content));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getRequiredPreCond() {
		if (requiredPreCond == null) {
			requiredPreCond = new EObjectResolvingEList<Course>(Course.class, this, CoursePackage.COURSE__REQUIRED_PRE_COND);
		}
		return requiredPreCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getRecommendedPreCond() {
		if (recommendedPreCond == null) {
			recommendedPreCond = new EObjectResolvingEList<Course>(Course.class, this, CoursePackage.COURSE__RECOMMENDED_PRE_COND);
		}
		return recommendedPreCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyPrograms() {
		if (studyPrograms == null) {
			studyPrograms = new EObjectResolvingEList<StudyProgram>(StudyProgram.class, this, CoursePackage.COURSE__STUDY_PROGRAMS);
		}
		return studyPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseInstance> getCourseInstances() {
		if (courseInstances == null) {
			courseInstances = new EObjectContainmentWithInverseEList<CourseInstance>(CourseInstance.class, this, CoursePackage.COURSE__COURSE_INSTANCES, CoursePackage.COURSE_INSTANCE__COURSE);
		}
		return courseInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (eContainerFeatureID() != CoursePackage.COURSE__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, CoursePackage.COURSE__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != CoursePackage.COURSE__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, CoursePackage.DEPARTMENT__COURSES, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.COURSE__DEPARTMENT, newDepartment, newDepartment));
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
			case CoursePackage.COURSE__COURSE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourseInstances()).basicAdd(otherEnd, msgs);
			case CoursePackage.COURSE__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
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
			case CoursePackage.COURSE__COURSE_INSTANCES:
				return ((InternalEList<?>)getCourseInstances()).basicRemove(otherEnd, msgs);
			case CoursePackage.COURSE__DEPARTMENT:
				return basicSetDepartment(null, msgs);
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
			case CoursePackage.COURSE__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, CoursePackage.DEPARTMENT__COURSES, Department.class, msgs);
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
			case CoursePackage.COURSE__CODE:
				return getCode();
			case CoursePackage.COURSE__NAME:
				return getName();
			case CoursePackage.COURSE__CONTENT:
				return getContent();
			case CoursePackage.COURSE__CREDITS:
				return getCredits();
			case CoursePackage.COURSE__REQUIRED_PRE_COND:
				return getRequiredPreCond();
			case CoursePackage.COURSE__RECOMMENDED_PRE_COND:
				return getRecommendedPreCond();
			case CoursePackage.COURSE__STUDY_PROGRAMS:
				return getStudyPrograms();
			case CoursePackage.COURSE__COURSE_INSTANCES:
				return getCourseInstances();
			case CoursePackage.COURSE__DEPARTMENT:
				return getDepartment();
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
			case CoursePackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case CoursePackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case CoursePackage.COURSE__CONTENT:
				setContent((String)newValue);
				return;
			case CoursePackage.COURSE__CREDITS:
				setCredits((Double)newValue);
				return;
			case CoursePackage.COURSE__REQUIRED_PRE_COND:
				getRequiredPreCond().clear();
				getRequiredPreCond().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.COURSE__RECOMMENDED_PRE_COND:
				getRecommendedPreCond().clear();
				getRecommendedPreCond().addAll((Collection<? extends Course>)newValue);
				return;
			case CoursePackage.COURSE__STUDY_PROGRAMS:
				getStudyPrograms().clear();
				getStudyPrograms().addAll((Collection<? extends StudyProgram>)newValue);
				return;
			case CoursePackage.COURSE__COURSE_INSTANCES:
				getCourseInstances().clear();
				getCourseInstances().addAll((Collection<? extends CourseInstance>)newValue);
				return;
			case CoursePackage.COURSE__DEPARTMENT:
				setDepartment((Department)newValue);
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
			case CoursePackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CoursePackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CoursePackage.COURSE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CoursePackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case CoursePackage.COURSE__REQUIRED_PRE_COND:
				getRequiredPreCond().clear();
				return;
			case CoursePackage.COURSE__RECOMMENDED_PRE_COND:
				getRecommendedPreCond().clear();
				return;
			case CoursePackage.COURSE__STUDY_PROGRAMS:
				getStudyPrograms().clear();
				return;
			case CoursePackage.COURSE__COURSE_INSTANCES:
				getCourseInstances().clear();
				return;
			case CoursePackage.COURSE__DEPARTMENT:
				setDepartment((Department)null);
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
			case CoursePackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case CoursePackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CoursePackage.COURSE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CoursePackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case CoursePackage.COURSE__REQUIRED_PRE_COND:
				return requiredPreCond != null && !requiredPreCond.isEmpty();
			case CoursePackage.COURSE__RECOMMENDED_PRE_COND:
				return recommendedPreCond != null && !recommendedPreCond.isEmpty();
			case CoursePackage.COURSE__STUDY_PROGRAMS:
				return studyPrograms != null && !studyPrograms.isEmpty();
			case CoursePackage.COURSE__COURSE_INSTANCES:
				return courseInstances != null && !courseInstances.isEmpty();
			case CoursePackage.COURSE__DEPARTMENT:
				return getDepartment() != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", content: ");
		result.append(content);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
