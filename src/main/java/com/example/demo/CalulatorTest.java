package com.example.demo;

public class CalulatorTest {

	public static int add (String num)
	{
		if (num.isEmpty())
		{
			return 0;
		}
		
		String delimiter = ",|\n";
	    if (num.startsWith("//")) {
	        int delimiterIndex = num.indexOf("\n");
	        delimiter = num.substring(2, delimiterIndex);
	        num = num.substring(delimiterIndex + 1);
	    }

	    String[] numArray = num.split(delimiter);
	    int sum = 0;
	    for (String num2 : numArray) {
	        sum =sum + Integer.parseInt(num2);
	    }
	    return sum;
	}
}