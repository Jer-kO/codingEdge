package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex7While;

public class Ex7WhileTest {
	
	@Test
	public void q1_addOneTest() {
		assertEquals(2, Ex7While.q1_zerosAtStart(new int[] {0, 0, 1, 2, 3}));
		assertEquals(0, Ex7While.q1_zerosAtStart(new int[] {1, 0, 0, 1, 2, 3}));
		assertEquals(0, Ex7While.q1_zerosAtStart(new int[] {}));
	}
	
}
