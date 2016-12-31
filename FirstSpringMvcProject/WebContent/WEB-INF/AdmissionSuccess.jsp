<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Congratulations! The Accounting Department has processed your application Successfully!</h1>
<h2>${msg}</h2>
</head>
<body>
<table>
<tr>
<td>Student Name =</td>
<td>${student.studentName}</td>
</tr>
<tr>
<td>Student Hoppy =</td>
<td>${student.studentHoppy}</td>
</tr>
<tr>
<td>Student DOB =</td>
<td>${student.dob}</td>
</tr>
<tr>
<td>Student Skill =</td>
<td>${student.skillSet}</td>
</tr>
<table>
<tr>
<td>Student Address =</td>
<td>City: ${student.studentAddress.city}

State :${student.studentAddress.state}

Country :${student.studentAddress.country}

ZipCode :${student.studentAddress.zip}</td>

</tr>
</table>

</table>


</body>
</html>