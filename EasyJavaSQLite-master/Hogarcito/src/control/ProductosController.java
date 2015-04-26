/*
 * Copyright (C) 2015 Steven Rod.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package control;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelProductos;

/**
 *
 * @author Steven
 */



public class ProductosController {

    Connection connection = null;
    Statement statement = null;
    public static List message;
    
    String connect = "jdbc:sqlite:sample.db"; // String de conexcion JDBC (Base de Datos Almacenamiento)
    
    
  //  String x = "jdbc:oracle:thin:@//localhost:1521/pdborcl";
    /**
     * Crea una nueva instancia ProductosController
     * @throws java.lang.ClassNotFoundException
     */
    public ProductosController() throws ClassNotFoundException {

        //Class.forName("org.sqlite.JDBC");
        try {
            connection = DriverManager.getConnection(connect);
            statement = connection.createStatement();
            

            statement.setQueryTimeout(30);
            //createTableProductos();
            // set timeout to 30 sec.
        } catch (SQLException ex) {

        }
    }
    
    /**
     * Vacia la tabla de Productos
     * @throws java.sql.SQLException
     */
    public void dumpTable() throws SQLException{
        statement.executeUpdate("drop table if exists productos");
    }
//======================================================================================
public void truncateTable() throws SQLException{
        statement.executeUpdate("truncate table productos");
    }
    
    //====================================
    /**
     * Crea una nueva tabla Productos
    
     */
    private void createTableProductos() {
        try {
            Class.forName("org.sqlite.JDBC");
            statement.executeUpdate("drop table if exists productos");
            statement.executeUpdate("create table productos ( "
                    + " idProducto        string, "
                    + " nombre            string,"
                    + " descripcion       string,"
                    + " cantidad          string,"
                    + " unidad_medida     string,"
                    //---------------------------
                    + " cantidadMinima    string,"
                    + " cantidadMaxima    string,"
                    + " usuario_registra     string,"
                    + " usuario_actualiza    string )");
            System.out.println("Tabla Creada");
        } catch (Exception e) {
            System.out.println("No pude crear la tabla");
        }
    }

//======================================================================================
    
    /**
     * Inserta un nuevo producto con caracteristicas minimas
     * @param product
     * @throws java.lang.ClassNotFoundException
     
     */
    public void insertProductMin(ModelProductos product) throws ClassNotFoundException {
        try {

           

            Class.forName("org.sqlite.JDBC");
            //-----------------------------------------------------------------------
            statement.executeUpdate("insert into productos values(  "
                    + " '" + product.idProducto + "',"
                    + " '" + product.nombre + "',"
                    + " '" + product.descripcion + "',"
                    + " '" + product.cantidad + "',"
                    + " '" + product.unidad_medida + "',"
                    //---------------------------------
                    + " ''," //-- cantidadMinima
                    + " ''," //-- cantidadMaxima
                    + " ''," //-- fechaVencimiento
                    + " ''," //-- userRegistra
                    + " '')"); //userActualiza

        } catch (SQLException e) {
           createTableProductos();
           try{
           statement.executeUpdate("insert into productos values(  "
                    + " '" + product.idProducto + "',"
                    + " '" + product.nombre + "',"
                    + " '" + product.descripcion + "',"
                    + " '" + product.cantidad + "',"
                    + " '" + product.unidad_medida + "',"
                    //---------------------------------
                    + " ''," //-- cantidadMinima
                    + " ''," //-- cantidadMaxima
                    + " ''," //-- fechaVencimiento
                    + " ''," //-- userRegistra
                    + " '')"); //userActualiza
           }
           catch(Exception ex){
               
           }
           
        }

    }

//======================================================================================
    
    /**
     * Inserta un nuevo producto con caracteristicas extendidas
     * @param product
     
     */
    public void insertProductMax(ModelProductos product) {
        try {

            //---------------------------------
            statement.executeUpdate("insert into productos values(  "
                    + " '" + product.idProducto + "',"
                    + " '" + product.nombre + "',"
                    + " '" + product.descripcion + "',"
                    + " '" + product.cantidad + "',"
                    + " '" + product.unidad_medida + "',"
                    //---------------------------------
                    + " '" + product.cantidad_minima + "'," //-- cantidadMinima
                    + " '" + product.cantidad_maxima + "'," //-- cantidadMaxima
                    + " '" + product.fecha_vencimiento + "'," //-- fechaVencimiento
                    + " '" + product.usuario_registra + "'," //-- userRegistra
                    + " '')"); //userActualiza

        } catch (Exception e) {
            System.out.println("Not Found");
        }
    }

//======================================================================================
    /**
     * Obtiene todos los elementos de la tabla productos y retorna una lista
     * @return  ArrayList<ModelProductos>   
     */
    public    ArrayList<ModelProductos> getAllProducts() {
        ArrayList<ModelProductos> miArray = new ArrayList<>();
        try {
            ResultSet rs = statement.executeQuery("select * from productos");
            while (rs.next()) {

                ModelProductos miPrduct = new ModelProductos();
                // read the result set
                try {
                    miPrduct.setIdProducto(rs.getString("idProducto"));
                    miPrduct.setNombre(rs.getString("nombre"));
                    miPrduct.setDescripcion(rs.getString("descripcion"));
                    miPrduct.setCantidad(rs.getString("cantidad"));
                    miPrduct.setUnidad_medida(rs.getString("unidad_medida"));

                } catch (Exception e) {

                }

                try {
                    miPrduct.setCantidad_minima(rs.getString("cantidadMinima"));
                    miPrduct.setCantidad_maxima(rs.getString("cantidadMaxima"));
                    miPrduct.setFecha_vencimiento(rs.getString("fechaVencimiento"));
                    miPrduct.setUsuario_registra(rs.getString("usuario_registra"));
                    miPrduct.setUsuario_actualiza(rs.getString("usuario_actualiza"));

                } catch (Exception e) {

                    // System.out.println( miPrduct.getIdProducto()+"  Es un producto minimas caracteristicas ");
                }

                miArray.add(miPrduct);

            }
        } catch (Exception e) {

        }
        return miArray;
    }

    public void editCantidad(double cant, String id){
    
        
        try {
            statement.executeUpdate("update productos set cantidad = '"+cant+"' where idProducto ='"+id+"'");
        } catch (SQLException ex) {
          //  Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No actuelice");
        }
    }
    
//=====================================================================================    
public void delete(String id){
    
        
        try {
            statement.executeUpdate("delete from productos where idProducto= '"+id+"'");
        } catch (SQLException ex) {
          //  Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No borr[e");
        }
    }
    

}
