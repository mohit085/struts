package com.struts.action;

import org.apache.struts2.convention.annotation.*;

public class HomeAction {
	
	@Action(value = "empform",results = {
			@Result(name="success",location="/WEB-INF/content/empform.jsp")
	})
	
	public String empForm() {
		return "success";
	}
	
//	@Action(value = "studform",results = {
//			@Result(name="success",location="/WEB-INF/content/studform.jsp")
//	})
//	
//	public String studForm() {
//		return "success";
//	}
}
