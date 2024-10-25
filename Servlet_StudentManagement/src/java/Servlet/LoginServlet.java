package Servlet;

import Dao.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.simple.parser.*;

public class LoginServlet extends HttpServlet 
    {
        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                HttpSession session = request.getSession();
                if (session.getAttribute("username") != null) 
                    {
                        response.sendRedirect("HomeServlet");
                    } 
                else 
                    {
                        response.setContentType("text/html");
                        response.getWriter().println("<html><head><title>Login</title></head><body>");
                        response.getWriter().println("<h1>Login</h1>");
                        response.getWriter().println("<form method = 'post' action = 'login'>");
                        response.getWriter().println("Username: <input type = 'text' name = 'username'><br>");
                        response.getWriter().println("Password: <input type = 'password' name = 'password'><br>");
                        response.getWriter().println("<input type = 'submit' value = 'Login'>");
                        response.getWriter().println("</form>");
                        response.getWriter().println("</body></html>");
                    }
            }
        
//------------------------------------------------------------------------------

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {            
                try 
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
                                HttpSession session = request.getSession();
                                session.setAttribute("username", username);
                                response.sendRedirect("HomeServlet");
                            }
                        else 
                            {
                                response.sendRedirect("FailPage.html");
                            }
                    }
                catch (ParseException ex) 
                    {
                        Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
    }