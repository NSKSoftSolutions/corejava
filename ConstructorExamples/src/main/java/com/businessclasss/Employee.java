package com.businessclasss;

import org.apache.log4j.Logger;

public class Employee {

	Logger logger = Logger.getLogger(Employee.class.getName());
	int v;

	public Employee(int value) {
		logger.info("excecuting the 1 Employee() Constuctr");
		v = value;
		logger.info("The value whicj are coming from clien is:" + v);
	}

	public Employee(Employee emp) {
		logger.info(emp.v);
	}

	public Employee(int value1, int value2) {
		logger.info("Addition of two numbers:" + (value1 + value2));

	}

	public Employee(int value, float fvalue, char c) {

		
		logger.info("value of interger:"+value);
		logger.info("value of float:"+fvalue);
		logger.info("value of char:"+c);
	}

}
