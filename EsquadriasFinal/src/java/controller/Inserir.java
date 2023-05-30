
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Produtos;
import model.ProdutosDAO;


@WebServlet(name = "Inserir", urlPatterns = {"/Inserir"})
public class Inserir extends HttpServlet {


    private String produto;
    private int estoque;
    private double valor;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
        
        
        this.produto = request.getParameter("produto");
        this.estoque = Integer.parseInt(request.getParameter("estoque"));
        this.valor = Double.parseDouble(request.getParameter("valor"));
        
        try{
            
            Produtos produtos = new Produtos(this.produto, this.estoque, this.valor);
                
            ProdutosDAO prodDao = new ProdutosDAO();
            prodDao.adicionarProduto(produtos);
            response.sendRedirect("listaProdutos.jsp");
          
        }catch (SQLException | ClassNotFoundException erro) {
            try (PrintWriter out = response.getWriter()) {
            
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Exames</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Ocorreu um erro :(</h1>");
                out.println("</body>");
                out.println("</html>");
        }

        
        
        
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
