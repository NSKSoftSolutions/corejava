package com.clientclasss;



import org.apache.log4j.Logger;

import com.bussinessclasss.ShoppersAdda;

public class App 
{
	static Logger logger=Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	logger.info("Came inside the main method");
    	ShoppersAdda adda=new ShoppersAdda();
    	adda.buymobiles();
    	logger.info("=====================+========================");
    	adda.buyclothes();
    	logger.info("hello world");
    }
}
