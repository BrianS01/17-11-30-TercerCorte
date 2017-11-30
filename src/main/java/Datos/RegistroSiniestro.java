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
public class RegistroSiniestro {
    
    private int idRegistroSiniestro;

    public RegistroSiniestro(int idRegistroSiniestro) {
        this.idRegistroSiniestro = idRegistroSiniestro;
    }
    
    public int getIdRegistroSiniestro() {
        return idRegistroSiniestro;
    }

    public void setIdRegistroSiniestro(int idRegistroSiniestro) {
        this.idRegistroSiniestro = idRegistroSiniestro;
    }

    @Override
    public String toString() {
        return "RegistroSiniestro{" + "idRegistroSiniestro=" + idRegistroSiniestro + '}';
    }
    
}
