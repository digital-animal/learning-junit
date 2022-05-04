package com.zahid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculationTest {
	    
	@Test
	public void testAdd() {
		Calculation t1 = new Calculation();
		int result = t1.add(4, 9);
		
		assertEquals(13, result);
		// assertEquals(10, result);
	}

	@Test
	public void testSquare() {
		Calculation t1 = new Calculation();
		int result = t1.square(4);
		
		assertEquals(16, result);
		// assertEquals(17, result);
	}

}
