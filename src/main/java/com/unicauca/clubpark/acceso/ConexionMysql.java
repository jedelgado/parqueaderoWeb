package com.unicauca.clubpark.acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Permite conectarse a la base de datos agenda
 * @author javier
 */
public class ConexionMysql {

    private Connection conexion;

    private final String baseDatos;

    public ConexionMysql() {
        conexion = null;
        baseDatos = "parqueadero";
    }

    /**
     * Permite hacer la conexion con la base de datos
     *
     * @return
     */
//    public int conectar() {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //crea una instancia de la controlador de la base de datos
//            conexion = DriverManager.getConnection(url, usuario, contraseña);
//            return 1;
//        } catch (SQLException | ClassNotFoundException e) {
//            System.out.println("Error conectándose a la bd: " + e.getMessage());
//        }
//        return -1;
//    }
     
    public Connection conectar(){
        
        try{
            
          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
          conexion = DriverManager.getConnection("jdbc:mysql://localhost/parqueaderopopayan","root","");  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conexion;
    }

    /**
     * Cierra la conexion con la base de datos
     *
     */
    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    /**
     * Retorna un objeto que almacena la referencia a la conexion con la base de
     * datos
     *
     * @return
     */
    public Connection getConnection() {
        return conexion;
    }

}