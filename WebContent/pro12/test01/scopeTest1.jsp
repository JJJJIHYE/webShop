<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//scope: pageContext(현재페이지) < request(요청마다) < session(브라우저마다) < application(웹프로그램마다)
pageContext.setAttribute("major", "JspServlet-pageContext");
request.setAttribute("major", "JspServlet-request");
session.setAttribute("major", "JspServlet-session");
application.setAttribute("major", "JspServlet-application");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>저장하기</h1>
	<h2>default : ${major}</h2>
	<h2>pageContext : ${pageScope.major}</h2>
	<h2>request : ${requestScope.major}</h2>
	<h2>session : ${sessionScope.major}</h2>
	<h2>application : ${applicationScope.major}</h2>
	<hr>
	<%--forward가 전달된다. 재요청 --%>
	<jsp:forward page="scopeTest2.jsp"></jsp:forward>
</body>
</html>