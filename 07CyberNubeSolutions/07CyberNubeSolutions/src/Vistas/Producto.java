/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TI 1
 */
public class Producto {
    private int idProducto;
    private String NombreProducto;
    private String Categoria;
    private double precio;
    private int stockMin; 
    private int stockMax;
    private boolean status;
    
    
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
        PreparedStatement Consulta;
        
    public Producto(){}
        
    public Producto(String NombreProducto, String Categoria, double precio, int stockMin, int stockMax){
        this.NombreProducto = NombreProducto;
        this.Categoria = Categoria;
        this.precio = precio;
        this.stockMin = stockMin;
        this.stockMax = stockMax;
}

    public int crear() throws SQLException{
      try{
            Consulta = con.prepareStatement("INSERT INTO Productos (IdProducto, NombreProducto, Categoria, Precio, stockMin, stockMax) VALUES(?, ?, ?, ?, ?, ?)");
            
            Consulta.setString(1, NombreProducto);
            Consulta.setString(2, Categoria);
            Consulta.setDouble(3, precio);
            Consulta.setInt(4, stockMin);
            Consulta.setInt(5, stockMax);
            
      }catch (SQLException e){
          JOptionPane.showMessageDialog(null, "Error" + e);
        }
      
      return Consulta.executeUpdate();
    }

    public DefaultTableModel leer(int IdProducto) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new Object[]{"IdProducto", "Nombre", "Categoria", "Precio", "StockMin", "StockMax"});

    String query = "SELECT * FROM Productos WHERE IdProducto = ?";
    try (PreparedStatement consulta = con.prepareStatement(query)) {
        consulta.setInt(1, IdProducto);
        try (var r = consulta.executeQuery()) {
            while (r.next()) {
                modelo.addRow(new Object[]{
                    r.getInt("IdProducto"), 
                    r.getString("Nombre"), 
                    r.getString("Categoria"), 
                    r.getDouble("Precio"), 
                    r.getInt("StockMin"), 
                    r.getInt("StockMax")
                });
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error " + ex);
    }

    return modelo;
}

public DefaultTableModel leer(String NombreProducto, String Categoria) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new Object[]{"Id", "Nombre", "Categoria", "Precio", "StockMinimo", "StockMaximo"});

    String query = "SELECT * FROM Productos";
    boolean hasNombreProducto = !NombreProducto.isEmpty();
    boolean hasCategoria = !Categoria.equals("Todos");

    if (hasNombreProducto && hasCategoria) {
        query += " WHERE Nombre LIKE ? AND Categoria = ?";
    } else if (hasNombreProducto) {
        query += " WHERE Nombre LIKE ?";
    } else if (hasCategoria) {
        query += " WHERE Categoria = ?";
    }

    try (PreparedStatement consulta = con.prepareStatement(query)) {
        int paramIndex = 1;
        if (hasNombreProducto) {
            consulta.setString(paramIndex++, "%" + NombreProducto + "%");
        }
        if (hasCategoria) {
            consulta.setString(paramIndex, Categoria);
        }

        try (var r = consulta.executeQuery()) {
            while (r.next()) {
                modelo.addRow(new Object[]{
                    r.getInt("Id"), 
                    r.getString("Nombre"), 
                    r.getString("Categoria"), 
                    r.getDouble("Precio"), 
                    r.getInt("StockMinimo"), 
                    r.getInt("StockMaximo")
                });
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error " + ex);
    }

    return modelo;
}

    public int modificar(int IdProducto)throws SQLException{
        try{
            Consulta = con.prepareStatement("UPDATE Productos SET nombre = ?, Categoria = ?, Precio = ?, StockMinimo = ?, StockMaximo WHERE IdProductos = ?");
            Consulta.setString(1, NombreProducto);
            Consulta.setString(2, Categoria);
            Consulta.setDouble(3, precio);
            Consulta.setInt(4, stockMin);
            Consulta.setInt(5, stockMax);
            Consulta.setInt(6, IdProducto);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return Consulta.executeUpdate();
        
    }
   public int suspender(int IdProducto, boolean Status) throws SQLException {
    String query = "UPDATE Usuarios SET status = ? WHERE IdUsuarios = ?";
    try (PreparedStatement consulta = con.prepareStatement(query)) {
        consulta.setInt(1, Status ? 2 : 1);
        consulta.setInt(2, IdProducto);
        return consulta.executeUpdate();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
        throw e; // Re-throw the exception to ensure the caller is aware of the failure
    }
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
            return NombreProducto;
        }

        /**
         * @param nombreProducto the nombreProducto to set
         */
        public void setNombreProducto(String nombreProducto) {
            this.NombreProducto = nombreProducto;
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
