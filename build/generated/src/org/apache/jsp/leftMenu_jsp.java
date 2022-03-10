package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class leftMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Navbar -->\n");
      out.write("    <nav\n");
      out.write("        class=\"main-header navbar navbar-expand navbar-white navbar-light\">\n");
      out.write("        <!-- Left navbar links -->\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\"><a class=\"nav-link\" data-widget=\"pushmenu\"\n");
      out.write("                                    href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a></li>\n");
      out.write("            <li class=\"nav-item d-none d-sm-inline-block\"><a href=\"#\"\n");
      out.write("                                                             class=\"nav-link\">Hướng dẫn sử dụng</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <!-- /.navbar -->\n");
      out.write("\n");
      out.write("    <!-- Main Sidebar Container -->\n");
      out.write("    <aside class=\"main-sidebar sidebar-dark-primary elevation-4\" style=\"height:730px\">\n");
      out.write("        <a href=\"#\" class=\"brand-link\"> <img\n");
      out.write("                src=\"Resources/img/AdminLTELogo.png\" alt=\"AdminLTE Logo\"\n");
      out.write("                class=\"brand-image img-circle elevation-3\" style=\"opacity: .8\">\n");
      out.write("            <span class=\"brand-text font-weight-light\">Quán lý thư viện</span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("            <!-- Sidebar user panel (optional) -->\n");
      out.write("            <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Sidebar Menu -->\n");
      out.write("            <nav class=\"mt-2\">\n");
      out.write("                <ul class=\"nav nav-pills nav-sidebar flex-column\"\n");
      out.write("                    data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\n");
      out.write("                    <li class=\"nav-item \"><a\n");
      out.write("                            href=\"loadHome\"\n");
      out.write("                            class=\"nav-link ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index == 1 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            <i class=\"nav-icon fas fa-book\"></i>\n");
      out.write("                            <p>Hướng dẫn</p>\n");
      out.write("                        </a></li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- /.sidebar-menu -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.sidebar -->\n");
      out.write("    </aside>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${User != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"image\">\n");
        out.write("                        <img src=\"Resources/img/avatar.jpg\" class=\"img-circle elevation-2\"\n");
        out.write("                             alt=\"User Image\">\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"info\">\n");
        out.write("                        <a href=\"#\" class=\"d-block\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${User.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${User == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"info\" style=\"margin-left: 60px;\">\n");
        out.write("                        <a href=\"login.jsp\" class=\"d-block\">Đăng\n");
        out.write("                            nhập</a>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${User != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li id=\"li1\"\n");
        out.write("                            class=\"nav-item has-treeview\"><a\n");
        out.write("                                href=\"#\"\n");
        out.write("                                class=\"nav-link ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index == 2 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                <i class=\"nav-icon fas fa-book\"></i>\n");
        out.write("                                <p>\n");
        out.write("                                    Quản lý sách<i class=\"right fas fa-angle-left\"></i>\n");
        out.write("                                </p>\n");
        out.write("                                \n");
        out.write("                            </a>\n");
        out.write("                            <ul id=\"menu1\" class=\"nav nav-treeview\">\n");
        out.write("                                <li class=\"nav-item\"><a\n");
        out.write("                                        href=\"loadManagerBook\"\n");
        out.write("                                        class=\"nav-link ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index2 == 1 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\n");
        out.write("                                        <p>Danh sách</p>\n");
        out.write("                                    </a></li>\n");
        out.write("                                <li class=\"nav-item\"><a\n");
        out.write("                                        href=\"loadAddBookPage\"\n");
        out.write("                                        class=\"nav-link ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index2 == 2 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\">\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\n");
        out.write("                                        <p>Thêm sách</p>\n");
        out.write("                                    </a></li>\n");
        out.write("                                <li class=\"nav-item\"><a\n");
        out.write("                                        href=\"loadManagerCate\"\n");
        out.write("                                        class=\"nav-link\">\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\n");
        out.write("                                        <p>Thể loại</p>\n");
        out.write("                                    </a></li>\n");
        out.write("                            </ul></li>\n");
        out.write("                        <li id=\"li2\"\n");
        out.write("                            class=\"nav-item has-treeview\"><a\n");
        out.write("                                \n");
        out.write("                                class=\"nav-link ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index == 3 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                <i class=\"nav-icon fas fa-book\"></i>\n");
        out.write("                                <p>\n");
        out.write("                                    Quản lý mượn sách<i class=\"right fas fa-angle-left\"></i>\n");
        out.write("                                </p>\n");
        out.write("                            </a>\n");
        out.write("                            <ul id=\"menu2\" class=\"nav nav-treeview\">\n");
        out.write("                                <li class=\"nav-item\"><a\n");
        out.write("                                        href=\"addReader.jsp\"\n");
        out.write("                                        class=\"nav-link\">\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\n");
        out.write("                                        <p>Thêm người mượn sách</p>\n");
        out.write("                                    </a></li>\n");
        out.write("                                <li class=\"nav-item\"><a\n");
        out.write("                                        href=\"#\"\n");
        out.write("                                        class=\"nav-link\">\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\n");
        out.write("                                        <p>Danh sách đang mượn sách</p>\n");
        out.write("                                    </a></li>\n");
        out.write("\n");
        out.write("                                <li class=\"nav-item\"><a\n");
        out.write("                                        href=\"#\"\n");
        out.write("                                        class=\"nav-link\">\n");
        out.write("                                        <i class=\"far fa-circle nav-icon\"></i>\n");
        out.write("                                        <p>Lịch sử mượn sách</p>\n");
        out.write("                                    </a></li>\n");
        out.write("                            </ul></li>\n");
        out.write("                        <li class=\"nav-item\"><a\n");
        out.write("                                href=\"logout\" class=\"nav-link\">\n");
        out.write("                                <i class=\"fas fa-circle nav-icon\"></i>\n");
        out.write("                                <p>Đăng xuất</p>\n");
        out.write("                            </a></li>  \n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
