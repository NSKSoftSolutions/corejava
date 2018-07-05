package com.clinetclasss.bussinessclass;

import java.util.LinkedList;

import org.apache.log4j.Logger;

public class LinkedListExample1 {

	public LinkedList linked_list;
	
	Logger logger=Logger.getLogger(LinkedListExample1.class.getName());
	public LinkedList add_Employee_Info()
	{
	 linked_list=new LinkedList();
	 linked_list.add(10);
	 linked_list.add(10.333);
	 linked_list.add(10.3f);
	 linked_list.add("snycon");
	 
	  return linked_list;	
	}
	
	public void disp()
	{
		boolean result=linked_list.contains("snycon");
		logger.info(result);
		/*Object removed_object=linked_list.remove(1);
		logger.info(removed_object);*/
		
	}
	
	public LinkedList getEmployee_Info()
	{
		return linked_list;
		
		
	}
	
	
	
}
