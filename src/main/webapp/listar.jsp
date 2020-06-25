<%-- 
    Document   : listar. Lista los parqueaderos
    Created on : 15/03/2014, 03:18:18 PM
    Author     : javier
--%>

<%@page import="com.unicauca.clubpark.negocio.Parqueadero"%>
<%@page import="java.util.List"%>
<%
    List<Parqueadero> parqueaderos = (List<Parqueadero>) request.getAttribute("parqueaderos");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">        
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Parqueaderos de Popayán</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            
        </nav>

        <div class="container-fluid">
            <div class="row">
                <% if (parqueaderos != null) { %>
                <% for (Parqueadero park : parqueaderos) {%>
                <div class="col-lg-3">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary"><%= park.getNombre()%></h6>
                    </div>
                    <div class="card-body">
                        <div class="text-center">
                            
                        </div>
                        <p>puestos libres: <%= park.getPuestosLibres()%></p>
                         <p> </p>
                        <p>Puestos ocupados: <%= park.getPuestosOcupados()%></p>
                        
                    </div>


                </div>
                <% }%>
                <% }%>  

            </div>

        </div>



        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>        
    </body>
</html>