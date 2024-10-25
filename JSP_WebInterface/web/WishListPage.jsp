<%@page import = "java.io.BufferedReader"%>
<%@page import = "java.io.FileReader"%>
<%@page import = "java.util.ArrayList"%>
<%@page import = "java.util.List"%>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>

<html>
    <head>
        <meta http-equiv = "Content-Type" content = "text/html; charset = UTF-8">
        <title>Wish List Page</title>
        <link rel = "stylesheet" href = "./Css/WishListPageStyle.css">  
        
        <style>
            .text h1 
                {
                    margin-top: 30px;
                }
                    
            #delete 
                {
                    margin-top: 60px;
                    margin-left:  50%;
                    background-color: #C8E2B1;
                    width: 150px;
                    height: 40px;
                    font-weight: bold;
                    cursor: pointer;
                    color: black;
                    border-radius: 10px;
                }

            .AddToCart button 
                {
                    background-color: #C8E2B1;
                    border-radius: 10px;
                    width: 100px;
                    height: 30px;
                }

            .AddToCart a 
                {
                    color: black;
                    text-decoration: none;
                    font-weight: bold;
                }

            .addnew button 
                {
                    background-color: #C8E2B1;
                    border-radius: 10px;
                    width: 100px;
                    height: 30px;
                }

            .addnew a 
                {
                    color: black;
                }

            .menu 
                {
                    display: flex;
                    justify-content: flex-start;
                    margin-left: 100px;
                }

            table 
                {
                    border-collapse: collapse;
                    width: 90%;   
                    margin-left: 100px;
                    justify-content: center;
                }
        </style>
            
    </head>    
        
    <body>
        <%@include file = "CouponHeader.jsp" %>

<!----------------------------------------------------------------------------->

        <div class = "menu">
            <a href = "#">Home</a>
            <div>/</div>
            <a href = "#">Shop</a>
            <div>/</div>
            <div>My Wishlist</div>
        </div>

<!----------------------------------------------------------------------------->

        <div class = "text">
            <div>
                <h1>My Wishlist</h1>
            </div>

            <div>
                <h3>There are 5 products in this wishlist.</h3>
            </div>
        </div>

<!----------------------------------------------------------------------------->
        
            <form action = "DeletePage.jsp" method = "post">
                <table>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                            <th>Status</th>
                            <th>Delete</th>
                            <th>Contact</th>
                        </tr>
                    </thead>
                    
                    <tbody>
                        <% 
                            java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("C:/Users/Administrator/Desktop/PRJ301/JSP_WebInterface/web/WEB-INF/Product.txt"));
                            String line;
                            while ((line = reader.readLine()) != null) 
                                {
                                    String[] parts = line.split(", ");
                        %>
                            <tr>
                                <td><%= parts[0] %></td>
                                <td><%= parts[1] %></td>
                                <td><%= parts[2] %></td>
                                <td><input type = "checkbox" name = "deleteCheckbox" value="<%= line %>"></td>
                                <td><a id = "contact" href = "ContactUsPage.html">Contact us</a></td> 
                            </tr>
                        <% } %>
                    </tbody>
                    
                </table>
                    
                <input id = "delete" type = "submit" value = "Delete Selected">
                
            </form>
            <div class = "AddToCart">                           
                <button><a href = "AddToCartPage.jsp">Add to cart </a></button> 
            </div>

            <div class = "addnew">
                <button> <a href = "AddProductPage.html"> Add new </a></button>
            </div>          
    </body>
    
<!----------------------------------------------------------------------------->

        <%@include file = "Footer.html" %>
</html>