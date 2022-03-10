package Controller;

import DAO.Dao;
import Model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class EditBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        request.setCharacterEncoding("UTF-8");
        try {
            Dao d = new Dao();
            
            String id = request.getParameter("bID");
            
            String name = request.getParameter("name");
            String cate = request.getParameter("category");
            String quantity = request.getParameter("count");
            Part pt = request.getPart("fileImage");
            
            
            String realPath = "D:\\FPTU\\Spring2022\\SWP\\code\\managerLibrary\\web\\Resources\\Photo";
            //request.getRequestDispatcher("jsp.jsp").forward(request, response);
            String filename = Paths.get(pt.getSubmittedFileName()).getFileName().toString();
            
            if (!Files.exists(Paths.get(realPath))) {
                Files.createDirectories(Paths.get(realPath));
            }
            
            Book oldB = d.getBookByID(id);
            
            String namefile = oldB.getImg();
            
            if (!filename.equals("")) {
                pt.write(realPath + "/" + filename);
                namefile = filename;
            }
            Book b = new Book(Integer.parseInt(id), name, Integer.parseInt(cate), Integer.parseInt(quantity), namefile, oldB.getCreateDay());

            boolean checkaddbook = d.updateBook(b);
            if (checkaddbook) {
                request.getRequestDispatcher("loadManagerBook").forward(request, response);
            } else {
                request.getRequestDispatcher("loadEditBookPage?bID="+id).forward(request, response);
            }
        } catch (Exception e) {
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
