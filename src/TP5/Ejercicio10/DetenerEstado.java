package TP5.Ejercicio10;

public class DetenerEstado extends Estado {
    private final static String DETENER = "Detener";

    public DetenerEstado(DetenerReloj stop){
        super(stop);
    }

    public String getNombre(){
        return DETENER;
    }

    public Estado getNombre(){
        return DETENER;
    }

    public Estado getSiguienteEstado(){
        return new EmpezarEstado(getDetenerReloj());
    }

    public void action(){
        getDetenerReloj().stop();
    }
}
