
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="util.ClassConex"%>
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
        <!--LLamado a las fuentes-->
        <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>


    </head>
    <body>
        <div id="contenedor1" class="container"> 
            <div class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <a id="txtnavbar" href="#" class="navbar-brand">INGENEO WEB</a>
                    <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <div class="collapse navbar-collapse navHeaderCollapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="#contenedor1">EMPLEADOS</a></li>
                            <li><a href="#contenedor2">DEPARTAMENTOS</a></li>
                            <li><a href="#contenedor3">CATEGORIA</a></li>
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
            <br>
            <p class="titulo">Gestion empleados</p>
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
                        <input id="redondo" type="text" class="form-control" name="txtNombre" placeholder="First name" aria-describedby="basic-addon1" title="Es necesaria su nombre, y debe contener letras" required value="<%= request.getAttribute("nom")%>"/>
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
                        <br><br>
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
                    <table border="1" class="table tabla-striped table-bordered table-hover table-condensed">
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

        <!--Este es el siguiente contenedor con la funcionalidad de gestionar los departamentos-->
        <div id="contenedor2" class="container">           
            <p class="titulo">Gestion de los departamentos</p>
            <br><br>
            <div class="contenedor col-md-4">
                <center><h2>Registro de departamentos</h2></center>

                <% if (request.getAttribute("mensajeD") != null) { %> 
                <div class="col-md-12 alert alert-info" role="alert">

                    ${mensajeD} 
                </div>
                <% }%> 

                <br><br>

                <form action="ServleDepartamento" method="POST">
                    <legend>Apartaments</legend>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Nombre del departamento</span>
                        <input id="redondo" type="text" class="form-control" name="txtNombreDepartamento" placeholder="Name" aria-describedby="basic-addon1" title="Es necesaria el nombre del departamento" required value="<%=request.getAttribute("nombre")%>"/>
                    </div>
                    <br>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Asignar </span>
                        <select class="form-control" name="txtEmpleadoEncargado" id="sel1" aria-describedby="basic-addon1"  title="Es necesaria asignar un empledo" required>                              
                            <%if (request.getAttribute("nombre_Coordinador") != null) {%>
                            <option value="<%=request.getAttribute("id_Coordinador")%>"><%= request.getAttribute("nombre_Coordinador")%></option>
                            <%} else {%>
                            <option value="">Empleado</option>
                            <%}%>
                            <!--Con estas lineas de codigo llamamos los empleados que estan en el sistema-->
                            <%
                                ClassConex conn = new ClassConex();

                                PreparedStatement consulta = conn.ObtenerConexion().prepareStatement("SELECT * FROM empleado");
                                ResultSet res = consulta.executeQuery();
                                while (res.next()) {%>
                            <option value="<%= res.getString("ID")%>"><%= res.getString("nombre")%></option>
                            <%}%>
                        </select>                        
                    </div>
                    <br>

                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Codigo del departamento a eliminar</span>
                        <input id="redondo" type="number" class="form-control" name="txtCodigoDepartamentoEliminar" placeholder="Cod_departamento" aria-describedby="basic-addon1" title="Es necesaria el nombre del departamento"  value="<%=request.getAttribute("cod_departamento")%>"/>
                    </div>    

                    <br>
                    <div class="btn-group col-md-12">
                        <input id="redondo btn-ok"  type="submit" class="btn btn-primary btn-md btn-block active" value="Ok">
                        <br><br><br>
                        <div class="form-group col-md-6">                        
                            <select id="listaOpciones" class="form-control btn-info" name="txtOpcionDepartamento" required>
                                <option value="1">CREATE</option>
                                <option value="2">ELIMINAR</option>
                                <option value="3">ACTUALIZAR</option>
                                <option value="4">CONSULTAR </option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-1"></div>

            <div class="contenedor col-md-7">
                <center><h2>Consulta de departamentos</h2></center>
                <br><br>
                <legend>All the departamentos</legend>
                <div id="resulset" class="table-responsive">
                    <% PreparedStatement consulta2 = conn.ObtenerConexion().prepareStatement("select departamento.*,empleado.nombre from empleado inner join departamento on departamento.id_coordinador=empleado.ID");
                        ResultSet res2 = consulta2.executeQuery();
                        if (res2 != null) {%>
                    <table border="1" class="table table-striped table-bordered table-hover table-condensed">
                        <tr>
                            <th>COD_DEPARTAMENTO</th><th>NOMBRE_DEPARTAMENTO</th><th>ID_COORDINADOR</th><th>NOMBRE_ENCARGADO</th>
                        </tr>
                        <%while (res2.next()) {%> 
                        <tr> 
                            <td> <%=res2.getString(1)%></td> 
                            <td> <%=res2.getString(2)%></td> 
                            <td> <%=res2.getString(3)%></td>
                            <td> <%=res2.getString(4)%></td>
                            <!--<td> <a href="#" alt="" onclick="valida_envia('4', '<%=res2.getString(1)%>');">SELECCIONAR</a></td>
                            <td> <a href="#" alt="" onclick="valida_envia('2', '<%=res2.getString(1)%>');">BORRAR</a></td>-->
                        </tr>
                        <%}%>
                    </table>
                    <%}%> 
                </div>
            </div>
        </div>

        <!--En este div se estara presentados los campos y l ainformacion para gestionar la categoria profesional--> 
        <div id="contenedor3" class="container">
            <p class="titulo">Gestion de la categoria profesional</p>
            <br><br>
            <div class="contenedor col-md-4">
                <center><h2>Registro de una categoria profesional</h2></center>
                    <% if (request.getAttribute("Mensaje") != null) { %> 
                <div class="col-md-12 alert alert-info" role="alert">

                    ${Mensaje} 
                </div>
                <% }%>  
                <br><br>
                <form action="ServeltCategoria" method="POST">
                    <legend>professional categories</legend>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Nombre de la categoria</span>
                        <input type="text" id="redondo" class="form-control" aria-describedby="basic-addon1" name="txtNombreCategoria" placeholder="Name" title="Es necesaria un nombre para la categoria" required/>
                    </div>
                    <br>
                      <div class="input-group">
                        <span class="input-group-addon" id="basic-addon1" >Codigo de la categoria a eliminar</span>
                        <input type="number" id="redondo" class="form-control" aria-describedby="basic-addon1" name="txtCodigoCategoria" placeholder="cod_categoria" title="Es necesaria el codigo de la categoria para poder eliminar" required/>
                    </div>
                    <br>
                    <div class="btn-group col-md-12">
                        <input id="redondo btn-ok"  type="submit" class="btn btn-primary btn-md btn-block active" value="Ok">
                        <br><br>
                        <div class="form-group col-md-6">                        
                            <select id="listaOpciones" class="form-control btn-info" name="txtOpcion">
                                <option value="1">CREATE</option>
                                <option value="2">ELIMINAR</option>
                                <option value="3">ACTUALIZAR</option>
                            </select>
                        </div>
                    </div> 
                </form>
            </div>
            <div class="col-md-1"></div>
            <div class="contenedor col-md-7">
               <center><h2>Consulta de las cateorias profesionales</h2></center>
                <br><br>
                <legend>All the departamentos</legend>
                <div id="resulset" class="table-responsive">
                    <% PreparedStatement consulta3 = conn.ObtenerConexion().prepareStatement("SELECT * FROM categoria_profesional;");
                        ResultSet res3 = consulta3.executeQuery();
                        if (res3 != null) {%>
                    <table border="1" class="table table-striped table-bordered table-hover table-condensed">
                        <tr>
                            <th>COD_CATEGORIA</th><th>NOMBRE</th>
                        </tr>
                        <%while (res3.next()) {%> 
                        <tr> 
                            <td> <%=res3.getString(1)%></td> 
                            <td> <%=res3.getString(2)%></td> 
                            
                            <!--<td> <a href="#" alt="" onclick="valida_envia('4', '<%=res3.getString(1)%>');">SELECCIONAR</a></td>
                            <td> <a href="#" alt="" onclick="valida_envia('2', '<%=res3.getString(1)%>');">BORRAR</a></td>-->
                        </tr>
                        <%}%>
                    </table>
                    <%}%> 
                </div>
                
            </div>


        </div>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-1.12.1.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="js/bootstrap.min.js"></script>


    </body>
</html>
