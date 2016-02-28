/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.ResultSet;

/**
 *
 * @author Juan
 */
public interface interfaceCRUD {
                                              
    public abstract boolean agregarRegistro();// opcion 1
    public abstract boolean borrarRegistro();// opcion 2
    public abstract boolean actualizarRegistro();//opcion 3
    
    
    public abstract ResultSet consultarRegistro();//opcion 4
    public abstract ResultSet listarTabla();// opcion 5
    
}
