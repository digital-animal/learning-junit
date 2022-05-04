package com.zahid;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

@DisplayName("When running CalculatorTest") 
public class CalculatorTest {
	
	public Calculator calc;
	public TestInfo testInfo;
	public TestReporter testReporter;
	
	@BeforeEach
	public void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		
		calc = new Calculator();
		
		testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
	}
	
	@Nested
	@DisplayName("Add Method")
	@Tag("Math")
	public class AddTest {
		
		@Test
		@DisplayName("when adding two positive numbers")
		public void testAddPositive() {
			assertEquals(2, calc.add(1, 1), "Should return right sum");
		}
		
		@Test
		@DisplayName("when adding two opposite signed numbers")
		public void testAddOpposite() {
			assertEquals(-5, calc.add(4, -9), "Should return right sum");
		}
		
		@Test
		@DisplayName("when adding two negative numbers")
		public void testAddNegative() {
			assertEquals(-2, calc.add(-1, -1), "Should return right sum");
		}
	}
	
	
	// @Test
	@RepeatedTest(5)
	@DisplayName("Sub Method, Repeated Test")
	public void testSubtraction(RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions = repetitionInfo.getTotalRepetitions();
		System.out.println("\t# Repetition " + currentRepetition + " of " + totalRepetitions + " testSubtraction()");
		
		int expected = 5;
		int actual = calc.sub(16, 11);
		assertEquals(expected, actual, () -> "should return " + expected + " but returned " + actual);
	}

	@Test
	@DisplayName("Testing Division Method")
	public void testDivision() {
		boolean isServerUp = true;
		assumeTrue(isServerUp);
		assertThrows(ArithmeticException.class, () -> calc.div(1, 0), "divide by zero should throw");
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Testing Multiplication Method")
	public void testMultication() {
		String report = "Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags();
		System.out.println(report);
		testReporter.publishEntry(report);
		
		// assertEquals(4, calc.mul(2, 2), "Should return multiplication of two numbers");
		assertAll(
				() -> assertEquals(4, calc.mul(2, 2)),
				() -> assertEquals(36, calc.mul(4, 9)),
				() -> assertEquals(-16, calc.mul(-4, 4)),
				() -> assertEquals(-2, calc.mul(2, -1)),
				() -> assertEquals(0, calc.mul(2, 0))
			);
	}

}
