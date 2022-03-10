package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("        <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftMenu.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"card card-primary\" style=\"margin-top: 12px;\">\n");
      out.write("                                    <div class=\"card-header\">\n");
      out.write("                                        <h3 class=\"card-title\">Hướng dẫn sử dụng trang web</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"margin-top: 12px; margin-left: 12px;\">\n");
      out.write("                                    ");

                                        if (request.getSession().getAttribute("User") == null) {
                                    
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        &nbsp;- Muốn sử dụng trang web này thì đầu tiên bạn cần <b>\n");
      out.write("                                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login\">đăng\n");
      out.write("                                                nhập.</a>\n");
      out.write("                                        </b>. Tên tài khoản: <b>nobita</b>, Mật khẩu: <b>doraemon</b>.\n");
      out.write("                                    </p>\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\n");
      out.write("                                    <p>&nbsp;Cám ơn bạn đã đăng nhập, bây giờ bạn có thể sử dụng\n");
      out.write("                                        trang web.</p>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    <p>- Các chức năng của trang web là quản lý sách và quản lý\n");
      out.write("                                        mượn sách</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <b>I. Quản lý sách.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Muốn xem danh sách trong thư viện chọn <b>Quản lý sách\n");
      out.write("                                            -&gt; Danh sách.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <b>-&nbsp; </b>Trong mục danh sách:&nbsp;\n");
      out.write("                                    </p>\n");
      out.write("                                    <p></p>\n");
      out.write("                                    <ol style=\"text-align: left;\">\n");
      out.write("                                        <li>Muốn tìm kiếm sách trong danh sách thì gõ vào ô Tìm\n");
      out.write("                                            kiếm và nhấn enter.</li>\n");
      out.write("                                        <li>Muốn chỉnh sửa thông tin sách nào thì nút <b>Chỉnh\n");
      out.write("                                                sửa</b>-&gt; Chỉnh sửa những thông tin cần thiết-&gt; Nhấn <b>Lưu-</b>&gt;\n");
      out.write("                                            nhấn <b>Hủy</b> để trở lại danh sách.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>Muốn xóa sách nào thì bạn chọn nút <b>Xóa</b> tương ứng\n");
      out.write("                                            của sách đó . Có thông báo xác nhận hiện ra. Chọn <b>Xóa</b> để\n");
      out.write("                                            xóa vĩnh viễn hoặc chọn <b>Hủy</b> để hủy thao tác xóa.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>Muốn xóa tất cả thì chọn nút <b>Xóa tất cả</b>.\n");
      out.write("                                        </li>\n");
      out.write("                                    </ol>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Muốn thêm sách thì chọn&nbsp;<b>Quản lý sách -&gt; Thêm\n");
      out.write("                                            sách -&gt; </b>Điền những thông tin cần thiết , chọn thể loại sách\n");
      out.write("                                        và hình ảnh tương ứng-&gt; Nhấn <b>Lưu</b> để lưu lại và nhấn <b>Hủy</b>\n");
      out.write("                                        để trở lại danh sách.\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        -Muốn xem thể loại sách thì chọn&nbsp;<b>Quản lý sách -&gt;\n");
      out.write("                                            Thể loại.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>-Trong mục thể loại, muốn thêm thể loại thì chọn thêm thể\n");
      out.write("                                        loại, muốn chỉnh sửa chọn chỉnh sửa, muốn xóa thì chọn nút Xóa.</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <b>II. Quản lý mượn sách.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Muốn thêm người mượn thì chọn <b>Quản lý mượn\n");
      out.write("                                            sách-&gt;Thêm người mượn sách.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        -Muốn xem danh sách đang mượn sách thì chọn <b>Quản lý mượn\n");
      out.write("                                            sách-&gt;Danh sách đang mượn.</b> Ở mục này bạn có thể tìm kiếm,\n");
      out.write("                                        quản lý xác nhận đã đã sách hay chưa. Nếu người đó đến trả thì\n");
      out.write("                                        bạn chọn <b>Đã trả.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Muốn xem danh sách đang mượn sách thì chọn<b> Quản lý mượn\n");
      out.write("                                            sách-&gt;Danh sách đang mượn.&nbsp;</b>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
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
