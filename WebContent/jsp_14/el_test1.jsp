<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	session.setAttribute("test", "Session Test");
%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	width: 400px;
	margin: auto;
	border: 1px solid gray;
	text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="el_test2.jsp" method="post">
		<table>
			<tr>
				<td>이름 :</td>
				<td><input type="text" name="name" value="홍길동"></td>
			</tr>
			<tr>
				<td colspan=2 align=center><input type="submit" value="입력"></td>
			</tr>
		</table>
	</form>
</body>
</html>