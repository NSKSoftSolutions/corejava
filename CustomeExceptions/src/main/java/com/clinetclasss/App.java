package com.clinetclasss;

import java.util.Scanner;

import com.bussinessclass.EmployeeSalStack;
import com.exceptionclasss.NegativeSalException;
import com.exceptionclasss.PsalException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Salary For an Employee");
		double salary = s.nextDouble();
		EmployeeSalStack esalstack = new EmployeeSalStack();
		try {
			esalstack.checking_sal_Of_Employee(salary);
		} catch (NegativeSalException nsal) {
			System.out.println(nsal);
		} catch (PsalException psal) {
			System.out.println(psal);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing the App class");
		}

	}
}
