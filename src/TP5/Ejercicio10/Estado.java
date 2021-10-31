package TP5.Ejercicio10;

public abstract class Estado {

    private DetenerReloj detenerReloj;

    public Estado(DetenerReloj stop){
        detenerReloj = stop;
    }

    public DetenerReloj getDetenerReloj(){
        return detenerReloj;
    }

    public String getTime(){
        return getDetenerReloj().getTiempo;
    }

    public abstract String getNombre();
    public abstract Estado getNombreEstado;
    public abstract void action();

}
