package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.TinTuc;
import Dao.TinTucDAO;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jsp");
    _jspx_dependants.add("/Footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv = \"Content-Type\" content = \"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel = \"stylesheet\" href = \"./Css/MyStyle.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv = \"Content-Type\" content = \"text/html; charset=UTF-8\">\n");
      out.write("        <title>Header</title>\n");
      out.write("        <link rel = \"stylesheet\" href = \"./Css/MyStyle.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1 \n");
      out.write("            style = \"height: 50px; \n");
      out.write("                    background-color: #B8E1FF; \n");
      out.write("                    font-weight: 600; \n");
      out.write("                    line-height: 50px; \n");
      out.write("                    text-align: center;\">\n");
      out.write("            Báo Điện Tử Online</h1>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<!----------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("        <div class = \"header_text\">\n");
      out.write("            <h1>Danh sách tin tức:</h1>\n");
      out.write("            <h3>Số lượng tin tức hiện có: 188</h3>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <table class = \"table\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Tiêu Đề</th>\n");
      out.write("                <th>Nội Dung</th>\n");
      out.write("                <th>Tác Giả</th>\n");
      out.write("                <th>Lượt Xem</th>\n");
      out.write("                <th>Ngày Tạo</th>\n");
      out.write("                <th>Xem Chi Tiết</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                TinTucDAO ttdao = new TinTucDAO();
                ArrayList<TinTuc> list = ttdao.getTinTucList();
                if (list != null && !list.isEmpty()) 
                    {
                        for (TinTuc t : list) 
                            {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th class = \"table_data\">");
      out.print( t.getId());
      out.write("</th>\n");
      out.write("                <th class = \"table_data\">");
      out.print( t.getTieuDe());
      out.write("</th>\n");
      out.write("                <th class = \"table_data\">");
      out.print( t.getNoiDung());
      out.write("</th>\n");
      out.write("                <th class = \"table_data\">");
      out.print( t.getTacGia());
      out.write("</th>\n");
      out.write("                <th class = \"table_data\">");
      out.print( t.getLuotXem());
      out.write("</th>\n");
      out.write("                <th class = \"table_data\">");
      out.print( t.getNgayTao());
      out.write("</th>\n");
      out.write("                <th class = \"table_data\"><a id = \"chi_tiet\" href =\"chi-tiet-bai-viet?id=");
      out.print( t.getId());
      out.write('"');
      out.write('>');
      out.print( t.getXem());
      out.write("</a></th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                            }
                    }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("<!----------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv = \"Content-Type\" content = \"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("        <link rel = \"stylesheet\" href = \"./Css/MyStyle.css\">       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h4     \n");
      out.write("            style = \"height: 50px; \n");
      out.write("                    background-color: #B8E1FF; \n");
      out.write("                    font-weight: 600; \n");
      out.write("                    line-height: 50px; \n");
      out.write("                    text-align: center;\">\n");
      out.write("            2022-2023: Toàn bộ bản quyền thuộc tòa soạn</h4>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>");
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
