package com.zahid;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CircleTest {
	
	Circle circle;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("# This needs to run before all");
	}
	
	@AfterAll
	static void afterAllCleanup() {
		System.out.println("# This needs to run after all");
	}
	
	@BeforeEach
	void init() {
		circle = new Circle();
		System.out.println("Instantiating circle");
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up");
	}

	@Test
	@DisplayName("Testing Cirlce Area Method")
	void testCircleArea() {
		double expected = 314.1592653589793;
		double actual = circle.computeArea(10);
		assertEquals(expected, actual, "should return correct circle area");
	}
	

	@Test
	void testCircleCircumference() {
	
		double expected = 62.83185307179586;
		double actual = circle.computeCircumference(10);
		assertEquals(expected, actual, "should return correct circle circumference");
	}
	
	@Test
	@Disabled
	@DisplayName("Disabled method. Should not run")
	void testDisabled() {
		fail("This test should be disabled");
	}
	
	@Test
	@EnabledOnOs(OS.LINUX)
	@DisplayName("Enabled on Linux. Disabled on Windows")
	void testEnabledOnLinux() {
		// fail("This test should be disabled in Windows but enabled on Linux");
		System.out.println("Testing on Ubuntu OS");
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	@DisplayName("Enabled on Windows. Disabled on Linux")
	void testEnabledOnWindows() {
		System.out.println("Testing on Windows OS");
	}

}
