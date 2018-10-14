package com.string.clint;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int j = a[0];
		for (int i = 0; i < a.length; i++) {
			if (j == a[i]) {
				j++;
				continue;
			} else {
				System.out.println("Missing Number=" +j);
				j++;
				i--;
			}
		}
	}

}
