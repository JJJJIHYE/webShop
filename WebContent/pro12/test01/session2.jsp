<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

String name=(String)session.getAttribute("name");
String address = (String)session.getAttribute("address");

%>    
 
<!DOCTYPE html>     
<html>
<head>
<meta charset="UTF-8">
<title>session 내장 객체 테스트2</title>
</head>
<body>
이름은 <%=name2 %>입니다.<br>
주소는 <%=address2 %>입니다. 
<%--include 디렉션: 합쳐서 컴파일
jsp:include 표준액션: 컴파일후 합친다.
--%>
</body>
</html>
