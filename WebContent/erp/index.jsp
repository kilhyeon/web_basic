<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="con" value="${JndiDS.getConnection() }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/index_style.css">
<title>데이터베이스 연동 테스트</title>
</head>
<body>
	<c:out value="${con }"></c:out><br>
	<fieldset>
		<legend>ERP</legend>
		<ul>
			<li><a href="TitleServlet">직책 관리</a></li>
			<li><a href="DeptServlet">부서 관리</a></li>
			<li><a href="EMpServlet">직원 관리</a></li>
		</ul>
	</fieldset>
</body>
</html>