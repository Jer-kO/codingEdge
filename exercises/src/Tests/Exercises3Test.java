package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex3;


public class Exercises3Test {
	
	Ex3 ex3;

	@Test
	public void secondStringTest() {
		assertEquals(Ex3.secondString(new String[] {"abc","def","ghi"}),"def");
		assertEquals(Ex3.secondString(new String[] {"abc","ghi"}),"ghi");
	}
	
	@Test
	public void findMaxTest() {
		assertEquals(Ex3.findMax(new int[] {1, 2, 3, 4}), 4);
		assertEquals(Ex3.findMax(new int[] {10}), 10);
		assertEquals(Ex3.findMax(new int[] {-1, -2, -3, -4}), -1);
		assertEquals(Ex3.findMax(new int[] {-10}), -10);
	}
	
	@Test
	public void findMinTest() {
		assertEquals(Ex3.findMin(new int[] {1, 2, 3, 4}), 1);
		assertEquals(Ex3.findMin(new int[] {10}), 10);
		assertEquals(Ex3.findMin(new int[] {-1, -2, -3, -4}), -4);
		assertEquals(Ex3.findMin(new int[] {-10}), -10);
	}
	
	@Test
	public void isSortedTest() {
		assertTrue(Ex3.isSorted(new int[] {-1, 0, 1, 2, 3, 4}));
		assertTrue(Ex3.isSorted(new int[] {10}));
		assertTrue(Ex3.isSorted(new int[] {}));
		assertFalse(Ex3.isSorted(new int[] {-1, -2, -3, -4}));
	}
	
	@Test
	public void sortIntsTest() {
		int[] input = {3, 1, 2, 0, -2, -1};
		int[] output = {-2, -1, 0, 1, 2, 3};
		int[] ans = Ex3.sortInts(input);
		
		for (int i = 0; i < ans.length; i++ ) {
			assertEquals(ans[i], output[i]);
		}
	}
	
	@Test
	public void numTriplesTest() {
		assertEquals(Ex3.numTriples(""), 0);
		assertEquals(Ex3.numTriples("a"), 0);
		assertEquals(Ex3.numTriples("aa"), 0);
		assertEquals(Ex3.numTriples("aaa"), 1);
		assertEquals(Ex3.numTriples("aaaxxbbbyyccc"), 3);
		assertEquals(Ex3.numTriples("aaaa"), 2);
		assertEquals(Ex3.numTriples("aaaabbbccd"), 3);
	}
	
	@Test
	public void fourInARowTest() {
		assertEquals(Ex3.fourInARow(new int[] {1, 1, 1, 1, 2, 1, 1}), 1);
		assertEquals(Ex3.fourInARow(new int[] {1, 2, 2, 2, 2, 1, 1}), 2);
		assertEquals(Ex3.fourInARow(new int[] {1, 1, 1, 2, 2, 2, 1}), 0);
		assertEquals(Ex3.fourInARow(new int[] {1, 1, 1}), 0);
	}
}
