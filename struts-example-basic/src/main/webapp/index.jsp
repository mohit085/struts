<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="show">
	<s:textfield name="employeeName" label="EmployeeName"></s:textfield>
	<s:textfield name="employeeId" label="EmployeeId"></s:textfield>
	<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>