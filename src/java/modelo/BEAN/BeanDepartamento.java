/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.BEAN;

/**
 *
 * @author ASUS X550C
 */
public class BeanDepartamento {
    private String nombreDepartamento;
    private int idEmpleadoEncargado;
    
    public BeanDepartamento(String nombreDepartamento,int idEmpleadoEncargado){
        this.nombreDepartamento=nombreDepartamento;
        this.idEmpleadoEncargado=idEmpleadoEncargado;
    }
    public BeanDepartamento(){}

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getIdEmpleadoEncargado() {
        return idEmpleadoEncargado;
    }

    public void setIdEmpleadoEncargado(int idEmpleadoEncargado) {
        this.idEmpleadoEncargado = idEmpleadoEncargado;
    }
    
    
}
