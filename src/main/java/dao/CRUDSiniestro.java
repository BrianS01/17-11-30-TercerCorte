/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Datos.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SERGIO
 */
public class CRUDSiniestro {

    public List<Siniestro> findAll() throws SQLException {
        List<Siniestro> departamentos = null;
        String query = "SELECT * FROM Siniestro";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            String lugar = null;
            String fecha = null;
            int hora = 0;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Siniestro>();
                }

                Siniestro registro = new Siniestro();

                lugar = rs.getString("lugar");
                registro.setLugar(lugar);

                fecha = rs.getString("fecha");
                registro.setFecha(fecha);

                hora = rs.getInt("hora");
                registro.setHora(hora);

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Siniestros");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Siniestro s) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Siniesro (lugar,fecha,hora) " + "values (?,?,?)";

        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);

            preparedStmt.setString(1, s.getLugar());
            preparedStmt.setString(2, s.getFecha());
            preparedStmt.setInt(3, s.getHora());

            System.out.println(s.getLugar());
            System.out.println(s.getFecha());
            System.out.println(s.getFecha());

            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void insert(controlador.Siniestro n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
