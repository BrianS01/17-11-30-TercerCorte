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
public class Poliza {

    private int idPoliza;
    private int costoBasico;
    private int porcentajeBonificaion;
    private String tipo;
    private int cobertura;
    private int numeroCuotas;

    public Poliza(int idPoliza, int costoBasico, int porcentajeBonificaion, String tipo, int cobertura, int numeroCuotas) {
        this.idPoliza = idPoliza;
        this.costoBasico = costoBasico;
        this.porcentajeBonificaion = porcentajeBonificaion;
        this.tipo = tipo;
        this.cobertura = cobertura;
        this.numeroCuotas = numeroCuotas;
    }

    public int getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    public int getCostoBasico() {
        return costoBasico;
    }

    public void setCostoBasico(int costoBasico) {
        this.costoBasico = costoBasico;
    }

    public int getPorcentajeBonificaion() {
        return porcentajeBonificaion;
    }

    public void setPorcentajeBonificaion(int porcentajeBonificaion) {
        this.porcentajeBonificaion = porcentajeBonificaion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCobertura() {
        return cobertura;
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" + "idPoliza=" + idPoliza + ", costoBasico=" + costoBasico + ", porcentajeBonificaion=" + porcentajeBonificaion + ", tipo=" + tipo + ", cobertura=" + cobertura + ", numeroCuotas=" + numeroCuotas + '}';
    }

}
