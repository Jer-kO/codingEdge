package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex7While;

public class Ex7WhileTest {
	
	@Test
	public void q1_findIndexOfIntTest() {
		assertEquals(0, Ex7While.q1_findIndexOfInt(new int[] {0, 0, 1, 2, 3}, 0));
		assertEquals(3, Ex7While.q1_findIndexOfInt(new int[] {0, 0, 1, -1, -1}, -1));
		assertEquals(4, Ex7While.q1_findIndexOfInt(new int[] {0, 0, 1, 2, 3}, 3));
	}
	
	@Test
	public void q2_zerosAtStartTest() {
		assertEquals(2, Ex7While.q2_zerosAtStart(new int[] {0, 0, 1, 2, 3}));
		assertEquals(0, Ex7While.q2_zerosAtStart(new int[] {1, 0, 0, 1, 2, 3}));
		assertEquals(0, Ex7While.q2_zerosAtStart(new int[] {}));
	}
	
}
