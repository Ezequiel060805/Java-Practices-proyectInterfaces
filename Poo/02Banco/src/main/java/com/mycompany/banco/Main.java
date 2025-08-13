/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 */
package pkg03estrucuras.de.control;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class DeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    /*Esttructuras de control
    a) Seleccion 
        1- If-else
        2- switch
    b) Repeticion 
        1- for
        2- while
        3- do-while
    */
    //Estructura de control if
    boolean isMoving = false;
    String text;
    if (isMoving){
        text = "Bicleta en movimiento";        
    }else{
        text = "Bicicleta detenida";
    }
    System.out.println(text);
    
    int edad = 15;
    if (edad>=18){
        text = "Persona mayor de edad";
    } else{
        text = "Persona menos de edad";
    }
       System.out.println(text);
       /*
       OPERADORES GRAFICOS:
        OR (||)
        AND (&&)
        NOT (!)
       */
       if (!isMoving && edad < 5){
           //No se esta moviendo y que sea menor a 5
       }
       //if anidado
       int testscore = 20;
       char grade;
      if (testscore >= 90){
          grade = 'A';
      }else if (testscore >= 80){
          grade = 'B';
      }else if (testscore >= 70){
          grade = 'C';
      }else if (testscore >= 60){
          grade = 'D';
      } else {
          grade = 'F';
      }
      System.out.println(grade);
      //ESTRUCTURA DE CONTROL for
      for (int i=0; i <= 100; i += 10){
          System.out.print(i + " - ");
      }
      System.out.println();
      for (int i=1000; i >= 100; i -=100){
          System.out.print(i + "- ");
      }
      //Salto de linea
      System.out.println();
      
      int[] numbers = {15,18,20,22,50,67};
      int acum = 0; //SUMA DE NUMEROS
      for(int i: numbers){
          System.out.print(i + " - ");
          acum += i;
      }
      System.out.println("Suma: " + acum);
    
    //ESTRUCTURA DE CONTROL while
    int e = 15;//INICIO
    while(e <= 90){
        System.out.print(e + "- " );
        e += 15;//Incremento
}
    //Salto de linea
    System.out.println();
    
    //ESTRUCTURA DE CONTROL DE UN DO-WHILE
    //Lectura atraves del System.in con Scanner
    Scanner leer = new Scanner(System.in);
    String letra;
    int cont = 0;
    do{
        System.out.println("Escribe una letra, presione [x] para salir");
        letra = leer.nextLine();
        cont++;
    }while (!"x".equals(letra));
        System.out.println(cont + " repeticiones");
    //15-30-45-60-75-90 
    //ingresar  8 calificaciones (System.in)
    //en validar que estas calificaciones estem en el rango de 0 a 100 puntos
    //(if)Mostrar el promedio general y cuantas materias
    //no acreditadas (menor a 60)
    
}