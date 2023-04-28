package model;

public class User {
    
    //Atributos
    private String userName;
    private String userPass;
    private String usercpf;
  
    //Método construtor
    public User(String user, String pass){
        this.userName = user;
        this.userPass = pass;
    }
    
    //Getters e Setters

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPass() {
        return userPass;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    public String getUsercpf() {
        return usercpf;
    }
    public void setUsercpf(String usercpf) {
        this.usercpf = usercpf;
    }
    
    //toString - método para representação geral do objeto

    @Override
    public String toString() {
        return "Nome:" + userName + "<br> CPF:" + usercpf;
    }   
    
    //Métodos gerais
    public boolean isLogged(){
        return(this.userName.equals("Lucas")
                && this.userPass.equals("senha1234"));
    }    
    
}//Fim da classe