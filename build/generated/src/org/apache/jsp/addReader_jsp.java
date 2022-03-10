package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addReader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <!-- Content Header (Page header) -->\n");
      out.write("            <div class=\"content-header\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row mb-2\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <h1 class=\"m-0 text-dark\"></h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-header -->\n");
      out.write("            <section class=\"content\">\n");
      out.write("\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\"></div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <!-- general form elements -->\n");
      out.write("                            <form role=\"form\" method=\"post\"\n");
      out.write("                                  action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddReader\">\n");
      out.write("\n");
      out.write("                                <div class=\"card card-primary\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"card-title\">Thêm người mượn sách</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.card-header -->\n");
      out.write("                                    <!-- form start -->\n");
      out.write("                                    <div class=\"row justify-content-center card-body\"\n");
      out.write("                                         style=\"margin-bottom: -34px;\">\n");
      out.write("                                        <div style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Họ và tên</label> <input type=\"text\"\n");
      out.write("                                                                            class=\"form-control\" id=\"name_reader\" name=\"name_reader\"\n");
      out.write("                                                                            placeholder=\"Nhập họ và tên\" required=\"required\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Số chứng minh nhân dân</label> <input type=\"text\"\n");
      out.write("                                                                                         class=\"form-control\" id=\"identify\" name=\"identify\"\n");
      out.write("                                                                                         placeholder=\"Số chứng minh nhân dân\" required=\"required\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.form-group -->\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Tên sách</label> <select class=\"form-control select2\"\n");
      out.write("                                                                            style=\"width: 100%;\" name=\"id_book\" required=\"required\">\n");
      out.write("                                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"book\">\n");
      out.write("                                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                                </c:forEach>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Ngày trả sách:</label>\n");
      out.write("                                            <div class=\"input-group date\" id=\"reservationdate\"\n");
      out.write("                                                 data-target-input=\"nearest\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control datetimepicker-input\"\n");
      out.write("                                                       id=\"end_day\" data-target=\"#reservationdate\"\n");
      out.write("                                                       oninput=\"generateFullName()\" required=\"required\"\n");
      out.write("                                                       name=\"end_day\" />\n");
      out.write("                                                <div class=\"input-group-append\" data-target=\"#reservationdate\"\n");
      out.write("                                                     data-toggle=\"datetimepicker\">\n");
      out.write("                                                    <div class=\"input-group-text\">\n");
      out.write("                                                        <i class=\"fa fa-calendar\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-footer\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary \">Lưu</button>\n");
      out.write("                                        <input type=\"button\" value=\"Hủy\" class=\"btn btn-primary\"\n");
      out.write("                                               onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ManageReader'\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.card -->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
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
