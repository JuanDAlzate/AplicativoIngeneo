package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Registros</title>\n");
      out.write("        <!--LLamado a bootstrap-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Stylo.css\"/>         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div class=\"col-md-4\"></div>            \n");
      out.write("            <div class=\" contenedor col-md-4\">\n");
      out.write("                <center><h2>Registro de empleados</h2></center>\n");
      out.write("               \n");
      out.write("                        ");
 if (request.getAttribute("mensaje") != null) { 
      out.write(" \n");
      out.write("                         <div class=\"col-md-12 alert alert-info\" role=\"alert\">\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("                        </div>\n");
      out.write("                        ");
 }
      out.write("                        \n");
      out.write("                    \n");
      out.write("                <br><br>\n");
      out.write("                <form action=\"ServletEmpleado\" action=\"POST\">\n");
      out.write("                    <legend>employee data</legend>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Identificacion</span>\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtIdentificacion\" placeholder=\"ID/CC\" aria-describedby=\"basic-addon1\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Nombre</span>\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtNombre\" placeholder=\"First name\" aria-describedby=\"basic-addon1\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Apellido</span>\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtApellido\" placeholder=\"Last name\" aria-describedby=\"basic-addon1\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Direccion</span>\n");
      out.write("                        <input id=\"redondo\" type=\"text\" class=\"form-control\" name=\"txtDireccion\" placeholder=\"(Cr 11 #23-12)\" aria-describedby=\"basic-addon1\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <span class=\"input-group-addon\" id=\"basic-addon1\">Telefono</span>\n");
      out.write("                        <input id=\"redondo\" type=\"number\" class=\"form-control\" name=\"txtTelefono\" placeholder=\"Phone number\" aria-describedby=\"basic-addon1\" required=\"Solo se permite numeros\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"btn-group col-md-12\">\n");
      out.write("                        <input id=\"redondo\"  type=\"submit\" class=\"btn btn-primary btn-md btn-block active\" value=\"Registrar\">\n");
      out.write("                        <input type=\"hidden\" name=\"txtOpcion\" value=\"1\">\n");
      out.write("                        \n");
      out.write("                    </div>               \n");
      out.write("\n");
      out.write("                </form>                 \n");
      out.write("            </div>   \n");
      out.write("            <div class=\"col-md-4\"></div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!--LLamado a la libreria Jquery-->\n");
      out.write("        <script src=\"jq/jquery-1.12.1.min.js\"/>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
