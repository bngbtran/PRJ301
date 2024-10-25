package Servlet;

import Model.*;
import Dao.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.logging.*;
import javax.servlet.annotation.*;
import org.json.simple.parser.*;

@WebServlet(name = "CheckLoginServlet", urlPatterns = {"/checklogin"})

public class CheckServlet extends HttpServlet 
    {
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                try 
                    {
                        String username = request.getParameter("username");
                        String password = request.getParameter("password");
                        
                        UserDAO userDAO = new UserDAO();
                        List<User> userList = userDAO.getUsers();
                        
                        boolean loggedIn = false;
                        for (User user : userList) 
                            {
                                if (user.getUsername().equals(username) && user.getPassword().equals(password)) 
                                    {
                                        loggedIn = true;
                                        break;
                                    }
                            }
                        if (loggedIn) 
                            {
                                response.sendRedirect("result-login?status=success");
                            }
                        else 
                            {
                                response.sendRedirect("result-login?status=fail");
                            }
                    }
                catch (ParseException ex) 
                    {
                        Logger.getLogger(CheckServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
    }