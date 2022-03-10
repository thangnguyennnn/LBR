package Controller;

import DAO.Dao;
import Model.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchBook extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String txtSearch = request.getParameter("txtSearch");
        Dao d = new Dao();
        List<Book> list = d.getListSearchBook(txtSearch);

        for (Book book : list) {
            String cate = d.getNameCateByID(book.getCateID()+"");
            out.println("<tr>\n"
                    + "                                                    <td>"+book.getId()+"</td>\n"
                    + "                                                    <td>"+book.getName()+"</td>\n"
                            +                                             "<td>"+cate+"</td>\n"
                    + "                                                    <td style=\"text-align: center;\">"+book.getQuantity()+"</td>\n"
                    + "                                                    <td>"+book.getCreateDay()+"</td>\n"
                    + "                                                    <td style=\"text-align: center;\"><img\n"
                    + "                                                            src=\"Resources/Photo/"+book.getImg()+"\" width=\"35\"\n"
                    + "                                                            height=\"50\">\n"
                    + "                                            <figcaption>\n"
                    + "                                                <a href=\"Resources/Photo/"+book.getImg()+"\"\n"
                    + "                                                   style=\"font-size: 14px;\" target=\"_blank\">Xem chi tiết</a>\n"
                    + "                                            </figcaption>\n"
                    + "                                            <td><a\n"
                    + "                                                    href=\"loadEditBookPage?bID="+book.getId()+"\"\n"
                    + "                                                    class=\"btn btn-sm btn-info\">Chỉnh sửa</a></td>\n"
                    + "                                            <td>\n"
                    + "                                                <button type=\"button\" class=\"btn btn-primary btn-danger\"\n"
                    + "                                                        data-toggle=\"modal\"\n"
                    + "                                                        data-target=\"#staticBackdrop-b"+book.getId()+"\"\n"
                    + "                                                        style=\"padding-bottom: 5px; padding-top: 3px; font-size: 14px\">Xóa</button>\n"
                    + "                                            </td>\n"
                    + "                                            </tr>");
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
