package model;

import java.sql.SQLException;

public class Usuarios {
    private int idUsuario;
    private String nome;
    private String senha;

    public Usuarios() {}

    public Usuarios(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public boolean verificaCredenciais() throws ClassNotFoundException, SQLException {
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        Usuarios usuarioBanco = usuariosDAO.listOneUsuarios(this.nome);
        
        if (usuarioBanco.getNome() != null && usuarioBanco.getNome().equals(this.nome)) {
            
            return this.senha.equals(usuarioBanco.getSenha());
        } else {
            
            return false;
        }
    }  
}
