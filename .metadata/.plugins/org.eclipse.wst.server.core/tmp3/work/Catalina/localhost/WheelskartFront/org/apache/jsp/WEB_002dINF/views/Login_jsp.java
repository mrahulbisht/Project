/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2017-06-25 11:29:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Login Page</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("    Note: It is best to use a less version of this file ( see http://css2less.cc\r\n");
      out.write("    For the media queries use @screen-sm-min instead of 768px.\r\n");
      out.write("    For .omb_spanOr use @body-bg instead of white.\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("@media (min-width: 768px) {\r\n");
      out.write("    .omb_row-sm-offset-3 div:first-child[class*=\"col-\"] {\r\n");
      out.write("        margin-left: 25%;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".omb_login .omb_authTitle {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("\tline-height: 300%;\r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write(".omb_login .omb_socialButtons a {\r\n");
      out.write("\tcolor: white; // In yourUse @body-bg \r\n");
      out.write("\topacity:0.9;\r\n");
      out.write("}\r\n");
      out.write(".omb_login .omb_socialButtons a:hover {\r\n");
      out.write("    color: white;\r\n");
      out.write("\topacity:1;    \t\r\n");
      out.write("}\r\n");
      out.write(".omb_login .omb_socialButtons .omb_btn-facebook {background: #3b5998;}\r\n");
      out.write(".omb_login .omb_socialButtons .omb_btn-twitter {background: #00aced;}\r\n");
      out.write(".omb_login .omb_socialButtons .omb_btn-google {background: #c32f10;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".omb_login .omb_loginOr {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tfont-size: 1.5em;\r\n");
      out.write("\tcolor: #aaa;\r\n");
      out.write("\tmargin-top: 1em;\r\n");
      out.write("\tmargin-bottom: 1em;\r\n");
      out.write("\tpadding-top: 0.5em;\r\n");
      out.write("\tpadding-bottom: 0.5em;\r\n");
      out.write("}\r\n");
      out.write(".omb_login .omb_loginOr .omb_hrOr {\r\n");
      out.write("\tbackground-color: #cdcdcd;\r\n");
      out.write("\theight: 1px;\r\n");
      out.write("\tmargin-top: 0px !important;\r\n");
      out.write("\tmargin-bottom: 0px !important;\r\n");
      out.write("}\r\n");
      out.write(".omb_login .omb_loginOr .omb_spanOr {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttop: -0.6em;\r\n");
      out.write("\tmargin-left: -1.5em;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\twidth: 3em;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\t\t\t\r\n");
      out.write("\r\n");
      out.write(".omb_login .omb_loginForm .input-group.i {\r\n");
      out.write("\twidth: 2em;\r\n");
      out.write("}\r\n");
      out.write(".omb_login .omb_loginForm  .help-block {\r\n");
      out.write("    color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("@media (min-width: 768px) {\r\n");
      out.write("    .omb_login .omb_forgotPwd {\r\n");
      out.write("        text-align: right;\r\n");
      out.write("\t\tmargin-top:10px;\r\n");
      out.write(" \t}\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"omb_login\">\r\n");
      out.write("    \t<h3 class=\"omb_authTitle\">Login or <a href=\"RegistrationPage\">Sign up</a></h3>\r\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3 omb_socialButtons\">\r\n");
      out.write("    \t    <div class=\"col-xs-4 col-sm-2\">\r\n");
      out.write("\t\t        <a href=\"Facebook.com\" class=\"btn btn-lg btn-block omb_btn-facebook\">\r\n");
      out.write("\t\t\t        <i class=\"fa fa-facebook visible-xs\"></i>\r\n");
      out.write("\t\t\t        <span class=\"hidden-xs\">Facebook</span>\r\n");
      out.write("\t\t        </a>\r\n");
      out.write("\t        </div>\r\n");
      out.write("        \t<div class=\"col-xs-4 col-sm-2\">\r\n");
      out.write("\t\t        <a href=\"Twitter.com\" class=\"btn btn-lg btn-block omb_btn-twitter\">\r\n");
      out.write("\t\t\t        <i class=\"fa fa-twitter visible-xs\"></i>\r\n");
      out.write("\t\t\t        <span class=\"hidden-xs\">Twitter</span>\r\n");
      out.write("\t\t        </a>\r\n");
      out.write("\t        </div>\t\r\n");
      out.write("        \t<div class=\"col-xs-4 col-sm-2\">\r\n");
      out.write("\t\t        <a href=\"Gmail.com\" class=\"btn btn-lg btn-block omb_btn-google\">\r\n");
      out.write("\t\t\t        <i class=\"fa fa-google-plus visible-xs\"></i>\r\n");
      out.write("\t\t\t        <span class=\"hidden-xs\">Google+</span>\r\n");
      out.write("\t\t        </a>\r\n");
      out.write("\t        </div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3 omb_loginOr\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6\">\r\n");
      out.write("\t\t\t\t<hr class=\"omb_hrOr\">\r\n");
      out.write("\t\t\t\t<span class=\"omb_spanOr\">or</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6\">\t\r\n");
      out.write("\t\t\t    <form class=\"omb_loginForm\" action=\"validate\" autocomplete=\"off\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"id\" placeholder=\"email address\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<span class=\"help-block\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t<input  type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                    <span class=\"help-block\">Password error</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Login</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3\">\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("\t\t\t\t<label class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" value=\"remember-me\">Remember Me\r\n");
      out.write("\t\t\t\t</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-3\">\r\n");
      out.write("\t\t\t\t<p class=\"omb_forgotPwd\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Forgot password?</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t    \t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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