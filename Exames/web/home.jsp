<%@include file="session/verify.jsp"%>
<%@page import="model.User"%>
<%  
    User userSession = (User)session.getAttribute("userNewSession");
%>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exames</title>
    </head>
    <body>
        <button onclick="window.location.href='session/logout.jsp'">Logout</button>
        
        <h1>Bem vindo <%=userSession%></h1>
    </body>
</html>
