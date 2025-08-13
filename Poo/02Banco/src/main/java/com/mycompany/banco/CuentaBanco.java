/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author ezequ
 */
public class CuentaBanco {
    private int noCuenta;
    private String titular;
    private int sucursal;
    private String fechaApertura;
    private String tipo;
    private double saldo;
    
    public CuentaBanco(String titular, int sucursal){
        this.titular = titular;
        this.sucursal = sucursal;
    }
    public CuentaBanco(String titular,int sucursal, String tipo, double saldo){
        this.titular = titular;
        this.sucursal = sucursal;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    public double abonar(double cantidad){
        return getSaldo();
    }
    public void contratarCredito(){
        
    }
    public int getnoCuenta(){
        return noCuenta;
    }

    /**
     * @param noCuenta the noCuenta to set
     */
    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
      @return the sucursal
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     @param sucursal the sucursal to set
     */
    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the fechaApertura
     */
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
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
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
