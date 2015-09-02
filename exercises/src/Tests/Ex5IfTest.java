package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex5If;


public class Ex5IfTest {

	@Test
	public void q1_greaterThan0Test() {
		assertEquals(true, Ex5If.q1_greaterThan0(2));
		assertEquals(false, Ex5If.q1_greaterThan0(0));
		assertEquals(false, Ex5If.q1_greaterThan0(-2));
	}
	
	@Test
	public void q2_stringLengthOrNumTest() {
		assertEquals(5, Ex5If.q2_stringLengthOrNum("Hello", 1));
		assertEquals(10, Ex5If.q2_stringLengthOrNum("Bye", 10));
		assertEquals(7, Ex5If.q2_stringLengthOrNum("1234567", 7));
	}
	
	@Test
	public void q3_getDayOfWeekTest() {
		assertEquals("monday", Ex5If.q3_getDayOfWeek(1).toLowerCase());
		assertEquals("tuesday", Ex5If.q3_getDayOfWeek(2).toLowerCase());
		assertEquals("wednesday", Ex5If.q3_getDayOfWeek(3).toLowerCase());
		assertEquals("thursday", Ex5If.q3_getDayOfWeek(4).toLowerCase());
		assertEquals("friday", Ex5If.q3_getDayOfWeek(5).toLowerCase());
		assertEquals("saturday", Ex5If.q3_getDayOfWeek(6).toLowerCase());
		assertEquals("sunday", Ex5If.q3_getDayOfWeek(7).toLowerCase());
	}
	
	@Test
	public void q4_getLetterGradeTest() {
		assertEquals("A", Ex5If.q4_getLetterGrade(100));
		assertEquals("A", Ex5If.q4_getLetterGrade(86));
		assertEquals("B", Ex5If.q4_getLetterGrade(85));
		assertEquals("B", Ex5If.q4_getLetterGrade(70));
		assertEquals("C", Ex5If.q4_getLetterGrade(69));
		assertEquals("C", Ex5If.q4_getLetterGrade(60));
		assertEquals("D", Ex5If.q4_getLetterGrade(59));
		assertEquals("D", Ex5If.q4_getLetterGrade(50));
		assertEquals("F", Ex5If.q4_getLetterGrade(49));
		assertEquals("F", Ex5If.q4_getLetterGrade(0));
		
	}
	
}
