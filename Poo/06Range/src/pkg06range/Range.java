package pkg06range;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ezequ
 */
public class Range {
    private int num = 1;
    private int max;
    private int interval = 1;
    
    public Range (int max){
        this.max = max;
    }
    public Range(int max,int num){
        this.max = max;
        this.num = num;
    }
    public Range(int max, int num, int interval){
        this.max = max;
        this.num = num;
        this.interval = interval;
    }
    public void reset(){
        //pone los valores default y el maximo en 
        num = 1;
        interval = 1;
        max = 0;
    }
    public String start(){
        /*
        ejecuta el rango con los valores actuales en los atributos a través de un ciclo
    for y dentro del ciclo los concatena en un String. Por otro lado, se debe validar que al ser decremento
    se posicione el número mayor para iniciar el ciclo for (es decir, de mayor a menor). En ambos,
    retorna la cadena con los números recorridos.
        */
        String result = "";
        int step = (num <= max) ? interval : -interval;//operador  ternario
        for (int i = num; (step > 0 && i <= max) || (step < 0 && i >= max); i += step) {
           // i += this.getInterval();
            result = result.concat(i + " "); 
        }

        return result;
        
    }
    public void setValues(int num, int max){
        //modifica los valores de los atributos
        //this.num = num;
        //this.max = max;
        this.setNum(num);
        this.setMax(max);
    }
    public void setValues(int num, int max, int interval){
        //modifica los valores de los atributos
        this.setNum(num);
        this.setMax(max);
        this.setInterval(interval);
    }
    public String getValues(){
        //muestra los valores de cada atributo, cadena de ejemplo:“Número inicial 5, Número máximo 57 e Intervalos de 3”
        return "Los valores es: tu numero, " + this.getNum() + ", mientras que tu numero maximo es " + this.getMax() + ", Y el intervalo entre estos es: " + this.getInterval();
        
    }
    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return the interval
     */
    public int getInterval() {
        return interval;
    }

    /**
     * @param interval the interval to set
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }
    
    
}
