package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
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
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div style=\"margin-top: 20px; color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\"></div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h3 class=\"card-title\">Danh sách thể loại sách</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.card-header -->\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                                    <table class=\"table table-bordered\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th style=\"width: 10px\">STT</th>\n");
      out.write("                                                <th>Tên thể loại</th>\n");
      out.write("                                                <th>Chỉnh sửa</th>\n");
      out.write("                                                <th>Xóa</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                    <div class=\"card-header\" style=\"margin-left: -20px;\">\n");
      out.write("                                        <input type=\"button\" value=\"Thêm thể loại\"\n");
      out.write("                                               class=\"btn btn-primary\"\n");
      out.write("                                               onclick=\"location.href = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddCategory'\">\n");
      out.write("                                    </div>\n");
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    <script src=\"Resources/plugins/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script\n");
      out.write("    src=\"Resources/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("    <script\n");
      out.write("    src=\"Resources/plugins/datatables-responsive/js/dataTables.responsive.min.js\"></script>\n");
      out.write("    <script\n");
      out.write("    src=\"Resources/plugins/datatables-responsive/js/responsive.bootstrap4.min.js\"></script>\n");
      out.write("    <!-- AdminLTE App -->\n");
      out.write("    <script src=\"Resources/js/adminlte.min.js\"></script>\n");
      out.write("    <!-- AdminLTE for demo purposes -->\n");
      out.write("    <script src=\"Resources/dist/js/demo.js\"></script>\n");
      out.write("    <!-- page script -->\n");
      out.write("    <script>\n");
      out.write("                                                                            $(function () {\n");
      out.write("                                                                                $(\"#example1\").DataTable({\n");
      out.write("                                                                                    \"responsive\": true,\n");
      out.write("                                                                                    \"autoWidth\": false,\n");
      out.write("                                                                                });\n");
      out.write("                                                                                $('#example2').DataTable({\n");
      out.write("                                                                                    \"paging\": true,\n");
      out.write("                                                                                    \"lengthChange\": false,\n");
      out.write("                                                                                    \"searching\": false,\n");
      out.write("                                                                                    \"ordering\": true,\n");
      out.write("                                                                                    \"info\": true,\n");
      out.write("                                                                                    \"autoWidth\": false,\n");
      out.write("                                                                                    \"responsive\": true,\n");
      out.write("                                                                                });\n");
      out.write("                                                                            });\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loop.index+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                    <td><a\n");
          out.write("                                                            href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/EditCategory?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                            class=\"btn btn-sm btn-info\">Chỉnh sửa</a></td>\n");
          out.write("                                                    <td>\n");
          out.write("                                                        <button type=\"button\" class=\"btn btn-primary btn-danger\"\n");
          out.write("                                                                data-toggle=\"modal\"\n");
          out.write("                                                                data-target=\"#staticBackdrop-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.toString(category.getId())}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Xóa</button>\n");
          out.write("                                                    </td>\n");
          out.write("                                                </tr>\n");
          out.write("\n");
          out.write("                                            <div class=\"modal fade\"\n");
          out.write("                                                 id=\"staticBackdrop-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Integer.toString(category.getId())}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                 data-backdrop=\"static\" data-keyboard=\"false\" tabindex=\"-1\"\n");
          out.write("                                                 aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n");
          out.write("                                                <div class=\"modal-dialog\">\n");
          out.write("                                                    <div class=\"modal-content\">\n");
          out.write("                                                        <div class=\"modal-header\">\n");
          out.write("                                                            <h5 class=\"modal-title\" id=\"staticBackdropLabel1\">Chú\n");
          out.write("                                                                ý</h5>\n");
          out.write("                                                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\n");
          out.write("                                                                    aria-label=\"Close\">\n");
          out.write("                                                                <span aria-hidden=\"true\">&times;</span>\n");
          out.write("                                                            </button>\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"modal-body\">\n");
          out.write("                                                            <span class=\"text-danger\"> Bạn có muốn chắc xóa thể\n");
          out.write("                                                                loại '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'</span>\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"modal-footer\">\n");
          out.write("                                                            <button type=\"button\"\n");
          out.write("                                                                    class=\"btn btn-warning  btn-secondary\"\n");
          out.write("                                                                    data-dismiss=\"modal\">Hủy</button>\n");
          out.write("                                                            <form\n");
          out.write("                                                                action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/DeleteCategory?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                                                method=\"POST\">\n");
          out.write("                                                                <button type=\"submit\" class=\"btn btn-danger\">Xóa</button>\n");
          out.write("                                                            </form>\n");
          out.write("\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
