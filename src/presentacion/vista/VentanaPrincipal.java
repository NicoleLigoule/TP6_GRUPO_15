package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaPrincipal{

    private JPanel contentPane;
    private JFrame frmPrincipal;

    public VentanaPrincipal() {
    	frmPrincipal = new JFrame();
    	frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frmPrincipal.setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout(0, 0));
        frmPrincipal.setContentPane(contentPane);

        JMenuBar menuBar = new JMenuBar();
        frmPrincipal.setJMenuBar(menuBar);

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
        // comment de prueba
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
        
        frmPrincipal.setVisible(true);
    }

}
