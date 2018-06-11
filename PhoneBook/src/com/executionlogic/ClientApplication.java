package com.executionlogic;

import com.bussinesslogic.Contacts;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contacts c=new Contacts();
		c.addcontact();
		c.displayContactInfo();
		c.searchContacts("Sajjad");
		
		
	}

}
