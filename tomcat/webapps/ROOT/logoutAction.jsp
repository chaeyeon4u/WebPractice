<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chaeyeon's First JSP BBS</title>
</head>
<body>
	<!-- session의 해제 -->
	<%
		session.invalidate();
	%>
	
	<script>
		location.href = 'index.html';
	</script>
</body>
</html>