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

/**
 *
 * @author HP
 */
public class searchInHistory extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Dao d = new Dao();
        String id = request.getParameter("name");
        List<reader> listSearch = d.getListReaderInHTRByName(id);
        for (reader r : listSearch) {
            Book b = d.getBookByID(r.getBookid()+"");
            out.println("<tr>\n" +
"                                                        <td>"+r.getId()+"</td>\n" +
"                                                        <td>"+r.getName()+"</td>\n" +
"                                                        <td>"+r.getIndentityCard()+"</td>\n" +
"                                                        <td>"+b.getName()+"</td>\n" +
"                                                        <td>"+r.getStartDay()+"</td>\n" +
"                                                        <td>"+r.getEndDay()+"</td>\n" +
"                                                        <td id=\"confirmR\">\n" +
"                                                            <button onclick=\"ConfirmR('"+"')\" type=\"submit\"\n" +
"                                                                    class=\"btn btn-success  btn-success\"\n" +
"                                                                    >???? tr??? Tr???\n" +
"                                                                s??ch</button>\n" +
"                                                        </td>\n" +
"                                                        <td>"+r.getStt()+"</td>\n" +
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
