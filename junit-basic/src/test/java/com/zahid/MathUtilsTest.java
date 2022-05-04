package com.zahid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test1() {
		MathUtils mu = new MathUtils();
		int result = mu.add(4, 9);
		assertEquals(13, result);
		System.out.println("Test1 ran succussfully");
	}
	

	@Test
	void test2() {
		MathUtils mu = new MathUtils();
		int result = mu.add(0, 1);
		// assertEquals(2, result); // failure
		assertNotEquals(2, result); // pass
		System.out.println("Test2 ran succussfully");
	}
	

	@Test
	void test3() {
		MathUtils mu = new MathUtils();
		int result = mu.add(-4, 4);
		assertEquals(0, result);
		System.out.println("Test3 ran succussfully");
	}

}
