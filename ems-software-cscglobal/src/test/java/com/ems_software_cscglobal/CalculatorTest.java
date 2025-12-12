package com.ems_software_cscglobal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ems_software_cscglobal.calc.Calculator;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

	Calculator calculator;
	int expected = 0;

	@BeforeAll
	public static void setUpAll() {
		System.out.println("Welcome to GSC Testing Center");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("##Before Each");
		calculator = new Calculator();
		expected = 20;
	}

	@AfterEach
	public void afterEach() {
		System.out.println("##After each");
		expected = 0;
		calculator = null;
	}

	@Test
	@DisplayName("Testing 10 and 10")
	@Order(3)
	void testAddNumbers() {
		int actual = calculator.addNumbers(10, 10);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing 8 and 12")
	@Order(4)
	void testAddNumbers2() {
		int actual = calculator.addNumbers(8, 12);
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("Testing 30 and -10")
	@Order(1)
	void testAddNumbers3() {
		int actual = calculator.addNumbers(30, -10);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Testing 5 and 15")
	@Order(2)
	void testAddNumbers5() {
		int actual = calculator.addNumbers(5, 15);
		assertEquals(expected, actual);
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Thanks for using my testing services");
	}

}
