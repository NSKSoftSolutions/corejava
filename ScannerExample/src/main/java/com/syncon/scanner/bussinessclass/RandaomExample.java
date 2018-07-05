package com.syncon.scanner.bussinessclass;

import java.util.Random;

public class RandaomExample {

	Random random;
	int number;

	public long generateRandomNumber() {
		random = new Random();
		
			number = random.nextInt(5000) + 1;
		System.out.println(number);
			return number;
	}

}
