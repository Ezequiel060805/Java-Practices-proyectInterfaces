/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07cybernubesolutions;

/**
 *
 * @author RZR
 */
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String Celular;
    private String email;
    private String rol;
    private String Contraseña;
    private boolean Status;
    private Validación validacion;
    
    Conectar conexion = new Conectar();

public Usuario (String nombreUsuario, String Celular, String email, String rol){
    this.nombreUsuario = nombreUsuario;
    this.Celular = Celular;
    this.email = email;
    this.rol = rol;
}
    public void crear(){
    
    }

    public void leer(){
    
    }
    
    public void modificar(){
        
    }
    
    public String actualizarContraseña(){
        return null;
    }
    
    public void suspender(){
        
    }
    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Status
     */
    public boolean isStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(boolean Status) {
        this.Status = Status;
    }
}
