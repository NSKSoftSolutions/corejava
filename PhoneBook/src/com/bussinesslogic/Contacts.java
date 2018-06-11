package com.bussinesslogic;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Contacts {

	TreeMap<String, Long> contact_info;
	Scanner scanner;
	int number;
	String contact_name;
	Long mobile_number;
	Set<Entry<String, Long>> total_contacts;
	Iterator<Entry<String, Long>> itr;
	Map.Entry<String, Long> me;

	// this method is for to add the Contact Information to the PhoneBook
	public TreeMap<String, Long> addcontact() {
		contact_info = new TreeMap<String, Long>();
		System.out.println("Enter the Number of Contacts that yoou want add");
		scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the Contact Name");
			contact_name = scanner.next();
			System.out.println("Enter the Mobile Number");
			mobile_number = scanner.nextLong();
			contact_info.put(contact_name, mobile_number);
			System.out.println("Contacts Are Added Successfully");
		}

		return contact_info;
	}

	// this method is used to display the Contact Information..........
	@SuppressWarnings("unchecked")
	public void displayContactInfo() {
		System.out.println("================================");
		System.out.println("Displaying the Contact-Information");
		total_contacts = contact_info.entrySet();
		itr = total_contacts.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			me = (Map.Entry<String, Long>) obj;
			String cont_name = (String) me.getKey();
			Long mobile_num = (Long) me.getValue();
			System.out.println(cont_name + " " + mobile_num);
			System.out.println("===============================");

		}
	}

	// this method is used for search the Contact Details
	public void searchContacts(String contact_name) {
		System.out.println("===========================================");
		System.out.println("Searching for the Contact"+contact_name);
		System.out.println("Contact Found..............Displaying Contact Information");
		if (contact_info.get(contact_name) != null) {
			mobile_number = contact_info.get(contact_name);
	        
			System.out.println(contact_name + " " + mobile_number);
		} else {
			System.out.println("The Contact ur looking for is not exisit Please add it");
			System.out.println("===========================================");
			addcontact();
		}
	}

}
