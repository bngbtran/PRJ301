package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Delete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Delete</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("                {\n");
      out.write("                    background-color: #C8E2B1;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            String[] productsToDelete = request.getParameterValues("deleteCheckbox");
            if (productsToDelete != null) 
                {
                    java.io.File file = new java.io.File("C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Product.txt");
                    java.util.List<String> lines = java.nio.file.Files.readAllLines(file.toPath(), java.nio.charset.StandardCharsets.UTF_8);
                    java.util.List<String> updatedLines = new java.util.ArrayList<>();

                    for (String line : lines) 
                        {
                            boolean delete = false;
                            for (String productToDelete : productsToDelete) 
                                {
                                    if (line.equals(productToDelete)) 
                                        {
                                            delete = true;
                                            break;
                                        }
                                }
                            if (!delete) 
                                {
                                    updatedLines.add(line);
                                }
                        }
                    java.nio.file.Files.write(file.toPath(), updatedLines, java.nio.charset.StandardCharsets.UTF_8);
                }
        
      out.write("\n");
      out.write("        <h1 style = \"margin-left: 580px; margin-top: 250px;\">Deleted successfully !!!</h1>\n");
      out.write("        <a style = \"margin-left: 700px;\" href = \"WishListPage.jsp\">Return</a>\n");
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
