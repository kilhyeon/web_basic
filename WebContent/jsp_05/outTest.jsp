<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1부터 100까지의 합은
<%
	int sum=0;
	for(int i=1; i<=100; i++){
		sum+=i;
	}
out.print(sum+"입니다.");
%><br>
<%=sum %>입니다.</h2>
<hr>

<h2>Out Test</h2>
<table border="1">
	<tr>
		<td>autoFlush 여부</td>
		<td><%=out.isAutoFlush() %></td>
	</tr>
	<tr>
		<td>출력 버퍼의 크기</td>
		<td><%=out.getBufferSize() %>바이트</td>
	</tr>
	<tr>
		<td>출력 버퍼의 남은 양</td>
		<td><%=out.getRemaining() %>바이트</td>
	</tr>
</table>
</body>
</html>