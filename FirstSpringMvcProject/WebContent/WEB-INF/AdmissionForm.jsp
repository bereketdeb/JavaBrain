
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<body>

	<a
		href="/FirstSpringMvcProject/student/AdmissionForm.html?siteLanguage=en">English</a>|
	<a
		href="/FirstSpringMvcProject/student/AdmissionForm.html?siteLanguage=fr">French</a>

	<h1>STUDENT ADMISSION FORM FOR ACCOUNTING CLASS</h1>

	<h2>${msg2}</h2>
	<form:errors path="student.*" />
	<form action="/FirstSpringMvcProject/student/submitAdmissionForm.html"
		method="post">
		<p>
			<spring:message code="label.studentName" />
			: <input type="text" name="studentName" />
			
		</p>
		<p>
			<spring:message code="label.studentHoppy" />
			: <input type="text" name="studentHoppy" />
		</p>
		<p>
			Student's DoB : <input type="text" name="dob" />
		</p>
		<table>
			<tr>
				<td>Student's Skill : <select name="skillSet" multiple>
						<option value="Core Java">CoreJava</option>
						<option value="Spring">Spring</option>
						<option value="SpringMvc">Spring Mvc</option>
						<option value="Hibernate">Hibernate</option>
				</select>
				</td>
			</tr>
		</table>

		<p>
			City :<input type="text" name="studentAddress.city" /> State: <input
				type="text" name="studentAddress.state" /> Country: <input
				type="text" name="studentAddress.country" /> ZipCode: <input
				type="text" name="studentAddress.zip" />
		</p>


		<input type="submit" value="submit this form by clicking here" />
	</form>


</body>


</html>




