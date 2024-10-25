<%@ page language = "java" contentType = "text/html; charset=UTF-8"
    pageEncoding = "UTF-8"%>

<html>
    <head>
        <meta charset = "UTF-8">
        <title>Add to cart</title>
        <link rel = "stylesheet" href = "./Css/AddToCartPageStyle.css">
        
        <style>
            #cart 
                {
                    border-radius: 10px;
                }
        </style>
        
    </head>
    
    <body>
        <h1>ADD TO CART</h1>
        <form action = "AddToCartPage.jsp" method = "post">
        <table>
            
            <thead>
                <tr>
                    <th>Product</th>
                    <th>Price</th>
                    <th>Select</th>
                </tr>
            </thead>
            
            <tbody>
                <% 
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
                %>
                    <tr>
                        <td><%=productName%></td>
                        <td><%=price%></td>
                        <td><input type = "checkbox" name = "selectedProducts" value = "<%=productName%>"></td>
                    </tr>
                <%
                        }
                    reader.close();
                        } 
                    catch (Exception e) 
                        {
                            e.printStackTrace();
                        }
                %>
            </tbody>
        
        </table>

            <input id="cart" type = "submit" value = "ADD TO CART">

        </form>
            
<!----------------------------------------------------------------------------->

            <%
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
            %>

            <button style = "border-radius: 10px;"> <a href = "WishListPage.jsp">Return</button>
    </body>
</html>