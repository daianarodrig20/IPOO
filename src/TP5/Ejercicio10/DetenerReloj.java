package TP5.Ejercicio10;

public class DetenerReloj {

    private final static String EMPTY = "00:00:00";

    private final static int SECONDS = 1000;
    private final static int MINUTES = 1000*60;
    private final static int HOURS = 1000*60*60;

    private long begin = 0;
    private long end = 0;

    private boolean running = false;

    public DetenerReloj(){}

    /* Reestablezco el cronometro a 0 */
    public void clean(){
        begin = 0;
        end = 0;
    }

    public void start(){
        // Devuelve la hora actual en milisegundos
        begin = System.currentTimeMillis();
        // Correr = verdadero
        running = true;
    }

    public void stop(){
        // Devuelve la hora actual en milisegundos
        end = System.currentTimeMillis();
        // Detiene la ejecución
        running = false;
    }

    public String getTime(){
        if(!running){
            long t = end - begin;
            return getFormat(get)
        }
    }



}
