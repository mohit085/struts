package com.struts.action;

import java.util.Arrays;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;


@ResultPath(value = "/WEB-INF/content/")

public class StudentAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private Student  student;
	private List<String> hobbies;
	
	public StudentAction() {
		hobbies = Arrays.asList("sports","music");
	}

	public List<String> getHobbies() {
		return Arrays.asList("Reading","PC gaming");
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Action(value = "/studregister", results = {
			@Result(name = "success", location = "studsuccess.jsp"),
			@Result(name = "input", location = "studform.jsp"),
			@Result(name = "error", location = "studform.jsp")
	})
	
	@Override
	public String execute() throws Exception {
		if(student.getName().equals("mohit"))
			return SUCCESS;
		return ERROR;
	}
	
	@Action(value = "/studform",results = {
	@Result(name="none",location="/WEB-INF/content/studform.jsp")
	})
	
	public String studForm() {
	return NONE;
	}

	@Override
	public void validate() {
		if(student!=null) {
			if(student.getName().length()<=0)
				addFieldError("student.name","Name is required");
			if(student.getAge()>20 || student.getAge()<70)
				addFieldError("student.age", "Age required between 21 and 70");
		}
	}
	
	
	
	
}
