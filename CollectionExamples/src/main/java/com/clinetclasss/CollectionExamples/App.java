package com.clinetclasss.CollectionExamples;

import java.util.Iterator;
import java.util.LinkedList;

import org.apache.log4j.Logger;

import com.clinetclasss.bussinessclass.LinkedListExample1;

/**
 * Hello world!
 *
 */
public class App {

	static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		logger.info("===========================");

		LinkedListExample1 le = new LinkedListExample1();
		le.add_Employee_Info();
		le.disp();
		LinkedList emploeeInfo = le.getEmployee_Info();
		Iterator iterator=emploeeInfo.iterator();
		while(iterator.hasNext())
		{
			logger.info(iterator.next());
			
		}
		
		

		logger.info("===========================");

	}
}
