package Controller;

import Dao.TinTucDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.TinTuc;

public class ChiTietServlet extends HttpServlet 
    {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) 
                    {          
                        String id_raw = request.getParameter("id");
                        int id = Integer.parseInt(id_raw);
                        TinTucDAO ttdao = new TinTucDAO();

                        TinTuc tintuc = ttdao.getTinTuc(id);

                        request.setAttribute("tintuc", tintuc);
                        request.getRequestDispatcher("DetailPage.jsp").forward(request, response);
                    }
            }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException 
            {
                processRequest(request, response);
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