package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <div class=\"content-header\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row mb-2\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h1 class=\"m-0 text-dark\"></h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.content-header -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3\"></div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card card-primary\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"card-title\">Đăng nhập</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-header -->\n");
      out.write("                                    <!-- form start -->\n");
      out.write("                                    <form role=\"form\"\n");
      out.write("                                          action=\"login\" method=\"post\">\n");
      out.write("                                        <div class=\"row justify-content-center card-body\"\n");
      out.write("                                             style=\"margin-bottom: -34px;\">\n");
      out.write("                                            <div style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"exampleInputEmail1\">Tên đăng nhập</label> <input\n");
      out.write("                                                type=\"text\" class=\"form-control\" name=\"username\"\n");
      out.write("                                                placeholder=\"Nhập tên đăng nhập\" required=\"required\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"exampleInputPassword1\">Mật khẩu</label> <input\n");
      out.write("                                                type=\"password\" class=\"form-control\" name=\"password\"\n");
      out.write("                                                id=\"exampleInputPassword1\" placeholder=\"Nhập mật khẩu\"\n");
      out.write("                                                required=\"required\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"form-check-input\"\n");
      out.write("                                                   id=\"exampleCheck1\" name=\"rememberMe\" value=\"Y\"> <label\n");
      out.write("                                                   class=\"form-check-label\" for=\"exampleCheck1\">Nhớ tài\n");
      out.write("                                                khoản</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div style=\"margin-bottom: -14px; margin-top: 25px;\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-body -->\n");
      out.write("                                    <div class=\"form-check\">\n");
      out.write("                                            <a href=\"register.jsp  \"\n");
      out.write("                                                class=\"form-check-label\" for=\"exampleCheck1\">Đăng Ký\n");
      out.write("                                                </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    <div class=\"card-footer\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
