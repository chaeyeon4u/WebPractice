<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- userDAO를 사용하기 위해 import해준다 -->
<%@ page import="user.UserDAO" %>
<!-- JavaScript를 사용하기 위해 import해준다 -->
<%@ page import="java.io.PrintWriter" %>
<!-- 건너오는 데이터를 UTF-8로 변환할 수 있게 해준다. -->
<% request.setCharacterEncoding("UTF-8"); %>
<!-- javaBeans를 이 페이지에서만 사용한다. -->
<jsp:useBean id="user" class="user.User" scope="page"/>
<!-- 넘어온 userID와 userPassword 받기 -->
<jsp:setProperty name="user" property="userID"/>
<jsp:setProperty name="user" property="userPassword"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chaeyeon's First JSP BBS</title>
</head>
<body>
	<!-- 여기서 userID와 userPassword를 처리해준다. -->
	<%
		
		String userID = null;
		if(session.getAttribute("userID") != null){//이미 session이 존재하는 상태이면
			userID = (String) session.getAttribute("userID");//userID에 세션명을 넘겨준다.
		}
		//이미 로그인되어있는 경우
		if(userID != null){
			session.invalidate();
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('세션을 제거했습니다. 다시 로그인해주세요.')");
			script.println("location.href = 'index.html'");
			script.println("</script>");
		}
		
		UserDAO UserDAO = new UserDAO();
		int result = UserDAO.login(user.getUserID(), user.getUserPassword());
		if(result == 1){//로그인에 성공했을 경우
			//세션을 연결해준다.
			session.setAttribute("userID", user.getUserID());
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = 'LoginOk_index.html'");
			script.println("</script>");
		}else if(result == 0){//비밀번호가 틀렸을 경우
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('비밀번호가 틀렸습니다.')");
			script.println("history.back();");//뒤로 되돌려보내줌
			script.println("</script>");
		}else if(result == -1){//아이디가 틀렸을 경우
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('아이디가 틀렸습니다.')");
			script.println("history.back();");//뒤로 되돌려보내줌
			script.println("</script>");
		}else if(result == -2){//데이터베이스 오류인 경우
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('데이터베이스 오류입니다.')");
			script.println("history.back();");//뒤로 되돌려보내줌
			script.println("</script>");
		}
	%>
</body>
</html>