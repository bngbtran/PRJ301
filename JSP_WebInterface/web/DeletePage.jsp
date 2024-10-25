<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding = "UTF-8" %>

<html>
    <head>
        <title>Delete</title>
        
        <style>
            body
                {
                    background-color: #C8E2B1;
                }
        </style>
        
    </head>
    
    <body>
        <%
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
        %>
        <h1 style = "margin-left: 580px; margin-top: 250px;">Deleted successfully !!!</h1>
        <a style = "margin-left: 700px;" href = "WishListPage.jsp">Return</a>
    </body>
    
</html>