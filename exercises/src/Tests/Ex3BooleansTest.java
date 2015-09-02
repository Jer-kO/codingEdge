package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex3Booleans;

public class Ex3BooleansTest {
	
	@Test
	public void q1_notBoolTest() {
		assertEquals(false, Ex3Booleans.q1_notBool(true));
		assertEquals(true, Ex3Booleans.q1_notBool(false));
	}
	
	@Test
	public void q2_bothTrueTest() {
		assertEquals(true, Ex3Booleans.q2_bothTrue(true, true));
		assertEquals(false, Ex3Booleans.q2_bothTrue(true, false));
		assertEquals(false, Ex3Booleans.q2_bothTrue(false, true));
		assertEquals(false, Ex3Booleans.q2_bothTrue(false, false));
	}
	
	@Test
	public void q3_atLeastOneTrueTest() {
		assertEquals(true, Ex3Booleans.q3_atLeastOneTrue(true, true));
		assertEquals(true, Ex3Booleans.q3_atLeastOneTrue(true, false));
		assertEquals(true, Ex3Booleans.q3_atLeastOneTrue(false, true));
		assertEquals(false, Ex3Booleans.q3_atLeastOneTrue(false, false));
	}
	
	@Test
	public void q4_exactlyOneTrueTest() {
		assertEquals(false, Ex3Booleans.q4_exactlyOneTrue(true, true));
		assertEquals(true, Ex3Booleans.q4_exactlyOneTrue(true, false));
		assertEquals(true, Ex3Booleans.q4_exactlyOneTrue(false, true));
		assertEquals(false, Ex3Booleans.q4_exactlyOneTrue(false, false));
	}
	
	@Test
	public void q5_oddNumberTrueTest() {
		assertEquals(false, Ex3Booleans.q5_oddNumberTrue(false, false, false, false, false));
		assertEquals(true, Ex3Booleans.q5_oddNumberTrue(false ,false, true, false, false));
		assertEquals(true, Ex3Booleans.q5_oddNumberTrue(false, false, false, false, true));
		assertEquals(true, Ex3Booleans.q5_oddNumberTrue(false, true, false, false, false));
		assertEquals(false, Ex3Booleans.q5_oddNumberTrue(false, true, false, false, true));
		assertEquals(false, Ex3Booleans.q5_oddNumberTrue(false, true, false, false, true));
		assertEquals(true, Ex3Booleans.q5_oddNumberTrue(false, true, true, false, true));
		assertEquals(false, Ex3Booleans.q5_oddNumberTrue(true, true, false, true, true));
		assertEquals(true, Ex3Booleans.q5_oddNumberTrue(true, true, true, true, true));
	}
	
}
