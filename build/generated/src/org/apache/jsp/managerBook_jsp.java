package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write("\n");
      out.write("        <section class=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <form role=\"form\" method=\"post\"\n");
      out.write("                                  action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/SearchBook\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h3 class=\"card-title\">Danh sách sách trong thư viện</h3>\n");
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
      out.write("                            </form>\n");
      out.write("                            <div class=\"row justify-content-center\">\n");
      out.write("                                <div style=\"margin-top: 20px; color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.card-header -->\n");
      out.write("                            <div class=\"card-body\" >\n");
      out.write("                                <div class=\"card-header\" style=\"margin-left: -20px; margin-top: -40px;\">\n");
      out.write("                                    <input type=\"button\" value=\"Thêm sách\"\n");
      out.write("                                           class=\"btn btn-primary\"\n");
      out.write("                                           onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddBook'\">\n");
      out.write("                                </div>\n");
      out.write("                                <table class=\"table table-bordered table-hover\" id=\"example2\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th style=\"width: 10px\">STT</th>\n");
      out.write("                                            <th style=\"width: 318px;\">Tên</th>\n");
      out.write("                                            <th>Thể loại</th>\n");
      out.write("                                            <th>Số lượng</th>\n");
      out.write("                                            <th>Ngày nhập</th>\n");
      out.write("                                            <th>Hình ảnh</th>\n");
      out.write("                                            <th>Chỉnh sửa</th>\n");
      out.write("                                            <th>Xóa</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"book\" varStatus=\"loop\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getCategory().getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td style=\"text-align: center;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getAmount()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getDay()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                            <td style=\"text-align: center;\"><img\n");
      out.write("                                                    src=\"Resources/img/products/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" width=\"35\"\n");
      out.write("                                                    height=\"50\">\n");
      out.write("                                        <figcaption>\n");
      out.write("                                            <a href=\"Resources/img/products/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                               style=\"font-size: 14px;\" target=\"_blank\">Xem chi tiết</a>\n");
      out.write("                                        </figcaption>\n");
      out.write("                                        <td><a\n");
      out.write("                                                href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/EditBook?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                                class=\"btn btn-sm btn-info\">Chỉnh sửa</a></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-primary btn-danger\"\n");
      out.write("                                                    data-toggle=\"modal\"\n");
      out.write("                                                    data-target=\"#staticBackdrop-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.toString(book.getId())}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                                    style=\"padding-bottom: 5px; padding-top: 3px; font-size: 14px\">Xóa</button>\n");
      out.write("                                        </td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        <div class=\"modal fade\"\n");
      out.write("                                             id=\"staticBackdrop-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.toString(book.getId())}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                             data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\"\n");
      out.write("                                             aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("                                            <div class=\"modal-dialog\">\n");
      out.write("                                                <div class=\"modal-content\">\n");
      out.write("                                                    <div class=\"modal-header\">\n");
      out.write("                                                        <h5 class=\"modal-title\" id=\"staticBackdropLabel1\">Chú\n");
      out.write("                                                            ý</h5>\n");
      out.write("                                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("                                                                aria-label=\"Close\">\n");
      out.write("                                                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"modal-body\">\n");
      out.write("                                                        <span class=\"text-danger\"> Bạn có muốn chắc xóa\n");
      out.write("                                                            cuốn sách '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"modal-footer\">\n");
      out.write("                                                        <button type=\"button\"\n");
      out.write("                                                                class=\"btn btn-warning  btn-secondary\"\n");
      out.write("                                                                data-dismiss=\"modal\">Hủy</button>\n");
      out.write("                                                        <form\n");
      out.write("                                                            action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/DeleteBook?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                                            method=\"POST\">\n");
      out.write("                                                            <button type=\"submit\" class=\"btn btn-danger\">Xóa</button>\n");
      out.write("                                                        </form>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </c:forEach>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <div class=\"card-tools\">\n");
      out.write("                                        <input type=\"button\" value=\"Xóa tất cả\" class=\"btn btn-danger\"\n");
      out.write("                                               data-toggle=\"modal\" data-target=\"#staticBackdrop-DeleteAll\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal fade\" id=\"staticBackdrop-DeleteAll\"\n");
      out.write("                                         data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\"\n");
      out.write("                                         aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
      out.write("                                        <div class=\"modal-dialog\">\n");
      out.write("                                            <div class=\"modal-content\">\n");
      out.write("                                                <div class=\"modal-header\">\n");
      out.write("                                                    <h5 class=\"modal-title\" id=\"staticBackdropLabel1\">Chú ý</h5>\n");
      out.write("                                                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
      out.write("                                                            aria-label=\"Close\">\n");
      out.write("                                                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                                    </button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-body\">\n");
      out.write("                                                    <span class=\"text-danger\"> Bạn có muốn chắc xóa tất\n");
      out.write("                                                        cả sách</span>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"modal-footer\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-warning  btn-secondary\"\n");
      out.write("                                                            data-dismiss=\"modal\">Hủy</button>\n");
      out.write("\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-danger\"\n");
      out.write("                                                            onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/DeleteBook'\">Xóa</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.card -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("        </section>\n");
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
