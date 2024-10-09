package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import presentacion.vista.VentanaPrincipal;

public class Principal extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        // Inicia la ventana
        VentanaPrincipal vista = new VentanaPrincipal();
        vista.show();
    }

}
