package Servlet;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import org.json.simple.*;

@WebServlet(name = "AddStudent", urlPatterns = {"/add"})

public class AddStudent extends HttpServlet 
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        List<Student> studentList = new ArrayList<>();

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                processRequest(request, response);
                request.getRequestDispatcher("AddStudent.html").forward(request, response);
            }
        
//------------------------------------------------------------------------------
        
        private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
            {
                String name = (String) request.getSession().getAttribute("name");
                request.setAttribute("name", name);
            }
        
//------------------------------------------------------------------------------

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
            {
                String name = request.getParameter("name");
                String id = request.getParameter("id");
                String password = request.getParameter("password");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String address = request.getParameter("address");
                String gender = request.getParameter("gender");
                LocalDateTime dateTime = LocalDateTime.now();
                String createdAt = dateTime.format(formatter);
                
                try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\PRJ301\\Servlet_StudentManagement\\web\\WEB-INF\\student.txt", true))) 
                    {
                        writer.println(name + "," + id + "," + password + "," + email + "," + phone + "," + address + "," + gender + "," + createdAt);
                    } 
                catch (IOException e) 
                    {
                        e.printStackTrace();
                    }
                request.getRequestDispatcher("SuccessPage.html").forward(request, response);
            }    
    }