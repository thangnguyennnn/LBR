package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCatelogy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("                            <div class=\"card card-primary\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h3 class=\"card-title\">Thêm thể loại</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.card-header -->\n");
      out.write("                                <!-- form start -->\n");
      out.write("                                <form role=\"form\" method=\"post\"\n");
      out.write("                                      action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddCategory\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Tên thể loại</label> <input type=\"text\"\n");
      out.write("                                                                               class=\"form-control\" id=\"name_category\" name=\"name_category\"\n");
      out.write("                                                                               placeholder=\"Nhập tên thể loại sách\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-footer\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary \">Lưu</button>\n");
      out.write("                                        <input type=\"button\" value=\"Hủy\" class=\"btn btn-primary\" onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ManageCategory'\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.card -->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container-fluid -->\n");
      out.write("            </section>\n");
      out.write("                                    \n");
      out.write("            <!-- /.content -->\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"main-footer\"> </footer>\n");
      out.write("<aside class=\"control-sidebar control-sidebar-dark\">\n");
      out.write("    <!-- Control sidebar content goes here -->\n");
      out.write("</aside>\n");
      out.write("<!-- /.control-sidebar -->\n");
      out.write("</div>\n");
      out.write("<!-- ./wrapper -->\n");
      out.write("\n");
      out.write("<!-- jQuery -->\n");
      out.write("<script src=\"./Resources/plugins/jquery/jquery.min.js\"></script>\n");
      out.write("<!-- jQuery UI 1.11.4 -->\n");
      out.write("<script src=\"./Resources/plugins/jquery-ui/jquery-ui.min.js\"></script>\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("<script>\n");
      out.write("    $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("</script>\n");
      out.write("<!-- Bootstrap 4 -->\n");
      out.write("<script src=\"./Resources/plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<!-- ChartJS -->\n");
      out.write("<script src=\"./Resources/plugins/chart.js/Chart.min.js\"></script>\n");
      out.write("<!-- Sparkline -->\n");
      out.write("<script src=\"./Resources/plugins/sparklines/sparkline.js\"></script>\n");
      out.write("<!-- JQVMap -->\n");
      out.write("<script src=\"./Resources/plugins/jqvmap/jquery.vmap.min.js\"></script>\n");
      out.write("<script src=\"./Resources/plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\n");
      out.write("<!-- jQuery Knob Chart -->\n");
      out.write("<script src=\"./Resources/plugins/jquery-knob/jquery.knob.min.js\"></script>\n");
      out.write("<!-- daterangepicker -->\n");
      out.write("<script src=\"./Resources/plugins/moment/moment.min.js\"></script>\n");
      out.write("<script src=\"./Resources/plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!-- Tempusdominus Bootstrap 4 -->\n");
      out.write("<script\n");
      out.write("src=\"./Resources/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\n");
      out.write("<!-- Summernote -->\n");
      out.write("<script src=\"./Resources/plugins/summernote/summernote-bs4.min.js\"></script>\n");
      out.write("<!-- overlayScrollbars -->\n");
      out.write("<script\n");
      out.write("src=\"./Resources/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\n");
      out.write("<!-- AdminLTE App -->\n");
      out.write("<script src=\"Resources/js/adminlte.js\"></script>\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("<script src=\"Resources/js/pages/dashboard.js\"></script>\n");
      out.write("<!-- AdminLTE for demo purposes -->\n");
      out.write("<script src=\"Resources/js/demo.js\"></script>\n");
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
