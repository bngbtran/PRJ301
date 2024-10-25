package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorHandleServlet extends HttpServlet 
    {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                response.setContentType("text/html; charset = UTF-8");
                try (PrintWriter out = response.getWriter()) 
                    {
                        out.println ("<!DOCTYPE html>");
                        out.println ("<html>");
                        out.println ("<head>");
                        out.println ("<title>Servlet ErrorHandleServlet</title>");            
                        out.println ("</head>");
                        out.println ("<body>");
                        out.println ("<h1>Servlet ErrorHandleServlet at: " + request.getContextPath() + "</h1>");
                        out.println ("</body>");
                        out.println ("</html>");
                    } 
            }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                try (PrintWriter out = response.getWriter()) 
                    {
                        out.println ("<!DOCTYPE html>");
                        out.println ("<html>");
                        out.println ("<head>");
                        out.println ("<title>Login</title>");
                        out.println ("<meta http-equiv = 'Content-Type' content = 'text/html; charset = UTF-8'>");
                        out.println ("</head>");
                        out.println ("<body>");
                        out.println ("<h1 style = 'color: red'>Invalid or Error Url</h1>");
                        out.println ("<a href = 'HomePage.jsp'>Back to home</a>");
                        out.println ("</body>");
                        out.println ("</html>");
                    }
            }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                processRequest(request, response);
            }

        @Override
        public String getServletInfo() 
            {
                return "Short description";
            }
    }