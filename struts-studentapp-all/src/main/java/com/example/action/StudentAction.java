package com.example.action;

import java.util.Arrays;
import java.util.List;

import com.example.model.Student;

public class StudentAction {
	
	
	//create a student object to populate the values
	
	private Student student;
	
	// create a list to pre populate the values of the hobbies array
	
	private List<String> hobbies;
	
	// create constructor to set the values for hobbies
	
	public StudentAction() {
		hobbies = Arrays.asList("sports","music","dance");
	}
	
	
	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public List<String> getHobbies() {
		return hobbies;
	}



	public void setHobbies(List<String> hobbies) {
		this.hobbies = Arrays.asList("sports","music","errors");
	}


	// this will be called when user clicks submit button in form
	public String execute() {
		if(student.getName().equals("mohit"))
			return "success";
		return "error";
	}

}
