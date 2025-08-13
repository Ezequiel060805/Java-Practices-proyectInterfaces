/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04tratamientocadenas;

/**
 *
 * @author ezequ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("---------------------------------------------------------------------------");
        System.out.println("Tratamiento de Cadenas - S");
        String msg = "fix1520-Reparar el Equipo de Computo";
        System.out.println(msg.toUpperCase());
        System.out.println(msg);
        System.out.println(msg.toLowerCase());
        System.out.println("Longitud del texto: " + msg.length());
        if(msg.contains("Equipo")){
            System.out.println("Se encontro el texto");
        }else {
            System.out.println("No se encontro la palabra");
        }
        System.out.println("Se encuentra palabra? " + msg.contains("fix"));
        //boolean resultado = 
        //msg = " ";
        if(msg.isEmpty()){
            System.out.println("msg esta vacia ");
        }
        System.out.println("Esta vacia la palabra? " + msg.isEmpty());
       msg = msg.replace("fix", "pixer");
       System.out.println(msg);
       System.out.println("Longitud del texto: " + msg.length());
       
        System.out.println("---------------------------------------------------------------------------");
                //"pixer1520-Reparar el equipo de computo"
        System.out.println(msg.substring(10));
        System.out.println(msg.substring(5, 9));
        System.out.println("Clave: " + msg.subSequence(5, 9));
        //Obtener la descripcion pixer
        System.out.println(msg.substring(0, 5));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Es igual?: " + msg.substring(0, 5).equals("pixer"));
        System.out.println(msg.concat(" de Escritorio."));
        //msg = msg.concat(" de Escritorio.")
        System.out.println(msg);
        String[] split = (msg.split("e"));
        for(String s: split) {
            System.out.println("Split: " + s);
        }
        System.out.println("Longitud del arreglo: " + split.length);*/
        // TODO code application logic here
        
        String ejercicio = "Soy el primer ejercicio con String"; 
        System.out.println(ejercicio);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("        =PRIMERA PARTE DEL EJERCICIO=");
     
        String[] split = (ejercicio.split(" "));
        int palabras = 0;
        for(String s: split){           
            palabras++;
        }
        System.out.println("La oracion tiene: " + palabras + " palabras.");
        System.out.println(ejercicio.replaceAll("el", "tu").toUpperCase());
        System.out.println("El indice de la palabra 'primer' es el: " + ejercicio.indexOf("primer"));
        if(ejercicio.contains("String")){
            System.out.println("Si contiene la palabra String.");
        }else{
            System.out.println("No contiene la palabra String.");
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("        =SEGUNDA PARTE DEL EJERCICIO=");
        String curp = "PERT740523HSRRSM05";
        System.out.println("La curp con la que vamos a trabajar es " + curp);
        
        //System.out.println("Longitud del texto es: " + ejercicio.length() + " Letras");
        int year = Integer.parseInt(curp.substring(4, 6));
        if(year<=25){
            year = 2000 + year; 
        }else{
            year =1900 + year;  
        }
        System.out.println("Nacio en el año: " + year);
        char sexo = curp.charAt(10);
        if(sexo != 'H'){
            System.out.println("La persona es mujer");
        }else{
            System.out.println("La persona es hombre.");
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("        =TERCERA PARTE DEL EJERCICIO=");
        String url = "   https//www.w3schools.com/java/     ";
        url = url.trim();
        System.out.println("La URL que ocupas es: " + url);
        if(url.contains("https//")){
            System.out.println("La pagina es segura.");
        }else{
            System.out.println("Ten cuidado, tus datos estan en riesgo. La pagina no es muy segura");
        }
        System.out.println("ULTIMO PASO");
        System.out.println("Nombre del sitio: "+ url.substring(11, 24));
        
    }
    
}
