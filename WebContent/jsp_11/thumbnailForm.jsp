<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ThumbnailServlet" method="post" enctype="multipart/form-data">
	이미지 파일 : <input type="file" name="filename"><p>
	<input type="submit" value="전송">
	</form>
</body>
</html>