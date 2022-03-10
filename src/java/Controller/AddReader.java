/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Dao;
import Model.reader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddReader extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        Dao d = new Dao();
        int id = d.createIDReader(d.getListReader());
        String name = request.getParameter("name_reader");
        String cmnd = request.getParameter("identify");
        int idBook = Integer.parseInt(request.getParameter("id_book"));
        Date da = new Date();
        int month = da.getMonth()+1;
        int year = da.getYear() + 1900;
        String ngayMuon = da.getDate()+"/"+month+"/"+year;
        String ngayTra = request.getParameter("end_day");
        String stt = "";
        
        reader r = new reader(id, name, idBook, cmnd, ngayMuon,ngayTra , stt);
        
        boolean check = d.AddReader(r);
        if (check) {
            List<reader> listReader = d.getListReader();
            HttpSession session = request.getSession();
            session.setAttribute("readerList", listReader);
            request.getRequestDispatcher("loadDangMuon").forward(request, response);
        } else {
            request.setAttribute("errorString", r.toString());
            request.getRequestDispatcher("addReader.jsp").forward(request, response);
        }
        
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
