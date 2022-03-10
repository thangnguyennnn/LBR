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
public class AddBook extends HttpServlet {

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

            String name = request.getParameter("name");
            String cate = request.getParameter("category");
            String quantity = request.getParameter("count");
            Part pt = request.getPart("fileImage");
            String realPath = "D:\\FPTU\\Spring2022\\SWP\\code\\managerLibrary\\web\\Resources\\Photo";
            String filename = Paths.get(pt.getSubmittedFileName()).getFileName().toString();
            if(!Files.exists(Paths.get(realPath))){
                Files.createDirectories(Paths.get(realPath));
            } 

            String namefile = null;
            if(!filename.equals("")){
                pt.write(realPath+"/"+filename);
                namefile = filename;
            } 
            Date da = new Date();
            int year = da.getYear()-100;
            String creatDay = da.getDate()+"/"+da.getMonth()+"/"+year;
            int id = d.creatIDUser("Book");
            Book b = new Book(id, name, Integer.parseInt(cate), Integer.parseInt(quantity),namefile ,creatDay);
            
            boolean checkaddbook = d.addBook(b);
            if(checkaddbook)
                request.getRequestDispatcher("loadManagerBook").forward(request, response);
            else{
                request.getRequestDispatcher("loadAddBookPage").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("loadAddBookPage").forward(request, response);
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
