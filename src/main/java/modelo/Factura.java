/*
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package modelo;

public class Factura
{
    private int idFactura;
    private int idDetalle;
    private int idProducto;
    private int cantidad;
    private int total;
    private String metodoPago;

    public int getIdFactura()
    {
        return idFactura;
    }

    public void setIdFactura(int idFactura)
    {
        this.idFactura = idFactura;
    }

    public int getIdDetalle()
    {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle)
    {
        this.idDetalle = idDetalle;
    }

    public int getIdProducto()
    {
        return idProducto;
    }

    public void setIdProducto(int idProducto)
    {
        this.idProducto = idProducto;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public String getMetodoPago()
    {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago)
    {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString()
    {
        return "Factura{" + "idFactura=" + idFactura + ", idDetalle=" + idDetalle + ", idProducto=" + idProducto + ", cantidad=" + cantidad + ", total=" + total + ", metodoPago=" + metodoPago + '}';
    }
}