package TP1.Ejercicio6;

import TP3.Ejercicio6.Temperatura;

import java.util.Date;

public class Clima {
    private String ciudad, provincia, pais;
    private double temperaturaActual;
    private double mininima, maxima;
    private String escala;
    private double presion;
    private double vientoVelocidad, vientoDireccion;
    private double humedad, visibilidad;
    private Date ultimaActualizacion;

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getProvincia() {
        return provincia;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }

    public void setTemperaturaActual(Temperatura temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }
    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setMininima(double mininima) {
        this.mininima = mininima;
    }
    public double getMininima() {
        return mininima;
    }

    public void setMaxima(double maxima) {
        this.maxima = maxima;
    }
    public double getMaxima() {
        return maxima;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
    public String getEscala() {
        return escala;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    public double getPresion() {
        return presion;
    }

    public void setVientoVelocidad(double vientoVelocidad) {
        this.vientoVelocidad = vientoVelocidad;
    }
    public double getVientoVelocidad() {
        return vientoVelocidad;
    }

    public void setVientoDireccion(double vientoDireccion) {
        this.vientoDireccion = vientoDireccion;
    }
    public double getVientoDireccion() {
        return vientoDireccion;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }
    public double getHumedad() {
        return humedad;
    }

    public void setVisibilidad(double visibilidad) {
        this.visibilidad = visibilidad;
    }
    public double getVisibilidad() {
        return visibilidad;
    }

    public void setUltimaActualizacion(Date fecha) {
        this.ultimaActualizacion = fecha;
    }
    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }

}
