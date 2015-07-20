package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exercises.Ex1;

import java.util.UUID;


public class Exercises1Test {
	
	Ex1 ex1;
	
    @BeforeClass
    public static void setUpExercises() throws Exception {
        // Code executed before the first test method
    }

	@Test
	public void stringQ1Test() {
		assertEquals(Ex1.stringQ1("hello", "world"), "hello world");
		assertEquals(Ex1.stringQ1("", ""), " ");
	}
	
	@Test
	public void stringQ2Test() {
		assertEquals(Ex1.stringQ2("hello"), "ello");
	}
	
	@Test
	public void booleanQ1Test() {
		assertEquals(Ex1.booleanQ1(true), false);
		assertEquals(Ex1.booleanQ1(false), true);
	}
	
	@Test
	public void booleanQ2Test() {
		assertEquals(Ex1.booleanQ2(true, true), true);
		assertEquals(Ex1.booleanQ2(true, false), false);
		assertEquals(Ex1.booleanQ2(false, true), false);
		assertEquals(Ex1.booleanQ2(false, false), false);
	}
	
	@Test
	public void booleanQ3Test() {
		assertEquals(Ex1.booleanQ3(true, true), true);
		assertEquals(Ex1.booleanQ3(true, false), true);
		assertEquals(Ex1.booleanQ3(false, true), true);
		assertEquals(Ex1.booleanQ3(false, false), false);
	}
	
	@Test
	public void booleanQ4Test() {
		assertEquals(Ex1.booleanQ4(true, true), false);
		assertEquals(Ex1.booleanQ4(true, false), true);
		assertEquals(Ex1.booleanQ4(false, true), true);
		assertEquals(Ex1.booleanQ4(false, false), false);
	}
	
	@Test
	public void booleanQ5Test() {
		assertEquals(Ex1.booleanQ5(false, false, false, false, false), false);
		assertEquals(Ex1.booleanQ5(false ,false, true, false, false), true);
		assertEquals(Ex1.booleanQ5(false, false, false, false, true), true);
		assertEquals(Ex1.booleanQ5(false, true, false, false, false), true);
		assertEquals(Ex1.booleanQ5(false, true, false, false, true), false);
		assertEquals(Ex1.booleanQ5(false, true, false, false, true), false);
		assertEquals(Ex1.booleanQ5(false, true, true, false, true), true);
		assertEquals(Ex1.booleanQ5(true, true, false, true, true), false);
		assertEquals(Ex1.booleanQ5(true, true, true, true, true), true);
	}
	
}
