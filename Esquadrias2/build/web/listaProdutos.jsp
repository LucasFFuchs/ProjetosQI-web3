<%@page import="model.ProdutosDAO"%>
<%@page import="model.Produtos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Lista de Produtos</title>
        <style>
            body {
                background: #192A56;
                font-family: Arial, sans-serif;
                color: white;
                text-align: center; 
                margin: 0;
                padding: 0;
            }
            
            h1 {
                font-size: 80px;
                margin-top: 100px;
                font-weight: bold;
                color: black;
            }
            
            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 30px;
            }
            
            th, td {
                padding: 10px;
                border-bottom: 1px white;
                font-weight: bold;
            }
            
            th {
                font-size: 24px;
            }
            
            td {
                font-size: 18px;
            }
            
            a {
                display: block;
                font-size: 30px;
                margin-top: 30px;
                color: black;
                text-decoration: none;
                font-weight: bold;
            }
            
            a:hover {
                color: gray;
            }
        </style>
    </head>
    <body>
        <h1>Lista de Produtos</h1>
        <table>
            <thead>
                <th>ID</th>
                <th>PRODUTO</th>
                <th>ESTOQUE</th>
                <th>VALOR</th>
            </thead>
            <tbody>
                <%
                ProdutosDAO e = new ProdutosDAO();
                for (Produtos item : e.listarProdutos()){
                %>
                <tr>
                    <td><%= item.getIdProduto() %></td>
                    <td><%= item.getProduto() %></td>
                    <td><%= item.getEstoque() %></td>
                    <td><%= item.getValor() %></td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
        
        <a href='home.jsp' style="margin-top: 500px;">Home</a>
    </body>
</html>