<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Enquiry From</h2>
	
	<p><font color="green">${msg}</font></p>
	<form:form action="save" modelAttribute="Students" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="Name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="Email" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="Gender" value="male" />Male <form:radiobutton
						path="Gender" value="famale" />Female</td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:select path="Course">
						<form:option value="">--select--</form:option>
						<form:options items="${course}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Timinngs</td>
				<td><form:checkboxes items="${Timmings}" path="Timings" /></td>

			</tr>
			<tr>

				<td><input type="submit" value="save"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>