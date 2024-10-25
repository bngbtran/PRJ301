<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8" %>
<%@ page import = "java.io.*" %>

<%
    String productName = request.getParameter("product-name");
    int productPrice = Integer.parseInt(request.getParameter("product-price"));
    String status = request.getParameter("status");

    try 
        {
            File file = new File("C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Product.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(productName + ", " + productPrice + ", " + status + "\n");
            writer.close();
        } 
    catch (IOException e) 
        {
            e.printStackTrace();
        }
    response.sendRedirect("WishListPage.jsp");
%>