<%@ page import="Dao.*" %>
<%@ page import="java.io.*, java.util.*, java.util.logging.*" %>
<%@ page import="javax.servlet.*, javax.servlet.http.*" %>
<%@ page import = "org.json.simple.parser.*" %>

<%
    {
        try 
            {
                if (request.getMethod().equalsIgnoreCase("POST")) 
                    {
                        String username = request.getParameter("username");
                        String password = request.getParameter("password");

                        UserDAO userDAO = new UserDAO();
                        List<Model.User> userList = userDAO.getUsers();

                        boolean loggedIn = false;
                        for (Model.User user : userList) 
                            {
                                if (user.getUsername().equals(username) && user.getPassword().equals(password)) 
                                {
                                    loggedIn = true;
                                    break;
                                }
                            }
                        if (loggedIn) 
                            {
                                response.sendRedirect("WishListPage.jsp");
                            }
                        else 
                            {
                                response.sendRedirect("HomeLoginPage.html");
                            }
                    }
            }
        catch (ParseException ex) 
            {
            }
    }
%>