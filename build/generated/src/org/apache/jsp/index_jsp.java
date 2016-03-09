package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import util.ClassConex;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Registros</title>\r\n");
      out.write("        <!--LLamado a bootstrap-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <!-- LLamado al archivo que contiene nuestro estilos-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Stylo.css\"/>      \r\n");
      out.write("        <!--LLamado a las fuentes-->\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\r\n");
      out.write("         <script src=\"js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                $('#listaOpciones').change(function(){\r\n");
      out.write("                    var selectedOption=$('#listaOpciones option:selected');\r\n");
      out.write("                     if(selectedOption.val()==2 || selectedOption.val()==4){\r\n");
      out.write("                         $(\"#nom,#ape,#dir,#tel\").hide(\"slow\");\r\n");
      out.write("                     }else{\r\n");
      out.write("                         $(\"#nom,#ape,#dir,#tel\").show(\"slow\");\r\n");
      out.write("                     }\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"contenedor1\" class=\"container\"> \r\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <a id=\"txtnavbar\" href=\"#\" class=\"navbar-brand\">INGENEO WEB</a>\r\n");
      out.write("                    <button class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navHeaderCollapse\">\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse navHeaderCollapse\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                            <li class=\"active\"><a href=\"#contenedor1\">EMPLEADOS</a></li>\r\n");
      out.write("                            <li><a href=\"#contenedor2\">DEPARTAMENTOS</a></li>\r\n");
      out.write("                            <li><a href=\"#contenedor3\">CATEGORIA</a></li>\r\n");
      out.write("                            <li><a href=\"#contenedor4\">NOMINA</a></li>\r\n");
      out.write("                            <li><a href=\"#contenedor5\">CONTRATO</a></li>\r\n");
      out.write("                            <li class=\"dropdown\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">SOCIAL MEDIA<b class=\"caret\"></b></a>\r\n");
      out.write("                                <ul class=\"dropdown-menu\">\r\n");
      out.write("                                    <li><a href=\"#\">OUTLOOK</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">GMAIL</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <p class=\"titulo\">Gestion empleados</p>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"contenedor col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <center><h2>Registro de empleados</h2></center>\r\n");
      out.write("\r\n");
      out.write("                ");
 if (request.getAttribute("mensaje") != null) { 
      out.write(" \r\n");
      out.write("                <div class=\"col-md-12 alert alert-info\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 }
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <form action=\"ServletEmpleado\" action=\"POST\">\r\n");
      out.write("                    <legend>employee data</legend>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                    <div id=\"iden\" class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Identificacion</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtIdentificacion\" placeholder=\"ID/CC\" aria-describedby=\"basic-addon1\" title=\"Es necesaria su identificacion\"  value=\"");
      out.print(request.getAttribute("id"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div id=\"nom\" class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Nombre</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtNombre\" placeholder=\"First name\" aria-describedby=\"basic-addon1\" title=\"Es necesaria su nombre, y debe contener letras\"  value=\"");
      out.print( request.getAttribute("nom"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div id=\"ape\" class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Apellido</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtApellido\" placeholder=\"Last name\" aria-describedby=\"basic-addon1\" title=\"Es necesaria su apellido, y debe contener letras\"  value=\"");
      out.print(request.getAttribute("ape"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div id=\"dir\" class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Direccion</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtDireccion\" placeholder=\"(Cr 11 #23-12)\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria su direccion ,y debe contener letras\"  value=\"");
      out.print(request.getAttribute("dir"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div id=\"tel\" class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Telefono</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtTelefono\" placeholder=\"Phone number\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria su telefono, y debe contener numeros\"  value=\"");
      out.print(request.getAttribute("tel"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Asignar </span>\r\n");
      out.write("                        <select class=\"form-control\" name=\"txtEmpleadoJefe\" id=\"sel1\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria asignar un empledo\" required>                              \r\n");
      out.write("                            ");
if (request.getAttribute("nombre_Coordinador") != null) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(request.getAttribute("id_Coordinador"));
      out.write('"');
      out.write('>');
      out.print( request.getAttribute("nombre_Coordinador"));
      out.write("</option>\r\n");
      out.write("                            ");
} else {
      out.write("\r\n");
      out.write("                            <option value=\"\">Empleado</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <!--Con estas lineas de codigo llamamos los empleados que estan en el sistema-->\r\n");
      out.write("                            ");

                                 
                                ClassConex conn = new ClassConex();
                                PreparedStatement consultaEmpleado = conn.ObtenerConexion().prepareStatement("SELECT ID,nombreE FROM empleado");
                                ResultSet res = consultaEmpleado.executeQuery();
                                while (res.next()) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( res.getString("ID"));
      out.write('"');
      out.write('>');
      out.print( res.getString("nombreE"));
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"btn-group col-md-12\">\r\n");
      out.write("                        <input id=\"redondo btn-ok\"  type=\"submit\" class=\"btn btn-primary btn-md btn-block active\" value=\"Ok\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                        <div class=\"form-group col-md-6\">                        \r\n");
      out.write("                            <select id=\"listaOpciones\" class=\"form-control btn-info\" name=\"txtOpcion\">\r\n");
      out.write("                                <option value=\"1\">CREATE</option>\r\n");
      out.write("                                <option value=\"2\">ELIMINAR</option>\r\n");
      out.write("                                <option value=\"3\">ACTUALIZAR</option>\r\n");
      out.write("                                <option value=\"4\">CONSULTAR </option>\r\n");
      out.write("                                <option value=\"5\">LISTAR</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>               \r\n");
      out.write("                </form>   \r\n");
      out.write("\r\n");
      out.write("            </div>            \r\n");
      out.write("            <div class=\"col-md-1\">\r\n");
      out.write("\r\n");
      out.write("            </div>  \r\n");
      out.write("\r\n");
      out.write("            <div class=\"contenedor col-md-7\">\r\n");
      out.write("                <center><h2>Consulta de empleados</h2></center>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <legend>All the employees</legend>\r\n");
      out.write("                <div id=\"resulset\" class=\"table-responsive\">\r\n");
      out.write("                    ");
  
                        PreparedStatement consultaEmpleados = conn.ObtenerConexion().prepareStatement("select empleado.ID,empleado.cod_empleado,empleado.nombreE,empleado.apellido,empleado.direccion,empleado.telefono,jefe.ID,jefe.nombreE from empleado left join empleado jefe on empleado.id_responsable=jefe.ID");
                        ResultSet res1 = consultaEmpleados.executeQuery();
                        
                        if (res1 != null) {
      out.write("\r\n");
      out.write("                    <table border=\"1\" class=\"table table-striped table-bordered table-hover table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>ID</th><th>CODIGO_EMPLEADO</th><th>NOMBRE</th><th>APELLIDO</th><th>DIRECCION</th><th>TELEFONO</th><th>ID_RESPONSABLE</th><th>NOMBRE_RESPONSABLE</th><!--<th colspan=\"2\">OPCIONES</th>-->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
while (res1.next()) {
      out.write(" \r\n");
      out.write("                        <tr> \r\n");
      out.write("                            <td> ");
      out.print(res1.getString(1));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res1.getString(2));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res1.getString(3));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(res1.getString(4));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(res1.getString(5));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(res1.getString(6));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(res1.getString(7));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(res1.getString(8));
      out.write("</td>\r\n");
      out.write("                           <!-- <td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('4', '");
      out.print(res1.getString(1));
      out.write("');\">SELECCIONAR</a></td>\r\n");
      out.write("                            <td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('2', '");
      out.print(res1.getString(1));
      out.write("');\">BORRAR</a></td>-->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>                \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--Este es el siguiente contenedor con la funcionalidad de gestionar los departamentos-->\r\n");
      out.write("        <div id=\"contenedor2\" class=\"container\">           \r\n");
      out.write("            <p class=\"titulo\">Gestion de los departamentos</p>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"contenedor col-md-4\">\r\n");
      out.write("                <center><h2>Registro de departamentos</h2></center>\r\n");
      out.write("\r\n");
      out.write("                ");
 if (request.getAttribute("mensajeD") != null) { 
      out.write(" \r\n");
      out.write("                <div class=\"col-md-12 alert alert-info\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeD}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 }
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                <br><br>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"ServleDepartamento\" method=\"POST\">\r\n");
      out.write("                    <legend>Apartaments</legend>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Nombre del departamento</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtNombreDepartamento\" placeholder=\"Name\" aria-describedby=\"basic-addon1\" title=\"Es necesaria el nombre del departamento\" required value=\"");
      out.print(request.getAttribute("nombre"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Asignar </span>\r\n");
      out.write("                        <select class=\"form-control\" name=\"txtEmpleadoEncargado\" id=\"sel1\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria asignar un empledo\" required>                              \r\n");
      out.write("                            ");
if (request.getAttribute("nombre_Coordinador") != null) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(request.getAttribute("id_Coordinador"));
      out.write('"');
      out.write('>');
      out.print( request.getAttribute("nombre_Coordinador"));
      out.write("</option>\r\n");
      out.write("                            ");
} else {
      out.write("\r\n");
      out.write("                            <option value=\"\">Empleado</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <!--Con estas lineas de codigo llamamos los empleados que estan en el sistema-->\r\n");
      out.write("                            ");

                               
                                PreparedStatement consultaApartamentosEmpleados = conn.ObtenerConexion().prepareStatement("SELECT ID,nombreE FROM empleado");
                                ResultSet resApartamentos = consultaApartamentosEmpleados.executeQuery();
                                while (resApartamentos.next()) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( resApartamentos.getString("ID"));
      out.write('"');
      out.write('>');
      out.print( resApartamentos.getString("nombreE"));
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Codigo del departamento a eliminar</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtCodigoDepartamentoEliminar\" placeholder=\"Cod_departamento\" aria-describedby=\"basic-addon1\" title=\"Es necesaria el nombre del departamento\"  value=\"");
      out.print(request.getAttribute("cod_departamento"));
      out.write("\"/>\r\n");
      out.write("                    </div>    \r\n");
      out.write("\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"btn-group col-md-12\">\r\n");
      out.write("                        <input id=\"redondo btn-ok\"  type=\"submit\" class=\"btn btn-primary btn-md btn-block active\" value=\"Ok\">\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <div class=\"form-group col-md-6\">                        \r\n");
      out.write("                            <select id=\"listaOpciones\" class=\"form-control btn-info\" name=\"txtOpcionDepartamento\" required>\r\n");
      out.write("                                <option value=\"1\">CREATE</option>\r\n");
      out.write("                                <option value=\"2\">ELIMINAR</option>\r\n");
      out.write("                                <option value=\"3\">ACTUALIZAR</option>\r\n");
      out.write("                                <option value=\"4\">CONSULTAR </option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-1\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"contenedor col-md-7\">\r\n");
      out.write("                <center><h2>Consulta de departamentos</h2></center>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <legend>All the departamentos</legend>\r\n");
      out.write("                <div id=\"resulset\" class=\"table-responsive\">\r\n");
      out.write("                    ");
 PreparedStatement consulta2 = conn.ObtenerConexion().prepareStatement("select departamento.*,empleado.nombreE from empleado inner join departamento on departamento.id_coordinador=empleado.ID");
                        ResultSet res2 = consulta2.executeQuery();
                        if (res2 != null) {
      out.write("\r\n");
      out.write("                    <table border=\"1\" class=\"table table-striped table-bordered table-hover table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>COD_DEPARTAMENTO</th><th>NOMBRE_DEPARTAMENTO</th><th>ID_COORDINADOR</th><th>NOMBRE_ENCARGADO</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
while (res2.next()) {
      out.write(" \r\n");
      out.write("                        <tr> \r\n");
      out.write("                            <td> ");
      out.print(res2.getString(1));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res2.getString(2));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res2.getString(3));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(res2.getString(4));
      out.write("</td>\r\n");
      out.write("                            <!--<td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('4', '");
      out.print(res2.getString(1));
      out.write("');\">SELECCIONAR</a></td>\r\n");
      out.write("                            <td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('2', '");
      out.print(res2.getString(1));
      out.write("');\">BORRAR</a></td>-->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");
}
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--En este contenedor se estara presentados los campos y l ainformacion para gestionar la categoria profesional--> \r\n");
      out.write("        <div id=\"contenedor3\" class=\"container\">\r\n");
      out.write("            <p class=\"titulo\">Gestion de la categoria profesional</p>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"contenedor col-md-4\">\r\n");
      out.write("                <center><h2>Registro de una categoria profesional</h2></center>\r\n");
      out.write("                    ");
 if (request.getAttribute("Mensaje") != null) { 
      out.write(" \r\n");
      out.write("                <div class=\"col-md-12 alert alert-info\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 }
      out.write("  \r\n");
      out.write("                <br><br>\r\n");
      out.write("                <form action=\"ServeltCategoria\" method=\"POST\">\r\n");
      out.write("                    <legend>professional categories</legend>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Nombre de la categoria</span>\r\n");
      out.write("                        <input type=\"text\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtNombreCategoria\" placeholder=\"Name\" title=\"Es necesaria un nombre para la categoria\" required/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Codigo de la categoria a eliminar</span>\r\n");
      out.write("                        <input type=\"number\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtCodigoCategoria\" placeholder=\"cod_categoria\" title=\"Es necesaria el codigo de la categoria para poder eliminar\" required/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"btn-group col-md-12\">\r\n");
      out.write("                        <input id=\"redondo btn-ok\"  type=\"submit\" class=\"btn btn-primary btn-md btn-block active\" value=\"Ok\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                        <div class=\"form-group col-md-6\">                        \r\n");
      out.write("                            <select id=\"listaOpciones\" class=\"form-control btn-info\" name=\"txtOpcion\">\r\n");
      out.write("                                <option value=\"1\">CREATE</option>\r\n");
      out.write("                                <option value=\"2\">ELIMINAR</option>\r\n");
      out.write("                                <option value=\"3\">ACTUALIZAR</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-1\"></div>\r\n");
      out.write("            <div class=\"contenedor col-md-7\">\r\n");
      out.write("                <center><h2>Consulta de las categorias profesionales</h2></center>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <legend>All the professional categories</legend>\r\n");
      out.write("                <div id=\"resulset\" class=\"table-responsive\">\r\n");
      out.write("                    ");
 PreparedStatement consulta3 = conn.ObtenerConexion().prepareStatement("SELECT * FROM categoria_profesional;");
                        ResultSet res3 = consulta3.executeQuery();
                        if (res3 != null) {
      out.write("\r\n");
      out.write("                    <table border=\"1\" class=\"table table-striped table-bordered table-hover table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>COD_CATEGORIA</th><th>NOMBRE</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
while (res3.next()) {
      out.write(" \r\n");
      out.write("                        <tr> \r\n");
      out.write("                            <td> ");
      out.print(res3.getString(1));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res3.getString(2));
      out.write("</td> \r\n");
      out.write("\r\n");
      out.write("<!--<td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('4', '");
      out.print(res3.getString(1));
      out.write("');\">SELECCIONAR</a></td>\r\n");
      out.write("<td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('2', '");
      out.print(res3.getString(1));
      out.write("');\">BORRAR</a></td>-->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");
}
      out.write(" \r\n");
      out.write("                </div>                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--En este contenedor se estara presentados los campos y la informacion para gestionar las categoria profesional -->    \r\n");
      out.write("        <div id=\"contenedor4\" class=\"container\">\r\n");
      out.write("            <p class=\"titulo\">Gestion de las nominas de los empleados</p>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"contenedor col-md-4\">\r\n");
      out.write("                <center><h2>Registro de una nomina</h2></center>\r\n");
      out.write("                    ");
 if (request.getAttribute("MensajeN") != null) { 
      out.write(" \r\n");
      out.write("                <div class=\"col-md-12 alert alert-info\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeN}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 }
      out.write("  \r\n");
      out.write("                <br><br>\r\n");
      out.write("                <form action=\"ServletNomina\" method=\"POST\">\r\n");
      out.write("                    <legend>Payrolls an employee</legend>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Fecha</span>\r\n");
      out.write("                        <input type=\"date\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtFechaNomina\" placeholder=\"Date\" title=\"Es necesario que ingrese la fecha\" required value=\"");
      out.print( request.getAttribute("fecha"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Salario</span>\r\n");
      out.write("                        <input type=\"number\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtSalarioNomina\" placeholder=\"Salario correspondiente\" title=\"Es necesario agregar un salario\" required value=\"");
      out.print( request.getAttribute("salario"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Empleado </span>\r\n");
      out.write("                        <select class=\"form-control\" name=\"txtEmpleadoNomina\" id=\"sel1\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria asignar un empleado para la nomina\" required>                              \r\n");
      out.write("                            ");
if (request.getAttribute("nombre") != null) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(request.getAttribute("id_empleado"));
      out.write('"');
      out.write('>');
      out.print( request.getAttribute("nombre"));
      out.write("</option>\r\n");
      out.write("                            ");
} else {
      out.write("\r\n");
      out.write("                            <option value=\"\">Empleado</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <!--Con estas lineas de codigo llamamos los empleados que estan en el sistema-->\r\n");
      out.write("                            ");

                                PreparedStatement consultaEmpleadoNomina = conn.ObtenerConexion().prepareStatement("SELECT ID,nombreE FROM empleado");
                                ResultSet resEmpleadoNomina = consultaEmpleadoNomina.executeQuery();
                                while (resEmpleadoNomina.next()) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( resEmpleadoNomina.getString("ID"));
      out.write('"');
      out.write('>');
      out.print( resEmpleadoNomina.getString("nombreE"));
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group col-md-7\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Cod_nomina</span>\r\n");
      out.write("                        <input type=\"number\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtCodigoNomina\" placeholder=\"cod nomina\" title=\"Es necesario agregar el codigo de la nomina si quieres eliminarla\" value=\"");
      out.print( request.getAttribute("cod_nomina"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"btn-group col-md-12\">\r\n");
      out.write("                        <input id=\"redondo btn-ok\"  type=\"submit\" class=\"btn btn-primary btn-md btn-block active\" value=\"Ok\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                        <div class=\"form-group col-md-6\">                        \r\n");
      out.write("                            <select id=\"listaOpciones\" class=\"form-control btn-info\" name=\"txtOpcion\">\r\n");
      out.write("                                <option value=\"1\">CREATE</option>\r\n");
      out.write("                                <option value=\"2\">ELIMINAR</option>\r\n");
      out.write("                                <option value=\"3\">ACTUALIZAR</option>\r\n");
      out.write("                                <option value=\"4\">CONSULTAR</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-1\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"contenedor col-md-7\">\r\n");
      out.write("                <center><h2>Consulta de las nominas creadas</h2></center>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <legend>All the payrolls</legend>\r\n");
      out.write("                <div id=\"resulset\" class=\"table-responsive\">\r\n");
      out.write("                    ");
 PreparedStatement consulta4 = conn.ObtenerConexion().prepareStatement("select nomina.*,empleado.nombreE from empleado inner join nomina on nomina.id_empleado=empleado.ID");
                        ResultSet res4 = consulta4.executeQuery();
                        if (res4 != null) {
      out.write("\r\n");
      out.write("                    <table border=\"1\" class=\"table table-striped table-bordered table-hover table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>COD_NOMINA</th><th>FECHA</th><th>SALARIO</th><th>ID_EMPLEADO</th><th>NOMBRE_EMPLEADO</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
while (res4.next()) {
      out.write(" \r\n");
      out.write("                        <tr> \r\n");
      out.write("                            <td> ");
      out.print(res4.getString(1));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res4.getString(2));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res4.getString(3));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res4.getString(4));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(res4.getString(5));
      out.write("</td> \r\n");
      out.write("\r\n");
      out.write("<!--<td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('4', '");
      out.print(res4.getString(1));
      out.write("');\">SELECCIONAR</a></td>\r\n");
      out.write("<td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('2', '");
      out.print(res4.getString(1));
      out.write("');\">BORRAR</a></td>-->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");
}
      out.write(" \r\n");
      out.write("                </div>                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!--En este contenedor se manejara la gestion de los contratos-->\r\n");
      out.write("        <div id=\"contenedor5\" class=\"container\">\r\n");
      out.write("            <p class=\"titulo\">Gestion de las contratos de los empleados</p>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"contenedor col-md-4\">\r\n");
      out.write("                <center><h2>Crear un contrato</h2></center>\r\n");
      out.write("                    ");
 if (request.getAttribute("mensajeContrato") != null) { 
      out.write(" \r\n");
      out.write("                <div class=\"col-md-12 alert alert-info\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeContrato}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("                ");
 }
      out.write("  \r\n");
      out.write("                <br><br>\r\n");
      out.write("                <form action=\"ServletContrato\" method=\"POST\">\r\n");
      out.write("                    <legend>Contract of a employee</legend>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span id=\"basic-addon1\" class=\"input-group-addon\">Fecha inicio</span>\r\n");
      out.write("                        <input type=\"date\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtFechaInicio\" placeholder=\"Fecha ini\" title=\"Es necesario agregar una fecha para registrar este contrato\" value=\"");
      out.print( request.getAttribute("fechaInicio"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span id=\"basic-addon1\" class=\"input-group-addon\">Fecha final</span>\r\n");
      out.write("                        <input type=\"date\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtFechaFinal\" placeholder=\"Fecha fin\" title=\"Es necesario agregar una fecha para registrar este contrato\" value=\"");
      out.print( request.getAttribute("fechaFinal"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Seleccione </span>\r\n");
      out.write("                        <select class=\"form-control\" name=\"txtEmpleadoAContratar\" id=\"sel1\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria asignar un empleado para la contratacion\" required>                              \r\n");
      out.write("                            ");
if (request.getAttribute("nombreEmpleado") != null) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(request.getAttribute("id_empleado"));
      out.write('"');
      out.write('>');
      out.print( request.getAttribute("nombreEmpleado"));
      out.write("</option>\r\n");
      out.write("                            ");
} else {
      out.write("\r\n");
      out.write("                            <option value=\"\">Empleado</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <!--Con estas lineas de codigo llamamos los empleados que estan en el sistema-->\r\n");
      out.write("                            ");

                                PreparedStatement consultaEmpleadoContrato = conn.ObtenerConexion().prepareStatement("SELECT ID,nombreE FROM empleado");
                                ResultSet resEmpleadoC = consultaEmpleadoContrato.executeQuery();
                                while (resEmpleadoC.next()) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( resEmpleadoC.getString("ID"));
      out.write('"');
      out.write('>');
      out.print( resEmpleadoC.getString("nombreE"));
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Seleccione </span>\r\n");
      out.write("                        <select class=\"form-control\" name=\"txtContratoCategoria\" id=\"sel1\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria asignar un empleado para la nomina\" required>                              \r\n");
      out.write("                            ");
if (request.getAttribute("nombreCategoria") != null) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(request.getAttribute("codigoCategoria"));
      out.write('"');
      out.write('>');
      out.print( request.getAttribute("nombreCategoria"));
      out.write("</option>\r\n");
      out.write("                            ");
} else {
      out.write("\r\n");
      out.write("                            <option value=\"\">Categoria</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                            <!--Con estas lineas de codigo llamamos los empleados que estan en el sistema-->\r\n");
      out.write("                            ");

                                PreparedStatement consultaCategoria= conn.ObtenerConexion().prepareStatement("SELECT * FROM categoria_profesional");
                                ResultSet resCategoria = consultaCategoria.executeQuery();
                                while (resCategoria.next()) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( resCategoria.getString("cod_categoria"));
      out.write('"');
      out.write('>');
      out.print( resCategoria.getString("nombreC"));
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                     <div class=\"input-group col-md-7 center-block\">\r\n");
      out.write("                        <span id=\"basic-addon1\" class=\"input-group-addon\">Cod_contrato</span>\r\n");
      out.write("                        \r\n");
      out.write("                        <input type=\"number\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtCodigoContrato\" placeholder=\"Utilizado para eliminar un contrato\" title=\"Es necesario agregar el codigo del contrato si lo desea eliminar\" value=\"");
      out.print( request.getAttribute("codigoContrato"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"btn-group col-md-12\">\r\n");
      out.write("                        <input id=\"redondo btn-ok\"  type=\"submit\" class=\"btn btn-primary btn-md btn-block active\" value=\"Ok\">\r\n");
      out.write("                        <br><br>\r\n");
      out.write("                        <div class=\"form-group col-md-6\">                        \r\n");
      out.write("                            <select id=\"listaOpciones\" class=\"form-control btn-info\" name=\"txtOpcion\">\r\n");
      out.write("                                <option value=\"1\">CREATE</option>\r\n");
      out.write("                                <option value=\"2\">ELIMINAR</option>\r\n");
      out.write("                                <option value=\"3\">ACTUALIZAR</option>\r\n");
      out.write("                                <option value=\"4\">CONSULTAR</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </form>   \r\n");
      out.write("            </div>  \r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-1\">\r\n");
      out.write("                       \r\n");
      out.write("                    </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"contenedor col-md-7\">\r\n");
      out.write("                \r\n");
      out.write("                <center><h2>Consulta de los contratos hechos</h2></center>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <legend>All the contracts</legend>\r\n");
      out.write("                <div id=\"resulset\" class=\"table-responsive\">\r\n");
      out.write("                    ");
 PreparedStatement consultaContratos = conn.ObtenerConexion().prepareStatement("SELECT cod_contrato,fecha_inicio,fecha_fin,id_empleado,nombreE,apellido,codigo_categoria,nombreC from contrato c,empleado e,categoria_profesional cp where c.id_empleado=e.ID and c.codigo_categoria=cp.cod_categoria;");
                        ResultSet resContratos = consultaContratos.executeQuery();
                        if (resContratos != null) {
      out.write("\r\n");
      out.write("                    <table border=\"1\" class=\"table table-striped table-bordered table-hover table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>COD_CONTRATO</th><th>FECHA_INICIO</th><th>FECHA_FINAL</th><th>ID_EMPLEADO</th><th>NOMBRE_EMPLEADO</th><th>APELLIDO</th><th>CODIGO_CATEGORIA</th><th>NOMBRE_CATEGORIA</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
while (resContratos.next()) {
      out.write(" \r\n");
      out.write("                        <tr> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(1));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(2));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(3));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(4));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(5));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(6));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(7));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(resContratos.getString(8));
      out.write("</td> \r\n");
      out.write("\r\n");
      out.write("                            <!--<td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('4', '");
      out.print(resContratos.getString(1));
      out.write("');\">SELECCIONAR</a></td>\r\n");
      out.write("                            <td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('2', '");
      out.print(resContratos.getString(1));
      out.write("');\">BORRAR</a></td>-->\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    ");
}
      out.write(" \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("        <script src=\"js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
