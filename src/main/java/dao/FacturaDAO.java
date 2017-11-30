/*
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Factura;
import util.DbUtil;

public class FacturaDAO
{
    private Connection connection;

    public FacturaDAO()
    {
        connection = DbUtil.getConnection();
    }

    public void addUser(Factura user)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into factura(idDetalle, idProducto, cantidad, total, metodoPago) values (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, user.getIdDetalle());
            preparedStatement.setInt(2, user.getIdProducto());
            preparedStatement.setInt(3, user.getCantidad());
            preparedStatement.setInt(4, user.getTotal());
            preparedStatement.setString(5, user.getMetodoPago());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteUser(int idFactura)
    {
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("delete from factura where idFactura=?");
            preparedStatement.setInt(1, idFactura);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void updateUser(Factura user)
    {
        try 
        {
            PreparedStatement preparedStatement = connection.prepareStatement("update factura set idDetalle=?, idProducto=?, cantidad=?, total=?, metodoPago=?" + "where idFactura=?");
            preparedStatement.setInt(1, user.getIdDetalle());
            preparedStatement.setInt(2, user.getIdProducto());
            preparedStatement.setInt(3, user.getCantidad());
            preparedStatement.setInt(4, user.getTotal());
            preparedStatement.setString(5, user.getMetodoPago());
            preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public List<Factura> getAllUsers()
    {
        List<Factura> users = new ArrayList<Factura>();
        
        try
        {
            System.out.println("Llegue hasta aca");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from factura");
            
            while (rs.next())
            {
                Factura user = new Factura();
                user.setIdFactura(rs.getInt("idFactura"));
                user.setIdDetalle(rs.getInt("idDetalle"));
                user.setIdProducto(rs.getInt("idProducto"));
                user.setCantidad(rs.getInt("cantidad"));
                user.setTotal(rs.getInt("total"));
                user.setMetodoPago(rs.getString("metodoPago"));
                users.add(user);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return users;
    }

    public Factura getUserById(int idDetalle)
    {
        Factura user = new Factura();
        
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from detalle where idFactura=?");
            preparedStatement.setInt(1, idDetalle);
            ResultSet rs = preparedStatement.executeQuery();
            
            if (rs.next())
            {
                user.setIdFactura(rs.getInt("idFactura"));
                user.setIdDetalle(rs.getInt("idDetalle"));
                user.setIdProducto(rs.getInt("idProducto"));
                user.setCantidad(rs.getInt("cantidad"));
                user.setTotal(rs.getInt("total"));
                user.setMetodoPago(rs.getString("metodoPago"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}