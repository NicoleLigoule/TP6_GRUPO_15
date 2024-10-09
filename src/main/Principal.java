package main;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        // Inicia la ventana
        Principal frame = new Principal();
        frame.setVisible(true); // Hace visible la ventana
    }

    public Principal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnPersona = new JMenu("Persona");
        mnPersona.setHorizontalAlignment(SwingConstants.LEFT);
        mnPersona.setBackground(Color.WHITE);
        mnPersona.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnPersona.setForeground(Color.BLACK);
        menuBar.add(mnPersona);

        // Opción Agregar
        JMenuItem MnIAgregar = new JMenuItem("Agregar");
        MnIAgregar.setHorizontalAlignment(SwingConstants.LEFT);
        mnPersona.add(MnIAgregar);

        // Opción Modificar
        JMenuItem MnIModificar = new JMenuItem("Modificar");
        MnIModificar.setHorizontalAlignment(SwingConstants.LEFT);
        mnPersona.add(MnIModificar);

        // Opción Eliminar
        JMenuItem MnIEliminar = new JMenuItem("Eliminar");
        MnIEliminar.setHorizontalAlignment(SwingConstants.LEFT);
        mnPersona.add(MnIEliminar);

        // Opción Listar
        JMenuItem MnIListar = new JMenuItem("Listar");
        MnIListar.setHorizontalAlignment(SwingConstants.LEFT);
        mnPersona.add(MnIListar);
    }
}
