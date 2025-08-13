/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author ezequ
 */
public class Programador {
    private String empresa;
    private String nombre;
    private double sueldo;
    private String lenguaje;
    private String puesto;
    private int añosExperiencia;
    
    public Programador(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
    }
    public Programador (String nombre, String puesto, String lenguaje, double sueldo){
        this.nombre = nombre;
        this.puesto = puesto;
        this.lenguaje = lenguaje;
        this.sueldo = sueldo;
    }
    public double pagarSueldo(double horas){
        double tarifaPorHora = 50.0;//por poner algo
        return horas * tarifaPorHora;
    }
    public void contratar(String puesto){
        this.setPuesto(puesto);
    }
            

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the lenguaje
     */
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * @param lenguaje the lenguaje to set
     */
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * @param añosExperiencia the añosExperiencia to set
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
