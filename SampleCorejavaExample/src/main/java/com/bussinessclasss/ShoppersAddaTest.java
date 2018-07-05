package com.bussinessclasss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppersAddaTest {

	String actual;
	String expected;
	ShoppersAdda  adda = new ShoppersAdda();

	@Test
	public void testBuyclothes() {

		expected = "Indian Terrian";
		actual = adda.buyclothes();
		assertEquals(expected, actual);
	}

	@Test
	public void testBuymobiles() {

		expected="apple";
		actual=adda.buymobiles();
		assertEquals(expected, actual);
		
	}

}
