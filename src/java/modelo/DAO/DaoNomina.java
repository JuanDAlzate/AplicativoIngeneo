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
import modelo.BEAN.BeanNomina;
import java.util.logging.Logger;
import util.ClassConex;
import util.interfaceCRUD;

/**
 *
 * @author ASUS X550C
 */
public class DaoNomina extends ClassConex implements interfaceCRUD{
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    
    public boolean encontrado=false;
    public boolean listo=false;
    
    public String fecha;
    public Double salario;
    public int codEmpleado;
    
    public DaoNomina(BeanNomina nomina){
        super();
        try {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            
            fecha = nomina.getFecha();
            salario =nomina.getSalario();
            codEmpleado =nomina.getCodigoEmpleadoNomina();
           
        } catch (SQLException ex) {
            Logger.getLogger(DaoNomina.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    @Override
    public boolean agregarRegistro() {
        try{
            st.executeUpdate("insert into nomina (fecha,salario,id_empleado) values ('"+fecha+"','"+salario+"','"+codEmpleado+"');");
            listo=true;
            
        }catch(SQLException ex){
             Logger.getLogger(DaoNomina.class.getName()).log(Level.SEVERE, null, ex);
       }     
        return listo;
    }

    
    public boolean borrarRegistro(int codigo) {
        try{
            st.executeUpdate("delete from nomina where cod_nomina='"+codigo+"';");
            listo=true;
        }catch(SQLException ex){
               Logger.getLogger(DaoNomina.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listo;
    }

   
    public boolean actualizarRegistro(int cod) {
        try{
            st.executeUpdate("update nomina set fecha='"+fecha+"',salario='"+salario+"',id_empleado='"+codEmpleado+"' where cod_nomina='"+cod+"';");
            listo=true;
        }catch(SQLException ex){
              Logger.getLogger(DaoNomina.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listo;
    }

    
    public ResultSet consultarRegistro(int cod) {
         try{
            rs=st.executeQuery("select nomina.*,empleado.nombreE from empleado inner join nomina on nomina.id_empleado=empleado.ID where cod_nomina='"+cod+"';");        
    }catch(SQLException ex){
           Logger.getLogger(DaoNomina.class.getName()).log(Level.SEVERE, null, ex);
    }
        return  rs;    
    
    }

    @Override
    public ResultSet listarTabla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet consultarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean borrarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
