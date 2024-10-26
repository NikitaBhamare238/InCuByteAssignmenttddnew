package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalInCuBytettdtestApplicationTests {

	@Test
	void AddEmptyString() {
		CalulatorTest calculator =  new CalulatorTest();
		int result = calculator.add("");
		Assertions.assertEquals(0,result ,"Expected result is if Added an empty string it should return 0");
		
	}
	
	@Test
	void AddString() {
		CalulatorTest calculator =  new CalulatorTest();
		int result = calculator.add("1");
		Assertions.assertEquals(1,result,"Expected result is if Added a single number it should return the number itself");
	
		}
	
	@Test
	void AddTwoNumbers()
	{
		CalulatorTest calculator = new CalulatorTest();
		int result = calculator.add("1,5");
		Assertions.assertEquals(6, result,"Expected result is if Added two comma-separated numbers should return their sum");
	}
	
	@Test
	public void AddMultipleNumbers() {
		CalulatorTest calculator = new CalulatorTest();
	    int result = calculator.add("1,2,3,4");
	    Assertions.assertEquals(10, result, "Expected result is if Added multiple numbers should return their sum");
	}

	@Test
	public void AddNumbersWithNewLines() {
		CalulatorTest calculator = new CalulatorTest();
	    int result = calculator.add("1\n2,3");
	    Assertions.assertEquals(6, result, "Expected result is if Added numbers with new lines between them should return their sum");
	}

	@Test
	public void AddWithCustomDelimiter() {
		CalulatorTest calculator = new CalulatorTest();
	    int result = calculator.add("//;\n1;2");
	    Assertions.assertEquals(3, result, "Expected result is if Added Using a custom delimiter should return the correct sum");
	}
	@Test
	public void testSingleNegativeNumber() {
	    CalulatorTest calculator = new CalulatorTest();
	    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        calculator.add("-1");
	    });
	    Assertions.assertEquals("Negative numbers not allowed: [-1]", exception.getMessage());
	}
	
	@Test
	public void testMultipleNegativeNumbers() {
	    CalulatorTest calculator = new CalulatorTest();
	    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        calculator.add("1,-2,-3");
	    });
	    Assertions.assertEquals("Negative numbers not allowed: [-2, -3]", exception.getMessage());
	}


}
