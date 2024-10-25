package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddToCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset = \"UTF-8\">\n");
      out.write("        <title>Add to cart</title>\n");
      out.write("        <link rel = \"stylesheet\" href = \"./Css/AddToCartStyle.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            #cart \n");
      out.write("                {\n");
      out.write("                    border-radius: 10px;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <h1>ADD TO CART</h1>\n");
      out.write("        <form action = \"AddToCart.jsp\" method = \"post\">\n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Product</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Select</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                ");
 
                    String filePath = "C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Product.txt";
                    try 
                        {
                            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath));
                            String line;
                            while ((line = reader.readLine()) != null) 
                                {
                                    String[] productInfo = line.split(", ");
                                    String productName = productInfo[0];
                                    double price = Double.parseDouble(productInfo[1]);
                
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(productName);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(price);
      out.write("</td>\n");
      out.write("                        <td><input type = \"checkbox\" name = \"selectedProducts\" value = \"");
      out.print(productName);
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                ");

                        }
                    reader.close();
                        } 
                    catch (Exception e) 
                        {
                            e.printStackTrace();
                        }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("            <input id=\"cart\" type = \"submit\" value = \"ADD TO CART\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("<!----------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("            ");

                if (request.getMethod().equals("POST")) 
                    {
                        String[] selectedProducts = request.getParameterValues("selectedProducts");
                        if (selectedProducts != null && selectedProducts.length > 0) 
                            {
                                String cartFilePath = "C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Cart.txt";
                                try 
                                    {
                                        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(cartFilePath, true));
                                        for (String product : selectedProducts) 
                                            {
                                                writer.write(product);
                                                writer.newLine();
                                            }
                                        writer.close();
                                        out.println("<p>Selected products have been added to the cart.</p>");
                                    }
                                catch (Exception e) 
                                    {
                                        e.printStackTrace();
                                    }
                            }
                    }
            
      out.write("\n");
      out.write("\n");
      out.write("            <button style = \"border-radius: 10px;\"> <a href = \"WishListPage.jsp\">Return</button>\n");
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
