package com.zahid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Arithmetic Operations")
public class MathTest {
	
	public Math math;
	
	@BeforeEach
	public void init() {
		math = new Math();
	}
	
	@Nested
	@DisplayName("Testing Addition")
	public class testAddition {
		
		@Test
		@DisplayName("Testing Positive Number Addition")
		public void testPositiveAddition() {
			int expected = 13;
			int actual = math.add(4, 9);
			assertEquals(expected, actual, "Should be correct for positive addition");
		}
		
		@Test
		@DisplayName("Testing Negative Number Addition")
		public void testNegativeAddition() {
			int expected = -13;
			int actual = math.add(-4, -9);
			assertEquals(expected, actual, "Should be correct for negative addition");
		}
		
		@Test
		@DisplayName("Testing Reverse Number Addition")
		public void testReverseAddition() {
			int expected = 0;
			int actual = math.add(-4, 4);
			assertEquals(expected, actual, "Should be correct for reverse number addition");
		}
	}

}
