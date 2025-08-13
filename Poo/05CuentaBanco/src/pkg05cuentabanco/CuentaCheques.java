/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05cuentabanco;

/**
 *
 * @author ezequ
 */
public class CuentaCheques extends CuentaBanco {
    private int movimientos;

    public CuentaCheques(String titular, int sucursal, String tipo, double saldo) {
        super(titular, sucursal, tipo, saldo);
    }
    public CuentaCheques(String titular, int sucursal) {
    super(titular, sucursal);
    }
    public int movimientosDiarios(){
        return 0;
    }
    @Override
     public String verDatos(){
        return "Cuenta cheques a nombre de " + this.getTitular() + " de la sucursal " + this.getSucursal();
     }
    /**
     * @return the movimientos
     */
    public int getMovimientos(){

      return movimientos;
    }
    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String enviarMsg() {
        return "Cuenta cheque a nombre de " + this.getTitular() + " con " + this.getMovimientos() + " movimientos y un saldo de $" + this.getSaldo();
    }
}
