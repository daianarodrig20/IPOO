package TP5.Ejercicio10;

public class EmpezarEstado {
    private final static String EMPEZAR = "Empezar";

    /* Hago un constructor */
    public EmpezarEstado(DetenerReloj stop){
        super(stop);
    }

    public String getNombre(){
        return EMPEZAR;
    }

    public Estado getSiguienteEstado(){
        return new DetenerEstado(getDetenerReloj);
    }
}
