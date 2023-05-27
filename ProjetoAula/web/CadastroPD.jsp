<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produto</title>
    </head>
    
    <body> 
        <h1>Cadastro de Produtos</h1>
    <form>
        <div>
        <table> 
        <tr>
            <th>Identificação</th>
            <th>Código</th>
            <th>M2</th>
        </tr>
        <div class="input-box">
        <tr>
            <td>Janela 2 folhas</td>   
            <td> 07803472</td>
            <td>550</td>
            <td>
                <button id="Edit">
                   <ion-icon name="save-outline"></ion-icon>
                </button>
            </td>
           
            <td>
                <button id="Clear">
                    <ion-icon name="trash-outline"></ion-icon>
                </button>
            </td>
        </tr>
        
       </div>
          
    </table>  
       <button>
           <ion-icon name="duplicate-outline"></ion-icon>
        </button>
       
    </form>
         <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </body>
</html>
