package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import exercises.Ex1Strings;

public class Ex1StringsTest {
	
	@Test
	public void q1_concatTwoStringsTest() {
		assertEquals("hello world", Ex1Strings.q1_concatTwoStrings("hello", "world"));
		assertEquals(" ", Ex1Strings.q1_concatTwoStrings("", ""));
	}
	
	@Test
	public void q2_concatThreeStrings() {
		assertEquals("a b c", Ex1Strings.q2_concatThreeStrings("a", "b", "c"));
		assertEquals("  ", Ex1Strings.q2_concatThreeStrings("", "", ""));
	}
	
	@Test
	public void q3_allButFirstCharTest() {
		assertEquals("h", Ex1Strings.q3_getFirstChar("hello"));
		assertEquals("a", Ex1Strings.q3_getFirstChar("a"));
	}
	
	@Test
	public void q4_allButFirstCharTest() {
		assertEquals("ello", Ex1Strings.q4_allButFirstChar("hello"));
	}
	
}
