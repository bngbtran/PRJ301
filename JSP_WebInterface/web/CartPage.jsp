<%@ page import = "java.io.BufferedReader" %>
<%@ page import = "java.io.FileReader" %>

    <style>
        button 
            {
                display: block;
                margin: 20px auto;
                padding: 10px 20px;
                background-color: #C8E2B1;
                color: black;
                border: none;
                cursor: pointer;
                text-decoration: none;
                border-radius: 10px;
            }
    </style>

<%
    String filePath = "C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Cart.txt";
    StringBuilder content = new StringBuilder();

    try 
        {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) 
                {
                    content.append(line).append("<br>");
                }
            br.close();
        } 
    catch (Exception e) 
        {
            e.printStackTrace();
        }
%>

<html>
    <head>
        <title>Cart</title>
        <link rel = "stylesheet" href = "./Css/CartPageStyle.css">
    </head>
    
    <body>
        <div class = "cart">
            <h1>CART</h1>
            <pre><%= content.toString()%></pre>
            <button> <a href = "WishListPage.jsp">Return</button>
        </div>
    </body>
</html>