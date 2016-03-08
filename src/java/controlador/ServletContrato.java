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

        String fechaInicio = request.getParameter("txtFechaInicio");
        String fechaFinal = request.getParameter("txtFechaFinal");
        int empleadoContrato = Integer.parseInt(request.getParameter("txtEmpleadoAContratar"));
        int categoriaContrato = Integer.parseInt(request.getParameter("txtContratoCategoria"));
        int codigoContrato = Integer.parseInt(request.getParameter("txtCodigoContrato"));
        int opcion = Integer.parseInt(request.getParameter("txtOpcion"));
        //-----------------------------------------------------------//
        BeanContrato BContrato = new BeanContrato(fechaInicio, fechaFinal, empleadoContrato, categoriaContrato);
        DaoContrato DContrato = new DaoContrato(BContrato);
        ResultSet rs;
        //-----------------------------------------------
        String mExito = "Operacion exitosa, Felicidades!!!!";
        String mError = "Operacion Fallida, Lo siento mucho!!!!";

        switch (opcion) {
            case 1:
                if (DContrato.agregarRegistro()) {
                    request.setAttribute("mensajeContrato", mExito);
                } else {
                    request.setAttribute("mensajeContrato", mError);
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 2:
                if (DContrato.borrarRegistro(codigoContrato)) {
                    request.setAttribute("mensajeContrato", mExito);
                } else {
                    request.setAttribute("mensajeContrato", mError);
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 3:
                if (DContrato.actualizarRegistro(codigoContrato)) {
                    request.setAttribute("mensajeContrato", mExito);
                } else {
                    request.setAttribute("mensajeContrato", mError);
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 4:
                 rs=(ResultSet)DContrato.consultarRegistro(codigoContrato);
                 try{
                    while(rs.next()){
                      request.setAttribute("codigoContrato", rs.getString(1));
                      request.setAttribute("fechaInicio", rs.getString(2));
                      request.setAttribute("fechaFinal", rs.getString(3));
                      request.setAttribute("id_empleado", rs.getString(4));
                      request.setAttribute("nombreEmpleado", rs.getString(5));
                      request.setAttribute("apellidoEmpleado", rs.getString(6));
                      request.setAttribute("codigoCategoria", rs.getString(7));
                      request.setAttribute("nombreCategoria", rs.getString(8));
                    }
                    }catch(SQLException ex){
                            Logger.getLogger(ServletContrato.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  request.getRequestDispatcher("index.jsp").forward(request, response);                 
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
