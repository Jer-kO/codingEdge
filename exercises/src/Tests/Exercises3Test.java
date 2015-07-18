package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import exercises.Ex3;


public class Exercises3Test {
	
	Ex3 ex3;

	@Test
	public void findMax() {
		assertEquals(Ex3.findMax(new int[] {1, 2, 3, 4}), 4);
		assertEquals(Ex3.findMax(new int[] {10}), 10);
		assertEquals(Ex3.findMax(new int[] {-1, -2, -3, -4}), -1);
		assertEquals(Ex3.findMax(new int[] {-10}), -10);
	}
	
	@Test
	public void findMin() {
		assertEquals(Ex3.findMin(new int[] {1, 2, 3, 4}), 1);
		assertEquals(Ex3.findMin(new int[] {10}), 10);
		assertEquals(Ex3.findMin(new int[] {-1, -2, -3, -4}), -4);
		assertEquals(Ex3.findMin(new int[] {-10}), -10);
	}
}
