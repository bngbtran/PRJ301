package Servlet;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
import javax.servlet.*;
import javax.servlet.http.*;
import static org.apache.tomcat.jni.Buffer.*;
import org.json.simple.*;

public class HomeServlet extends HttpServlet 
    {
        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                HttpSession session = request.getSession();
                if (session.getAttribute("username") == null) 
                    {
                        response.sendRedirect("LoginPage.html");
                    } 
                else 
                    {
                        List<Student> studentList = readStudentListFromFile("C:\\Users\\Administrator\\Desktop\\PRJ301\\Servlet_StudentManagement\\web\\WEB-INF\\student.txt");

                        response.setContentType("text/html");
                        response.getWriter().println("<html><head><title>Home</title>");
                        response.getWriter().println("<style>");
                        response.getWriter().println("body { margin-top:50px; font-family: Time New Romans; background-color: #B8E1FF; }");
                        response.getWriter().println("h1 { color: black; text-align: center; }");
                        response.getWriter().println("h2 { color: black; text-align: center; font-size: xx-large; }");
                        response.getWriter().println("a { text-decoration: none; color: black; margin-right: 10px; }");
                        response.getWriter().println(".nav-container { display: flex; justify-content: center; margin-bottom: 10px; font-size: large; }");
                        response.getWriter().println(".nav-container a { margin-right: 20px; color: black; font-weight: bold; }");
                        response.getWriter().println("table { border-collapse: collapse; }");
                        response.getWriter().println(".table-container { display: flex; justify-content: center; }");
                        response.getWriter().println("th, td { border: 1px solid black;  padding: 15px; }");
                        response.getWriter().println(".search-container { text-align: right; margin-bottom: 10px; }");
                        response.getWriter().println(".search-container input{ border-radius: 20px; color: black; }");
                        response.getWriter().println(".delete-container { position: fixed; bottom: 20px; right: 20px; }");
                        response.getWriter().println(".delete-container input{ border-radius: 20px; color: black; }");
                        response.getWriter().println("</style>");
                        response.getWriter().println("</head><body>");
                        
//------------------------------------------------------------------------------
                        
                        response.getWriter().println("<h1>Welcome, " + session.getAttribute("username") + " !</h1>");
                        response.getWriter().println("<div class = 'nav-container'>");
                        response.getWriter().println("<a href = HomeServlet>Home</a>");
                        response.getWriter().println("<a href = LogoutServlet>Logout</a>");
                        response.getWriter().println("<a href = AddStudentPage.html>Add</a>");
                        response.getWriter().println("</div>");
                        
//------------------------------------------------------------------------------

                        response.getWriter().println("<div class = 'search-container'>");
                        response.getWriter().println("<form method = 'get' action = 'HomeServlet'>");
                        response.getWriter().println("Name: <input type = 'text' name = 'keyword'>");
                        response.getWriter().println("<input type = 'submit' value = 'Search'>");
                        response.getWriter().println("</form>");
                        response.getWriter().println("</div>");
                        
//------------------------------------------------------------------------------

                        String keyword = request.getParameter("keyword");

                        List<Student> filteredList = filterStudentList(keyword, studentList);
                        sortStudentList(filteredList);

                        response.getWriter().println("<h2>STUDENT LIST</h2>");

                        response.getWriter().println("<div class = 'table-container'>");
                        response.getWriter().println("<table>");
                        response.getWriter().println("<tr><th>ID</th><th>NAME</th><th>EMAIL</th><th>PHONE</th><th>ADDRESS</th><th>GENDER</th><th>CREATED AT</th></tr>");
                        for (Student student : filteredList) 
                            {
                                response.getWriter().println("<tr>");
                                response.getWriter().println("<td>" + student.getId() + "</td>");
                                response.getWriter().println("<td>" + student.getName() + "</td>"); 
                                response.getWriter().println("<td>" + student.getEmail() + "</td>");
                                response.getWriter().println("<td>" + student.getPhone() + "</td>");
                                response.getWriter().println("<td>" + student.getAddress() + "</td>");
                                response.getWriter().println("<td>" + student.getGender() + "</td>");
                                response.getWriter().println("<td>" + student.getCreatedAt() + "</td>");
                                response.getWriter().println("</tr>");
                            }
                        response.getWriter().println("</table>");
                        response.getWriter().println("</div>");

                        response.getWriter().println("<div class = 'delete-container'>");
                        response.getWriter().println("<form method = 'post' action = 'HomeServlet'>");
                        response.getWriter().println("<label for = 'id'>ID: </label>");
                        response.getWriter().println("<input type = 'text' id = 'id' name = 'id'>");
                        response.getWriter().println("<input type = 'submit' value = 'Delete'>");
                        response.getWriter().println("</form>");
                        response.getWriter().println("</div>");
                        
                        response.getWriter().println("</body></html>");
                    }
            }
        
//------------------------------------------------------------------------------

        private List<Student> readStudentListFromFile(String fileName) throws IOException 
            {
                List<Student> studentList = new ArrayList<>();
                Path filePath = Paths.get(fileName);

                try (Stream<String> lines = Files.lines(filePath)) 
                    {
                        lines.forEach(line -> 
                            {
                                String[] parts = line.split(",");
                                if (parts.length == 8) 
                                    {
                                        String name = parts[0];
                                        String id = parts[1];
                                        String password = parts[2];
                                        String email = parts[3];
                                        String phone = parts[4];
                                        String address = parts[5];
                                        String gender = parts[6];
                                        String createdAt = parts[7];
                                        Student student = new Student(name, id, password, email, phone, address, gender, createdAt);
                                        studentList.add(student);
                                    }
                            });
                    }
                return studentList;
            }
        
//------------------------------------------------------------------------------

        private List<Student> filterStudentList(String keyword, List<Student> studentList) 
            {
                List<Student> filteredList = new ArrayList<>();
                if (keyword == null || keyword.isEmpty()) 
                    {
                        filteredList = studentList;
                    } 
                else 
                    {
                        for (Student student : studentList) 
                            {
                                if (student.getName().toLowerCase().contains(keyword.toLowerCase())) 
                                    {
                                        filteredList.add(student);
                                    }
                            }
                    }
                return filteredList;
            }
        
//------------------------------------------------------------------------------

        private void sortStudentList(List<Student> studentList) 
            {
                Collections.sort(studentList, new Comparator<Student>() 
                    {
                        public int compare(Student student1, Student student2) 
                            {
                                return student2.getCreatedAt().compareTo(student1.getCreatedAt());
                            }
                    });
            }
        
//------------------------------------------------------------------------------

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                String idToDelete = request.getParameter("id");
                String filePath = "C:\\Users\\Administrator\\Desktop\\PRJ301\\Servlet_StudentManagement\\web\\WEB-INF\\student.txt";
                deleteStudent(filePath, idToDelete);
                response.sendRedirect("SuccessPage.html");
            }
        
//------------------------------------------------------------------------------

        private void deleteStudent(String filePath, String idToDelete) throws IOException 
            {
                File inputFile = new File(filePath);
                File tempFile = new File("temp.txt");

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                FileWriter writer = new FileWriter(tempFile);

                String lineToRemove;
                while ((lineToRemove = reader.readLine()) != null) 
                    {
                        String[] studentData = lineToRemove.split(",");
                        if (!studentData[1].equals(idToDelete)) 
                            {
                                writer.write(lineToRemove + System.lineSeparator());
                            }
                    }
                writer.close();
                reader.close();
                inputFile.delete();
                tempFile.renameTo(inputFile);
            }
    }