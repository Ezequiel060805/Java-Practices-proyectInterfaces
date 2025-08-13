/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05cuentabanco;

import java.util.Scanner;

/**
 *
 * @author ezequ
 */
public class Main {
    /*
    De una clase abstracta no podemos crear objetos 
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objetod e CuentaBanco
        //CuentaBanco cb = new CuentaBanco("Ezequiel Castellanos", 5241);
        
        //Objeto CuentaAhorro
        CuentaAhorro ca = new CuentaAhorro("Ezequiel Leyva", 7300);
        //System.out.println(cb.verDatos());
        System.out.println(ca.verDatos());
        System.out.println(ca.verDatos("Hola, buen dia: "));
        System.out.println(ca.enviarMsg());
        //objeto de cuenta cheque
        CuentaCheques ch = new CuentaCheques("Ezequiel", 9300);
        System.out.println(ch.verDatos());
        //metodo abstracto implementado en CuentaAhorro
        System.out.println(ch.enviarMsg());
        //Realizar abono y retiro a cada una de las cuentas. CuentaAhorro y CuentaCheque(ca y ch).
        //Al final mostrar el saldo de ambas.\
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad a abonar a su cuenta ahorro. ");
        double abonoAhorro = leer.nextDouble();
        System.out.println(ca.abonar(abonoAhorro));
        System.out.println("Ingresa cantidad a retirar de cuenta ahorro. ");
        double retiroAhorro = leer.nextDouble();
        System.out.println(ca.retirar(retiroAhorro));
       
        System.out.println("-------------------------------------");
        System.out.println("Ingresa cantidad a abonar de cuenta cheques. ");
        double abonoCheques = leer.nextDouble();
        System.out.println(ch.abonar(abonoCheques));
        System.out.println("Ingresa la cantidad a retirar de cuenta cheques. ");
        double retiroCheques = leer.nextDouble();
        System.out.println(ch.retirar(retiroCheques));
    }
    
}
