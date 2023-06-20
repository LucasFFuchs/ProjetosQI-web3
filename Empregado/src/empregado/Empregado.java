
package empregado;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public double getSalario(){
        return salario;
    }    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
}
