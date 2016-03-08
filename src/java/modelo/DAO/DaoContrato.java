/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BEAN.BeanContrato;
import sun.util.logging.PlatformLogger;
import util.ClassConex;
import util.interfaceCRUD;


/**
 *
 * @author ASUS X550C
 */
public class DaoContrato extends ClassConex {
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    
    public boolean encontrado=false;
    public boolean listo = false;
    
    public String fechaInicio="";
    public String fechaFinal="";
    public int empleadoContrato;
    public int categoriaContrato;
    
    public DaoContrato(BeanContrato contrato){
        super();
        try{
            conn=this.ObtenerConexion();
            st=conn.createStatement();
            fechaInicio=contrato.getFechaInicial();
            fechaFinal=contrato.getFechaFinal();
            empleadoContrato=contrato.getEmpleadoContratado();
            categoriaContrato=contrato.getCategoriaContrato();
        }catch(SQLException ex) {
            Logger.getLogger(DaoContrato.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public boolean agregarRegistro() {
        try{
            st.executeUpdate("insert into contrato (fecha_inicio,fecha_fin,id_empleado,codigo_categoria) values ('"+fechaInicio+"','"+fechaFinal+"','"+empleadoContrato+"','"+categoriaContrato+"')");
            listo=true;
        }catch(SQLException ex){
            Logger.getLogger(DaoContrato.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listo;
         }

   
    public boolean borrarRegistro(int cod) {
        try{
           st.executeUpdate("delete from contrato where cod_contrato='"+cod+"';");
           listo=true;
        }catch(SQLException ex){
           Logger.getLogger(DaoContrato.class.getName()).log(Level.SEVERE,null,ex);
        }    
         return listo;
    }

   
    public boolean actualizarRegistro(int cod) {
        try{
           st.executeUpdate("update contrato set fecha_inicio='"+fechaInicio+"',fecha_fin='"+fechaFinal+"',id_empleado='"+empleadoContrato+"',codigo_categoria='"+categoriaContrato+"' where cod_contrato='"+cod+"'");
           listo=true;
        }catch(SQLException ex){
             Logger.getLogger(DaoContrato.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listo;
    }

  
    public ResultSet consultarRegistro(int cod) {
        try{
            rs=st.executeQuery("SELECT cod_contrato,fecha_inicio,fecha_fin,id_empleado,nombreE,apellido,codigo_categoria,nombreC from contrato c,empleado e,categoria_profesional cp where c.id_empleado=e.ID and c.codigo_categoria=cp.cod_categoria and cod_contrato='"+cod+"';");
        }catch(SQLException ex){
            Logger.getLogger(DaoContrato.class.getName()).log(Level.SEVERE,null,ex);
        }
        return rs;
    }

}
