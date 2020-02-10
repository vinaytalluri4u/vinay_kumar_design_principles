package com.epam.calculator;

public class Addition 
{
	public static int add(int a[],int t)
	{
		int sum=0;
		for(int i=0;i<t;i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}

}
