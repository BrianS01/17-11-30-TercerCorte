/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author SERGIO
 */
public class Concepto {

    private int idConcepto;
    private String nombre;
    private int Poliza_idPoliza;

    public int getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(int idConcepto) {
        this.idConcepto = idConcepto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoliza_idPoliza() {
        return Poliza_idPoliza;
    }

    public void setPoliza_idPoliza(int Poliza_idPoliza) {
        this.Poliza_idPoliza = Poliza_idPoliza;
    }

    @Override
    public String toString() {
        return "Concepto{" + "idConcepto=" + idConcepto + ", nombre=" + nombre + ", Poliza_idPoliza=" + Poliza_idPoliza + '}';
    }

}
