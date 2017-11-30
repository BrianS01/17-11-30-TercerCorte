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
public class Siniestro {
    
    private int idSiniestro; 
    private String lugar;
    private String fecha;
    private int hora; 
    private int RegistroSiniestro_idRegistroSiniestro;

    public Siniestro(int idSiniestro, String lugar, String fecha, int hora, int RegistroSiniestro_idRegistroSiniestro) {
        this.idSiniestro = idSiniestro;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.RegistroSiniestro_idRegistroSiniestro = RegistroSiniestro_idRegistroSiniestro;
    }
    
        public Siniestro() {
    
    }

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getRegistroSiniestro_idRegistroSiniestro() {
        return RegistroSiniestro_idRegistroSiniestro;
    }

    public void setRegistroSiniestro_idRegistroSiniestro(int RegistroSiniestro_idRegistroSiniestro) {
        this.RegistroSiniestro_idRegistroSiniestro = RegistroSiniestro_idRegistroSiniestro;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "idSiniestro=" + idSiniestro + ", lugar=" + lugar + ", fecha=" + fecha + ", hora=" + hora + ", RegistroSiniestro_idRegistroSiniestro=" + RegistroSiniestro_idRegistroSiniestro + '}';
    }
    
}
