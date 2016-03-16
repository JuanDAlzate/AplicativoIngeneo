/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BEAN.BeanEmpleado;
import modelo.DAO.DaoEmpleado;

/**
 *
 * @author Juan Diego Porras
 */
@WebServlet(name = "ServletEmpleado", urlPatterns = {"/ServletEmpleado"})
public class ServletEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
         int opcion=Integer.parseInt(request.getParameter("txtOpcion"));
         int id;
         String nombre="";
         String apellido="";
         String direccion="";
         String telefono="";
         int empleadoJefe;
        
    //___________________________________________________________________________________    
        
        ResultSet rs;
        
                   
         String mExito="Operacion exitosa, Felicidades!!!!"; 
         String mError="Operacion Fallida, Lo siento mucho!!!!";
         
         switch(opcion){
            case 1:// AGREGAR REGISTROS
                id=Integer.parseInt(request.getParameter("txtIdentificacion"));   
                nombre=request.getParameter("txtNombre");
                apellido=request.getParameter("txtApellido");
                direccion=request.getParameter("txtDireccion");
                telefono=request.getParameter("txtTelefono");
                empleadoJefe=Integer.parseInt(request.getParameter("txtEmpleadoJefe"));
                
                BeanEmpleado BEmpleado=new BeanEmpleado(id,nombre,apellido,direccion,telefono,empleadoJefe);
                DaoEmpleado DEmpleado=new DaoEmpleado(BEmpleado);

                if(DEmpleado.agregarRegistro()){
                    request.setAttribute("mensaje", mExito);
                }else{request.setAttribute("mensaje", mError);}
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 2://BORRAR REGISTROS
                
                
                id=Integer.parseInt(request.getParameter("txtIdentificacion"));                
                BeanEmpleado BEmpleadoB=new BeanEmpleado(id);
                DaoEmpleado DEmpleadoB=new DaoEmpleado(BEmpleadoB);
                
                //Validacion para que un empleado no sea eliminado si es un coordinador
                if(DEmpleadoB.buscarCoordinador(id)){
                   request.setAttribute("mensaje", "El empleado es un coordinador, debe de cambiarlo si quiere eliminarlo ");
                 
                }else if(DEmpleadoB.buscarNomina(id)){
                   request.setAttribute("mensaje", "El empleado tiene asignadas nominas, debe de manejar esto si desea eliminarlo ");
                }else if(DEmpleadoB.buscarContratos(id)){
                   request.setAttribute("mensaje", "Al empleado se le han hecho contratos, maneje esto primero y despues si podra eliminarlo");
                }else{
                   if(DEmpleadoB.borrarRegistro()){
                    request.setAttribute("mensaje", mExito);
                }else{
                    request.setAttribute("mensaje", mError);
                }   
                } 
                   
                request.getRequestDispatcher("index.jsp").forward(request, response);
            break;    
            case 3://ACTUALIZAR REGISTROS
                id=Integer.parseInt(request.getParameter("txtIdentificacion"));   
                nombre=request.getParameter("txtNombre");
                apellido=request.getParameter("txtApellido");
                direccion=request.getParameter("txtDireccion");
                telefono=request.getParameter("txtTelefono");
                empleadoJefe=Integer.parseInt(request.getParameter("txtEmpleadoJefe"));                
                
                id=Integer.parseInt(request.getParameter("txtIdentificacion"));                
                BeanEmpleado BEmpleadoA=new BeanEmpleado(id,nombre,apellido,direccion,telefono,empleadoJefe);
                DaoEmpleado DEmpleadoA=new DaoEmpleado(BEmpleadoA);                
                
                if(DEmpleadoA.actualizarRegistro()){
                    request.setAttribute("mensaje", mExito);
                }else{request.setAttribute("mensaje", mError);}
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 4://CONSULTAR UN REGISTRO
                 id=Integer.parseInt(request.getParameter("txtIdentificacion"));                
                BeanEmpleado BEmpleadoC=new BeanEmpleado(id);
                DaoEmpleado DEmpleadoC=new DaoEmpleado(BEmpleadoC);
                rs=(ResultSet)DEmpleadoC.consultarRegistro();
        try {
             while(rs.next()){
                request.setAttribute("id", rs.getString(1));
                request.setAttribute("nom", rs.getString(3));
                request.setAttribute("ape", rs.getString(4));
                request.setAttribute("dir", rs.getString(5));
                request.setAttribute("tel", rs.getString(6));
                request.setAttribute("id_jefe", rs.getString(7));
                request.setAttribute("name_jefe", rs.getString(8));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
                //request.setAttribute("resultset", rs);
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            /*case 5://LISTAR TODOS LOS REGISTROS
                rs=DEmpleado.listarTabla();
                request.setAttribute("resultset", rs);
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;*/
            default:
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
         }
        
//        try {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Pagina respuesta</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Pagina respuesta</h1><br> opcion " + opcion);
//            out.println("<br>Identificacion:"+BCliente.getIdCliente());
//            out.println("<br>nombre:"+BCliente.getNombreCliente());
//            out.println("<br>Apellido:"+BCliente.getApellidoCliente());
//            out.println("<br>Genero:"+BCliente.getGeneroCliente());
//            
//            out.println("</body>");
//            out.println("</html>");
//        } finally {            
//            out.close();
//        }
//    
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
