package com.bussiessclss;

import java.util.Scanner;

public class Category {

	String cat_name;
	int cat_id;
	Scanner s;
	public void addCategoryToShoppersAdda()
	{
		s=new Scanner(System.in);
		System.out.println("Category Name");
		cat_name=s.next();
		System.out.println("Category id");
		cat_id=s.nextInt();
		System.out.println("=========================");
		System.out.println(cat_id+ " "+cat_name);
		System.out.println("=========================");
			
	}
	
	
	
	
	
}
