package course.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import course.Timetable;
import course.TimetableEntry;
import course.CourseFactory;
import course.CourseWork;
import course.DayOfWeek;
import course.StudyProgram;


public class CourseValidatorTest {
	
	@Test
	public void testScheduledHoursSumCorrectly() {
		StudyProgram testStudyProgram = CourseFactory.eINSTANCE.createStudyProgram();
		CourseWork testCourseWork = CourseFactory.eINSTANCE.createCourseWork();
		Timetable testTimeTable = CourseFactory.eINSTANCE.createTimetable();
		TimetableEntry testTimetableEntry = CourseFactory.eINSTANCE.createTimetableEntry();
		TimetableEntry testTimetableEntry1 = CourseFactory.eINSTANCE.createTimetableEntry();
		TimetableEntry testTimetableEntry2 = CourseFactory.eINSTANCE.createTimetableEntry();
		
		testTimetableEntry.setDay(DayOfWeek.WEDNESDAY);
		
		
		
		
		
	}

}
