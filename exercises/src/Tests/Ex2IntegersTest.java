package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex2Integers;

public class Ex2IntegersTest {
	
	@Test
	public void q1_addOneTest() {
		assertEquals(1, Ex2Integers.q1_addOne(0));
		assertEquals(0, Ex2Integers.q1_addOne(-1));
		assertEquals(1001, Ex2Integers.q1_addOne(1000));
	}
	
}
