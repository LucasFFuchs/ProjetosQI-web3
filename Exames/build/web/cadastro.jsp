<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        <form action="#",method="post">
            <h2>Novo exame</h2>
            <input type="text" name='exame' placeholder="Digite o nome do exame aqui" required>
            <br><br>
            <input type="number" name="valor" placeholder='Digite o valor do exame' min='1' max='100'
                   step='0.01' required>
            <br><br>
            <select name='especialidade' required> 
                <option>Selecione a especialidade</option>
                <option value='Gastro'>Gastro</option>
                <option value='Dentista'>Dentista</option>
                <option value='Pediatra'>Pediatra</option>
                <option value='Neuro'>Neuro</option>
            </select>
            <br><br>
            <input type="submit" value='Cadastrar'>
        </form>
        <hr>
        <a href="home.jsp">Página inicial</a>
        
    </body>
</html>
