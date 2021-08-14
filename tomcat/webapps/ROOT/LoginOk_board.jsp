<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import="bbs.Bbs" %>
<%@ page import="java.util.ArrayList" %>

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
			//get page Information
			int pageNumber = 1;
			if(request.getParameter("pageNumber") != null){
				pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
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
							<li title="Notice Board"><a href="LoginOk_board.html" class="icon-pencil"><span class="label">Notice Board</span></a></li>
						</ul>
					</header>

				<!--Notice board Part start-->
                <div id="noticeBoard">
                    <table id="boardTable">
                        <thead>
                            <tr>
                                <th>번호</th>
                                <th>제목</th>
                                <th>작성자</th>
                                <th>날짜</th>
                            </tr>
                        </thead>
                         <!-- Boarder List start -->
                        <tbody class="boardTbody">
                            	<% 
                            		BbsDAO bbsDAO = new BbsDAO();
                            		ArrayList<Bbs> list = bbsDAO.getList(pageNumber);//getList를 이용하여 목록을 얻어온다.
                            		for(int i = 0; i < list.size(); i++){
                            	%>
                            	<tr>
	                            	<td><%= list.get(i).getBbsID() %></td>
	                            	<!-- Title make page change -->
	                                <td><a href="LoginOk_view.jsp?bbsID=<%= list.get(i).getBbsID() %>"><%= list.get(i).getBbsTitle() %></a></td>
	                                <td><%= list.get(i).getUserID() %></td>
	                                <td><%= list.get(i).getBbsDate().substring(0,11) +" "+ list.get(i).getBbsDate().substring(11,13)+ "시 " + list.get(i).getBbsDate().substring(14,16) + "분"%></td>
                            	</tr>
                            	<%
                            		}
                            	%>
                        </tbody>
                         <!-- Boarder List end -->
                    </table>


					                    
                    <div id="writeButton">
                    	<% 
                    		if(pageNumber != 1){//1 페이지가 아닌경우
                    	%>
                    			<a href="LoginOk_board.jsp?pageNumber=<%= pageNumber-1 %>"><input class="btn-primary" type="button" value="이전"></a>
                    	<% 
                    		} if(bbsDAO.nextPage(pageNumber+1)){//다음페이지가 존재하면
                    	%>
                    			<a href="LoginOk_board.jsp?pageNumber=<%= pageNumber+1 %>"><input class="btn-primary" type="button" value="다음"></a>
                    	<%
                    		}
                    	%>
                    	
                        <a href="LoginOk_write.html"><input class="btn-primary" type="button" value="글쓰기"/></a>
                    </div>
                </div>
                <!--Notice board Part end-->

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