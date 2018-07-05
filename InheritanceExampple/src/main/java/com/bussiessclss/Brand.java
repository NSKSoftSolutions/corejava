package com.bussiessclss;

import java.util.Scanner;

public class Brand extends Category {

	String brand_name;
	String manufatured_by;

	Scanner s;

	public void addbrand() {
		s = new Scanner(System.in);
		System.out.println("Enter the Brand_Name");
		brand_name = s.next();
		System.out.println("Enter the Manufacturer");
		manufatured_by = s.next();
		System.out.println("=========================");
		System.out.println(brand_name + "" + manufatured_by);
		System.out.println("=========================");

	}

}
