package com.struts.action;

import com.struts.model.Student;

public class StudentAction {
	
	private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public String execute() {
		if(student.getStudentName().equalsIgnoreCase("mohit"))
			return "success";
		return "error";
	}

}
