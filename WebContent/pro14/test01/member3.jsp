<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%
  request.setCharacterEncoding("UTF-8");
--%>    
<%--com.kosta.controller.pro13.MemberBean m2;
m2=new com.kosta.controller.pro13.MemberBean();
m2.setId(request.getParameter("id"));
m2.setId(request.getParameter("id"));
m2.setId(request.getParameter("id"));
m2.setId(request.getParameter("id"));--%>

<jsp:useBean  id="m" class="com.kosta.controller.pro13.MemberBean" /> <%--new 됨--%>
<jsp:setProperty  name="m" property="*" /> <%--이때 set되는거--%>

<meta  charset="UTF-8">
<html>
<head>
<title>회원 정보 출력창</title>
</head>
<body>
   <table align=center border="1" >
     <tr align="center" bgcolor="#99ccff">
        <td width=20--%><b>아이디</b></td>
        <td width="20%" ><b>비밀번호</b></td>
        <td width="20%" ><b>이름</b></td>
        <td width="20%" ><b>이메일</b></td>		
     </tr>
     </tr>
<%--jsp에서 자바스크립트 안쓰려고--%>
     <tr align="center">
       <td>${m.id } </td>
       <td>${m.pwd} </td>
       <td>${m.name }</td>
       <td>${m.email }</td>
</tr>
</table>
</body>
</html>
