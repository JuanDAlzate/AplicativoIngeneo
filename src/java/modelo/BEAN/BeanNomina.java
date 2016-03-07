
package modelo.BEAN;

public class BeanNomina {
    
    private String fecha;
    private Double salario;
    private int codigoEmpleadoNomina;
    
    public BeanNomina(String fecha,Double salario,int codigoEmpleadoNomina){
        this.fecha=fecha;
        this.salario=salario;
        this.codigoEmpleadoNomina=codigoEmpleadoNomina;
    }
    public BeanNomina(){}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getCodigoEmpleadoNomina() {
        return codigoEmpleadoNomina;
    }

    public void setCodigoEmpleadoNomina(int codigoEmpleadoNomina) {
        this.codigoEmpleadoNomina = codigoEmpleadoNomina;
    }
    
    
    
}
