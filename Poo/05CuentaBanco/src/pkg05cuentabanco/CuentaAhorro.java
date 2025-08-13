a/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05cuentabanco;

/**
 *
 * @author ezequ
 */
public class CuentaAhorro extends CuentaBanco {
    private double tasaInteres;

    public CuentaAhorro(String titular, int sucursal) {
        super(titular, sucursal);
        /*
        Cuenta ahorro es una subclase de CuentaBanco 
        que es la superclase.
        Para indicar la herencia se utiliza extends.
        De haver constructores en la superclase, se
        deve utilizar el metodo super() en la subclase para acceder a un constructor
        de la superclase. 
        Una subclase solo puede heredar de una clase.f
        */
    }
    public CuentaAhorro(String titular, int sucursal, String tipo, double saldo) {
    super(titular, sucursal, tipo, saldo);
    }
    //Este es un metodo heredado, por eso lleva ese override
    @Override
    public String verDatos(){
        return "Cuenta Ahorro a nombre de " + this.getTitular() + " de la sucursal " + this.getSucursal();
    }
        //Metodo no heredado
        //Se llama metodo de sobrecarga (Polimorfismo)
    public String verDatos(String saludo){
        return saludo + "Cuenta Ahorro a nombre de " + this.getTitular() + " de la sucursal " + this.getSucursal();
    }
    public double calcularSaldo(){
        return 0;
    }

    /**
     * @return the tasaInteres
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * @param tasaInteres the tasaInteres to set
     */
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String enviarMsg() {
        return "Cuenta Ahorro a nombre de " + this.getTitular() + " con una tasa de interes de " + this.getTasaInteres();
    }
}
