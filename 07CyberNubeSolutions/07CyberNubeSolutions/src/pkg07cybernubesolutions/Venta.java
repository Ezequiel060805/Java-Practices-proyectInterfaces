/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg07cybernubesolutions;

import java.util.Date;

/**
 *
 * @author RZR
 */
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Venta {
    private int idVenta;
    private Cliente cliente;
    private Usuario usuario;
    private Date fechaVenta; 
    private Date horaVenta; // Usar Date para hora también
    private List<Producto> productos;
    private ArrayList<Integer> cantidad;
    private double total;
    private double efectivo;
    private boolean status;
    
    public Venta(Usuario usuario, Cliente cliente, List<Producto> productos, ArrayList<Integer> cantidad, double total) {
        this.usuario = usuario;
        this.cliente = cliente;
        this.productos = productos;
        this.cantidad = cantidad;
        this.total = total;
    }

    // Getters y setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(Date horaVenta) {
        this.horaVenta = horaVenta;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Integer> getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList<Integer> cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

