
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registros</title>
        <!--LLamado a bootstrap-->
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
        <!-- LLamado al archivo que contiene nuestro estilos-->
        <link rel="stylesheet" href="css/Stylo.css"/>      
        <!--LLamado a la libreria de bootstrap para JavaScript-->
        
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
                        <span class="input-group-addon" id="basic-addon1" >Identificacion</span>
                        <input id="redondo" type="number" class="form-control" name="txtIdentificacion" placeholder="ID/CC" aria-describedby="basic-addon1" title="Es necesaria su identificacion" required value="<%=request.getAttribute("id") %>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Nombre</span>
                        <input id="redondo" type="text" class="form-control" name="txtNombre" placeholder="First name" aria-describedby="basic-addon1" title="Es necesaria su nombre, y debe contener letras" required value="<%=request.getAttribute("nom") %>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Apellido</span>
                        <input id="redondo" type="text" class="form-control" name="txtApellido" placeholder="Last name" aria-describedby="basic-addon1" title="Es necesaria su apellido, y debe contener letras" required value="<%=request.getAttribute("ape") %>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Direccion</span>
                        <input id="redondo" type="text" class="form-control" name="txtDireccion" placeholder="(Cr 11 #23-12)" aria-describedby="basic-addon1"  title="Es necesaria su direccion ,y debe contener letras" required value="<%=request.getAttribute("dir") %>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Telefono</span>
                        <input id="redondo" type="number" class="form-control" name="txtTelefono" placeholder="Phone number" aria-describedby="basic-addon1"  title="Es necesaria su telefono, y debe contener numeros" required="Solo se permite numeros" value="<%=request.getAttribute("tel") %>"/>
                    </div>
                    <br>
                    <div class="btn-group col-md-12">
                        <input id="redondo btn-ok"  type="submit" class="btn btn-primary btn-md btn-block active" value="Ok">
                        <br><br><br>
                        <div class="form-group col-md-6">                        
                        <select id="listaOpciones" class="form-control btn-info" name="txtOpcion">
                          <option value="1">CREATE</option>
                          <option value="2">ELIMINAR</option>
                          <option value="3">ACTUALIZAR</option>
                          <option value="4">CONSULTAR </option>
                          <option value="5">LISTAR</option>
                        </select>
                        </div>
                    </div>               

                </form>                 
            </div>   
                    <div class="col-md-4">
                        <br><br>
                         <div id="resulset">
    <%ResultSet rs = (ResultSet) request.getAttribute("resultset");    
        if (rs != null) {%>
    <table border="1">
        <tr>
            <td>ID</td><td>NOMBRE</td><td>APELLIDO</td><td>DIRECCION</td><td>TELEFONO</td><td colspan="2">OPCIONES</td>
        </tr>
        <%while (rs.next()) {%> 
        <tr> 
            <td> <%=rs.getString(1)%></td> 
            <td> <%=rs.getString(2)%></td> 
            <td> <%=rs.getString(3)%></td>
            <td> <%=rs.getString(4)%></td>
            <td> <%=rs.getString(5)%></td>
            <td> <a href="#" alt="" onclick="valida_envia('4','<%=rs.getString(1)%>');">SELECCIONAR</a></td>
            <td> <a href="#" alt="" onclick="valida_envia('2','<%=rs.getString(1)%>');">BORRAR</a></td>
        </tr>
        <%}%>
    </table>
    <%}%>
</div>
                    </div>            
        </div>
         
        <!--LLamado al archivo para usar javascript con bootstrap-->                
        <script src="js/bootstrap.min.css"/>
        <!--LLamado a la libreria Jquery-->
        <script src="jq/jquery-1.12.1.min.js"/>
        <!--LLamado al archivo donde usamos Jquery-->
        <script src="jq/Jquery.js"/>
        

    </body>
</html>
