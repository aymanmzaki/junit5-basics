package com.jdevz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils m;
	
	@BeforeEach
	void init() {
		m= new MathUtils();	
	}

	
	@Test
	void testAdd() {
		int expected= 10;
		int actual=m.add(5, 5);
		assertEquals(expected,actual, "This Method should Add two numbers");
	}
	
	@Test
	void testCalculateCicleAreaMethod()
	{	
		double radius=10;
		double expected=3.14*radius*radius;
		double actual=m.calculateCircleArea(10);
		double delta=0.20;
		assertEquals(expected, actual,delta);
	}
	
	@Test
	void testDivideWithNormalDoubleNumbers() {
		double a= 100, b=50;
		double actual=m.divide(a, b);
		double expected=2;
		assertEquals(expected, actual);
			
	}

	@Test
	void testDivideByZaero() {
		assertThrows(ArithmeticException.class,() -> m.divide(100, 0),"divide By Zero Should be Thrown" );
	}
}
