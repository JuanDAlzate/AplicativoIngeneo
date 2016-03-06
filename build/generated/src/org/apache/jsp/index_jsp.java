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
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
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
      out.write("                            <li><a href=\"#\">NOMINA</a></li>\r\n");
      out.write("                            <li><a href=\"#\">CONTRATO</a></li>\r\n");
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
      out.write("\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Identificacion</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtIdentificacion\" placeholder=\"ID/CC\" aria-describedby=\"basic-addon1\" title=\"Es necesaria su identificacion\" required value=\"");
      out.print(request.getAttribute("id"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Nombre</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtNombre\" placeholder=\"First name\" aria-describedby=\"basic-addon1\" title=\"Es necesaria su nombre, y debe contener letras\" required value=\"");
      out.print( request.getAttribute("nom"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Apellido</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtApellido\" placeholder=\"Last name\" aria-describedby=\"basic-addon1\" title=\"Es necesaria su apellido, y debe contener letras\" required value=\"");
      out.print(request.getAttribute("ape"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Direccion</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtDireccion\" placeholder=\"(Cr 11 #23-12)\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria su direccion ,y debe contener letras\" required value=\"");
      out.print(request.getAttribute("dir"));
      out.write("\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Telefono</span>\r\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtTelefono\" placeholder=\"Phone number\" aria-describedby=\"basic-addon1\"  title=\"Es necesaria su telefono, y debe contener numeros\" required=\"Solo se permite numeros\" value=\"");
      out.print(request.getAttribute("tel"));
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
      out.write("                                <option value=\"4\">CONSULTAR </option>\r\n");
      out.write("                                <option value=\"5\">LISTAR</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>               \r\n");
      out.write("\r\n");
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
ResultSet rs = (ResultSet) request.getAttribute("resultset");
                        if (rs != null) {
      out.write("\r\n");
      out.write("                    <table border=\"1\" class=\"table tabla-striped table-bordered table-hover table-condensed\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>ID</th><th>NOMBRE</th><th>APELLIDO</th><th>DIRECCION</th><th>TELEFONO</th><th colspan=\"2\">OPCIONES</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
while (rs.next()) {
      out.write(" \r\n");
      out.write("                        <tr> \r\n");
      out.write("                            <td> ");
      out.print(rs.getString(1));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(rs.getString(2));
      out.write("</td> \r\n");
      out.write("                            <td> ");
      out.print(rs.getString(3));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(rs.getString(4));
      out.write("</td>\r\n");
      out.write("                            <td> ");
      out.print(rs.getString(5));
      out.write("</td>\r\n");
      out.write("                            <td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('4', '");
      out.print(rs.getString(1));
      out.write("');\">SELECCIONAR</a></td>\r\n");
      out.write("                            <td> <a href=\"#\" alt=\"\" onclick=\"valida_envia('2', '");
      out.print(rs.getString(1));
      out.write("');\">BORRAR</a></td>\r\n");
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

                                ClassConex conn = new ClassConex();

                                PreparedStatement consulta = conn.ObtenerConexion().prepareStatement("SELECT * FROM empleado");
                                ResultSet res = consulta.executeQuery();
                                while (res.next()) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( res.getString("ID"));
      out.write('"');
      out.write('>');
      out.print( res.getString("nombre"));
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
 PreparedStatement consulta2 = conn.ObtenerConexion().prepareStatement("select departamento.*,empleado.nombre from empleado inner join departamento on departamento.id_coordinador=empleado.ID");
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
      out.write("        <!--En este div se estara presentados los campos y l ainformacion para gestionar la categoria profesional--> \r\n");
      out.write("        <div id=\"contenedor3\" class=\"container\">\r\n");
      out.write("            <p class=\"titulo\">Gestion de la categoria profesional</p>\r\n");
      out.write("            <br><br>\r\n");
      out.write("            <div class=\"contenedor col-md-4\">\r\n");
      out.write("                <center><h2>Registro de una categoria profesional</h2></center>\r\n");
      out.write("                    ");
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
      out.write("  \r\n");
      out.write("                <br><br>\r\n");
      out.write("                <form action=\"ServeltCategoria\" method=\"POST\">\r\n");
      out.write("                    <legend>professional categories</legend>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Nombre de la categoria</span>\r\n");
      out.write("                        <input type=\"text\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtNombreCategoria\" placeholder=\"Name\" title=\"Es necesaria un nombre para la categoria\" required/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                      <div class=\"input-group\">\r\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\" >Codigo de la categoria a eliminar</span>\r\n");
      out.write("                        <input type=\"number\" id=\"redondo\" class=\"form-control\" aria-describedby=\"basic-addon1\" name=\"txtCodigoCategoria\" placeholder=\"Name\" title=\"Es necesaria el codigo de la categoria para poder eliminar\" required/>\r\n");
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
      out.write("            <div class=\"col-md-7\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
