package com.sap.test;

import org.junit.Assert;
import org.junit.Before;

import com.sap.calculator.Calculator;

import junit.framework.TestCase;

public class UnitTestCase2 extends TestCase{

	Calculator calculatore ;
	
	@Before
	public void setUp(){
		this.calculatore = new Calculator();
	}
	public void testPositiveNumber(){
		Assert.assertTrue(this.calculatore.add(10, 20)== 30);
	}
}
