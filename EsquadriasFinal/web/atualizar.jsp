
<!DOCTYPE html>
<html>
<head>

    <title>Atualizar</title>
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
        
        input[type="number"],
        input[type="text"] {
            margin-bottom: 10px;
            padding: 8px;
            width: 250px;
            border-radius: 4px;
            border: none;
        }
        
        input[type="submit"],
        a.button {
            padding: 12px 24px;
            background-color: #3498DB;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s ease;
            border: none;
            cursor: pointer;
            display: inline-block;
            margin-top: 10px;
        }
        
        input[type="submit"]:hover,
        a.button:hover {
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
    <script>
        function confirmacao() {
            var resposta = confirm("Tem certeza de que deseja deletar?");
            if (resposta) {
                return true;
            } else {
                return false;
            }
        }
    </script>
</head>
<body>
    <form action='Atualizar' method='post'>
        <input type='number' name='id_produto' placeholder='Índice do produto' required>
        <br>
        <input type='text' name='produto' placeholder='Nome do produto' required>
        <br>
        <input type='number' name='estoque' min='0' placeholder="Quantidade no estoque" required>
        <br>
        <input type='number' name='valor' step='0.01' min='0' placeholder="Valor do produto" required>
        <br>
        <input type='submit' value='Registrar' onclick="return confirmacao();">
    </form>
        <a href='home.jsp' style="margin-top: 500px;">Home</a>
</body>
</html>