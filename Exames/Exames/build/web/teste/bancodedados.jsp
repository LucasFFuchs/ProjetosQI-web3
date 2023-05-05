<%@page import="model.MyConnection"%>
<%
    if(MyConnection.getConnection()!= null){
        out.print("Conexão bem sucedida");
        out.print("Nome do Banco de dados: " + MyConnection.getConnection().getCatalog());
    }else{
        out.print("Erro de conexão");
    }
%>