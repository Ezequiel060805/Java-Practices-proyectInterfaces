/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intropoo;

/**
 *
 * @author ezequ

 */
public class Usuario{
    //Atributos
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private boolean premium;
    
    /* El encapsulamiento tiene 3 niveles de proteccion: public, protected y privated
    */
    
    //Metodos
    public void editarPerfil(){
        //codigo del metodo 
    }
    
    public boolean iniciarSesion(String correo, String contrasena){
        return this.correo.equals(correo) && this.contrasena.equals(contrasena);
        //codigo del metodo
    }
    public void cerrarSesion(){
        //codigo del metodo
    }
    public void cambiarPassword(){
        //codigo del metodo
    }
    public void pasarPremium(){
        //codigo del metodo
    }
    
    /**
     * @return the nombre;
     */
    public String getNombres() {
        return nombre;
    }

    /**
     * @param nombres the nombre to set
     */
    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    /**
     * @return the apellido
     */
    public String getApellidos() {
        return apellido;
    }

    /**
     * @param apellidos the apellido to set
     */
    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getcontrasena() {
        return contrasena;
    }

    /**
     * @param password the password to set
     */
    public void setcontrasena(String password) {
        this.contrasena = password;
    }

    /**
     * @return the premium
     */
    public boolean isPremium() {
        return premium;
    }

    /**
     * @param premium the premium to set
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }
    
}

