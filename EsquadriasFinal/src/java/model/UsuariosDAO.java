package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO {
    private static Connection conn;

    public UsuariosDAO() throws ClassNotFoundException, SQLException {
        conn = MyConnection.getConnection();
    }

    public Usuarios listOneUsuarios(String nome) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE nome = ?";

        PreparedStatement prep = conn.prepareStatement(query);
        prep.setString(1, nome);

        ResultSet result = prep.executeQuery();

        Usuarios user = new Usuarios();

        if (result.next()) {
            user.setIdUsuario(result.getInt("id_usuario"));
            user.setNome(result.getString("nome"));
            user.setSenha(result.getString("senha"));
        }

        return user;
    }

    public List<Usuarios> listAllUsuarios() throws SQLException {
        String query = "SELECT * FROM usuarios";
        PreparedStatement prep = conn.prepareStatement(query);
        ResultSet result = prep.executeQuery();

        List<Usuarios> usuariosList = new ArrayList<>();

        while (result.next()) {
            Usuarios user = new Usuarios();
            user.setIdUsuario(result.getInt("id_usuario"));
            user.setNome(result.getString("nome"));
            user.setSenha(result.getString("senha"));
            usuariosList.add(user);
        }

        return usuariosList;
    }

    public boolean verificarCredenciais(String nome, String senha) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE nome = ? AND senha = ?";

        PreparedStatement prep = conn.prepareStatement(query);
        prep.setString(1, nome);
        prep.setString(2, senha);

        ResultSet result = prep.executeQuery();

        return result.next();
    }
}