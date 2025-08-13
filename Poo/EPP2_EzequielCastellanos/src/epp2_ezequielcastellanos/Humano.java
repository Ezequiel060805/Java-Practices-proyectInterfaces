/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epp2_ezequielcastellanos;

/**
 *
 * @author ezequ
 */
public class Humano extends SerVivo {
    private String curp;
    private String nacionalidad;
    
    public Humano(String nombre, String nacionalidad) {
        super(nombre);
        this.nacionalidad = nacionalidad;
    }


    @Override
    public String consultarDatos() {
        return "Los datos consultados son: " + nombre + "de nacionalidad " + nacionalidad;
    }
    public void bailar(String cancion){
        
    }
    public String hablar(){
        return "N/A";
    }

    /**
     * @return the curp
     */
    public String getCurp() {
        return curp;
    }

    /**
     * @param curp the curp to set
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
   
    
}
