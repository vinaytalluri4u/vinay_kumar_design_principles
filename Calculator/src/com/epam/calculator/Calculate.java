package com.epam.calculator;
import java.util.*;
public class Calculate extends Division
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("1)Addition");
	System.out.println("2)subtraction");
	System.out.println("3)Multiplication");
	System.out.println("4)Division");
	System.out.print("choose your choice:");
	int n=sc.nextInt();
	switch(n)
	{
	case 1:
	{
		System.out.print("Enter how many numbers to add:");
		int t=sc.nextInt();
		int[] a=new int[t];
		for(int i=0;i<t;i++)
		{
			System.out.print("Enter the "+(i+1)+" number:");
			a[i]=sc.nextInt();
		}
		int ad=add(a,t);
		System.out.println("Addition is:"+ad);
		break;
		
	}
	case 2:
	{
		System.out.println("Enter two numbers for substraction");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		System.out.println("Subtraction is "+sub(num1,num2));
		break;
	}
	case 3:
	{
		System.out.print("Enter how many numbers to multiply:");
		int t=sc.nextInt();
		int[] a=new int[t];
		for(int i=0;i<t;i++)
		{
			System.out.print("Enter the "+(i+1)+" number:");
			a[i]=sc.nextInt();
		}
		int ad=mul(a,t);
		System.out.println("Multiplication is:"+ad);
		break;
	}
	case 4:
	{
		System.out.println("Enter two numbers for division");
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		div(num1,num2);
		break;
	}
	default:
	{
		System.out.println("Out of choice");
	}
	}
	}

}
