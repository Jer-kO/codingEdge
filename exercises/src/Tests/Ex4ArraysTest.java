package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex4Arrays;

public class Ex4ArraysTest {
	
	@Test
	public void q1_firstString() {
		assertEquals("abc", Ex4Arrays.q1_firstString(new String[] {"abc","def","ghi"}));
		assertEquals("abc", Ex4Arrays.q1_firstString(new String[] {"abc","ghi"}));
	}
	
	@Test
	public void q2_secondStringTest() {
		assertEquals("def", Ex4Arrays.q2_secondString(new String[] {"abc","def","ghi"}));
		assertEquals("ghi", Ex4Arrays.q2_secondString(new String[] {"abc","ghi"}));
	}
	
}
