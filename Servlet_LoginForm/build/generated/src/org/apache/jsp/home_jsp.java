package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Student;
import java.util.List;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>List of Students</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("            .pagination {\n");
      out.write("                margin-top: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pagination a {\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                color: #000;\n");
      out.write("                text-decoration: none;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .pagination a.active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: #fff;\n");
      out.write("                border: 1px solid #4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .success-message {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 10px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                max-width: 800px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logout-btn {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #f44336;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-title {\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .table-container {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: left;\n");
      out.write("                border-bottom: 1px solid #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search-bar {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search-input {\n");
      out.write("                flex: 1;\n");
      out.write("                padding: 5px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .search-btn {\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button-group {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: flex-end;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .delete-btn, .add-btn {\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #f44336;\n");
      out.write("                color: #fff;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"user-info\">\n");
      out.write("                    ");
 String successMessage = request.getParameter("successMessage");
                        if (successMessage != null && !successMessage.isEmpty()) {
      out.write("\n");
      out.write("                    <div class=\"success-message\">\n");
      out.write("                        ");
      out.print( successMessage);
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                    <span>Welcome ");
      out.print( request.getAttribute("name"));
      out.write("</span>\n");
      out.write("                </div>\n");
      out.write("                <form method=\"get\" action=\"logout\">\n");
      out.write("                    <button class=\"logout-btn\">Logout</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <h2 class=\"form-title\">List of Students</h2>\n");
      out.write("            ");
 if (request.getAttribute("notFound") != null) { 
      out.write("\n");
      out.write("            <p>No results found.</p>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            <form method=\"get\" action=\"search\">\n");
      out.write("                <div class=\"search-bar\">\n");
      out.write("                    <input type=\"text\" class=\"search-input\" name=\"search\" placeholder=\"Search...\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                    <button class=\"search-btn\">Search</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <form method=\"get\" action=\"home\" >\n");
      out.write("                <div class=\"table-container\">\n");
      out.write("\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Password</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Phone</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>Gender</th>\n");
      out.write("                                <th>Created At</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("\n");
      out.write("                            ");
 if (request.getAttribute("students") != null) {
                                    for (Student student : (List<Student>) request.getAttribute("students")) {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( student.getName());
      out.write("</td>\n");
      out.write("                                <td >");
      out.print( student.getId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( student.getPassword());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( student.getEmail());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( student.getPhone());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( student.getAddress());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( student.getGender());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( student.getCreatedAt());
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
  }
                                }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"pagination\">\n");
      out.write("                        <ul>\n");
      out.write("                            ");
 int totalPages = (int) request.getAttribute("totalPages");
                                int currentPage = (int) request.getAttribute("currentPage");
                                for (int i = 1; i <= totalPages; i++) {
                                    String activeClass = (i == currentPage) ? "active" : "";
                            
      out.write("\n");
      out.write("                            <li class=\"");
      out.print( activeClass);
      out.write("\">\n");
      out.write("                                <a href=\"home?page=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a>\n");
      out.write("                            </li>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            <div class=\"button-group\">\n");
      out.write("                <div class=\"button-group\">\n");
      out.write("                    <form method=\"post\" action=\"delete\">\n");
      out.write("                        <div class=\"search-bar\">\n");
      out.write("                            <input type=\"text\" class=\"search-input\" name=\"delete\" placeholder=\"Search...\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.delete}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            <button class=\"search-btn\">Delete</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <form method=\"get\" action=\"addform\" >\n");
      out.write("                    <button class=\"add-btn\">Add</button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
