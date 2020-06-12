package com.sap.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sap.calculator.Calculator;

public class UnitTestCase1 {

	Calculator calc;
	
	@Before
	public void setUp() {
		calc = new Calculator();
	}
	@Test
	public void testAddWithPositiveNumbers() {
		int sumValue = calc.add(10, 20);
		assertTrue(sumValue == 30);
	}
	
	@Test
	public void testAddWithNegitiveNumber() {
		int sumValue = calc.add(-30, -40);
		assertTrue(sumValue == -70);
	}

}
