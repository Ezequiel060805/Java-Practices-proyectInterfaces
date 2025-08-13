/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07cybernubesolutions;

/**
 *
 * @author RZR
 */
public class Producto {
    private int idProducto;
    private String nombreProducto;
    private String Categoria;
    private double precio;
    private int stockMin; 
    private int stockMax;
    private boolean status;
    
    public Producto(String nombreProducto, String Categoria, double precio, int stockMin, int stockMax){
        this.nombreProducto = nombreProducto;
        this.Categoria = Categoria;
        this.precio = precio;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
        
    }
    
    public void crear(){
        
    }
    public void leer(){
        
    }
    public void modificar(){
        
    }
    public void suspender(){
        
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stockMin
     */
    public int getStockMin() {
        return stockMin;
    }

    /**
     * @param stockMin the stockMin to set
     */
    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    /**
     * @return the stockMax
     */
    public int getStockMax() {
        return stockMax;
    }

    /**
     * @param stockMax the stockMax to set
     */
    public void setStockMax(int stockMax) {
        this.stockMax = stockMax;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
}
