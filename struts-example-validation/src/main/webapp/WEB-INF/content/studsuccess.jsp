<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:property value="student"/><br>
	Name:<s:property value="student.name"/><br>
	City:<s:property value="student.city"/><br>
	Salary:<s:property value="student.allownace"/><br>
</body>
</html>