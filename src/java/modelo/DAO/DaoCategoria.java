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
import modelo.BEAN.BeanCategoria;
import util.ClassConex;
import util.interfaceCRUD;

/**
 *
 * @author ASUS X550C
 */
public class DaoCategoria  extends ClassConex implements interfaceCRUD{
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    
    public boolean encontrado=false;
    public boolean listo=false;
    
    public String nombre="";
    
    public DaoCategoria(BeanCategoria categoria){
        super();
        try{
            conn=this.ObtenerConexion();
            st=conn.createStatement();
            this.nombre=categoria.getNombre();
            
            }catch(SQLException ex){
                  Logger.getLogger(DaoCategoria.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }
    
    
    
    
    

    @Override
    public boolean agregarRegistro() {
        try{
            st.executeUpdate("insert into categoria_profesional (nombre) values ('"+nombre+"');");
            listo=true;
        }catch(SQLException ex){
            Logger.getLogger(DaoCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }

    public boolean borrarRegistro(int cod) {
        try{
            st.executeUpdate("delete from categoria_profesional where cod_categoria='"+cod+"';");
            listo=true;
        }catch(SQLException ex){
               Logger.getLogger(DaoCategoria.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listo;
         
    }

   
    public boolean actualizarRegistro(int cod) {
        try{
            st.executeUpdate("update categoria_profesional set nombre='"+nombre+"' where cod_categoria='"+cod+"'");
               listo=true;
        }catch(SQLException ex){
               Logger.getLogger(DaoCategoria.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        return listo;
        }

    @Override
    public boolean borrarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet consultarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet listarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
}
