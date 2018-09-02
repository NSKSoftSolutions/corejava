package com.syncon.scanner.bussinessclass;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Example {

	Scanner s;
	Logger logger = Logger.getLogger(Example.class.getName());
	int value3;

	public int addition() {
		s = new Scanner(System.in);
		System.out.println("Enter 1st value");
		int value1 = s.nextInt();
		System.out.println("enter 2nd value");
		int value2 = s.nextInt();
		/*
		 * int value1=30; int value2=20;
		 */
		value3 = (value1 + value2);
		logger.info("Addition of two=" + value3);

		return value3;
	}

	public void disp() {
		System.out.println(value3);
	}

}
