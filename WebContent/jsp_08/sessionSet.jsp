<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("name","Session Test!");
	session.setAttribute("id","Session ID!");
	
	//세션 유지 시간을 5분으로
	session.setMaxInactiveInterval(60*5);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
location.href="sessionTest.jsp";
</script>
</body>
</html>