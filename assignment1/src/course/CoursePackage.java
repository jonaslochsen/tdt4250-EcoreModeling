/**
 */
package course;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see course.CourseFactory
 * @model kind="package"
 * @generated
 */
public interface CoursePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "course";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/assignment1/model/course.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "course";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoursePackage eINSTANCE = course.impl.CoursePackageImpl.init();

	/**
	 * The meta object id for the '{@link course.impl.UniversityImpl <em>University</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.UniversityImpl
	 * @see course.impl.CoursePackageImpl#getUniversity()
	 * @generated
	 */
	int UNIVERSITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Faculties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__FACULTIES = 1;

	/**
	 * The feature id for the '<em><b>People</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY__PEOPLE = 2;

	/**
	 * The number of structural features of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>University</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.FacultyImpl <em>Faculty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.FacultyImpl
	 * @see course.impl.CoursePackageImpl#getFaculty()
	 * @generated
	 */
	int FACULTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>University</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__UNIVERSITY = 1;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__DEPARTMENTS = 2;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__SHORT_NAME = 3;

	/**
	 * The number of structural features of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.CourseImpl
	 * @see course.impl.CoursePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 3;

	/**
	 * The feature id for the '<em><b>Study Programs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDY_PROGRAMS = 4;

	/**
	 * The feature id for the '<em><b>Course Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_INSTANCES = 5;

	/**
	 * The feature id for the '<em><b>Department</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPARTMENT = 6;

	/**
	 * The feature id for the '<em><b>Pre Requisities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PRE_REQUISITIES = 7;

	/**
	 * The feature id for the '<em><b>Dependent Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPENDENT_COURSES = 8;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.CourseInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.CourseInstanceImpl
	 * @see course.impl.CoursePackageImpl#getCourseInstance()
	 * @generated
	 */
	int COURSE_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__ORGANISATION = 1;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__EVALUATION = 2;

	/**
	 * The feature id for the '<em><b>Course Work</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__COURSE_WORK = 3;

	/**
	 * The feature id for the '<em><b>Time Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__TIME_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE__SEMESTER = 5;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.DepartmentImpl
	 * @see course.impl.CoursePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__SHORT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 2;

	/**
	 * The feature id for the '<em><b>Study Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDY_PROGRAMS = 3;

	/**
	 * The feature id for the '<em><b>Faculty</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__FACULTY = 4;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.PersonImpl
	 * @see course.impl.CoursePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYMENT = 1;

	/**
	 * The feature id for the '<em><b>Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STUDIES = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.EvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.EvaluationImpl
	 * @see course.impl.CoursePackageImpl#getEvaluation()
	 * @generated
	 */
	int EVALUATION = 6;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__EXAM = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Assigments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__ASSIGMENTS = 2;

	/**
	 * The feature id for the '<em><b>Course Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION__COURSE_INSTANCE = 3;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.OrganisationImpl
	 * @see course.impl.CoursePackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 7;

	/**
	 * The feature id for the '<em><b>Course Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__COURSE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__EMPLOYEES = 1;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.StudyProgramImpl <em>Study Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.StudyProgramImpl
	 * @see course.impl.CoursePackageImpl#getStudyProgram()
	 * @generated
	 */
	int STUDY_PROGRAM = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM__CODE = 0;

	/**
	 * The number of structural features of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Study Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.CourseWorkImpl <em>Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.CourseWorkImpl
	 * @see course.impl.CoursePackageImpl#getCourseWork()
	 * @generated
	 */
	int COURSE_WORK = 9;

	/**
	 * The feature id for the '<em><b>Lecture Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__LECTURE_HOURS = 0;

	/**
	 * The feature id for the '<em><b>Lab Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__LAB_HOURS = 1;

	/**
	 * The feature id for the '<em><b>Course Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK__COURSE_INSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_WORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.TimetableImpl
	 * @see course.impl.CoursePackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 10;

	/**
	 * The feature id for the '<em><b>Course Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__COURSE_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Timetable Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__TIMETABLE_ENTRY = 1;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.TimetableEntryImpl <em>Timetable Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.TimetableEntryImpl
	 * @see course.impl.CoursePackageImpl#getTimetableEntry()
	 * @generated
	 */
	int TIMETABLE_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY__DAY = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY__ROOM = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY__TIME = 2;

	/**
	 * The feature id for the '<em><b>Study Program</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY__STUDY_PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Timetable Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Timetable Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.EmploymentImpl <em>Employment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.EmploymentImpl
	 * @see course.impl.CoursePackageImpl#getEmployment()
	 * @generated
	 */
	int EMPLOYMENT = 12;

	/**
	 * The feature id for the '<em><b>Employment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__EMPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__EMPLOYEE = 1;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT__ORGANISATION = 2;

	/**
	 * The number of structural features of the '<em>Employment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Employment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.impl.StudiesImpl <em>Studies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.impl.StudiesImpl
	 * @see course.impl.CoursePackageImpl#getStudies()
	 * @generated
	 */
	int STUDIES = 13;

	/**
	 * The feature id for the '<em><b>Past Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES__PAST_COURSES = 0;

	/**
	 * The feature id for the '<em><b>Student</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES__STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Current Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES__CURRENT_COURSES = 2;

	/**
	 * The number of structural features of the '<em>Studies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Studies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link course.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.DayOfWeek
	 * @see course.impl.CoursePackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 14;

	/**
	 * The meta object id for the '{@link course.TypeOfInstruction <em>Type Of Instruction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.TypeOfInstruction
	 * @see course.impl.CoursePackageImpl#getTypeOfInstruction()
	 * @generated
	 */
	int TYPE_OF_INSTRUCTION = 15;

	/**
	 * The meta object id for the '{@link course.TypeOfEmployment <em>Type Of Employment</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.TypeOfEmployment
	 * @see course.impl.CoursePackageImpl#getTypeOfEmployment()
	 * @generated
	 */
	int TYPE_OF_EMPLOYMENT = 16;


	/**
	 * The meta object id for the '{@link course.semesterType <em>semester Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see course.semesterType
	 * @see course.impl.CoursePackageImpl#getsemesterType()
	 * @generated
	 */
	int SEMESTER_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link course.University <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>University</em>'.
	 * @see course.University
	 * @generated
	 */
	EClass getUniversity();

	/**
	 * Returns the meta object for the attribute '{@link course.University#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.University#getName()
	 * @see #getUniversity()
	 * @generated
	 */
	EAttribute getUniversity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link course.University#getFaculties <em>Faculties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faculties</em>'.
	 * @see course.University#getFaculties()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_Faculties();

	/**
	 * Returns the meta object for the containment reference list '{@link course.University#getPeople <em>People</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>People</em>'.
	 * @see course.University#getPeople()
	 * @see #getUniversity()
	 * @generated
	 */
	EReference getUniversity_People();

	/**
	 * Returns the meta object for class '{@link course.Faculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty</em>'.
	 * @see course.Faculty
	 * @generated
	 */
	EClass getFaculty();

	/**
	 * Returns the meta object for the attribute '{@link course.Faculty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Faculty#getName()
	 * @see #getFaculty()
	 * @generated
	 */
	EAttribute getFaculty_Name();

	/**
	 * Returns the meta object for the container reference '{@link course.Faculty#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>University</em>'.
	 * @see course.Faculty#getUniversity()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_University();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Faculty#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see course.Faculty#getDepartments()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_Departments();

	/**
	 * Returns the meta object for the attribute '{@link course.Faculty#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see course.Faculty#getShortName()
	 * @see #getFaculty()
	 * @generated
	 */
	EAttribute getFaculty_ShortName();

	/**
	 * Returns the meta object for class '{@link course.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see course.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see course.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see course.Course#getContent()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Content();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see course.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the reference list '{@link course.Course#getStudyPrograms <em>Study Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Study Programs</em>'.
	 * @see course.Course#getStudyPrograms()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_StudyPrograms();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Course#getCourseInstances <em>Course Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Instances</em>'.
	 * @see course.Course#getCourseInstances()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseInstances();

	/**
	 * Returns the meta object for the container reference '{@link course.Course#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Department</em>'.
	 * @see course.Course#getDepartment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Department();

	/**
	 * Returns the meta object for the reference list '{@link course.Course#getPreRequisities <em>Pre Requisities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pre Requisities</em>'.
	 * @see course.Course#getPreRequisities()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_PreRequisities();

	/**
	 * Returns the meta object for the attribute '{@link course.Course#getDependentCourses <em>Dependent Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Courses</em>'.
	 * @see course.Course#getDependentCourses()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_DependentCourses();

	/**
	 * Returns the meta object for class '{@link course.CourseInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see course.CourseInstance
	 * @generated
	 */
	EClass getCourseInstance();

	/**
	 * Returns the meta object for the container reference '{@link course.CourseInstance#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course</em>'.
	 * @see course.CourseInstance#getCourse()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Course();

	/**
	 * Returns the meta object for the containment reference '{@link course.CourseInstance#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organisation</em>'.
	 * @see course.CourseInstance#getOrganisation()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Organisation();

	/**
	 * Returns the meta object for the containment reference '{@link course.CourseInstance#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evaluation</em>'.
	 * @see course.CourseInstance#getEvaluation()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_Evaluation();

	/**
	 * Returns the meta object for the containment reference '{@link course.CourseInstance#getCourseWork <em>Course Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Course Work</em>'.
	 * @see course.CourseInstance#getCourseWork()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_CourseWork();

	/**
	 * Returns the meta object for the containment reference '{@link course.CourseInstance#getTimeTable <em>Time Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Table</em>'.
	 * @see course.CourseInstance#getTimeTable()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EReference getCourseInstance_TimeTable();

	/**
	 * Returns the meta object for the attribute '{@link course.CourseInstance#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester</em>'.
	 * @see course.CourseInstance#getSemester()
	 * @see #getCourseInstance()
	 * @generated
	 */
	EAttribute getCourseInstance_Semester();

	/**
	 * Returns the meta object for class '{@link course.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see course.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link course.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the attribute '{@link course.Department#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see course.Department#getShortName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_ShortName();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see course.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Department#getStudyPrograms <em>Study Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Programs</em>'.
	 * @see course.Department#getStudyPrograms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_StudyPrograms();

	/**
	 * Returns the meta object for the container reference '{@link course.Department#getFaculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Faculty</em>'.
	 * @see course.Department#getFaculty()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Faculty();

	/**
	 * Returns the meta object for class '{@link course.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see course.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link course.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see course.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the reference list '{@link course.Person#getEmployment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employment</em>'.
	 * @see course.Person#getEmployment()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Employment();

	/**
	 * Returns the meta object for the containment reference '{@link course.Person#getStudies <em>Studies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Studies</em>'.
	 * @see course.Person#getStudies()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Studies();

	/**
	 * Returns the meta object for class '{@link course.Evaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see course.Evaluation
	 * @generated
	 */
	EClass getEvaluation();

	/**
	 * Returns the meta object for the attribute '{@link course.Evaluation#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exam</em>'.
	 * @see course.Evaluation#getExam()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Exam();

	/**
	 * Returns the meta object for the attribute '{@link course.Evaluation#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see course.Evaluation#getProject()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Project();

	/**
	 * Returns the meta object for the attribute '{@link course.Evaluation#getAssigments <em>Assigments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigments</em>'.
	 * @see course.Evaluation#getAssigments()
	 * @see #getEvaluation()
	 * @generated
	 */
	EAttribute getEvaluation_Assigments();

	/**
	 * Returns the meta object for the container reference '{@link course.Evaluation#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course Instance</em>'.
	 * @see course.Evaluation#getCourseInstance()
	 * @see #getEvaluation()
	 * @generated
	 */
	EReference getEvaluation_CourseInstance();

	/**
	 * Returns the meta object for class '{@link course.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see course.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the container reference '{@link course.Organisation#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course Instance</em>'.
	 * @see course.Organisation#getCourseInstance()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_CourseInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Organisation#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employees</em>'.
	 * @see course.Organisation#getEmployees()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Employees();

	/**
	 * Returns the meta object for class '{@link course.StudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Program</em>'.
	 * @see course.StudyProgram
	 * @generated
	 */
	EClass getStudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link course.StudyProgram#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see course.StudyProgram#getCode()
	 * @see #getStudyProgram()
	 * @generated
	 */
	EAttribute getStudyProgram_Code();

	/**
	 * Returns the meta object for class '{@link course.CourseWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work</em>'.
	 * @see course.CourseWork
	 * @generated
	 */
	EClass getCourseWork();

	/**
	 * Returns the meta object for the attribute '{@link course.CourseWork#getLectureHours <em>Lecture Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lecture Hours</em>'.
	 * @see course.CourseWork#getLectureHours()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_LectureHours();

	/**
	 * Returns the meta object for the attribute '{@link course.CourseWork#getLabHours <em>Lab Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lab Hours</em>'.
	 * @see course.CourseWork#getLabHours()
	 * @see #getCourseWork()
	 * @generated
	 */
	EAttribute getCourseWork_LabHours();

	/**
	 * Returns the meta object for the container reference '{@link course.CourseWork#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course Instance</em>'.
	 * @see course.CourseWork#getCourseInstance()
	 * @see #getCourseWork()
	 * @generated
	 */
	EReference getCourseWork_CourseInstance();

	/**
	 * Returns the meta object for class '{@link course.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see course.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the container reference '{@link course.Timetable#getCourseInstance <em>Course Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Course Instance</em>'.
	 * @see course.Timetable#getCourseInstance()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_CourseInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link course.Timetable#getTimetableEntry <em>Timetable Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timetable Entry</em>'.
	 * @see course.Timetable#getTimetableEntry()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_TimetableEntry();

	/**
	 * Returns the meta object for class '{@link course.TimetableEntry <em>Timetable Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable Entry</em>'.
	 * @see course.TimetableEntry
	 * @generated
	 */
	EClass getTimetableEntry();

	/**
	 * Returns the meta object for the attribute '{@link course.TimetableEntry#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see course.TimetableEntry#getDay()
	 * @see #getTimetableEntry()
	 * @generated
	 */
	EAttribute getTimetableEntry_Day();

	/**
	 * Returns the meta object for the attribute '{@link course.TimetableEntry#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room</em>'.
	 * @see course.TimetableEntry#getRoom()
	 * @see #getTimetableEntry()
	 * @generated
	 */
	EAttribute getTimetableEntry_Room();

	/**
	 * Returns the meta object for the attribute '{@link course.TimetableEntry#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see course.TimetableEntry#getTime()
	 * @see #getTimetableEntry()
	 * @generated
	 */
	EAttribute getTimetableEntry_Time();

	/**
	 * Returns the meta object for the reference list '{@link course.TimetableEntry#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Study Program</em>'.
	 * @see course.TimetableEntry#getStudyProgram()
	 * @see #getTimetableEntry()
	 * @generated
	 */
	EReference getTimetableEntry_StudyProgram();

	/**
	 * Returns the meta object for the attribute '{@link course.TimetableEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see course.TimetableEntry#getType()
	 * @see #getTimetableEntry()
	 * @generated
	 */
	EAttribute getTimetableEntry_Type();

	/**
	 * Returns the meta object for class '{@link course.Employment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employment</em>'.
	 * @see course.Employment
	 * @generated
	 */
	EClass getEmployment();

	/**
	 * Returns the meta object for the attribute list '{@link course.Employment#getEmployment <em>Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Employment</em>'.
	 * @see course.Employment#getEmployment()
	 * @see #getEmployment()
	 * @generated
	 */
	EAttribute getEmployment_Employment();

	/**
	 * Returns the meta object for the reference '{@link course.Employment#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employee</em>'.
	 * @see course.Employment#getEmployee()
	 * @see #getEmployment()
	 * @generated
	 */
	EReference getEmployment_Employee();

	/**
	 * Returns the meta object for the container reference '{@link course.Employment#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Organisation</em>'.
	 * @see course.Employment#getOrganisation()
	 * @see #getEmployment()
	 * @generated
	 */
	EReference getEmployment_Organisation();

	/**
	 * Returns the meta object for class '{@link course.Studies <em>Studies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Studies</em>'.
	 * @see course.Studies
	 * @generated
	 */
	EClass getStudies();

	/**
	 * Returns the meta object for the reference list '{@link course.Studies#getPastCourses <em>Past Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Past Courses</em>'.
	 * @see course.Studies#getPastCourses()
	 * @see #getStudies()
	 * @generated
	 */
	EReference getStudies_PastCourses();

	/**
	 * Returns the meta object for the container reference '{@link course.Studies#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Student</em>'.
	 * @see course.Studies#getStudent()
	 * @see #getStudies()
	 * @generated
	 */
	EReference getStudies_Student();

	/**
	 * Returns the meta object for the attribute '{@link course.Studies#getCurrentCourses <em>Current Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Courses</em>'.
	 * @see course.Studies#getCurrentCourses()
	 * @see #getStudies()
	 * @generated
	 */
	EAttribute getStudies_CurrentCourses();

	/**
	 * Returns the meta object for enum '{@link course.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see course.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the meta object for enum '{@link course.TypeOfInstruction <em>Type Of Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Instruction</em>'.
	 * @see course.TypeOfInstruction
	 * @generated
	 */
	EEnum getTypeOfInstruction();

	/**
	 * Returns the meta object for enum '{@link course.TypeOfEmployment <em>Type Of Employment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Employment</em>'.
	 * @see course.TypeOfEmployment
	 * @generated
	 */
	EEnum getTypeOfEmployment();

	/**
	 * Returns the meta object for enum '{@link course.semesterType <em>semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>semester Type</em>'.
	 * @see course.semesterType
	 * @generated
	 */
	EEnum getsemesterType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CourseFactory getCourseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link course.impl.UniversityImpl <em>University</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.UniversityImpl
		 * @see course.impl.CoursePackageImpl#getUniversity()
		 * @generated
		 */
		EClass UNIVERSITY = eINSTANCE.getUniversity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITY__NAME = eINSTANCE.getUniversity_Name();

		/**
		 * The meta object literal for the '<em><b>Faculties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__FACULTIES = eINSTANCE.getUniversity_Faculties();

		/**
		 * The meta object literal for the '<em><b>People</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITY__PEOPLE = eINSTANCE.getUniversity_People();

		/**
		 * The meta object literal for the '{@link course.impl.FacultyImpl <em>Faculty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.FacultyImpl
		 * @see course.impl.CoursePackageImpl#getFaculty()
		 * @generated
		 */
		EClass FACULTY = eINSTANCE.getFaculty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTY__NAME = eINSTANCE.getFaculty_Name();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__UNIVERSITY = eINSTANCE.getFaculty_University();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__DEPARTMENTS = eINSTANCE.getFaculty_Departments();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACULTY__SHORT_NAME = eINSTANCE.getFaculty_ShortName();

		/**
		 * The meta object literal for the '{@link course.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.CourseImpl
		 * @see course.impl.CoursePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CONTENT = eINSTANCE.getCourse_Content();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Study Programs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STUDY_PROGRAMS = eINSTANCE.getCourse_StudyPrograms();

		/**
		 * The meta object literal for the '<em><b>Course Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE_INSTANCES = eINSTANCE.getCourse_CourseInstances();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEPARTMENT = eINSTANCE.getCourse_Department();

		/**
		 * The meta object literal for the '<em><b>Pre Requisities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__PRE_REQUISITIES = eINSTANCE.getCourse_PreRequisities();

		/**
		 * The meta object literal for the '<em><b>Dependent Courses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DEPENDENT_COURSES = eINSTANCE.getCourse_DependentCourses();

		/**
		 * The meta object literal for the '{@link course.impl.CourseInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.CourseInstanceImpl
		 * @see course.impl.CoursePackageImpl#getCourseInstance()
		 * @generated
		 */
		EClass COURSE_INSTANCE = eINSTANCE.getCourseInstance();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE = eINSTANCE.getCourseInstance_Course();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__ORGANISATION = eINSTANCE.getCourseInstance_Organisation();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__EVALUATION = eINSTANCE.getCourseInstance_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Course Work</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__COURSE_WORK = eINSTANCE.getCourseInstance_CourseWork();

		/**
		 * The meta object literal for the '<em><b>Time Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCE__TIME_TABLE = eINSTANCE.getCourseInstance_TimeTable();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_INSTANCE__SEMESTER = eINSTANCE.getCourseInstance_Semester();

		/**
		 * The meta object literal for the '{@link course.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.DepartmentImpl
		 * @see course.impl.CoursePackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__SHORT_NAME = eINSTANCE.getDepartment_ShortName();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Study Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDY_PROGRAMS = eINSTANCE.getDepartment_StudyPrograms();

		/**
		 * The meta object literal for the '<em><b>Faculty</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__FACULTY = eINSTANCE.getDepartment_Faculty();

		/**
		 * The meta object literal for the '{@link course.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.PersonImpl
		 * @see course.impl.CoursePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Employment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EMPLOYMENT = eINSTANCE.getPerson_Employment();

		/**
		 * The meta object literal for the '<em><b>Studies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__STUDIES = eINSTANCE.getPerson_Studies();

		/**
		 * The meta object literal for the '{@link course.impl.EvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.EvaluationImpl
		 * @see course.impl.CoursePackageImpl#getEvaluation()
		 * @generated
		 */
		EClass EVALUATION = eINSTANCE.getEvaluation();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__EXAM = eINSTANCE.getEvaluation_Exam();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__PROJECT = eINSTANCE.getEvaluation_Project();

		/**
		 * The meta object literal for the '<em><b>Assigments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION__ASSIGMENTS = eINSTANCE.getEvaluation_Assigments();

		/**
		 * The meta object literal for the '<em><b>Course Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION__COURSE_INSTANCE = eINSTANCE.getEvaluation_CourseInstance();

		/**
		 * The meta object literal for the '{@link course.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.OrganisationImpl
		 * @see course.impl.CoursePackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Course Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__COURSE_INSTANCE = eINSTANCE.getOrganisation_CourseInstance();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__EMPLOYEES = eINSTANCE.getOrganisation_Employees();

		/**
		 * The meta object literal for the '{@link course.impl.StudyProgramImpl <em>Study Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.StudyProgramImpl
		 * @see course.impl.CoursePackageImpl#getStudyProgram()
		 * @generated
		 */
		EClass STUDY_PROGRAM = eINSTANCE.getStudyProgram();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PROGRAM__CODE = eINSTANCE.getStudyProgram_Code();

		/**
		 * The meta object literal for the '{@link course.impl.CourseWorkImpl <em>Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.CourseWorkImpl
		 * @see course.impl.CoursePackageImpl#getCourseWork()
		 * @generated
		 */
		EClass COURSE_WORK = eINSTANCE.getCourseWork();

		/**
		 * The meta object literal for the '<em><b>Lecture Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__LECTURE_HOURS = eINSTANCE.getCourseWork_LectureHours();

		/**
		 * The meta object literal for the '<em><b>Lab Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_WORK__LAB_HOURS = eINSTANCE.getCourseWork_LabHours();

		/**
		 * The meta object literal for the '<em><b>Course Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_WORK__COURSE_INSTANCE = eINSTANCE.getCourseWork_CourseInstance();

		/**
		 * The meta object literal for the '{@link course.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.TimetableImpl
		 * @see course.impl.CoursePackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Course Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__COURSE_INSTANCE = eINSTANCE.getTimetable_CourseInstance();

		/**
		 * The meta object literal for the '<em><b>Timetable Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__TIMETABLE_ENTRY = eINSTANCE.getTimetable_TimetableEntry();

		/**
		 * The meta object literal for the '{@link course.impl.TimetableEntryImpl <em>Timetable Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.TimetableEntryImpl
		 * @see course.impl.CoursePackageImpl#getTimetableEntry()
		 * @generated
		 */
		EClass TIMETABLE_ENTRY = eINSTANCE.getTimetableEntry();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_ENTRY__DAY = eINSTANCE.getTimetableEntry_Day();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_ENTRY__ROOM = eINSTANCE.getTimetableEntry_Room();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_ENTRY__TIME = eINSTANCE.getTimetableEntry_Time();

		/**
		 * The meta object literal for the '<em><b>Study Program</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE_ENTRY__STUDY_PROGRAM = eINSTANCE.getTimetableEntry_StudyProgram();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMETABLE_ENTRY__TYPE = eINSTANCE.getTimetableEntry_Type();

		/**
		 * The meta object literal for the '{@link course.impl.EmploymentImpl <em>Employment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.EmploymentImpl
		 * @see course.impl.CoursePackageImpl#getEmployment()
		 * @generated
		 */
		EClass EMPLOYMENT = eINSTANCE.getEmployment();

		/**
		 * The meta object literal for the '<em><b>Employment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYMENT__EMPLOYMENT = eINSTANCE.getEmployment_Employment();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT__EMPLOYEE = eINSTANCE.getEmployment_Employee();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYMENT__ORGANISATION = eINSTANCE.getEmployment_Organisation();

		/**
		 * The meta object literal for the '{@link course.impl.StudiesImpl <em>Studies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.impl.StudiesImpl
		 * @see course.impl.CoursePackageImpl#getStudies()
		 * @generated
		 */
		EClass STUDIES = eINSTANCE.getStudies();

		/**
		 * The meta object literal for the '<em><b>Past Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDIES__PAST_COURSES = eINSTANCE.getStudies_PastCourses();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDIES__STUDENT = eINSTANCE.getStudies_Student();

		/**
		 * The meta object literal for the '<em><b>Current Courses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDIES__CURRENT_COURSES = eINSTANCE.getStudies_CurrentCourses();

		/**
		 * The meta object literal for the '{@link course.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.DayOfWeek
		 * @see course.impl.CoursePackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '{@link course.TypeOfInstruction <em>Type Of Instruction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.TypeOfInstruction
		 * @see course.impl.CoursePackageImpl#getTypeOfInstruction()
		 * @generated
		 */
		EEnum TYPE_OF_INSTRUCTION = eINSTANCE.getTypeOfInstruction();

		/**
		 * The meta object literal for the '{@link course.TypeOfEmployment <em>Type Of Employment</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.TypeOfEmployment
		 * @see course.impl.CoursePackageImpl#getTypeOfEmployment()
		 * @generated
		 */
		EEnum TYPE_OF_EMPLOYMENT = eINSTANCE.getTypeOfEmployment();

		/**
		 * The meta object literal for the '{@link course.semesterType <em>semester Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see course.semesterType
		 * @see course.impl.CoursePackageImpl#getsemesterType()
		 * @generated
		 */
		EEnum SEMESTER_TYPE = eINSTANCE.getsemesterType();

	}

} //CoursePackage
