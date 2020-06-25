package com.unicauca.clubpark.acceso;

import com.unicauca.clubpark.negocio.IParqueaderoDAO;
import com.unicauca.clubpark.negocio.Parqueadero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javier
 */
public class ParqueaderoDAOImplMysql implements IParqueaderoDAO {

    private ConexionMysql conexion;

    public ParqueaderoDAOImplMysql() {
        conexion = new ConexionMysql();
    }

    //Metodo que nos recupera la información del parqueadero
    @Override
    public List<Parqueadero> getParqueaderos() {

        Parqueadero park = null;
        List<Parqueadero> lista = new ArrayList<Parqueadero>();

        conexion.conectar();
        try {
            PreparedStatement sentencia = null;
            String sql = "SELECT * from parqueadero";
            sentencia = conexion.getConnection().prepareStatement(sql);
            ResultSet res = sentencia.executeQuery();
            while (res.next()) {
                park = new Parqueadero();
                park.setNombre(res.getString("nomParqueadero"));
                park.setPuestosLibres(res.getString("puestosLibres"));
                park.setPuestosOcupados(res.getString("puestosOcupados"));

                lista.add(park);
            }
            sentencia.close();
            conexion.desconectar();

        } catch (Exception e) {
            System.out.println("Error al consultar los parqueaderos\n" + e.getMessage());
        }
        return lista;
    }

}
