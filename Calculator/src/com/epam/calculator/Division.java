package com.epam.calculator;

public class Division extends Multiplication {
	public static void div(int num1,int num2)
	{
	    float f;
		try
		{
			f=num1/num2;
			System.out.println("division is "+f);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
