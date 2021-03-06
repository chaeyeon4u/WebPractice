/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2021-06-04 10:32:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("\tVisualize by TEMPLATED\r\n");
      out.write("\ttemplated.co @templatedco\r\n");
      out.write("\tReleased for free under the Creative Commons Attribution 3.0 license (templated.co/license)\r\n");
      out.write("-->\r\n");
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
      out.write("\r\n");
      out.write("\t\t<!-- Wrapper -->\r\n");
      out.write("\t\t\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Header -->\r\n");
      out.write("\t\t\t\t\t<header id=\"header\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"avatar\"><a href=\"index.html\" title=\"Home\"><img src=\"images/at_cafe.jpg\" width=\"170\" height=\"170\" alt=\"\" /></a></span>\r\n");
      out.write("\t\t\t\t\t\t<h1>Welcome to <strong>Chaeyeon's Bakery</strong> site <br />\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"icons\">\r\n");
      out.write("                            <li title=\"Home\"><a href=\"index.html\" class=\"icon-home\"><span class=\"label\">Home</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li title=\"Join\"><a href=\"join.html\" class=\"icon-check\"><span class=\"label\">Join</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li title=\"Login\"><a href=\"login.html\" class=\"icon-login\"><span class=\"label\">Login</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li title=\"Notice Board\" onclick=\"Login_Notice()\"><a href=\"#\" class=\"icon-pencil\"><span class=\"label\">Notice Board</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Main -->\r\n");
      out.write("\t\t\t\t\t<section id=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Thumbnails -->\r\n");
      out.write("\t\t\t\t\t\t\t<section class=\"thumbnails\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"HeartLetteringCake.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie1.JPG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Heart Lettering Cake</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"MickeyMousCookies.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie2.JPG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Mickey Mous Cookies</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"CherryLemonCupcake.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie3.JPG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Cherry Lemon Cupcake</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"ColorfulLeteringCake.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie4.PNG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Colorful Lettering Cake</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"HeartMacarons%20.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie5.PNG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Heart Macarons</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"StrawberryTart.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie6.PNG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Strawberry Tart</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"TulipsCake.html\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"images/thumbs/cookie7.PNG\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3>Tulips Cake</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Footer -->\r\n");
      out.write("\t\t\t\t<footer>\r\n");
      out.write("                    <b>\r\n");
      out.write("                        <font color=\"white\">TEL) 042-***_**** <br>????????????: ?????????????????? ?????????????????? ?????????????????? ****</font>\r\n");
      out.write("                    </b>\r\n");
      out.write("                    <details>\r\n");
      out.write("                        <summary>\r\n");
      out.write("                            <font color=\"white\">Copyright</font>\r\n");
      out.write("                        </summary>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <font color=\"white\">?????? ?????????????????????????????? ???????????????????????? ?????????????????????????????? ????????????.. Templated ????????????</font>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </details>\r\n");
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
