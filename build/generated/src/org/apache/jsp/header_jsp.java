package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Quản lý thư viện</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/plugins/fontawesome-free/css/all.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/css/ionicons.min.css\">\n");
      out.write("        <!-- Tempusdominus Bbootstrap 4 -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\n");
      out.write("        <!-- JQVMap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./Resources/plugins/jqvmap/jqvmap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- overlayScrollbars -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/plugins/overlayScrollbars/css/OverlayScrollbars.min.css\">\n");
      out.write("        <!-- Daterange picker -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!-- summernote -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"./Resources/plugins/summernote/summernote-bs4.css\">\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("        <!-- daterange picker -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"Resources/plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!-- Bootstrap Color Picker -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"Resources/plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.min.css\">\n");
      out.write("        <!-- Select2 -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"Resources/plugins/select2/css/select2.min.css\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"Resources/plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css\">\n");
      out.write("        <!-- Bootstrap4 Duallistbox -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"Resources/plugins/bootstrap4-duallistbox/bootstrap-duallistbox.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"Resources/css/adminlte.min.css\">\n");
      out.write("        <!-- Google Font: Source Sans Pro -->\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition sidebar-mini layout-fixed\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav\n");
      out.write("                class=\"main-header navbar navbar-expand navbar-white navbar-light\">\n");
      out.write("                <!-- Left navbar links -->\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" data-widget=\"pushmenu\"\n");
      out.write("                                            href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a></li>\n");
      out.write("                    <li class=\"nav-item d-none d-sm-inline-block\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/UserManual\"\n");
      out.write("                                                                     class=\"nav-link\">Hướng dẫn sử dụng</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <!-- /.navbar -->\n");
      out.write("\n");
      out.write("            <!-- Main Sidebar Container -->\n");
      out.write("            <aside class=\"main-sidebar sidebar-dark-primary elevation-4\">\n");
      out.write("                <a href=\"#\" class=\"brand-link\"> <img\n");
      out.write("                        src=\"Resources/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\"\n");
      out.write("                        class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\n");
      out.write("                    <span class=\"brand-text font-weight-light\">Quán lý thư viện</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel (optional) -->\n");
      out.write("                    <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\n");
      out.write("                        <div class=\"image\">\n");
      out.write("                            <img src=\"Resources/img/avatar.jpg\" class=\"img-circle elevation-2\"\n");
      out.write("                                 alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info\">\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"d-block\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info\" style=\"margin-left: 60px;\">\n");
      out.write("                            <a href=\"#\" class=\"d-block\">Đăng\n");
      out.write("                                nhập</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Menu -->\n");
      out.write("                    <nav class=\"mt-2\">\n");
      out.write("                        <ul class=\"nav nav-pills nav-sidebar flex-column\"\n");
      out.write("                            data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\n");
      out.write("                            <li class=\"nav-item \"><a\n");
      out.write("                                    href=\"#\"\n");
      out.write("                                    class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-book\"></i>\n");
      out.write("                                    <p>Hướng dẫn</p>\n");
      out.write("                                </a></li>\n");
      out.write("                            <li\n");
      out.write("                                class=\"nav-item has-treeview\"><a\n");
      out.write("                                    href=\"#\"\n");
      out.write("                                    class=\"nav-link \">\n");
      out.write("                                    <i class=\"nav-icon fas fa-book\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Quản lý sách<i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"nav nav-treeview\">\n");
      out.write("                                    <li class=\"nav-item\"><a\n");
      out.write("                                            href=\"#\"\n");
      out.write("                                            class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Danh sách</p>\n");
      out.write("                                        </a></li>\n");
      out.write("                                    <li class=\"nav-item\"><a\n");
      out.write("                                            href=\"#\"\n");
      out.write("                                            class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Thêm sách</p>\n");
      out.write("                                        </a></li>\n");
      out.write("                                    <li class=\"nav-item\"><a\n");
      out.write("                                            href=\"#\"\n");
      out.write("                                            class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Thể loại</p>\n");
      out.write("                                        </a></li>\n");
      out.write("                                </ul></li>\n");
      out.write("                            <li\n");
      out.write("                                class=\"nav-item has-treeview\"><a\n");
      out.write("                                    href=\"#\"\n");
      out.write("                                    class=\"nav-link\">\n");
      out.write("                                    <i class=\"nav-icon fas fa-book\"></i>\n");
      out.write("                                    <p>\n");
      out.write("                                        Quản lý mượn sách<i class=\"right fas fa-angle-left\"></i>\n");
      out.write("                                    </p>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"nav nav-treeview\">\n");
      out.write("                                    <li class=\"nav-item\"><a\n");
      out.write("                                            href=\"#\"\n");
      out.write("                                            class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Thêm người mượn sách</p>\n");
      out.write("                                        </a></li>\n");
      out.write("                                    <li class=\"nav-item\"><a\n");
      out.write("                                            href=\"#\"\n");
      out.write("                                            class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Danh sách đang mượn sách</p>\n");
      out.write("                                        </a></li>\n");
      out.write("\n");
      out.write("                                    <li class=\"nav-item\"><a\n");
      out.write("                                            href=\"#\"\n");
      out.write("                                            class=\"nav-link\">\n");
      out.write("                                            <i class=\"far fa-circle nav-icon\"></i>\n");
      out.write("                                            <p>Lịch sử mượn sách</p>\n");
      out.write("                                        </a></li>\n");
      out.write("                                </ul></li>\n");
      out.write("                            <li class=\"nav-item\"><a\n");
      out.write("                                    href=\"#\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"fas fa-circle nav-icon\"></i>\n");
      out.write("                                    <p>Đăng xuất</p>\n");
      out.write("                                </a></li>   \n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <!-- /.sidebar-menu -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>");
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
