package Tests;

import static org.junit.Assert.*;
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
	
	@Test
	public void forQ2Test() {
		assertTrue(Ex2.forQ2(new int[] {1, 2, 3, 11}));
		assertTrue(Ex2.forQ2(new int[] {100}));
		assertFalse(Ex2.forQ2(new int[] {}));
		assertFalse(Ex2.forQ2(new int[] {-100}));
	}
	
	@Test
	public void forQ3Test() {
		assertEquals(Ex2.forQ3(new int[] {1, -4, 10, 3, 22, -30}), 22);
		assertEquals(Ex2.forQ3(new int[] {-44}), -44);
		assertEquals(Ex2.forQ3(new int[] {1, -4, 3000000, -100000000, 3}), 3000000);
		assertEquals(Ex2.forQ3(new int[] {-44, -12, -33}), -12);
	}
	
	@Test
	public void forQ4Test() {
		assertEquals(Ex2.forQ4(new int[][] {{-33}}), -33);
		assertEquals(Ex2.forQ4(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), 9);
		assertEquals(Ex2.forQ4(new int[][] {{3, 1, -5, 10, 23}, {1, 44, -2, -6, 4}, {-5, -1, 3, 43, 2}}), 44);
		assertEquals(Ex2.forQ4(new int[][] {{1,2}, {3, 4, 5, 6}, {7, 8, 9}, {10}}), 10);
	}
	
	@Test
	public void forQ5Test() {
		assertEquals(Ex2.forQ5(new int[] {1}), 1);
		assertEquals(Ex2.forQ5(new int[] {1, 2, 3}), 6);
		assertEquals(Ex2.forQ5(new int[] {-10, 20}), 10);
		assertEquals(Ex2.forQ5(new int[] {1, 2, 3, 4, 5}), 15);
	}
	
	
	@Test
	public void forQ6Test() {
		assertEquals(Ex2.forQ6(new int[][] {{-3}}), -3);
		assertEquals(Ex2.forQ6(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), 24);
		assertEquals(Ex2.forQ6(new int[][] {{3, 1, -5, 10, 23}, {1, 44, -2, -6, 4}, {-5, -1, 3, 43, 2}}), 42);
		assertEquals(Ex2.forQ6(new int[][] {{1,2}, {3, -4, 5, 6}, {-7, 8, 9}, {10}}), 10);
	}
	
}
