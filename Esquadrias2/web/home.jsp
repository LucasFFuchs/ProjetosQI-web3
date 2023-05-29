<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <style>
        body {
            background: #192A56;
            font-family: Arial, sans-serif;
            color: black;
            text-align: center;
        }
        
        h1 {
            font-size: 80px;
            margin-top: 100px;
        }
        
        .button-container {
            display: flex;
            justify-content: center;
            margin-top: 30px;
        }
        
        .button {
            display: inline-block;
            font-size: 30px;
            color: white;
            background-color: transparent;
            border: none;
            padding: 10px 20px;
            margin: 0 10px;
            text-decoration: none;
            transition: background-color 0.3s;
        }
        
        .button:hover {
            background-color: #333;
        }
    </style>
</head>
<body>
    <h1>Página Inicial</h1>
    <div class="button-container">
        <a href="listaProdutos.jsp" class="button">LISTA DE PRODUTOS</a>
        <a href="crud.jsp" class="button">ALTERAÇÃO DE DADOS</a>
    </div>
</body>
</html>