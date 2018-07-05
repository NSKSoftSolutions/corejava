package com.clinetclasss;

import org.apache.log4j.Logger;

import com.businessclasss.Employee;

public class App {
	static Logger logger = Logger.getLogger(App.class.getName());

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Employee emp=new Employee();
		logger.info("came inside the main method and started executing  things");

		Employee emp1 = new Employee(10);
		Employee emp2 = new Employee(30);
		Employee emp3 = new Employee(emp2);
		Employee emp4 = new Employee(10, 20);
		Employee emp5 = new Employee(10, 3.5f, 'S');

	}
}
