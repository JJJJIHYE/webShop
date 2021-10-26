<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>8번입니다.</title>
</head>
<body>
	
	<jsp:useBean id="m" class="com.kosta.controller.pro13.MemberBean"
		scope="request" />

	<jsp:getProperty name="m" property="id" /><br>
	<jsp:getProperty name="m" property="pwd" /><br>
	<jsp:getProperty name="m" property="name" /><br>
	<jsp:getProperty name="m" property="email" /><br>

</body>
</html>