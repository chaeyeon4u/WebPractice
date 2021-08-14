<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="bbs.BbsDAO" %>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Chaeyeon's Bakery</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
        <link href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300&display=swap" rel="stylesheet"/>
        <link rel="stylesheet" href="assets/css/reset.css"/>
        <link rel="stylesheet" href="fontello-9bbb8792/css/fontello.css">
		<link rel="stylesheet" href="assets/css/main2.css"/>
        
        <script defer src="assets/js/common.js"></script>
	</head>
	<body>
		<%
			//session관리
			String userID = null;
			if(session.getAttribute("userID") != null){
				userID = (String) session.getAttribute("userID");
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
			}
		%>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
						<span class="avatar"><a href="LoginOk_index.html" title="Home"><img src="images/at_cafe.jpg" width="170" height="170" alt="" /></a></span>
						<h1>Welcome to <strong>Chaeyeon's Bakery</strong> site <br />
						</h1>
						<ul class="icons">
                            <li title="Home"><a href="LoginOk_index.html" class="icon-home"><span class="label">Home</span></a></li>
							<li title="Join" onclick="Already_Login()"><a href="#" class="icon-check"><span class="label">Join</span></a></li>
							<li title="Logout" onclick="Logout()"><a href="logoutAction.jsp" class="icon-login"><span class="label" >Login</span></a></li>
							<li title="Notice Board"><a href="LoginOk_board.jsp" class="icon-pencil"><span class="label">Notice Board</span></a></li>
						</ul>
					</header>

				<!--write Part start-->
                <div id="noticeBoard">
                    <form method="post" action="updateAction.jsp?bbsID=<%= bbsID %>">
                        <table id="boardTable">
                            <thead>
                                <tr>
                                    <th colspan="2">글 수정하기</th>
                                </tr>
                            </thead>
                            <tbody class="writeTbody">
                                <tr>
                                <!-- bbsTitle과 bbsContent는 updateAction.jsp에서 사용가능하다. (request.getParameter("bbsTitle")를 사용하여) -->
                                    <td><input class="bbsTitle" type="text" placeholder="글 제목" name="bbsTitle" maxlength="50" value="<%= bbs.getBbsTitle() %>"></td>
                                </tr>
                                <tr>
                                    <td><textarea placeholder="글 내용" name="bbsContent" maxlength="2048"><%= bbs.getBbsContent() %></textarea></td>
                                </tr>
                            </tbody>
                        </table>
                    
	                    <div id="writeButton">
	                        <input class="btn-primary" type="submit" value="수정 완료"/>
	                    </div>
                    </form>
                </div>
                <!--write Part end-->

                <!-- Footer -->
                <footer>
                <b>
                    <font color="white">TEL) 042-***_**** <br>위치: 천안시 서북구 두정동 ****</font>
                </b>
                <details>
                    <summary>
                        <font color="white">Copyright</font>
                    </summary>
                    <p>
                        <font color="white">이 홈페이지의 저작권은 유채연에게 있음</font>
                    </p>
                </details>
               </footer>

			</div>

	</body>
</html>