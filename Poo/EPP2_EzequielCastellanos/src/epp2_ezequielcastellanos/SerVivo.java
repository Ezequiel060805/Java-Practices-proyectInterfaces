/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epp2_ezequielcastellanos;

/**
 *
 * @author ezequ
 */
public abstract class SerVivo {
    String nombre;
    private String tipo;
    private float peso;
    
    /**
     *
     * @return
     */
    public abstract String consultarDatos();
    
    public SerVivo(String nombre1){
        this.nombre = nombre1;
    }
    public void nacer (String fecha){
        
    }
    public void morir(String fecha){
        
    }

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
