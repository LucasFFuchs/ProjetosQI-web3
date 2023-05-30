
package model;


public class Produtos {
    
    private int idProduto;
    private String produto;
    private int estoque;
    private double valor;

    public Produtos() {
    }

    public Produtos(int idProduto, String produto, int estoque, double valor) {
        this.idProduto = idProduto;
        this.produto = produto;
        this.estoque = estoque;
        this.valor = valor;
    }

    public Produtos(String produto, int estoque, double valor) {
        this.produto = produto;
        this.estoque = estoque;
        this.valor = valor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
     
    
}
