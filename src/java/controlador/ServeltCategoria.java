/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.BEAN.BeanCategoria;
import modelo.DAO.DaoCategoria;

/**
 *
 * @author ASUS X550C
 */
@WebServlet(name = "ServeltCategoria", urlPatterns = {"/ServeltCategoria"})
public class ServeltCategoria extends HttpServlet {

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
        
        int opcionCategoria=Integer.parseInt(request.getParameter("txtOpcion"));
        String nombreCategoria="";
        int codCategoria;
        
        //---------------------------------------------------------
        
        //--------------------------------------------------
        String mExito="Felicidades,operacion exitosa";
        String mError="Lo siento mucho ,operacion fallida";
        String mensaje;
        HttpSession session=request.getSession();
        
        switch(opcionCategoria){
            case 1://AGREGAR CATEGORIA       
                 nombreCategoria=request.getParameter("txtNombreCategoria");
                 BeanCategoria BCategoria=new BeanCategoria(nombreCategoria);
                 DaoCategoria DCategoria=new DaoCategoria(BCategoria);
                 
                if(DCategoria.agregarRegistro()){
                   mensaje=mExito;
                   session.setAttribute("Mensaje", mExito);
                   //request.setAttribute("Mensaje", mExito);
                }else{
                    mensaje=mError;
                    session.setAttribute("Mensaje", mError);
                    //request.setAttribute("Mensaje", mError);
                }
                    response.sendRedirect("index.jsp#contenedor3");
                    //request.getRequestDispatcher("index.jsp").forward(request,response);
                break;
            case 2://BORRAR CATEGORIA
                
                   codCategoria=Integer.parseInt(request.getParameter("txtCodigoCategoria"));
                   BeanCategoria BCategoriaBorrar=new BeanCategoria();
                   DaoCategoria DCategoriaBorrar=new DaoCategoria(BCategoriaBorrar);
                   
                   if(DCategoriaBorrar.buscarCategoriaContrato(codCategoria)){
                   
                         mensaje="La categoria esta siendo utilizada en un contrato hecho";
                         session.setAttribute("Mensaje", mensaje);
                        //request.setAttribute("Mensaje", "La categoria esta siendo utilizada en un contrato hecho");
                   }else{
                      
                       if(DCategoriaBorrar.borrarRegistro(codCategoria)){
                         mensaje=mExito;
                         session.setAttribute("Mensaje", mExito);
                        //request.setAttribute("Mensaje", mExito);
                    }else{
                         mensaje=mError;
                         session.setAttribute("Mensaje", mError);
                         //request.setAttribute("Mensaje", mError);
                    }
                       
                   }
                    response.sendRedirect("index.jsp#contenedor3");
                    //request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
            case 3://ACTUALIZAR CATEGORIA
                    codCategoria=Integer.parseInt(request.getParameter("txtCodigoCategoria"));
                    nombreCategoria=request.getParameter("txtNombreCategoria");                    
                    BeanCategoria BCategoriaActualizar=new BeanCategoria(nombreCategoria);
                    DaoCategoria DCategoriaActualizar=new DaoCategoria(BCategoriaActualizar);
                    
                    if(DCategoriaActualizar.actualizarRegistro(codCategoria)){
                         mensaje=mExito;
                         session.setAttribute("Mensaje", mensaje);
                        //request.setAttribute("Mensaje", mExito);
                    }else{
                        mensaje=mError;
                        session.setAttribute("Mensaje", mensaje);
                      //request.setAttribute("Mensaje", mError);
                    }
                     response.sendRedirect("index.jsp#contenedor3");
                    //request.getRequestDispatcher("index.jsp").forward(request, response);
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
