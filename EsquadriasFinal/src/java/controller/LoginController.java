package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 
import jakarta.servlet.http.HttpSession;
import model.Usuarios;

@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    //Atributos
    private String nome;
    private String senha;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        this.nome = request.getParameter("user");
        this.senha = request.getParameter("pass");
        
        Usuarios usuarioNovo = new Usuarios(this.nome,this.senha);
        
        try {

            if(usuarioNovo.verificaCredenciais()) {
                HttpSession session = request.getSession();
                session.setAttribute("userNewSession", usuarioNovo);
                request.setAttribute("usuarioNovo", usuarioNovo);
                request.getRequestDispatcher("home.jsp").forward(request, response);
            } else {
                try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Esquadrias</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<script>");
                    out.println("alert('Acesso negado');");
                    out.println("window.location.replace('index.jsp');");
                    out.println("</script>");
                    out.println("</body>");
                    out.println("</html>");
                }
            }
        } catch (SQLException | ClassNotFoundException erro) {
            PrintWriter out = response.getWriter();
            out.print("Ocorreu algum erro :(");
        
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
