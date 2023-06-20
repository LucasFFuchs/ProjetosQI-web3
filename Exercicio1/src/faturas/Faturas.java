package faturas;

public class Faturas 
{
private String numero;
private String descriçao;
private int quantidade;
private double preço;


public String getnumero() {
return numero;
}

public String getdescriçao() {
return descriçao;
}

public int getquantidade() {
return quantidade;
}

public double getpreço() {
return preço;
}


public void setnumero(String numero) {
this.numero = numero;
}

public void setdescriçao(String descriçao) {
this.descriçao = descriçao;
}

public void setquantidade(int quantidade) {
this.quantidade = quantidade;
}

public void setpreço(int preço) {
this.preço = preço;
}

}