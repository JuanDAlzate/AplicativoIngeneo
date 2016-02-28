/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.BEAN;

/**
 *
 * @author Juan
 */
public class BeanEmpleado {
    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String direccionEmpleado;
    private String telefonoEmpleado;

    public BeanEmpleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String direccionEmpleado,String telefonoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.telefonoEmpleado=telefonoEmpleado;
    }

    public BeanEmpleado() {
    }

    //Metdo set and getter
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    //Metdo set and getter
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
     //Metdo set and getter
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }
    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }
    //Metdo set and getter
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    
    public  String getTelefonoEmpleado(){
        return telefonoEmpleado;
    }
    public void setTelefono(String telefonoEmpleado){
        this.telefonoEmpleado=telefonoEmpleado;
    }
    
    
    
    
}
