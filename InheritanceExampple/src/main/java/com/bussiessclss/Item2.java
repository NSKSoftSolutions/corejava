package com.bussiessclss;

import java.util.Scanner;

public class Item2 extends Brand {

	String item_id;
	String item_name;
	double price;
	String warrenty;

	Scanner s;

	public void add_ItemToShoppersAdda() {
		s = new Scanner(System.in);
		System.out.println("Enter Item_id");
		item_id = s.next();
		System.out.println("Enter Item_name");
		item_name = s.next();
		System.out.println("Enter the Price Item");
		price = s.nextDouble();
		System.out.println("Enter the Warrenty in days");
		warrenty = s.next();

		System.out.println("=================================");

		System.out.println(item_id + " " + item_name + " " + price + " " + warrenty);

		System.out.println("==================================");

	}

}
