package com.syncon.scanner;

import org.apache.log4j.Logger;

import com.syncon.scanner.bussinessclass.Example;
import com.syncon.scanner.bussinessclass.Example1;
import com.syncon.scanner.bussinessclass.RandaomExample;

/**
 * Hello world!
 *
 */
public class App {
	static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		/*
		 * logger.info("I came to main()"); Example e=new Example(); e.addition();
		 */

		RandaomExample random_example = new RandaomExample();
		
			random_example.generateRandomNumber();
           
			Example e=new Example();
			e.addition();
			e.disp();
			
			Example1 e1=new Example1();
			         e1.details_of_employee();
			
			
			}
}
