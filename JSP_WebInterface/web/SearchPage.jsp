<%@page import="java.util.List"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.util.Scanner"%>
<%@page import="java.io.File"%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<%@ page import = "java.io.BufferedReader" %>
<%@ page import = "java.io.FileReader" %>

<html>
    <head>
        <title>Search</title>
        <style>
            * 
                {
                    font-family: Arial, Helvetica, sans-serif;
                }

            body 
                {
                    background-color: white;
                    margin: 0;
                    padding: 30px;
                    margin-left: 550px;
                    margin-top: 30px;
                }

            h1 
                {
                    margin-left: 60px;
                    color: #333;
                }

            button 
                {
                    background-color: #C8E2B1;
                    border: none;
                    color: black;
                    padding: 10px 20px;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 16px;
                    margin-top: 20px;
                    cursor: pointer;
                    margin-left: 80px;
                    border-radius: 10px;
                }

            button a 
                {
                    color: black;
                    text-decoration: none;
                }
        </style>
        
    </head>

    <body>
        <h1>SEARCH</h1>
        <% 
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
        %>
        <button><a href = "WishListPage.jsp">Return</a></button>
    </body>
    
</html>