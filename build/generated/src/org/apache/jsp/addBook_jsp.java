package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("\n");
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
      out.write("                                <!-- general form elements -->\n");
      out.write("                                <div class=\"card card-primary\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"card-title\">Thêm sách vào thư viện</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row justify-content-center\"\n");
      out.write("                                         style=\"margin-top: 15px; margin-bottom: -15px;\">\n");
      out.write("                                        <div style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.card-header -->\n");
      out.write("                                <!-- form start -->\n");
      out.write("                                <form role=\"form\" method=\"post\"\n");
      out.write("                                      action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddBook\"\n");
      out.write("                                      enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Nhập tên sách</label> <input type=\"text\"\n");
      out.write("                                                                                class=\"form-control\" id=\"name\" name=\"name\"\n");
      out.write("                                                                                placeholder=\"Nhập tên sách\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Thể loại</label> <select name=\"category\" id=\"category\"\n");
      out.write("                                                                            class=\"form-control\" required>\n");
      out.write("                                                <!-- <option value=\"\">Chọn 1 thể loại</option> -->\n");
      out.write("                                                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"category\">\n");
      out.write("                                                    <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.toString(category.getId())}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                                                </c:forEach>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Số lượng</label> <input type=\"number\"\n");
      out.write("                                                                           class=\"form-control\" id=\"count\" name=\"count\" min=\"1\" value=\"1\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"exampleInputFile\">Thêm ảnh bìa</label>\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <div class=\"custom-file\">\n");
      out.write("                                                    <input type=\"file\" accept=\"image/png, image/jpeg\"\n");
      out.write("                                                           class=\"custom-file-input\" id=\"customFile\" name=\"fileImage\"\n");
      out.write("                                                           required> <label class=\"custom-file-label\"\n");
      out.write("                                                           for=\"customFile\" style=\"color: #a6b0ba;\">Nhấn đây để chọn file</label>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-footer\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary \">Lưu</button>\n");
      out.write("                                        <input type=\"button\" value=\"Trở lại\" class=\"btn btn-primary\"\n");
      out.write("                                               onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ManageBook'\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("            </section>\n");
      out.write("        </div>                    \n");
      out.write("        <!-- /.content -->\n");
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
