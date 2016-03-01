
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
            <div class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <a href="#" class="navbar-brand">GESTION EMPLEADOS</a>
                    <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    </button>
                    
                    <div class="collapse navbar-collapse navHeaderCollapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="#">EMPLEADOS</a></li>
                            <li><a href="#">DEPARTAMENTOS</a></li>
                            <li><a href="#">CATEGORIA</a></li>
                            <li><a href="#">NOMINA</a></li>
                            <li><a href="#">CONTRATO</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">SOCIAL MEDIA<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">OUTLOOK</a></li>
                                    <li><a href="#">GMAIL</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
             </div>
            <br><br>
            <div class="contenedor col-md-4">

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
                        <input id="redondo" type="number" class="form-control" name="txtIdentificacion" placeholder="ID/CC" aria-describedby="basic-addon1" title="Es necesaria su identificacion" required value="<%=request.getAttribute("id")%>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Nombre</span>
                        <input id="redondo" type="text" class="form-control" name="txtNombre" placeholder="First name" aria-describedby="basic-addon1" title="Es necesaria su nombre, y debe contener letras" required value="<%=request.getAttribute("nom")%>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Apellido</span>
                        <input id="redondo" type="text" class="form-control" name="txtApellido" placeholder="Last name" aria-describedby="basic-addon1" title="Es necesaria su apellido, y debe contener letras" required value="<%=request.getAttribute("ape")%>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Direccion</span>
                        <input id="redondo" type="text" class="form-control" name="txtDireccion" placeholder="(Cr 11 #23-12)" aria-describedby="basic-addon1"  title="Es necesaria su direccion ,y debe contener letras" required value="<%=request.getAttribute("dir")%>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1">Telefono</span>
                        <input id="redondo" type="number" class="form-control" name="txtTelefono" placeholder="Phone number" aria-describedby="basic-addon1"  title="Es necesaria su telefono, y debe contener numeros" required="Solo se permite numeros" value="<%=request.getAttribute("tel")%>"/>
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
            <div class="col-md-1">

            </div>  
                    
            <div class="contenedor col-md-7">
                 <center><h2>Consulta de empleados</h2></center>
                <br><br>
                <legend>All the employees</legend>
                <div id="resulset" class="table-responsive">
                    <%ResultSet rs = (ResultSet) request.getAttribute("resultset");
        if (rs != null) {%>
                    <table border="1" class="table tabla-striped table-hover table-condensed">
                        <tr>
                            <th>ID</th><th>NOMBRE</th><th>APELLIDO</th><th>DIRECCION</th><th>TELEFONO</th><th colspan="2">OPCIONES</th>
                        </tr>
                        <%while (rs.next()) {%> 
                        <tr> 
                            <td> <%=rs.getString(1)%></td> 
                            <td> <%=rs.getString(2)%></td> 
                            <td> <%=rs.getString(3)%></td>
                            <td> <%=rs.getString(4)%></td>
                            <td> <%=rs.getString(5)%></td>
                            <td> <a href="#" alt="" onclick="valida_envia('4', '<%=rs.getString(1)%>');">SELECCIONAR</a></td>
                            <td> <a href="#" alt="" onclick="valida_envia('2', '<%=rs.getString(1)%>');">BORRAR</a></td>
                        </tr>
                        <%}%>
                    </table>
                    <%}%>
                </div>
            </div>            
        </div>
         <hr>
         <!--Este es el siguiente contenedor con la funcionalidad de gestionar los departamentos-->
         <div class="container">
             <div class="contenedor col-md-4">
                 
                  <center><h2>Registro de departamentos</h2></center>
                  <!--
                  <% if (request.getAttribute("mensaje") != null) { %> 
                <div class="col-md-12 alert alert-info" role="alert">

                    ${mensaje} 
                </div>
                <% }%>                        

               
                  -->
                   <br><br>
                   <form>
                       <legend>Apartaments</legend>
                       <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Nombre del departamento</span>
                        <input id="redondo" type="number" class="form-control" name="txtDepartamento" placeholder="ID/CC" aria-describedby="basic-addon1" title="Es necesaria su identificacion" required value="<%=request.getAttribute("id")%>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Asignar </span>
                          <select class="form-control" id="sel1">
                            <option>Empleado</option>
                            <option>2</option>
                          </select>                        
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
             <div class="col-md-1"></div>
             <div class="col-md-7"></div>
         </div>

        <!--LLamado al js de bootstrap-->
        <script src="js/bootstrap.js"></script>
        
        <!--LLamado al archivo donde usamos Jquery-->
        <script src="http://code.jquery.com/jquery-1.12.1.min.js"></script>


    </body>
</html>
