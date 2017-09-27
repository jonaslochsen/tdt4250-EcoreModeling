package course.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import course.Timetable;
import course.TimetableEntry;
import course.TypeOfEmployment;
import course.Course;
import course.CourseFactory;
import course.CourseInstance;
import course.CourseWork;
import course.DayOfWeek;
import course.Employment;
import course.Evaluation;
import course.Organisation;
import course.Person;
import course.StudyProgram;


public class CourseValidatorTest {
	
//	@Test
//	public void testScheduledHoursSumCorrectly() {
//		StudyProgram testStudyProgram = CourseFactory.eINSTANCE.createStudyProgram();
//		CourseWork testCourseWork = CourseFactory.eINSTANCE.createCourseWork();
//		Timetable testTimeTable = CourseFactory.eINSTANCE.createTimetable();
//		TimetableEntry testTimetableEntry = CourseFactory.eINSTANCE.createTimetableEntry();
//		TimetableEntry testTimetableEntry1 = CourseFactory.eINSTANCE.createTimetableEntry();
//		TimetableEntry testTimetableEntry2 = CourseFactory.eINSTANCE.createTimetableEntry();
//		
//		testTimetableEntry.setDay(DayOfWeek.WEDNESDAY);
//		
//		
//		
//		
//		
//	}
	
	@Test
	public void testCannotBeStudentAndTAInSameCourse() {
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
	
	@Test
	public void testEvaluationMustSumToOneHundred() {
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

}
