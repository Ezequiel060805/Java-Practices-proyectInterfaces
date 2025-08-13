/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rap2_castellanosleyva;

/**
 *
 * @author ezequ
 */
public class Secretario extends Empleado {
    private final String area;
     
    public Secretario(String nombre, String apellidos, String rfc, String direccion, String telefono,String area) {
        super(nombre, apellidos, rfc, direccion, telefono);
        this.area = area;
    }

    @Override
    public void incrementarSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  public void imprimirDatosEspecificos() {
        System.out.println("Secretario '" + this.getNombre() + " " + this.getApellido() + "' con el # empleado '" +
                this.getNoEmpleado() + "' pertenece al departamento '" + getDepartamento() +
                "' ubicado en el área '" + area + "'");
    }
   
    
}
