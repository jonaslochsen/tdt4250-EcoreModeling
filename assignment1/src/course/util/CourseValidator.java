/**
 */
package course.util;

import course.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see course.CoursePackage
 * @generated
 */
public class CourseValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CourseValidator INSTANCE = new CourseValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "course";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CoursePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CoursePackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case CoursePackage.FACULTY:
				return validateFaculty((Faculty)value, diagnostics, context);
			case CoursePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case CoursePackage.COURSE_INSTANCE:
				return validateCourseInstance((CourseInstance)value, diagnostics, context);
			case CoursePackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case CoursePackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case CoursePackage.EVALUATION:
				return validateEvaluation((Evaluation)value, diagnostics, context);
			case CoursePackage.ORGANISATION:
				return validateOrganisation((Organisation)value, diagnostics, context);
			case CoursePackage.STUDY_PROGRAM:
				return validateStudyProgram((StudyProgram)value, diagnostics, context);
			case CoursePackage.COURSE_WORK:
				return validateCourseWork((CourseWork)value, diagnostics, context);
			case CoursePackage.TIMETABLE:
				return validateTimetable((Timetable)value, diagnostics, context);
			case CoursePackage.TIMETABLE_ENTRY:
				return validateTimetableEntry((TimetableEntry)value, diagnostics, context);
			case CoursePackage.EMPLOYMENT:
				return validateEmployment((Employment)value, diagnostics, context);
			case CoursePackage.STUDIES:
				return validateStudies((Studies)value, diagnostics, context);
			case CoursePackage.DAY_OF_WEEK:
				return validateDayOfWeek((DayOfWeek)value, diagnostics, context);
			case CoursePackage.TYPE_OF_INSTRUCTION:
				return validateTypeOfInstruction((TypeOfInstruction)value, diagnostics, context);
			case CoursePackage.TYPE_OF_EMPLOYMENT:
				return validateTypeOfEmployment((TypeOfEmployment)value, diagnostics, context);
			case CoursePackage.SEMESTER_TYPE:
				return validatesemesterType((semesterType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFaculty(Faculty faculty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(faculty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstance(CourseInstance courseInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseInstance_scheduledHours(courseInstance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the scheduledHours constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseInstance_scheduledHours(CourseInstance courseInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		int totalCourseHours = courseInstance.getCourseWork().getLabHours() + courseInstance.getCourseWork().getLectureHours();
		
		int scheduledHours = 0;
		
		EList<TimetableEntry> timeTableEntries = courseInstance.getTimeTable().getTimetableEntry();
		
		for (TimetableEntry timetableEntry : timeTableEntries) {
			String lecture = timetableEntry.getTime();
			String[] splitLectureString = lecture.split("-");
			scheduledHours += Integer.parseInt(splitLectureString[1].substring(0, 2)) - Integer.parseInt(splitLectureString[0].substring(0, 2));
		}
		
		if (totalCourseHours == scheduledHours)
			return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(person, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluation(Evaluation evaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evaluation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisation(Organisation organisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyProgram(StudyProgram studyProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyProgram, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseWork(CourseWork courseWork, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseWork, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetable(Timetable timetable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timetable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimetableEntry(TimetableEntry timetableEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timetableEntry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployment(Employment employment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(employment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(employment, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmployment_cannotBeStudentAndTAInSameCourse(employment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cannotBeStudentAndTAInSameCourse constraint of '<em>Employment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEmployment_cannotBeStudentAndTAInSameCourse(Employment employment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (employment.getEmployment().contains(TypeOfEmployment.TA) && employment.getEmployment().contains(TypeOfEmployment.STUDENT)) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudies(Studies studies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studies, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayOfWeek(DayOfWeek dayOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfInstruction(TypeOfInstruction typeOfInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeOfEmployment(TypeOfEmployment typeOfEmployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatesemesterType(semesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CourseValidator
