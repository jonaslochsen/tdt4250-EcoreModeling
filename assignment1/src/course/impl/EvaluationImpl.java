/**
 */
package course.impl;

import course.CourseInstance;
import course.CoursePackage;
import course.Evaluation;

import course.Studies;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.EvaluationImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link course.impl.EvaluationImpl#getProject <em>Project</em>}</li>
 *   <li>{@link course.impl.EvaluationImpl#getAssigments <em>Assigments</em>}</li>
 *   <li>{@link course.impl.EvaluationImpl#getCourseInstance <em>Course Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationImpl extends MinimalEObjectImpl.Container implements Evaluation {
	/**
	 * The default value of the '{@link #getExam() <em>Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected static final int EXAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected int exam = EXAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final int PROJECT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected int project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssigments() <em>Assigments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigments()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSIGMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssigments() <em>Assigments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigments()
	 * @generated
	 * @ordered
	 */
	protected int assigments = ASSIGMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExam() {
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExam(int newExam) {
		int oldExam = exam;
		exam = newExam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.EVALUATION__EXAM, oldExam, exam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(int newProject) {
		int oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.EVALUATION__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssigments() {
		return assigments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssigments(int newAssigments) {
		int oldAssigments = assigments;
		assigments = newAssigments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.EVALUATION__ASSIGMENTS, oldAssigments, assigments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance getCourseInstance() {
		if (eContainerFeatureID() != CoursePackage.EVALUATION__COURSE_INSTANCE) return null;
		return (CourseInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourseInstance(CourseInstance newCourseInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourseInstance, CoursePackage.EVALUATION__COURSE_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseInstance(CourseInstance newCourseInstance) {
		if (newCourseInstance != eInternalContainer() || (eContainerFeatureID() != CoursePackage.EVALUATION__COURSE_INSTANCE && newCourseInstance != null)) {
			if (EcoreUtil.isAncestor(this, newCourseInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourseInstance != null)
				msgs = ((InternalEObject)newCourseInstance).eInverseAdd(this, CoursePackage.COURSE_INSTANCE__EVALUATION, CourseInstance.class, msgs);
			msgs = basicSetCourseInstance(newCourseInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.EVALUATION__COURSE_INSTANCE, newCourseInstance, newCourseInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void completeExam(Studies student) {
		double courseCredits = getCourseInstance().getCourse().getCredits();
		double pastCredits = student.getCredits();
		student.setCredits(pastCredits + courseCredits);
		student.signOffFromExam(getCourseInstance());
		
		//Remove from currentCourse
		//Add to pastCourses
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
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
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
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
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
				return eInternalContainer().eInverseRemove(this, CoursePackage.COURSE_INSTANCE__EVALUATION, CourseInstance.class, msgs);
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
			case CoursePackage.EVALUATION__EXAM:
				return getExam();
			case CoursePackage.EVALUATION__PROJECT:
				return getProject();
			case CoursePackage.EVALUATION__ASSIGMENTS:
				return getAssigments();
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
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
			case CoursePackage.EVALUATION__EXAM:
				setExam((Integer)newValue);
				return;
			case CoursePackage.EVALUATION__PROJECT:
				setProject((Integer)newValue);
				return;
			case CoursePackage.EVALUATION__ASSIGMENTS:
				setAssigments((Integer)newValue);
				return;
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
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
			case CoursePackage.EVALUATION__EXAM:
				setExam(EXAM_EDEFAULT);
				return;
			case CoursePackage.EVALUATION__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case CoursePackage.EVALUATION__ASSIGMENTS:
				setAssigments(ASSIGMENTS_EDEFAULT);
				return;
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
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
			case CoursePackage.EVALUATION__EXAM:
				return exam != EXAM_EDEFAULT;
			case CoursePackage.EVALUATION__PROJECT:
				return project != PROJECT_EDEFAULT;
			case CoursePackage.EVALUATION__ASSIGMENTS:
				return assigments != ASSIGMENTS_EDEFAULT;
			case CoursePackage.EVALUATION__COURSE_INSTANCE:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CoursePackage.EVALUATION___COMPLETE_EXAM__STUDIES:
				completeExam((Studies)arguments.get(0));
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
		result.append(" (exam: ");
		result.append(exam);
		result.append(", project: ");
		result.append(project);
		result.append(", assigments: ");
		result.append(assigments);
		result.append(')');
		return result.toString();
	}

} //EvaluationImpl
