package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import exercises.Ex2;


public class Exercises2Test {
	
	Ex2 ex2;

	@Test
	public void ifQ1Test() {
		assertEquals(Ex2.ifQ1(2), true);
		assertEquals(Ex2.ifQ1(0), false);
		assertEquals(Ex2.ifQ1(-2), false);
	}
	
	@Test
	public void ifQ2Test() {
		assertEquals(Ex2.ifQ2("Hello", 1), 5);
		assertEquals(Ex2.ifQ2("Bye", 10), 10);
		assertEquals(Ex2.ifQ2("1234567", 7), 7);
	}
	
	@Test
	public void ifQ3Test() {
		assertEquals(Ex2.ifQ3(1).toLowerCase(), "monday");
		assertEquals(Ex2.ifQ3(2).toLowerCase(), "tuesday");
		assertEquals(Ex2.ifQ3(3).toLowerCase(), "wednesday");
		assertEquals(Ex2.ifQ3(4).toLowerCase(), "thursday");
		assertEquals(Ex2.ifQ3(5).toLowerCase(), "friday");
		assertEquals(Ex2.ifQ3(6).toLowerCase(), "saturday");
		assertEquals(Ex2.ifQ3(7).toLowerCase(), "sunday");
	}
	
	@Test
	public void forQ1Test() {
		assertEquals(Ex2.forQ1(-1), "");
		assertEquals(Ex2.forQ1(0), "");
		assertEquals(Ex2.forQ1(1), "1");
		assertEquals(Ex2.forQ1(3), "111");
		assertEquals(Ex2.forQ1(5), "11111");
	}
	
}
