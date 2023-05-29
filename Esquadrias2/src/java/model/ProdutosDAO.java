package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProdutosDAO {
    private static Connection conn;

    public ProdutosDAO() throws ClassNotFoundException, SQLException {
        conn = MyConnection.getConnection();
    }
    //Insert
    public void adicionarProduto(Produtos produto) throws SQLException {
        try{
            String query = "INSERT INTO produtos (produto, estoque, valor) VALUES (?, ?, ?)";

            try (PreparedStatement prep = conn.prepareStatement(query)) {
                prep.setString(1, produto.getProduto());
                prep.setInt(2, produto.getEstoque());
                prep.setDouble(3, produto.getValor());
                
                prep.execute();
            }
        }catch(SQLException erro){
            System.out.println("Erro no insert");
        }
    }//Fim do insert
    
    
    //Listar os registros do BD
    public ArrayList<Produtos> listarProdutos() throws SQLException {
        ArrayList<Produtos> list = new ArrayList<>();
                
        String query = "SELECT * FROM produtos";

        PreparedStatement prep = conn.prepareStatement(query);
        ResultSet result = prep.executeQuery();

        while (result.next()) {
            Produtos e = new Produtos();
            e.setIdProduto(result.getInt("id_produto"));
            e.setProduto(result.getString("produto"));
            e.setEstoque(result.getInt("estoque"));
            e.setValor(result.getDouble("valor"));
            
            list.add(e);
        }

        return list;
    }//Fim do método list
    
    
    
    //Atualizar
    public void atualizarProduto(Produtos produto) throws SQLException {
        String query = "UPDATE produtos SET produto = ?, estoque = ?, valor = ? WHERE id_produto = ?";

        try (PreparedStatement prep = conn.prepareStatement(query)) {
            prep.setString(1, produto.getProduto());
            prep.setInt(2, produto.getEstoque());
            prep.setDouble(3, produto.getValor());
            prep.setInt(4, produto.getIdProduto());
            
            prep.execute();
        }
    }//Fim do método atualizar
    
    
    
    //Excluir
    public void excluirProduto(int idProduto) throws SQLException {
        String query = "DELETE FROM produtos WHERE id_produto = ?";

        try (PreparedStatement prep = conn.prepareStatement(query)) {
            prep.setInt(1, idProduto);
            prep.execute();
        }
    }//Fim do mérodo excluir
    
    //Selecionar apenas um registro
    public Produtos listarUmProduto(int i) throws SQLException{
        String sql = "SELECT * FROM produtos WHERE id_produto = ?";
        PreparedStatement prep = conn.prepareStatement(sql);
        prep.setInt(1, i);
        ResultSet result = prep.executeQuery();

        Produtos produto = new Produtos();

        if(result.next()){
            produto.setIdProduto(result.getInt("id_produto"));
            produto.setProduto(result.getString("produto"));
            produto.setEstoque(result.getInt("estoque"));
            produto.setValor(result.getDouble("valor"));

        }
        return produto;
    }
}