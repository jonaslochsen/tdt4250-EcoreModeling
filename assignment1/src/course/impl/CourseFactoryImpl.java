/**
 */
package course.impl;

import course.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseFactoryImpl extends EFactoryImpl implements CourseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CourseFactory init() {
		try {
			CourseFactory theCourseFactory = (CourseFactory)EPackage.Registry.INSTANCE.getEFactory(CoursePackage.eNS_URI);
			if (theCourseFactory != null) {
				return theCourseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CourseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoursePackage.UNIVERSITY: return createUniversity();
			case CoursePackage.FACULTY: return createFaculty();
			case CoursePackage.COURSE: return createCourse();
			case CoursePackage.COURSE_INSTANCE: return createCourseInstance();
			case CoursePackage.DEPARTMENT: return createDepartment();
			case CoursePackage.PERSON: return createPerson();
			case CoursePackage.EVALUATION: return createEvaluation();
			case CoursePackage.ORGANISATION: return createOrganisation();
			case CoursePackage.STUDY_PROGRAM: return createStudyProgram();
			case CoursePackage.COURSE_WORK: return createCourseWork();
			case CoursePackage.TIMETABLE: return createTimetable();
			case CoursePackage.TIMETABLE_ENTRY: return createTimetableEntry();
			case CoursePackage.EMPLOYMENT: return createEmployment();
			case CoursePackage.STUDIES: return createStudies();
			case CoursePackage.COURSE_POINT_REDUCTION: return createCoursePointReduction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CoursePackage.DAY_OF_WEEK:
				return createDayOfWeekFromString(eDataType, initialValue);
			case CoursePackage.TYPE_OF_INSTRUCTION:
				return createTypeOfInstructionFromString(eDataType, initialValue);
			case CoursePackage.TYPE_OF_EMPLOYMENT:
				return createTypeOfEmploymentFromString(eDataType, initialValue);
			case CoursePackage.SEMESTER_TYPE:
				return createsemesterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CoursePackage.DAY_OF_WEEK:
				return convertDayOfWeekToString(eDataType, instanceValue);
			case CoursePackage.TYPE_OF_INSTRUCTION:
				return convertTypeOfInstructionToString(eDataType, instanceValue);
			case CoursePackage.TYPE_OF_EMPLOYMENT:
				return convertTypeOfEmploymentToString(eDataType, instanceValue);
			case CoursePackage.SEMESTER_TYPE:
				return convertsemesterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public University createUniversity() {
		UniversityImpl university = new UniversityImpl();
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculty createFaculty() {
		FacultyImpl faculty = new FacultyImpl();
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseInstance createCourseInstance() {
		CourseInstanceImpl courseInstance = new CourseInstanceImpl();
		return courseInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation createEvaluation() {
		EvaluationImpl evaluation = new EvaluationImpl();
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram createStudyProgram() {
		StudyProgramImpl studyProgram = new StudyProgramImpl();
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseWork createCourseWork() {
		CourseWorkImpl courseWork = new CourseWorkImpl();
		return courseWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timetable createTimetable() {
		TimetableImpl timetable = new TimetableImpl();
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableEntry createTimetableEntry() {
		TimetableEntryImpl timetableEntry = new TimetableEntryImpl();
		return timetableEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employment createEmployment() {
		EmploymentImpl employment = new EmploymentImpl();
		return employment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Studies createStudies() {
		StudiesImpl studies = new StudiesImpl();
		return studies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePointReduction createCoursePointReduction() {
		CoursePointReductionImpl coursePointReduction = new CoursePointReductionImpl();
		return coursePointReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
		DayOfWeek result = DayOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfInstruction createTypeOfInstructionFromString(EDataType eDataType, String initialValue) {
		TypeOfInstruction result = TypeOfInstruction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfInstructionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfEmployment createTypeOfEmploymentFromString(EDataType eDataType, String initialValue) {
		TypeOfEmployment result = TypeOfEmployment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfEmploymentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public semesterType createsemesterTypeFromString(EDataType eDataType, String initialValue) {
		semesterType result = semesterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertsemesterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoursePackage getCoursePackage() {
		return (CoursePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoursePackage getPackage() {
		return CoursePackage.eINSTANCE;
	}

} //CourseFactoryImpl
