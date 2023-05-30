<%
    if(session.getAttribute("userNewSession") != null) {
        response.sendRedirect("home.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            background-color: #192A56;
            color: #fff;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        h1 {
            text-align: center;
            font-size: 48px;
            margin-bottom: 40px;
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }

        .fields {
            margin-bottom: 20px;
            padding: 12px;
            width: 300px;
            font-size: 20px;
        }

        button {
            padding: 12px 24px;
            font-size: 24px;
            background-color: #2980B9;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        p {
            text-align: center;
            margin-top: 40px;
            font-size: 20px;
        }
    </style>
</head>
<body>
    <h1>Login</h1>

    <form action="LoginController" method="post">
        <ion-icon name="person-circle-outline"></ion-icon>
        <input type="text" name="user" id="user" placeholder="Usuário" class="fields" required>

        <ion-icon name="lock-closed-outline"></ion-icon>
        <input type="password" id="pass" name="pass" placeholder="Senha" class="fields" required>

        <br><br>

        <button>Entrar</button>
    </form>
    <p>${mensagem}</p>

    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>