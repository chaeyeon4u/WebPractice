/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2021-06-08 04:14:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import bbs.BbsDAO;
import bbs.Bbs;
import java.util.ArrayList;

public final class LoginOk_005fboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("bbs.Bbs");
    _jspx_imports_classes.add("bbs.BbsDAO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Chaeyeon's Bakery</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Source+Sans+Pro:wght@300&display=swap\" rel=\"stylesheet\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/reset.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontello-9bbb8792/css/fontello.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/main2.css\"/>\r\n");
      out.write("        \r\n");
      out.write("        <script defer src=\"assets/js/common.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");

			//get page Information
			int pageNumber = 1;
			if(request.getParameter("pageNumber") != null){
				pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Wrapper -->\r\n");
      out.write("\t\t\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Header -->\r\n");
      out.write("\t\t\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"avatar\"><a href=\"LoginOk_index.html\" title=\"Home\"><img src=\"images/at_cafe.jpg\" width=\"170\" height=\"170\" alt=\"\" /></a></span>\r\n");
      out.write("\t\t\t\t\t\t<h1>Welcome to <strong>Chaeyeon's Bakery</strong> site <br />\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"icons\">\r\n");
      out.write("                            <li title=\"Home\"><a href=\"LoginOk_index.html\" class=\"icon-home\"><span class=\"label\">Home</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li title=\"Join\" onclick=\"Already_Login()\"><a href=\"#\" class=\"icon-check\"><span class=\"label\">Join</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li title=\"Logout\" onclick=\"Logout()\"><a href=\"logoutAction.jsp\" class=\"icon-login\"><span class=\"label\" >Login</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li title=\"Notice Board\"><a href=\"LoginOk_board.html\" class=\"icon-pencil\"><span class=\"label\">Notice Board</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--Notice board Part start-->\r\n");
      out.write("                <div id=\"noticeBoard\">\r\n");
      out.write("                    <table id=\"boardTable\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>번호</th>\r\n");
      out.write("                                <th>제목</th>\r\n");
      out.write("                                <th>작성자</th>\r\n");
      out.write("                                <th>날짜</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                         <!-- Boarder List start -->\r\n");
      out.write("                        <tbody class=\"boardTbody\">\r\n");
      out.write("                            \t");
 
                            		BbsDAO bbsDAO = new BbsDAO();
                            		ArrayList<Bbs> list = bbsDAO.getList(pageNumber);//getList를 이용하여 목록을 얻어온다.
                            		for(int i = 0; i < list.size(); i++){
                            	
      out.write("\r\n");
      out.write("                            \t<tr>\r\n");
      out.write("\t                            \t<td>");
      out.print( list.get(i).getBbsID() );
      out.write("</td>\r\n");
      out.write("\t                            \t<!-- Title make page change -->\r\n");
      out.write("\t                                <td><a href=\"LoginOk_view.jsp?bbsID=");
      out.print( list.get(i).getBbsID() );
      out.write('"');
      out.write('>');
      out.print( list.get(i).getBbsTitle() );
      out.write("</a></td>\r\n");
      out.write("\t                                <td>");
      out.print( list.get(i).getUserID() );
      out.write("</td>\r\n");
      out.write("\t                                <td>");
      out.print( list.get(i).getBbsDate().substring(0,11) +" "+ list.get(i).getBbsDate().substring(11,13)+ "시 " + list.get(i).getBbsDate().substring(14,16) + "분");
      out.write("</td>\r\n");
      out.write("                            \t</tr>\r\n");
      out.write("                            \t");

                            		}
                            	
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                         <!-- Boarder List end -->\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t                    \r\n");
      out.write("                    <div id=\"writeButton\">\r\n");
      out.write("                    \t");
 
                    		if(pageNumber != 1){//1 페이지가 아닌경우
                    	
      out.write("\r\n");
      out.write("                    \t\t\t<a href=\"LoginOk_board.jsp?pageNumber=");
      out.print( pageNumber-1 );
      out.write("\"><input class=\"btn-primary\" type=\"button\" value=\"이전\"></a>\r\n");
      out.write("                    \t");
 
                    		} if(bbsDAO.nextPage(pageNumber+1)){//다음페이지가 존재하면
                    	
      out.write("\r\n");
      out.write("                    \t\t\t<a href=\"LoginOk_board.jsp?pageNumber=");
      out.print( pageNumber+1 );
      out.write("\"><input class=\"btn-primary\" type=\"button\" value=\"다음\"></a>\r\n");
      out.write("                    \t");

                    		}
                    	
      out.write("\r\n");
      out.write("                    \t\r\n");
      out.write("                        <a href=\"LoginOk_write.html\"><input class=\"btn-primary\" type=\"button\" value=\"글쓰기\"/></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--Notice board Part end-->\r\n");
      out.write("\r\n");
      out.write("                <!-- Footer -->\r\n");
      out.write("                <footer>\r\n");
      out.write("                <b>\r\n");
      out.write("                    <font color=\"white\">TEL) 042-***_**** <br>위치: 천안시 서북구 두정동 ****</font>\r\n");
      out.write("                </b>\r\n");
      out.write("                <details>\r\n");
      out.write("                    <summary>\r\n");
      out.write("                        <font color=\"white\">Copyright</font>\r\n");
      out.write("                    </summary>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <font color=\"white\">이 홈페이지의 저작권은 유채연에게 있음</font>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </details>\r\n");
      out.write("               </footer>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}