/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epp2_ezequielcastellanos;

/**
 *
 * @author ezequ
 */
public class EPP2_EzequielCastellanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Lupita Sosa";
        String nacionalidad = "Colombiana";  
        String nombre1 = "Colibri";
        String familia = "Aves";

        //String Humano = "Lupita Sosa" + "Colombiana";       
        Humano h1 = new Humano(nombre, nacionalidad);
        System.out.println(h1.consultarDatos());

        Animal ani = new Animal(nombre1, familia);
        System.out.println(ani.consultarDatos());
                
    }
    
}
