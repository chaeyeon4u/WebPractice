<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- BbsDAO와 Bbs를 사용하기 위해 import해준다 -->
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<!-- JavaScript를 사용하기 위해 import해준다 -->
<%@ page import="java.io.PrintWriter" %>
<!-- 건너오는 데이터를 UTF-8로 변환할 수 있게 해준다. -->
<% request.setCharacterEncoding("UTF-8"); %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chaeyeon's First JSP BBS</title>
</head>
<body>
	<!-- join에 대한 작업을 수행한다. -->
	<%
		/*로그인이 되어있을 경우 처리*/
		String userID = null;
		if(session.getAttribute("userID") != null){//이미 session이 존재하는 상태이면
			userID = (String) session.getAttribute("userID");//userID에 세션명을 넘겨준다.
		}
		if(userID == null){//로그인이 안되어있는 경우
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('로그인을 해주세요.')");
			script.println("location.href = 'login.html'");
			script.println("</script>");
		}
		
		int bbsID = 0;
		if(request.getParameter("bbsID") != null){
			bbsID = Integer.parseInt(request.getParameter("bbsID"));
		}
		if(bbsID == 0){//bbsID가 유효하지 않은 경우
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('유효하지 않은 값입니다.')");
			script.println("location.href='LoginOk_board.jsp'");
			script.println("<script>");
		}
		//bbsID가 유효한 경우
		Bbs bbs = new BbsDAO().getBbs(bbsID);
		if(!userID.equals(bbs.getUserID())){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('권한이 없습니다.')");
			script.println("location.href='LoginOk_board.jsp'");
			script.println("<script>");
		}else{//빈칸이 존재하지 않을 경우
			BbsDAO BbsDAO = new BbsDAO();
			int result = BbsDAO.delete(bbsID);
			
			if(result == -1){//데이터베이스 오류인 경우
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('글 삭제에 실패했습니다.')");
				script.println("history.back();");//뒤로 되돌려보내줌
				script.println("</script>");
			}else{//성공한 경우
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("location.href = 'LoginOk_board.jsp'");
				script.println("</script>");
			}
		}
		
		
	%>
</body>
</html>