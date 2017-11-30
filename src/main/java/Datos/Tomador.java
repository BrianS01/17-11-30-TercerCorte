/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author SERGIO
 */
public class Tomador extends Cliente{
    
     private int idClienteAsegurado;
     private int edadA;

    public Tomador(int idClienteAsegurado, int edadA, int Cliente_idCliente, int idCliente, int documento, String tipoDocumento, String nombre, String apellido, String direccion, int telefono, String fechanacimiento) {
        super(idCliente, documento, tipoDocumento, nombre, apellido, direccion, telefono, fechanacimiento);
        this.idClienteAsegurado = idClienteAsegurado;
        this.edadA = edadA;
    }

    public Tomador() {
    
    }

    public int getIdClienteAsegurado() {
        return idClienteAsegurado;
    }

    public void setIdClienteAsegurado(int idClienteAsegurado) {
        this.idClienteAsegurado = idClienteAsegurado;
    }

    public int getEdadA() {
        return edadA;
    }

    public void setEdadA(int edadA) {
        this.edadA = edadA;
    }

    @Override
    public String toString() {
        return "Tomador{" + "idClienteAsegurado=" + idClienteAsegurado + ", edadA=" + edadA + '}';
    }
    
}
