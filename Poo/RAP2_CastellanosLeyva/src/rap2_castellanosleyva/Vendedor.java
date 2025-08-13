/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rap2_castellanosleyva;

/**
 *
 * @author ezequ
 */
public class Vendedor {
     private String matriculaPlacas;
    private String telefonoMovil;
    private String zonaVenta;
    private double comision;

    public Vendedor(String nombre, String apellidos, String rfc, String direccion, String telefono,
                    String matriculaPlacas, String telefonoMovil, String zonaVenta, double comision) {
        super(nombre, apellidos, rfc, direccion, telefono);
        this.matriculaPlacas = matriculaPlacas;
        this.telefonoMovil = telefonoMovil;
        this.zonaVenta = zonaVenta;
        this.comision = comision;
    }

    @Override
    public void incrementarSalario() {
        // Incremento del 10% anual
    }

    public void imprimirDatosEspecificos() {
        System.out.println("Vendedor '" + getNombre() + " " + getApellidos() + "' con el # empleado '" +
                getNumeroEmpleado() + "' pertenece al departamento '" + getDepartamento() +
                "' de la zona '" + getZonaVenta() + "' y utiliza el vehículo '" + getMatriculaPlacas() + "'");
    }

    /**
     * @return the matriculaPlacas
     */
    public String getMatriculaPlacas() {
        return matriculaPlacas;
    }

    /**
     * @param matriculaPlacas the matriculaPlacas to set
     */
    public void setMatriculaPlacas(String matriculaPlacas) {
        this.matriculaPlacas = matriculaPlacas;
    }

    /**
     * @return the telefonoMovil
     */
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    /**
     * @param telefonoMovil the telefonoMovil to set
     */
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    /**
     * @return the zonaVenta
     */
    public String getZonaVenta() {
        return zonaVenta;
    }

    /**
     * @param zonaVenta the zonaVenta to set
     */
    public void setZonaVenta(String zonaVenta) {
        this.zonaVenta = zonaVenta;
    }

    /**
     * @return the comision
     */
    public double getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(double comision) {
        this.comision = comision;
    }
}
