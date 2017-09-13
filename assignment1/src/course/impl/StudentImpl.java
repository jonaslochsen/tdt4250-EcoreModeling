/**
 */
package course.impl;

import course.CoursePackage;
import course.Evaluation;
import course.Student;
import course.StudyProgram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course.impl.StudentImpl#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link course.impl.StudentImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonImpl implements Student {
	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<Evaluation> evaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoursePackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram getStudyProgram() {
		if (eContainerFeatureID() != CoursePackage.STUDENT__STUDY_PROGRAM) return null;
		return (StudyProgram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyProgram(StudyProgram newStudyProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyProgram, CoursePackage.STUDENT__STUDY_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyProgram(StudyProgram newStudyProgram) {
		if (newStudyProgram != eInternalContainer() || (eContainerFeatureID() != CoursePackage.STUDENT__STUDY_PROGRAM && newStudyProgram != null)) {
			if (EcoreUtil.isAncestor(this, newStudyProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyProgram != null)
				msgs = ((InternalEObject)newStudyProgram).eInverseAdd(this, CoursePackage.STUDY_PROGRAM__STUDENTS, StudyProgram.class, msgs);
			msgs = basicSetStudyProgram(newStudyProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoursePackage.STUDENT__STUDY_PROGRAM, newStudyProgram, newStudyProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evaluation> getEvaluation() {
		if (evaluation == null) {
			evaluation = new EObjectWithInverseResolvingEList.ManyInverse<Evaluation>(Evaluation.class, this, CoursePackage.STUDENT__EVALUATION, CoursePackage.EVALUATION__REGISTERED_STUDENTS);
		}
		return evaluation;
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyProgram((StudyProgram)otherEnd, msgs);
			case CoursePackage.STUDENT__EVALUATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEvaluation()).basicAdd(otherEnd, msgs);
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				return basicSetStudyProgram(null, msgs);
			case CoursePackage.STUDENT__EVALUATION:
				return ((InternalEList<?>)getEvaluation()).basicRemove(otherEnd, msgs);
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				return eInternalContainer().eInverseRemove(this, CoursePackage.STUDY_PROGRAM__STUDENTS, StudyProgram.class, msgs);
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				return getStudyProgram();
			case CoursePackage.STUDENT__EVALUATION:
				return getEvaluation();
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				setStudyProgram((StudyProgram)newValue);
				return;
			case CoursePackage.STUDENT__EVALUATION:
				getEvaluation().clear();
				getEvaluation().addAll((Collection<? extends Evaluation>)newValue);
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				setStudyProgram((StudyProgram)null);
				return;
			case CoursePackage.STUDENT__EVALUATION:
				getEvaluation().clear();
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
			case CoursePackage.STUDENT__STUDY_PROGRAM:
				return getStudyProgram() != null;
			case CoursePackage.STUDENT__EVALUATION:
				return evaluation != null && !evaluation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudentImpl
