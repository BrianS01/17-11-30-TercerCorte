/*
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package modelo;

public class Detalle
{
    private int idDetalle;
    private String nombreCliente;
    private int cedula;
    private String fecha;

    public int getIdDetalle()
    {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle)
    {
        this.idDetalle = idDetalle;
    }

    public int getCedula()
    {
        return cedula;
    }

    public void setCedula(int cedula)
    {
        this.cedula = cedula;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    @Override
    public String toString()
    {
        return "Detalle{" + "idDetalle=" + idDetalle + ", cedula=" + cedula + ", nombreCliente=" + nombreCliente + ", fecha=" + fecha + '}';
    }
}