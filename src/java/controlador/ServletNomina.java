/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BEAN.BeanNomina;
import modelo.DAO.DaoNomina;

/**
 *
 * @author ASUS X550C
 */
@WebServlet(name = "ServletNomina", urlPatterns = {"/ServletNomina"})
public class ServletNomina extends HttpServlet {

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

        int opcion = Integer.parseInt(request.getParameter("txtOpcion"));
        String fecha = "";
        double salario;
        int codEmpleadoNomina;
        int codigoNomina;

        ResultSet rs;

        String mensajexitosoN = "Operacion exitosa,Felicidades";
        String mensajeErrorN = "Operacion fallida,Lo siento";

        switch (opcion) {
            case 1:
                fecha = request.getParameter("txtFechaNomina");
                salario = Double.parseDouble(request.getParameter("txtSalarioNomina"));
                codEmpleadoNomina = Integer.parseInt(request.getParameter("txtEmpleadoNomina"));

                BeanNomina BNomina = new BeanNomina(fecha, salario, codEmpleadoNomina);
                DaoNomina DNomina = new DaoNomina(BNomina);
                if (DNomina.agregarRegistro()) {
                    request.setAttribute("MensajeN", mensajexitosoN);
                } else {
                    request.setAttribute("MensajeN", mensajeErrorN);
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 2:

                codigoNomina = Integer.parseInt(request.getParameter("txtCodigoNomina"));
                BeanNomina BNominaBorrar = new BeanNomina();
                DaoNomina DNominaBorrar = new DaoNomina(BNominaBorrar);

                if (DNominaBorrar.borrarRegistro(codigoNomina)) {
                    request.setAttribute("MensajeN", mensajexitosoN);
                } else {
                    request.setAttribute("MensajeN", mensajeErrorN);
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            case 3:

                fecha = request.getParameter("txtFechaNomina");
                salario = Double.parseDouble(request.getParameter("txtSalarioNomina"));
                codEmpleadoNomina = Integer.parseInt(request.getParameter("txtEmpleadoNomina"));
                codigoNomina = Integer.parseInt(request.getParameter("txtCodigoNomina"));

                BeanNomina BNominaActualizar = new BeanNomina(fecha, salario, codEmpleadoNomina);
                DaoNomina DNominaActualizar = new DaoNomina(BNominaActualizar);

                if (DNominaActualizar.actualizarRegistro(codigoNomina)) {
                    request.setAttribute("MensajeN", mensajexitosoN);
                } else {
                    request.setAttribute("MensajeN", mensajeErrorN);
                }
                request.getRequestDispatcher("index.jsp").forward(request, response);

            case 4://CONSULTAR UN REGISTRO
                codigoNomina = Integer.parseInt(request.getParameter("txtCodigoNomina"));
                
                BeanNomina BNominaConsultar = new BeanNomina();
                DaoNomina DNominaconsultar = new DaoNomina(BNominaConsultar);
                
                rs = (ResultSet) DNominaconsultar.consultarRegistro(codigoNomina);
                try {
                    while (rs.next()) {
                        request.setAttribute("cod_nomina", rs.getString(1));
                        request.setAttribute("fecha", rs.getString(2));
                        request.setAttribute("salario", rs.getString(3));
                        request.setAttribute("id_empleado", rs.getString(4));
                        request.setAttribute("nombre", rs.getString(5));
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ServletNomina.class.getName()).log(Level.SEVERE, null, ex);
                }
                //request.setAttribute("resultset", rs);
                
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
