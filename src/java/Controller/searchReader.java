package Controller;

import DAO.Dao;
import Model.Book;
import Model.reader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchReader extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Dao d = new Dao();
        String id = request.getParameter("name");
        List<reader> listSearch = d.getListReaderByName(id);
        for (reader r : listSearch) {
            Book b = d.getBookByID(r.getBookid()+"");
            out.println("<tr>\n" +
"                                                        <td>"+r.getId()+"</td>\n" +
"                                                        <td>"+r.getName()+"</td>\n" +
"                                                        <td>"+r.getIndentityCard()+"</td>\n" +
"                                                        <td>"+b.getName()+"</td>\n" +
"                                                        <td>"+r.getStartDay()+"</td>\n" +
"                                                        <td>"+r.getEndDay()+"</td>\n" +
"                                                        <td id=\"confirmR"+r.getId()+"\">\n" +
"                                                            <button onclick=\"ConfirmR('"+r.getId()+"')\" type=\"submit\"\n" +
"                                                                    class=\"btn btn-success  btn-warning\"\n" +
"                                                                    >Chưa Trả\n" +
"                                                                sách</button>\n" +
"                                                        </td>\n" +
"                                                        <td>"+"</td>\n" +
"                                                    </tr>");
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
