package com.syncon.scanner.bussinessclass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExampleTest {

	int expected;
    @Test
	public void testAddition() {
	expected=50;
	Example e=new Example();	
	int actual=e.addition();
	assertEquals(40,actual);
	
	}

}
