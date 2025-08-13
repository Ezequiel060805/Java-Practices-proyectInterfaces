/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06range;

/**
 *
 * @author ezequ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        la profe en el main quiere que 
        num= 1
        max = 15
        interval = -3
        1-4-7-10-13
        15-12-9-6-3
        */
        Range ra = new Range(50, 0);
        System.out.println(ra.getValues());
        System.out.println(ra.start());
        ra.reset();
        System.out.println(ra.getValues());
        ra.setValues(15, 1, 3);
        System.out.println(ra.getValues());
        System.out.println(ra.start());
    }
}
