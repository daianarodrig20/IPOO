package TP4.Ejercicio1;

import javax.swing.*;

public class HolaMundoSwing {
    public static void crearGUI() {
        /* JFrame es una clase utilizada en Swing para generar ventanas
           sobre las cuales añadir distintos objetos con los que podra
           interactuar o no el usuario
           El JFrame es necesario como base o contenedor base para todos los
           demas componentes graficos
         */
        JFrame.setDefaultLookAndFeelDecorated(true);
        /* .setDefaultLookAndFeelDecorated(true) hace que las decoraciones
           se vean y se sientan bien
         */
        JFrame frame = new JFrame("HolaMundoSwing");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Esto basicamente cierra la ventana, jeje salu2
           Le indicamos que cuando se cierre esta ventana, el programa tiene
           que terminar
        * */



         /* JLabel son textos que podemos colocar en un Frame, pero ademas de
            textos podemos colocar imagenes(animadas o no) para darle una buena
            presentacion a nuestra ventana, los JLabel son esenciales al momento
            de crear una interfas de usuario
          */
        JLabel label = new JLabel("Hola, como va ?");

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crearGUI();
            }
        });
    }
}
