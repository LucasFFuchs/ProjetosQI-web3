<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <style>
    body {
      background: #192A56;
      font-family: Arial, sans-serif;
      color: white;
      text-align: center;
      padding-top: 100px;
    }
    
    h1 {
      font-size: 80px;
    }
    
    .button-container {
      margin-top: 50px;
    }
    
    .button-container a {
      display: inline-block;
      margin: 10px;
      padding: 12px 24px;
      background-color: #3498DB;
      color: white;
      text-decoration: none;
      border-radius: 4px;
      transition: background-color 0.3s ease;
    }
    
    .button-container a:hover {
      background-color: #2980B9;
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
