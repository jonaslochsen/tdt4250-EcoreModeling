package course.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import course.Timetable;
import course.TimetableEntry;
import course.TypeOfEmployment;
import course.TypeOfInstruction;
import course.semesterType;
import course.Course;
import course.CourseFactory;
import course.CourseInstance;
import course.CourseWork;
import course.DayOfWeek;
import course.Employment;
import course.Evaluation;
import course.Organisation;
import course.Person;
import course.Department;
import course.Evaluation;
import course.Organisation;
import course.StudyProgram;


public class CourseValidatorTest {	
	
	@Test
	public void testCannotBeStudentAndTAInSameCourseNotViolated() {
		CourseInstance testCourseInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		Person testPerson = CourseFactory.eINSTANCE.createPerson();
		Organisation testOrganisation = CourseFactory.eINSTANCE.createOrganisation();
		Employment testEmployment1 = CourseFactory.eINSTANCE.createEmployment();
		TypeOfEmployment testTypeOfEmployment1 = TypeOfEmployment.STUDENT;
		
		testCourseInstance.setCourse(testCourse);
		testOrganisation.setCourseInstance(testCourseInstance);
		
		testEmployment1.setOrganisation(testOrganisation);
		testEmployment1.setEmployee(testPerson);
		testEmployment1.getEmployment().add(testTypeOfEmployment1);
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(testEmployment1);
		assertEquals(Diagnostic.OK, diagnostics.getSeverity());
	}
	
	@Test
	public void testCannotBeStudentAndTAInSameCourseViolated() {
		CourseInstance testCourseInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		Person testPerson = CourseFactory.eINSTANCE.createPerson();
		Organisation testOrganisation = CourseFactory.eINSTANCE.createOrganisation();
		Employment testEmployment1 = CourseFactory.eINSTANCE.createEmployment();
		TypeOfEmployment testTypeOfEmployment1 = TypeOfEmployment.STUDENT;
		TypeOfEmployment testTypeOfEmployment2 = TypeOfEmployment.TA;
		
		testCourseInstance.setCourse(testCourse);
		testOrganisation.setCourseInstance(testCourseInstance);
		
		testEmployment1.setOrganisation(testOrganisation);
		testEmployment1.setEmployee(testPerson);
		testEmployment1.getEmployment().add(testTypeOfEmployment1);
		testEmployment1.getEmployment().add(testTypeOfEmployment2);
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(testEmployment1);
		assertEquals(Diagnostic.ERROR, diagnostics.getSeverity());
	}
	
	
	
	@Test
	public void testEvaluationMustSumToOneHundredNotViolated() {
		Evaluation testEvaluation = CourseFactory.eINSTANCE.createEvaluation();
		Evaluation testEvaluation2 = CourseFactory.eINSTANCE.createEvaluation();
		Evaluation testEvaluation3 = CourseFactory.eINSTANCE.createEvaluation();
		CourseInstance testCourseInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		
		testCourseInstance.setCourse(testCourse);
		
		testEvaluation.setCourseInstance(testCourseInstance);
		testEvaluation.setAssigments(20);
		testEvaluation.setProject(20);
		testEvaluation.setExam(60);
		
		testEvaluation2.setCourseInstance(testCourseInstance);
		testEvaluation2.setAssigments(0);
		testEvaluation2.setExam(100);
		testEvaluation2.setProject(0);
		
		testEvaluation3.setCourseInstance(testCourseInstance);
		testEvaluation3.setAssigments(50);
		testEvaluation3.setExam(50);
		testEvaluation3.setProject(0);

		
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(testEvaluation);
		assertEquals(Diagnostic.OK, diagnostics.getSeverity());
		
		Diagnostic diagnostics2 = Diagnostician.INSTANCE.validate(testEvaluation2);
		assertEquals(Diagnostic.OK, diagnostics2.getSeverity());
		
		Diagnostic diagnostics3 = Diagnostician.INSTANCE.validate(testEvaluation3);
		assertEquals(Diagnostic.OK, diagnostics3.getSeverity());
	}
	
	@Test
	public void testEvaluationMustSumToOneHundredViolated() {
		Evaluation testEvaluation = CourseFactory.eINSTANCE.createEvaluation();
		Evaluation testEvaluation2 = CourseFactory.eINSTANCE.createEvaluation();
		Evaluation testEvaluation3 = CourseFactory.eINSTANCE.createEvaluation();
		CourseInstance testCourseInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		
		testCourseInstance.setCourse(testCourse);
		
		testEvaluation.setCourseInstance(testCourseInstance);
		testEvaluation.setAssigments(50);
		testEvaluation.setProject(50);
		testEvaluation.setExam(50);
		
		testEvaluation2.setCourseInstance(testCourseInstance);
		testEvaluation2.setAssigments(50);
		testEvaluation2.setExam(40);
		testEvaluation2.setProject(0);
		
		testEvaluation3.setCourseInstance(testCourseInstance);
		testEvaluation3.setAssigments(50);
		testEvaluation3.setExam(70);
		testEvaluation3.setProject(0);

		
		Diagnostic diagnostics = Diagnostician.INSTANCE.validate(testEvaluation);
		assertEquals(Diagnostic.ERROR, diagnostics.getSeverity());
		
		Diagnostic diagnostics2 = Diagnostician.INSTANCE.validate(testEvaluation2);
		assertEquals(Diagnostic.ERROR, diagnostics2.getSeverity());
		
		Diagnostic diagnostics3 = Diagnostician.INSTANCE.validate(testEvaluation3);
		assertEquals(Diagnostic.ERROR, diagnostics3.getSeverity());
	}
	
	public void testScheduledHoursSumCorrectly() {
		StudyProgram testStudyProgram = CourseFactory.eINSTANCE.createStudyProgram();
		testStudyProgram.setCode("MTDT");
		StudyProgram testStudyProgram2 = CourseFactory.eINSTANCE.createStudyProgram();
		testStudyProgram2.setCode("MTPETR");
		CourseWork testCourseWork = CourseFactory.eINSTANCE.createCourseWork();
		Timetable testTimeTable = CourseFactory.eINSTANCE.createTimetable();
		CourseInstance testCourseInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		Department testDepartment = CourseFactory.eINSTANCE.createDepartment();
		TimetableEntry testTimetableEntry = CourseFactory.eINSTANCE.createTimetableEntry();
		TimetableEntry testTimetableEntry1 = CourseFactory.eINSTANCE.createTimetableEntry();
		TimetableEntry testTimetableEntry2 = CourseFactory.eINSTANCE.createTimetableEntry();
		Evaluation testEvaluation = CourseFactory.eINSTANCE.createEvaluation();
		Organisation testOrganisation = CourseFactory.eINSTANCE.createOrganisation();
		
		testTimetableEntry.setDay(DayOfWeek.WEDNESDAY);
		testTimetableEntry.setRoom("VE22");
		testTimetableEntry.setTime("08:15-10:00");
		testTimetableEntry.setType(TypeOfInstruction.LAB);
		testTimetableEntry.addStudyProgram(testStudyProgram);
		
		testTimetableEntry1.setDay(DayOfWeek.WEDNESDAY);
		testTimetableEntry1.setRoom("S4");
		testTimetableEntry1.setTime("12:15-14:00");
		testTimetableEntry1.setType(TypeOfInstruction.LECTURE);
		testTimetableEntry1.addStudyProgram(testStudyProgram);
		
		testTimetableEntry2.setDay(DayOfWeek.THURSDAY);
		testTimetableEntry2.setRoom("S4");
		testTimetableEntry2.setTime("12:15-13:00");
		testTimetableEntry2.setType(TypeOfInstruction.LECTURE);
		testTimetableEntry2.addStudyProgram(testStudyProgram);
		
		TimetableEntry testTimetableEntry3 = CourseFactory.eINSTANCE.createTimetableEntry();
		testTimetableEntry3.setDay(DayOfWeek.WEDNESDAY);
		testTimetableEntry3.setRoom("VE22");
		testTimetableEntry3.setTime("08:15-10:00");
		testTimetableEntry3.setType(TypeOfInstruction.LAB);
		testTimetableEntry3.addStudyProgram(testStudyProgram2);
		
		TimetableEntry testTimetableEntry4 = CourseFactory.eINSTANCE.createTimetableEntry();
		testTimetableEntry4.setDay(DayOfWeek.WEDNESDAY);
		testTimetableEntry4.setRoom("S4");
		testTimetableEntry4.setTime("12:15-14:00");
		testTimetableEntry4.setType(TypeOfInstruction.LECTURE);
		testTimetableEntry4.addStudyProgram(testStudyProgram2);
		
		TimetableEntry testTimetableEntry5 = CourseFactory.eINSTANCE.createTimetableEntry();
		testTimetableEntry5.setDay(DayOfWeek.THURSDAY);
		testTimetableEntry5.setRoom("S4");
		testTimetableEntry5.setTime("12:15-13:00");
		testTimetableEntry5.setType(TypeOfInstruction.LECTURE);
		testTimetableEntry5.addStudyProgram(testStudyProgram2);
		
		testTimeTable.addTimetableEntry(testTimetableEntry);
		testTimeTable.addTimetableEntry(testTimetableEntry1);
		testTimeTable.addTimetableEntry(testTimetableEntry2);
		testTimeTable.addTimetableEntry(testTimetableEntry3);
		testTimeTable.addTimetableEntry(testTimetableEntry4);
		testTimeTable.addTimetableEntry(testTimetableEntry5);
		
		
		testCourseWork.setLabHours(2);
		testCourseWork.setLectureHours(3);
		
		testCourseInstance.setCourse(testCourse);
		testCourse.setDepartment(testDepartment);
		testCourseInstance.setSemester(semesterType.FALL);
		testCourseInstance.setEvaluation(testEvaluation);
		testCourseInstance.setOrganisation(testOrganisation);
		testCourseInstance.setCourseWork(testCourseWork);
		testCourseInstance.setTimeTable(testTimeTable);
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(testCourseInstance);
		assertEquals(Diagnostic.OK, diagnostic.getSeverity());
	}
	
	@Test
	public void testScheduledHoursConstraintViolated() {
		StudyProgram testStudyProgram = CourseFactory.eINSTANCE.createStudyProgram();
		CourseWork testCourseWork = CourseFactory.eINSTANCE.createCourseWork();
		Timetable testTimeTable = CourseFactory.eINSTANCE.createTimetable();
		CourseInstance testCourseInstance = CourseFactory.eINSTANCE.createCourseInstance();
		Course testCourse = CourseFactory.eINSTANCE.createCourse();
		Department testDepartment = CourseFactory.eINSTANCE.createDepartment();
		TimetableEntry testTimetableEntry = CourseFactory.eINSTANCE.createTimetableEntry();
		TimetableEntry testTimetableEntry1 = CourseFactory.eINSTANCE.createTimetableEntry();
		TimetableEntry testTimetableEntry2 = CourseFactory.eINSTANCE.createTimetableEntry();
		Evaluation testEvaluation = CourseFactory.eINSTANCE.createEvaluation();
		Organisation testOrganisation = CourseFactory.eINSTANCE.createOrganisation();
		
		testTimetableEntry.setDay(DayOfWeek.WEDNESDAY);
		testTimetableEntry.setRoom("VE22");
		testTimetableEntry.setTime("08:15-13:00");
		testTimetableEntry.setType(TypeOfInstruction.LAB);
		testTimetableEntry.addStudyProgram(testStudyProgram);
		
		testTimetableEntry1.setDay(DayOfWeek.WEDNESDAY);
		testTimetableEntry1.setRoom("S4");
		testTimetableEntry1.setTime("12:15-15:00");
		testTimetableEntry1.setType(TypeOfInstruction.LECTURE);
		testTimetableEntry1.addStudyProgram(testStudyProgram);
		
		testTimetableEntry2.setDay(DayOfWeek.THURSDAY);
		testTimetableEntry2.setRoom("S4");
		testTimetableEntry2.setTime("12:15-17:00");
		testTimetableEntry2.setType(TypeOfInstruction.LECTURE);
		testTimetableEntry2.addStudyProgram(testStudyProgram);
		
		testTimeTable.addTimetableEntry(testTimetableEntry);
		testTimeTable.addTimetableEntry(testTimetableEntry1);
		testTimeTable.addTimetableEntry(testTimetableEntry2);
		
		testCourseWork.setLabHours(2);
		testCourseWork.setLectureHours(3);
		
		testCourseInstance.setCourse(testCourse);
		testCourse.setDepartment(testDepartment);
		testCourseInstance.setSemester(semesterType.FALL);
		testCourseInstance.setEvaluation(testEvaluation);
		testCourseInstance.setOrganisation(testOrganisation);
		testCourseInstance.setCourseWork(testCourseWork);
		testCourseInstance.setTimeTable(testTimeTable);
		
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(testCourseInstance);
		assertEquals(Diagnostic.ERROR, diagnostic.getSeverity());
		
		
	}
}

