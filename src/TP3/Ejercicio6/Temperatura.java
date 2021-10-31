package TP3.Ejercicio6;

public class Temperatura {
    private double valor;
    private Escala escala;

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }
    public Escala getEscala() {
        return escala;
    }

    public String toString() {
        return  "Temperatura [valor=" + valor + ", escala= " + escala + "]";
    }

    public double compareTo(Temperatura t){
        return (double)valor - (double)t.getValor();
    }

}
