package com.struts.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Employee;

public class EmployeeAction extends ActionSupport{
	
	private Employee employee;

	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String execute() {
		System.out.println(employee);
		System.out.println(employee.getEmployeeName());
		if(employee.getEmployeeName().equalsIgnoreCase("mohit"))
			return "success";
//		else if (employee.getEmployeeName().equals("A"))
//			throw new NullPointerException();
		else
		return "error";
	}

}
