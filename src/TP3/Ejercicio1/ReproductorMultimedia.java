package TP3.Ejercicio1;

public class ReproductorMultimedia implements VideoClip {

    private boolean encendido = false;
    private boolean ejecutando = false;
    private boolean bucle = false;

    public void encender(){
        encendido = true;
    }
    public void apagar(){
        encendido = false;
    }

    @Override
    public void play() {
        ejecutando = true;
    }

    public void bucle (){
        bucle =! bucle;
    }

    @Override
    public void stop() {
        ejecutando = false;
    }
}
