/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

;
import Datos.Cliente;
import Datos.Tomador;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class CRUDCliente {

    public List<Tomador> findAll() throws SQLException {
        List<Tomador> departamentos = null;
        String query = "SELECT * FROM Tomador";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int idClienteAsegurado = 0;
            int edadA = 0;
            int documento = 0;
            String tipoDocumento = null;
            String nombre = null;
            String apellido = null;
            String direccion = null;
            int telefono = 0;
            String fechanacimiento = null;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Tomador>();
                }

                Tomador registro = new Tomador();

                documento = rs.getInt("documento");
                registro.setDocumento(documento);

                tipoDocumento = rs.getString("tipoDocumento");
                registro.setTipoDocumento(tipoDocumento);

                nombre = rs.getString("nombre");
                registro.setNombre(nombre);

                apellido = rs.getString("apellido");
                registro.setApellido(apellido);

                direccion = rs.getString("direccion");
                registro.setDireccion(direccion);

                telefono = rs.getInt("telefono");
                registro.setTelefono(telefono);

                fechanacimiento = rs.getString("fechanacimiento");
                registro.setFechanacimiento(fechanacimiento);

                idClienteAsegurado = rs.getInt("idClienteAsegurado");
                registro.setIdClienteAsegurado(idClienteAsegurado);

                edadA = rs.getInt("edadA");
                registro.setEdadA(edadA);

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Clientes");
            e.printStackTrace();
        }

        return departamentos;
    }

    public boolean insert(Tomador t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Tomador1 (documento,tipoDocumento,nombre,apellido,direccion,telefono,fechanacimiento,edadT) " + "values (?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStmt = null;

        try {

            preparedStmt = connection.prepareStatement(query);
    

            preparedStmt.setInt(1, t.getDocumento());
            preparedStmt.setString(2, t.getTipoDocumento());
            preparedStmt.setString(3, t.getNombre());
            preparedStmt.setString(4, t.getApellido());
            preparedStmt.setString(5, t.getDireccion());
            preparedStmt.setInt(6, t.getTelefono());
            preparedStmt.setString(7, t.getFechanacimiento());
            preparedStmt.setInt(8, t.getEdadA());
            
            
            System.out.println(t.getApellido());
            System.out.println(t.getDireccion());
            System.out.println(t.getDocumento());
            System.out.println(t.getEdadA());
            System.out.println(t.getFechanacimiento());
            System.out.println(t.getIdCliente());
            System.out.println(t.getIdClienteAsegurado());
            System.out.println(t.getNombre());
            System.out.println(t.getNombre());
            System.out.println(t.getTelefono());
            System.out.println(t.getTipoDocumento());
            System.out.println(t.getDocumento());
            
            
            
            
       
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
