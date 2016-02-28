
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registros</title>
        <!--LLamado a bootstrap-->
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <link rel="stylesheet" href="css/Stylo.css"/>         
    </head>
    <body>
        <div class="container"> 
            <div class="col-md-4"></div>            
            <div class=" contenedor col-md-4">
                <center><h2>Registro de empleados</h2></center>
               
                        <% if (request.getAttribute("mensaje") != null) { %> 
                         <div class="col-md-12 alert alert-info" role="alert">
                             
                        ${mensaje} 
                        </div>
                        <% }%>                        
                    
                <br><br>
                <form action="ServletEmpleado" action="POST">
                    <legend>employee data</legend>

                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Identificacion</span>
                        <input id="redondo" type="number" class="form-control" name="txtIdentificacion" placeholder="ID/CC" aria-describedby="basic-addon1" required/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Nombre</span>
                        <input id="redondo" type="text" class="form-control" name="txtNombre" placeholder="First name" aria-describedby="basic-addon1" required/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Apellido</span>
                        <input id="redondo" type="text" class="form-control" name="txtApellido" placeholder="Last name" aria-describedby="basic-addon1" required/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Direccion</span>
                        <input id="redondo" type="text" class="form-control" name="txtDireccion" placeholder="(Cr 11 #23-12)" aria-describedby="basic-addon1" required/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Telefono</span>
                        <input id="redondo" type="number" class="form-control" name="txtTelefono" placeholder="Phone number" aria-describedby="basic-addon1" required="Solo se permite numeros"/>
                    </div>
                    <br>
                    <div class="btn-group col-md-12">
                        <input id="redondo"  type="submit" class="btn btn-primary btn-md btn-block active" value="Registrar">
                        <input type="hidden" name="txtOpcion" value="4">
                        
                        
                    </div>               

                </form>                 
            </div>   
            <div class="col-md-4"></div>
            
        </div>
        <!--LLamado a la libreria Jquery-->
        <script src="jq/jquery-1.12.1.min.js"/>

    </body>
</html>
