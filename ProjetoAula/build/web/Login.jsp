<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/Login.css"/>
    </head>
  <body>
    <section>
        <div class="form-box">
            <div class="form-value">
                <form action="">
                    <h2>Login</h2>
                    <div class="inputbox">
                        <ion-icon name="person-outline"></ion-icon>
                        <input type="usuario" required>
                        <label for="">Usuário</label>
                    </div>
                       <div class="inputbox">
                        <ion-icon name="lock-closed-outline"></ion-icon>
                        <input type="senha" required>
                        <label for="">Senha</label>
                    </div>
                    <div class="forget"> 
                        <label for=""><input type="checkbox">Salvar. <a href="#">Recuperar Senha.</a></label> 
                    </div>
                    <button>Entrar</button>
                   
                </form>
            </div>
        </div>
     </section>
      <!-- Esse script e para Colocar os icones  -->
      <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>
