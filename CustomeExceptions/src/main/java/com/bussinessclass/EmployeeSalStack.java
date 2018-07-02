package com.bussinessclass;

import com.exceptionclasss.NegativeSalException;
import com.exceptionclasss.PsalException;

public class EmployeeSalStack {

	public void checking_sal_Of_Employee(double salary) throws PsalException,NegativeSalException
	{
		if(salary>0)
		{
			PsalException psal=new PsalException("Try For the best");
			throw psal; 
		}
		else
		{
			NegativeSalException nsal=new NegativeSalException("Please dont enter the -ve Sala for an Employee");
		    throw nsal; 
		}
	}
	
	
}
