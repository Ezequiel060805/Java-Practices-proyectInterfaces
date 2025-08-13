/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05cuentabanco;

/**
 *
 * @author ezequ
 */
public abstract class CuentaBanco {
    private int noCuenta;
    private String titular;
    private int sucursal;
    private String fechaApertura;
    private String tipo;
    private double saldo;
    /*
    Constructor se llama igual a la clase 
    no llevara valor de retorno
    requiere nivel de acceso public
    puede llevar los parametros que se requieran
    de no haber un constructor definido, se crea 
    un constructor por default sin parametros
    */    
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
    // Método abstracto que debe ser implementado por las subclases
    public abstract String enviarMsg();

    public String verDatos() {
        return "Cuenta Banco a nombre de " + getTitular() + " de la sucursal " +
                getSucursal();
    }
/*
    public String abonar(double cantidad) {
        // Sumar al saldo
        this.saldo += cantidad;
        return "Se agregó un abono de " + cantidad + " a la cuenta.";
    }

    public String retirar(double cantidad) {
        // Restar al saldo si hay saldo suficiente
        if (cantidad <= saldo) {
            this.saldo -= cantidad;
            return "Se retiró la cantidad de " + cantidad + " de la cuenta.";
        } else {
            return "Saldo insuficiente para realizar el retiro.";
        }
    }
*/
    public double abonar(double cantidad){
        saldo += cantidad;
        return saldo;
    } //sumar saldo.
    
    public double retirar(double cantidad){ //cambiar el valor de retorno en cuanto a como lo necesite.
        if (cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro exitoso. ");
        }else{
            System.out.println("No cuenta con saldo suficiente para retirar, intente de nuevo. ");
        }
        return saldo;
    }

    /**
     * @return the noCuenta
     */
    public int getNoCuenta() {
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
     * @return the sucursal
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
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
