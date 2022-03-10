package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerReader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <!-- Main content -->\n");
      out.write("            <section class=\"content\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div style=\"margin-top: 20px; color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <c:if\n");
      out.write("                                    test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_0')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <form role=\"form\" method=\"post\"\n");
      out.write("                                          action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchReader\">\n");
      out.write("                                </c:if>\n");
      out.write("                                <c:if\n");
      out.write("                                    test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_1')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <form role=\"form\" method=\"post\"\n");
      out.write("                                          action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchReader?status=1\">\n");
      out.write("                                </c:if>\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <c:if\n");
      out.write("                                        test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_0')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <h3 class=\"card-title\">Danh sách sách những người đang mượn\n");
      out.write("                                            sách</h3>\n");
      out.write("                                    </c:if>\n");
      out.write("                                    <c:if\n");
      out.write("                                        test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_1')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <h3 class=\"card-title\">Danh sách lịch sử mượn sách sách</h3>\n");
      out.write("                                    </c:if>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"card-tools\" style=\"margin-right: 1px;\">\n");
      out.write("                                        <div class=\"input-group input-group-sm\" style=\"width: 200px;\">\n");
      out.write("                                            <input type=\"text\" name=\"data_search\"\n");
      out.write("                                                   class=\"form-control float-right\"\n");
      out.write("                                                   placeholder=\"Tìm kiếm theo tên\">\n");
      out.write("\n");
      out.write("                                            <div class=\"input-group-append\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                                    <i class=\"fas fa-search\"></i>\n");
      out.write("                                                </button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                </form>\n");
      out.write("                                <!-- /.card-header -->\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <table class=\"table table-bordered table-hover\" id=\"example2\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th style=\"width: 10px\">STT</th>\n");
      out.write("                                                <th>Tên</th>\n");
      out.write("                                                <th>Số CMNN</th>\n");
      out.write("                                                <th>Tên sách mượn</th>\n");
      out.write("                                                <th>Ngày mượn</th>\n");
      out.write("                                        <c:if\n");
      out.write("                                            test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_0')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <th>Ngày phải trả</th>\n");
      out.write("                                            <th>Xác nhận</th>\n");
      out.write("                                        </c:if>\n");
      out.write("                                        <c:if\n");
      out.write("                                            test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_1')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                            <th>Ngày trả</th>\n");
      out.write("                                        </c:if>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                        <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${readerList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"reader\" varStatus=\"loop\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reader.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reader.getIdentify()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reader.getBook().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reader.getStart_day()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reader.getEnd_day()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <c:if\n");
      out.write("                                                test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Check.toString().equals('ManageReader_0')}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                <td>\n");
      out.write("                                                    <button type=\"submit\"\n");
      out.write("                                                            class=\"btn btn-warning  btn-secondary\"\n");
      out.write("                                                            onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ConfirmReader?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reader.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'\">Đã\n");
      out.write("                                                        trả</button>\n");
      out.write("                                                </td>\n");
      out.write("                                            </c:if>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </c:forEach>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.card -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
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
