package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex6For;


public class Ex6ForTest {
	
	@Test
	public void q1_numberOfOnesTest() {
		assertEquals("", Ex6For.q1_numberOfOnes(-1));
		assertEquals("", Ex6For.q1_numberOfOnes(0));
		assertEquals("1", Ex6For.q1_numberOfOnes(1));
		assertEquals("111", Ex6For.q1_numberOfOnes(3));
		assertEquals("11111", Ex6For.q1_numberOfOnes(5));
	}
	
	@Test
	public void q2_largerThan10Test() {
		assertTrue(Ex6For.q2_largerThan10(new int[] {1, 2, 3, 11}));
		assertTrue(Ex6For.q2_largerThan10(new int[] {100}));
		assertFalse(Ex6For.q2_largerThan10(new int[] {}));
		assertFalse(Ex6For.q2_largerThan10(new int[] {-100}));
	}
	
	@Test
	public void q3_getLargestIntTest() {
		assertEquals(22, Ex6For.q3_getLargestInt(new int[] {1, -4, 10, 3, 22, -30}));
		assertEquals(-44, Ex6For.q3_getLargestInt(new int[] {-44}));
		assertEquals(3000000, Ex6For.q3_getLargestInt(new int[] {1, -4, 3000000, -100000000, 3}));
		assertEquals(-12, Ex6For.q3_getLargestInt(new int[] {-44, -12, -33}));
	}
	
	@Test
	public void q4_getLargestIntIn2DArrayTest() {
		assertEquals(-33, Ex6For.q4_getLargestIntIn2DArray(new int[][] {{-33}}));
		assertEquals(9, Ex6For.q4_getLargestIntIn2DArray(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
		assertEquals(44, Ex6For.q4_getLargestIntIn2DArray(new int[][] {{3, 1, -5, 10, 23}, {1, 44, -2, -6, 4}, {-5, -1, 3, 43, 2}}));
		assertEquals(10, Ex6For.q4_getLargestIntIn2DArray(new int[][] {{1,2}, {3, 4, 5, 6}, {7, 8, 9}, {10}}));
	}
	
	@Test
	public void q5_sumOfElementsTest() {
		assertEquals(1, Ex6For.q5_sumOfElements(new int[] {1}));
		assertEquals(6, Ex6For.q5_sumOfElements(new int[] {1, 2, 3}));
		assertEquals(10, Ex6For.q5_sumOfElements(new int[] {-10, 20}));
		assertEquals(15, Ex6For.q5_sumOfElements(new int[] {1, 2, 3, 4, 5}));
	}
	
	
	@Test
	public void q6_sumOfLargestRowTest() {
		assertEquals(-3, Ex6For.q6_sumOfLargestRow(new int[][] {{-3}}));
		assertEquals(24, Ex6For.q6_sumOfLargestRow(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
		assertEquals(42, Ex6For.q6_sumOfLargestRow(new int[][] {{3, 1, -5, 10, 23}, {1, 44, -2, -6, 4}, {-5, -1, 3, 43, 2}}));
		assertEquals(10, Ex6For.q6_sumOfLargestRow(new int[][] {{1,2}, {3, -4, 5, 6}, {-7, 8, 9}, {10}}));
	}
	
}
