<!DOCTYPE html>
<html>
<head>
  <title>CRUD</title>
  <style>
    body {
      background: #192A56;
      font-family: Arial, sans-serif;
      color: white;
      text-align: center;
      padding-top: 100px;
    }
    
    h1 {
      font-size: 40px;
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
  <h1>Alteração de dados</h1>
  <div class="button-container">
    <a href="atualizar.jsp">Atualizar dados</a>
    <a href="inserir.jsp">Inserir dados</a>
    <a href="deletar.jsp">Deletar dados</a>
  </div>
</body>
</html>
