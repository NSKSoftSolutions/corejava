package com.bussinessclasss;

import java.util.Scanner;

public class OperationsOnExceptions {

	Scanner s;
	int value3;
	public int div()
	{
		s=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int value1=s.nextInt();
		System.out.println("Enter 2nd value");
		int value2=s.nextInt();
		try {
		value3=value1/value2;
		System.out.println("The Div of two="+value3);
		}
		catch(ArithmeticException ae)
		{
        	System.out.println("coming to the catch block");
        	System.out.println("Dont Enter 0 For Denomenator");
		}		
		catch(NumberFormatException nfe)
		{
			System.out.println("Please enter a valid number");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
			System.out.println("closing the Things and cominng outside of the finally block");
			
		}
	return value3;
		
	}

}
