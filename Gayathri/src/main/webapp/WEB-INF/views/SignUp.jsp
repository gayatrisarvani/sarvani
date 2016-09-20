<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp" %>
<body style="background-color:#FFEFD5">
<h3><center>Welcome to RegistrationPage</center></h3>
<center><img src="resources/images/rg.jpg" style="width: 400px"; height="200px"></center>  
<br> 
<div align="center" class="form">			
<form:form  commandName="customer" >
<table>
<tr>
<td>UserName:</td><td><form:input path="username"></form:input><form:errors path="username" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td>Password:</td><td><form:password path="password"></form:password><form:errors path="password" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr>
<td>EmailId:</td><td><form:input path="emailId"></form:input><form:errors path="emailId" style="color:red"></form:errors></td>
</tr>
<tr><td><br></td></tr>
<tr><td></td>
<td><input name="_eventId_submit" type="submit" value="Register"/></td>
</tr>
</table>
</form:form>
</div>
</div>
<br>
<br>
<br>
<br>
<%@include file="footer.jsp" %>
</html>