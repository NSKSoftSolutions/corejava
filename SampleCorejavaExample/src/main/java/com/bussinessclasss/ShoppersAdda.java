package com.bussinessclasss;

import org.apache.log4j.Logger;

public class ShoppersAdda {

	String cloth_brand;
	String mobile_brand;

	Logger logger = Logger.getLogger(ShoppersAdda.class.getName());

	public String buyclothes() {

		cloth_brand = "Indian Terrian";
		logger.info("came inside the showroom");
		logger.info("buying clothes:" + cloth_brand);
		logger.info("paying bills");
		logger.info("Coming out of shop");

		return cloth_brand;
	}

	public String buymobiles() {
		mobile_brand = "Apple";

		logger.info("Came to shope buying mobile:" + mobile_brand);

		return mobile_brand;
	}

}
