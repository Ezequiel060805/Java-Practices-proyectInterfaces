/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rap2_castellanosleyva;

/**
 *
 * @author ezequ
 */
public class JefeDeZona extends Empleado {
    private final String zonaAsignada;
    private Secretario secretario;
    private final String matriculaPlacas;
    public JefeDeZona(String nombre, String apellido, String rfc, String telefono, String direccion,
            String zonaAsignada, Secretario Secretario, Vendedor[] vendedores, String matriculaPlacas) {
        super(nombre, apellido, rfc, telefono, direccion);
        this.zonaAsignada = zonaAsignada;
        this.secretario = secretario;
        this.matriculaPlacas = matriculaPlacas;
    

    }
    @Override
    public void incrementarSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void imprimirDatosEspecificos() {
        System.out.println("Jefe de Zona " + this.getNombre() + " " + this.getApellido() + "' con el # empleado '" +
                this.getNoEmpleado() + "' pertenece al departamento '" + this.getDepartamento() +
                "' de la zona '" + zonaAsignada + "' y utiliza el vehículo '" + matriculaPlacas + "'");
    }
}

public class RAP2_ApellidoNombre {
    public static void main(String[] args) {
        // Aquí puedes crear instancias de las clases y probar sus métodos
    }
    /**
     * @return the zonaAsignada
     */
    public String getZonaAsignada() {
        return zonaAsignada;
    }

    
    /**
     * @param zonaAsignada the zonaAsignada to set
     */
    public void setZonaAsignada(String zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }

    /**
     * @return the secretario
     */
    public Secretario getSecretario() {
        return secretario;
    }

    /**
     * @param secretario the secretario to set
     */
    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    /**
     * @return the vendedores
     */
    public Vendedor[] getVendedores() {
        return vendedores;
    }

    /**
     * @param vendedores the vendedores to set
     */
    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
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



    
}
