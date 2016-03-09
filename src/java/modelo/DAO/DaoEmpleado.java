/**
 *
 * @author Juan
 */
package modelo.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BEAN.BeanEmpleado;
import util.*;


public class DaoEmpleado extends ClassConex implements  interfaceCRUD{
    
    public Connection conn=null;
    public Statement st=null;
    public ResultSet rs=null;
    
    
    public boolean encontrado=false;
    public boolean listo = false;
    
    public int id;
    public String nombre="";
    public String apellido="";
    public String direccion="";
    public String telefono="";
    public int empleadoJefe;
    
    
    
    /**
     *
     * @param empleado
     */
    public DaoEmpleado(BeanEmpleado empleado) {
        super();
        try {
            conn = this.ObtenerConexion();
            st = conn.createStatement();
            
            id = empleado.getIdEmpleado();
            nombre =empleado.getNombreEmpleado();
            apellido =empleado.getApellidoEmpleado();
            direccion =empleado.getDireccionEmpleado();            
            telefono=empleado.getTelefonoEmpleado();
            empleadoJefe=empleado.getEmpleadoJefe();
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   @Override
    public boolean agregarRegistro() { //opcion 1.
        try {
            st.executeUpdate("insert into empleado (ID,nombreE,apellido,direccion,telefono,id_responsable) values ('"+id+"','"+nombre+"','"+apellido+"','"+direccion+"','"+telefono+"','"+empleadoJefe+"');");
            listo=true;
           
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listo;
    }

   
    @Override
    public boolean borrarRegistro() {// opcion 2.
        try {
            st.executeUpdate("delete from empleado where ID='"+id+"';");
            listo=true;
           
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        return listo;
    }

    @Override
    public boolean actualizarRegistro() { //opcion 3.
        try {
            st.executeUpdate("update  empleado set nombreE='"+nombre+"',apellido='"+apellido+"',direccion='"+direccion+"',telefono='"+telefono+"',id_responsable='"+empleadoJefe+"' where ID='"+id+"';");
            listo=true;
           
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
      
        }
        return listo;
    }

    @Override
    public ResultSet consultarRegistro() { //opcion 4.
         try {        
            rs = st.executeQuery("select empleado.ID,empleado.cod_empleado,empleado.nombreE,empleado.apellido,empleado.direccion,empleado.telefono,jefe.ID,jefe.nombreE from empleado left join empleado jefe on empleado.id_responsable=jefe.ID where empleado.ID='"+id+"'");
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
    }

    @Override
    public ResultSet listarTabla() { //opcion 5.
        try {        
                rs = st.executeQuery("SELECT ID,nombreE,apellido,direccion,telefono  FROM empleado order by ID;");
        } catch (SQLException ex) {
            Logger.getLogger(DaoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
        
    }
    
}
