<%-- 
    Document   : index
    Created on : 13/07/2019, 10:57:51 AM
    Author     : libardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Parqueaderos publicos</h1>
        <a href="<%= request.getContextPath() %>/ParqueaderosServlet?accion=listar">Listar parqueaderos</a>
    </body>
</html>
