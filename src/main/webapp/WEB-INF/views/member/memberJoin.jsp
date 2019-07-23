<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<c:import url="../temp/bootstrap.jsp"/>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1>Join Form</h1>
	<form:form commandName="memberVO" enctype="multipart/form-data" id="frm">
		<div class="form-group">
			<label for="id">ID :</label>
			<form:input path="id" cssClass="form-control" id="id"/>
		</div>
		<div class="form-group">
			<label for="pw">PW :</label>
			<form:input path="pw" cssClass="form-control" id="pw"/>
		</div>
		<div class="form-group">
			<label for="pw2">rePW :</label>
			<form:input path="pw2" cssClass="form-control" id="pw2"/>
		</div>
		<div class="form-group">
			<label for="name">NAME :</label>
			<form:input path="name" cssClass="form-control" id="name"/>
		</div>
		<div class="form-group">
			<label for="email">E-Mail :</label>
			<form:input path="email" cssClass="form-control" id="email"/>
		</div>
		<div class="form-group">
			<label for="photo">PHOTO :</label>
			<input type="file" name="photo">
		</div>
		<form:button Class="btn btn-default">Join</form:button>
	</form:form>
</div>
</body>
</html>