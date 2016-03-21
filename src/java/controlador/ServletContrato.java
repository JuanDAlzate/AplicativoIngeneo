/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.servlet.http.HttpSession;
import modelo.BEAN.BeanContrato;
import modelo.DAO.DaoContrato;

/**
 *
 * @author ASUS X550C
 */
@WebServlet(name = "ServletContrato", urlPatterns = {"/ServletContrato"})
public class ServletContrato extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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

        String fechaInicio = "";
        String fechaFinal = "";
        int empleadoContrato ;
        int categoriaContrato;
        int codigoContrato;
        int opcion = Integer.parseInt(request.getParameter("txtOpcion"));
        //-----------------------------------------------------------//
        
        ResultSet rs;
        //-----------------------------------------------
        String mExito = "Operacion exitosa, Felicidades!!!!";
        String mError = "Operacion Fallida, Lo siento mucho!!!!";
        String mensaje;
        HttpSession session=request.getSession();

        switch (opcion) {
            case 1:
                  fechaInicio = request.getParameter("txtFechaInicio");
                  fechaFinal = request.getParameter("txtFechaFinal");
                  empleadoContrato = Integer.parseInt(request.getParameter("txtEmpleadoAContratar"));
                  categoriaContrato = Integer.parseInt(request.getParameter("txtContratoCategoria"));
                  
                  BeanContrato BContrato = new BeanContrato(fechaInicio, fechaFinal, empleadoContrato, categoriaContrato);
                  DaoContrato DContrato = new DaoContrato(BContrato);                
                
                if (DContrato.agregarRegistro()) {
                       mensaje=mExito;
                       session.setAttribute("mensajeContrato", mensaje);                      
                        //request.setAttribute("mensajeContrato", mExito);
                } else {
                      mensaje=mError;
                      session.setAttribute("mensajeContrato", mensaje);
                    //request.setAttribute("mensajeContrato", mError);
                }
                     response.sendRedirect("index.jsp#contenedor5");
                    //request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 2:
                  codigoContrato = Integer.parseInt(request.getParameter("txtCodigoContrato")); 
                  
                  BeanContrato BContratoBorrar = new BeanContrato();
                  DaoContrato DContratoBorrar = new DaoContrato(BContratoBorrar);
                 
                if(DContratoBorrar.borrarRegistro(codigoContrato)) {
                    mensaje=mExito;
                    session.setAttribute("mensajeContrato", mExito);
                    //request.setAttribute("mensajeContrato", mExito);
                } else {
                    mensaje=mError;
                    session.setAttribute("mensajeContrato", mError);
                    //request.setAttribute("mensajeContrato", mError);
                }
                    response.sendRedirect("index.jsp#contenedor5");
                    //request.getRequestDispatcher("index.jsp").forward(request, response);
                    
                    //Se eliminan los parametros que estan en la session
                     session.removeAttribute("codigoContrato");
                      session.removeAttribute("fechaInicio");
                      session.removeAttribute("fechaFinal");
                      session.removeAttribute("id_empleado");
                      session.removeAttribute("nombreEmpleado");
                      session.removeAttribute("apellidoEmpleado");
                      session.removeAttribute("codigoCategoria");
                      session.removeAttribute("nombreCategoria");
                break;
           case 3:
               
                codigoContrato = Integer.parseInt(request.getParameter("txtCodigoContrato"));                
                fechaInicio = request.getParameter("txtFechaInicio");
                fechaFinal = request.getParameter("txtFechaFinal");
                empleadoContrato = Integer.parseInt(request.getParameter("txtEmpleadoAContratar"));
                categoriaContrato = Integer.parseInt(request.getParameter("txtContratoCategoria"));
               
                  BeanContrato BContratoActualizar = new BeanContrato(fechaInicio, fechaFinal, empleadoContrato, categoriaContrato);
                  DaoContrato DContratoActualizar = new DaoContrato(BContratoActualizar);               
               
                if (DContratoActualizar.actualizarRegistro(codigoContrato)) {
                   mensaje=mExito;
                   session.setAttribute("mensajeContrato", mExito);
                   //request.setAttribute("mensajeContrato", mExito);
                } else {
                    mensaje=mError;
                    session.setAttribute("mensajeContrato", mError);
                    //request.setAttribute("mensajeContrato", mError);
                }
                    response.sendRedirect("index.jsp#contenedor5");
                    //request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 4:
                
                  codigoContrato = Integer.parseInt(request.getParameter("txtCodigoContrato")); 
                  BeanContrato BContratoConsultar = new BeanContrato();
                  DaoContrato DContratoConsultar = new DaoContrato(BContratoConsultar);       
                 
                 rs=(ResultSet)DContratoConsultar.consultarRegistro(codigoContrato);
                 try{
                    while(rs.next()){
                      session.setAttribute("codigoContrato", rs.getString(1));
                      session.setAttribute("fechaInicio", rs.getString(2));
                      session.setAttribute("fechaFinal", rs.getString(3));
                      session.setAttribute("id_empleado", rs.getString(4));
                      session.setAttribute("nombreEmpleado", rs.getString(5));
                      session.setAttribute("apellidoEmpleado", rs.getString(6));
                      session.setAttribute("codigoCategoria", rs.getString(7));
                      session.setAttribute("nombreCategoria", rs.getString(8));
                    }
                    }catch(SQLException ex){
                            Logger.getLogger(ServletContrato.class.getName()).log(Level.SEVERE, null, ex);
                    }
                     response.sendRedirect("index.jsp#contenedor5");
                    //request.getRequestDispatcher("index.jsp").forward(request, response);                 
                  break;
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
