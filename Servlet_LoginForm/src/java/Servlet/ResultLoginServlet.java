package Servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(name = "ResultLoginServlet", urlPatterns = {"/result-login"})

public class ResultLoginServlet extends HttpServlet 
    {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
                {
                    response.setContentType("text/html; charset = UTF-8");
                    String status = request.getParameter("status");

                    String message;
                    if (status.equals("success")) 
                        {
                            request.getRequestDispatcher("SuccessPage.html").forward(request, response);
                        }
                    else 
                        {
                            request.getRequestDispatcher("FailPage.html").forward(request, response);
                        }
                    response.setContentType("text/html");
                }
    }