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
      out.write("                                        <h3 class=\"card-title\">H?????ng d???n s??? d???ng trang web</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"margin-top: 12px; margin-left: 12px;\">\n");
      out.write("                                    ");

                                        if (request.getSession().getAttribute("User") == null) {
                                    
      out.write("\n");
      out.write("                                    <p>\n");
      out.write("                                        &nbsp;- Mu???n s??? d???ng trang web n??y th?? ?????u ti??n b???n c???n <b>\n");
      out.write("                                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Login\">????ng\n");
      out.write("                                                nh???p.</a>\n");
      out.write("                                        </b>. T??n t??i kho???n: <b>nobita</b>, M???t kh???u: <b>doraemon</b>.\n");
      out.write("                                    </p>\n");
      out.write("                                    ");

                                    } else {
                                    
      out.write("\n");
      out.write("                                    <p>&nbsp;C??m ??n b???n ???? ????ng nh???p, b??y gi??? b???n c?? th??? s??? d???ng\n");
      out.write("                                        trang web.</p>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    <p>- C??c ch???c n??ng c???a trang web l?? qu???n l?? s??ch v?? qu???n l??\n");
      out.write("                                        m?????n s??ch</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <b>I. Qu???n l?? s??ch.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Mu???n xem danh s??ch trong th?? vi???n ch???n <b>Qu???n l?? s??ch\n");
      out.write("                                            -&gt; Danh s??ch.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <b>-&nbsp; </b>Trong m???c danh s??ch:&nbsp;\n");
      out.write("                                    </p>\n");
      out.write("                                    <p></p>\n");
      out.write("                                    <ol style=\"text-align: left;\">\n");
      out.write("                                        <li>Mu???n t??m ki???m s??ch trong danh s??ch th?? g?? v??o ?? T??m\n");
      out.write("                                            ki???m v?? nh???n enter.</li>\n");
      out.write("                                        <li>Mu???n ch???nh s???a th??ng tin s??ch n??o th?? n??t <b>Ch???nh\n");
      out.write("                                                s???a</b>-&gt; Ch???nh s???a nh???ng th??ng tin c???n thi???t-&gt; Nh???n <b>L??u-</b>&gt;\n");
      out.write("                                            nh???n <b>H???y</b> ????? tr??? l???i danh s??ch.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>Mu???n x??a s??ch n??o th?? b???n ch???n n??t <b>X??a</b> t????ng ???ng\n");
      out.write("                                            c???a s??ch ???? . C?? th??ng b??o x??c nh???n hi???n ra. Ch???n <b>X??a</b> ?????\n");
      out.write("                                            x??a v??nh vi???n ho???c ch???n <b>H???y</b> ????? h???y thao t??c x??a.\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>Mu???n x??a t???t c??? th?? ch???n n??t <b>X??a t???t c???</b>.\n");
      out.write("                                        </li>\n");
      out.write("                                    </ol>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Mu???n th??m s??ch th?? ch???n&nbsp;<b>Qu???n l?? s??ch -&gt; Th??m\n");
      out.write("                                            s??ch -&gt; </b>??i???n nh???ng th??ng tin c???n thi???t , ch???n th??? lo???i s??ch\n");
      out.write("                                        v?? h??nh ???nh t????ng ???ng-&gt; Nh???n <b>L??u</b> ????? l??u l???i v?? nh???n <b>H???y</b>\n");
      out.write("                                        ????? tr??? l???i danh s??ch.\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        -Mu???n xem th??? lo???i s??ch th?? ch???n&nbsp;<b>Qu???n l?? s??ch -&gt;\n");
      out.write("                                            Th??? lo???i.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>-Trong m???c th??? lo???i, mu???n th??m th??? lo???i th?? ch???n th??m th???\n");
      out.write("                                        lo???i, mu???n ch???nh s???a ch???n ch???nh s???a, mu???n x??a th?? ch???n n??t X??a.</p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <b>II. Qu???n l?? m?????n s??ch.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Mu???n th??m ng?????i m?????n th?? ch???n <b>Qu???n l?? m?????n\n");
      out.write("                                            s??ch-&gt;Th??m ng?????i m?????n s??ch.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        -Mu???n xem danh s??ch ??ang m?????n s??ch th?? ch???n <b>Qu???n l?? m?????n\n");
      out.write("                                            s??ch-&gt;Danh s??ch ??ang m?????n.</b> ??? m???c n??y b???n c?? th??? t??m ki???m,\n");
      out.write("                                        qu???n l?? x??c nh???n ???? ???? s??ch hay ch??a. N???u ng?????i ???? ?????n tr??? th??\n");
      out.write("                                        b???n ch???n <b>???? tr???.</b>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        - Mu???n xem danh s??ch ??ang m?????n s??ch th?? ch???n<b> Qu???n l?? m?????n\n");
      out.write("                                            s??ch-&gt;Danh s??ch ??ang m?????n.&nbsp;</b>\n");
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
