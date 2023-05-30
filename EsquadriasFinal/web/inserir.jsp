<%@page import="model.Produtos" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Inserir</title>
    <style>
        body {
            background: #192A56;
            font-family: Arial, sans-serif;
            color: white;
            text-align: center;
            padding-top: 100px;
        }
        
        form {
            margin-top: 30px;
        }
        
        input[type="text"],
        input[type="number"] {
            margin-bottom: 10px;
            padding: 8px;
            width: 250px;
            border-radius: 4px;
            border: none;
        }
        
        input[type="submit"] {
            padding: 12px 24px;
            background-color: #3498DB;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s ease;
            border: none;
            cursor: pointer;
        }
        
        input[type="submit"]:hover {
            background-color: #2980B9;
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
    <form action='Inserir' method='post'>
        <input type='text' placeholder="Nome do produto" name='produto' required>
        <br>
        <input type='number' min='0' placeholder="Quantidade no estoque" name='estoque' required>
        <br>
        <input type='number' step='0.01' min='0' placeholder="Valor do produto" name='valor' required>
        <br><br>
        <input type='submit' value='Registrar'>
    </form>
    <a href='home.jsp' style="margin-top: 500px;">Home</a>
</body>
</html>
