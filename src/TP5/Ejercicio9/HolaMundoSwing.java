package TP5.Ejercicio9;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HolaMundoSwing {

    public static void crearGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("HolaMundoSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hola, Mundo");

        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                crearGUI();
            }
        }
        );
    }
}
