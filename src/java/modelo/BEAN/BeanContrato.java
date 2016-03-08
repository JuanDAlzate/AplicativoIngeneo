
package modelo.BEAN;

public class BeanContrato {
    
    private String fechaInicial;
    private String fechaFinal;
    private int empleadoContratado;
    private int categoriaContrato;

    public BeanContrato(String fechaInicial, String fechaFinal, int empleadoContratado, int categoriaContrato) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.empleadoContratado = empleadoContratado;
        this.categoriaContrato = categoriaContrato;
    }
    
   public BeanContrato(){}

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getEmpleadoContratado() {
        return empleadoContratado;
    }

    public void setEmpleadoContratado(int empleadoContratado) {
        this.empleadoContratado = empleadoContratado;
    }

    public int getCategoriaContrato() {
        return categoriaContrato;
    }

    public void setCategoriaContrato(int categoriaContrato) {
        this.categoriaContrato = categoriaContrato;
    }
   
   
}
