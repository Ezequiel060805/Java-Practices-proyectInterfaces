/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package epp2_ezequielcastellanos;

/**
 *
 * @author ezequ
 */
public class Animal extends SerVivo{  
    private String familia;
    private String especie;
    private String tipoMovimiento;
    
    public Animal(String nombre1, String familia) {
        super(nombre1);
        this.familia = familia;
    }
    public void cazar(){
        
    }
    @Override
    public String consultarDatos() {
        String nombre1 = null;
        return "Los datos solicitados son: " + nombre1 + " perteneciente a la familia " + familia ;
    }

    /**
     * @return the familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * @param familia the familia to set
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the tipoMovimiento
     */
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    /**
     * @param tipoMovimiento the tipoMovimiento to set
     */
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    
}
