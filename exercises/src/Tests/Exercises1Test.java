package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import exercises.Ex1;

import java.util.UUID;


public class Exercises1Test {
	
	Ex1 ex1;
	static String str1;
	static String str2;
	
    @BeforeClass
    public static void setUpExercises() throws Exception {
        // Code executed before the first test method
    	str1 = UUID.randomUUID().toString();
    	str2 = UUID.randomUUID().toString();
    }

	@Test
	public void Question1Test() {
		assertEquals(Ex1.Question1("hello", "world"), "hello world");
		assertEquals(Ex1.Question1(str1, str2), str1 + " " + str2);
	}
	
	@Test
	public void Question2Test() {
		assertEquals(Ex1.Question2("hello", "world"), "hello world");
	}

}
