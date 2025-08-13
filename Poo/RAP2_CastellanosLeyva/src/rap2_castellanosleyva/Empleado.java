e/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rap2_castellanosleyva;

/**
 *
 * @author ezequ
 */
public abstract class Empleado {
    //Deben de ser 10 atributos
    private String nombre;
    private String apellido;
    private String rfc;
    private String telefono;
    private String direccion;
    
    private String departamento;
    private int antiguedad;
    private String fechaIngreso;
    private int noEmpleado;
    private double salario;        
    private Empleado jefe;
    
    public Empleado(String nombre, String apellido, String rfc, String telefono, String direccion){
        this.apellido = apellido;
        this.direccion = direccion;
        this.nombre = nombre;
        this.rfc = rfc;
        this.telefono = telefono;
                
    }
    public String verDatosGenerales(){
        return "Empleado '" + nombre + " " + apellido + "' con el # empleado '" + noEmpleado + "' pertenece al departamento '" + departamento + "'";
    }

    /**
     *
     */
    public abstract void incrementarSalario();
    /*
    public Empleado(5 argumentos){
        this.atributo = argumento;
        //los demas
*/
   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    /**
     * @return the fechaIngreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the noEmpleado
     */
    public int getNoEmpleado() {
        return noEmpleado;
    }

    /**
     * @param noEmpleado the noEmpleado to set
     */
    public void setNoEmpleado(int noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the jefe
     */
    public Empleado getJefe() {
        return jefe;
    }

    /**
     * @param jefe the jefe to set
     */
    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }
    
}
