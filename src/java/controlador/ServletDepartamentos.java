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
import modelo.BEAN.BeanDepartamento;
import modelo.BEAN.BeanEmpleado;
import modelo.DAO.DaoDepartamento;
import modelo.DAO.DaoEmpleado;

/**
 *
 * @author Juan Diego Porras
 */
@WebServlet(name = "ServelDepartamentos", urlPatterns = {"/ServleDepartamento"})
public class ServletDepartamentos extends HttpServlet {

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
        
        Integer codigoDepartamento;
        
        int opcion=Integer.parseInt(request.getParameter("txtOpcionDepartamento"));       
        String nombreDepartamento="";
        int idEncargadoDepartamento;
         
        
        
    //___________________________________________________________________________________    
        
        ResultSet rs;
        
                   
         String MensajeExitoD="Operacion exitosa, Felicidades!!!!"; 
         String MensajeErrorD="Operacion Fallida, Lo siento mucho!!!!";
         
         switch(opcion){
            case 1:// AGREGAR REGISTROS
                nombreDepartamento=request.getParameter("txtNombreDepartamento");
                idEncargadoDepartamento=Integer.parseInt(request.getParameter("txtEmpleadoEncargado"));              
                BeanDepartamento BDepartamento=new BeanDepartamento(nombreDepartamento,idEncargadoDepartamento);
                DaoDepartamento DDepartamento=new DaoDepartamento(BDepartamento);
                
                if(DDepartamento.agregarRegistro()){
                    request.setAttribute("mensajeD", MensajeExitoD);
                }else{
                    request.setAttribute("mensajeD", MensajeErrorD);
                }
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 2://BORRAR REGISTROS
                
                codigoDepartamento=Integer.parseInt(request.getParameter("txtCodigoDepartamentoEliminar"));
                BeanDepartamento BDepartamentoB=new BeanDepartamento();
                DaoDepartamento DDepartamentoB=new DaoDepartamento(BDepartamentoB);
                
                if(DDepartamentoB.borrarRegistro(codigoDepartamento)){
                    request.setAttribute("mensajeD", MensajeExitoD);
                }else{request.setAttribute("mensajeD", MensajeErrorD);}
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
            break;    
           case 3://ACTUALIZAR REGISTROS
               
                nombreDepartamento=request.getParameter("txtNombreDepartamento");
                idEncargadoDepartamento=Integer.parseInt(request.getParameter("txtEmpleadoEncargado"));
                 codigoDepartamento=Integer.parseInt(request.getParameter("txtCodigoDepartamentoEliminar")); 
                 
                 BeanDepartamento BDepartamentoA=new BeanDepartamento(nombreDepartamento,idEncargadoDepartamento);
                DaoDepartamento DDepartamentoA=new DaoDepartamento(BDepartamentoA);
                
                if(DDepartamentoA.actualizarRegistro(codigoDepartamento)){
                    request.setAttribute("mensajeD", MensajeExitoD);
                }else{request.setAttribute("mensajeD", MensajeErrorD);}
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
             case 4://CONSULTAR UN REGISTRO
                 
                 codigoDepartamento=Integer.parseInt(request.getParameter("txtCodigoDepartamentoEliminar")); 
                 BeanDepartamento BDepartamentoCon=new BeanDepartamento();
                DaoDepartamento DDepartamentoCon=new DaoDepartamento(BDepartamentoCon);
                
                rs=(ResultSet)DDepartamentoCon.consultarRegistro(codigoDepartamento);
        try {
            while(rs.next()){
                request.setAttribute("cod_departamento", rs.getString(1));
                request.setAttribute("nombre", rs.getString(2));
                request.setAttribute("id_Coordinador", rs.getString(3));
                request.setAttribute("nombre_Coordinador", rs.getString(4));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
                //request.setAttribute("resultset", rs);
                
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
          /*  case 5://LISTAR TODOS LOS REGISTROS
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
