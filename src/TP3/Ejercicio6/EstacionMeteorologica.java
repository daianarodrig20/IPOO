package TP3.Ejercicio6;

import TP1.Ejercicio6.Clima;
import TP5.Ejercicio1.RandomSelector;

import java.util.*;

public class EstacionMeteorologica {

    private String ciudad;

    private List<Clima> historialClimas = new ArrayList<Clima>();

    private Clima climaActual;

    public EstacionMeteorologica(String unaCiudad){
        ciudad = unaCiudad;
    }

    /* Para generar numero aleatorios utilizo "Random" */
    Random random = new Random();

    /* Actualizar el clima */
    public void actualizarClima(){
        Clima c = new Clima();

        Temperatura temp = new Temperatura();
        /* Defino que va a tomar el numero aleatorio entre 0 y 25 más 1 */
        temp.setValor(random.nextInt(25));
        temp.setEscala(Escala.Celsius);

        c.setUltimaActualizacion(GregorianCalendar.getInstance().getTime());
        c.setCiudad(ciudad);
        c.setTemperaturaActual(temp);

        System.out.println(c);

        setClimaActual(c);
        agregarClima(c);

    }


    /* Asigna el clima actual */
    public void setClimaActual(Clima climaActual){
        this.climaActual = climaActual;
    }

    /* Retorna el clima actual */
    public Clima getClimaActual(){
        return climaActual;
    }

    /* Agregar un clima al historial */
    public void agregarClima(Clima unClima){
        historialClimas.add(unClima);
    };

    /* Elimina un clima del historial */
    public void eliminarClima(Clima unClima){
        historialClimas.remove(unClima);
    };

    /* Retorna todos los climas del historial */
    public List<Clima> getClimas(){
        return historialClimas;
    };

    /* Ordena el historial por fecha */
    public List<Clima> ordenarClimaPorFecha(){
        List<Clima> o = new ArrayList<Clima>(historialClimas);
        Collections.sort(o, new Comparator<Clima>() {
            public int compare(Clima o1, Clima o2) {
                return 	o1.getUltimaActualizacion().compareTo(o2.getUltimaActualizacion());
            }
        });

        return o;
    };

    /* Ordena el historial por temperatura. Sin tener
    en cuenta la escala. Solo se ordena por el valor
    de la temperatura
     */
    public List<Clima> ordenarTemperatura() {
        List<Clima> o = new ArrayList<Clima>(historialClimas);
        Collections.sort(o, new Comparator<Clima>() {

            public int compare(Clima o1, Clima o2) {
                /* A o1 que es un objeto clima llamo al getTemperaturaActual que es de tipo "double"
                   y le hago un casteo para que quede del tipo "Double"
                 */
                return ((Double)o1.getTemperaturaActual())
                        .compareTo(o2.getTemperaturaActual());
            }
        });

        return o;
    }

    public static void main(String[] args) {
        final EstacionMeteorologica e = new EstacionMeteorologica("Pergamino");

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                e.actualizarClima();
            }
        };

        timer.schedule(task, 1, 3000);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        timer.cancel();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>> Por Temperatura: " + e.ordenarTemperatura());

    }
}
