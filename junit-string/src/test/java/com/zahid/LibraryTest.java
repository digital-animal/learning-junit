package com.zahid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibraryTest {

	@Test
	void test1() {
		String str = "abcdefg";
		String output = str.toUpperCase();
		String expected = "ABCDEFG";
		
		assertEquals(expected, output);
		System.out.println("Test1 successful");
	}

	@Test
	void test2() {
		int num = Math.min(4, 9);
		int expected = 4;
		
		assertEquals(expected, num);
		System.out.println("Test2 successful");
	}

	@Test
	void test3() {
		int num = Math.max(4, 9);
		int expected = 9;
		
		assertEquals(expected, num);
		System.out.println("Test3 successful");
	}

	@Test
	void test4() {
		double num = Math.pow(2, 10);
		double expected = 512;
		
		assertNotEquals(expected, num);
		System.out.println("Test4 successful");
	}
	
	@Test
	void test5() {
		int num = 9;
		boolean isEven = (num % 2 == 0? true: false);
		assertFalse(isEven);
		
		System.out.println("Test5 successful");
	}
	
	@Test
	void test6() {
		int num = 9;
		boolean isOdd = (num % 2 == 1? true: false);
		assertTrue(isOdd);
		
		System.out.println("Test6 successful");
	}
	
	@Test
	void test7() {
		String str = null;			
		assertThrows(NullPointerException.class, () -> str.length());

		System.out.println("Test7 successful");
	}
}
