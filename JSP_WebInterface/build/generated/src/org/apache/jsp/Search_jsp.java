package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Search</title>\n");
      out.write("        <style>\n");
      out.write("            * \n");
      out.write("                {\n");
      out.write("                    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            body \n");
      out.write("                {\n");
      out.write("                    background-color: white;\n");
      out.write("                    margin: 0;\n");
      out.write("                    padding: 30px;\n");
      out.write("                    margin-left: 550px;\n");
      out.write("                    margin-top: 30px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            h1 \n");
      out.write("                {\n");
      out.write("                    margin-left: 60px;\n");
      out.write("                    color: #333;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            button \n");
      out.write("                {\n");
      out.write("                    background-color: #C8E2B1;\n");
      out.write("                    border: none;\n");
      out.write("                    color: black;\n");
      out.write("                    padding: 10px 20px;\n");
      out.write("                    text-align: center;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    display: inline-block;\n");
      out.write("                    font-size: 16px;\n");
      out.write("                    margin-top: 20px;\n");
      out.write("                    cursor: pointer;\n");
      out.write("                    margin-left: 80px;\n");
      out.write("                    border-radius: 10px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            button a \n");
      out.write("                {\n");
      out.write("                    color: black;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <h1>SEARCH</h1>\n");
      out.write("        ");
 
            String searchTerm = request.getParameter("product-name").toLowerCase(); 
            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Product.txt"));
            String line;
            while ((line = reader.readLine()) != null) 
                {
                    if (line.contains(searchTerm)) 
                        {
                            out.println(line + "<br>");
                        }
                }
            reader.close();
        
      out.write("\n");
      out.write("        <button><a href = \"WishListPage.jsp\">Return</a></button>\n");
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
