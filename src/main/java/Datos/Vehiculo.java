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
public class Vehiculo {
    
   private int idVehiculo;
   private String matricula;
   private String cilindraje;
   private String marca;
   private String color;
   private int Cliente_idCliente;
   private int Poliza_idPoliza;
   private int RegistroSiniestro_idRegistroSiniestro;

    public Vehiculo(int idVehiculo, String matricula, String cilindraje, String marca, String color, int Cliente_idCliente, int Poliza_idPoliza, int RegistroSiniestro_idRegistroSiniestro) {
        this.idVehiculo = idVehiculo;
        this.matricula = matricula;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.color = color;
        this.Cliente_idCliente = Cliente_idCliente;
        this.Poliza_idPoliza = Poliza_idPoliza;
        this.RegistroSiniestro_idRegistroSiniestro = RegistroSiniestro_idRegistroSiniestro;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    public int getPoliza_idPoliza() {
        return Poliza_idPoliza;
    }

    public void setPoliza_idPoliza(int Poliza_idPoliza) {
        this.Poliza_idPoliza = Poliza_idPoliza;
    }

    public int getRegistroSiniestro_idRegistroSiniestro() {
        return RegistroSiniestro_idRegistroSiniestro;
    }

    public void setRegistroSiniestro_idRegistroSiniestro(int RegistroSiniestro_idRegistroSiniestro) {
        this.RegistroSiniestro_idRegistroSiniestro = RegistroSiniestro_idRegistroSiniestro;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", matricula=" + matricula + ", cilindraje=" + cilindraje + ", marca=" + marca + ", color=" + color + ", Cliente_idCliente=" + Cliente_idCliente + ", Poliza_idPoliza=" + Poliza_idPoliza + ", RegistroSiniestro_idRegistroSiniestro=" + RegistroSiniestro_idRegistroSiniestro + '}';
    }
    
}
