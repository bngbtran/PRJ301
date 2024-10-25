package Servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet 
    {
        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                HttpSession session = request.getSession();
                session.removeAttribute("username");
        
                response.sendRedirect("LoginPage.html");
            }
        
//------------------------------------------------------------------------------

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                doGet(request, response);
            }
    }