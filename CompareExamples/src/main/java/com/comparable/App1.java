package com.comparable;

import java.util.Collections;
import java.util.LinkedList;

public class App1 {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Anil");
		ll.add("Bandra");
		ll.add("Cat");
		ll.add("Dance");
		ll.add("Eagle");
		ll.add("Flies");
		System.out.println("Before Swaping");
		System.out.println(ll);
		System.out.println("after Swaping");
		Collections.swap(ll, 1, 5);
		System.out.println(ll);
		// now i want to change F position to A and A to F

	}

}
