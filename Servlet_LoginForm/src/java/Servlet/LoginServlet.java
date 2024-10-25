package Servlet;

import Dao.*;
import Model.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})

public class LoginServlet extends HttpServlet 
    {
        private UserDAO userDAO;

        @Override
        public void init() 
            {
                userDAO = new UserDAO();
            }
        
//------------------------------------------------------------------------------

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
                {
                    request.getRequestDispatcher("LoginPage.html").forward(request, response);
                }
    }