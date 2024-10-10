package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelAgregarPersonas extends JPanel {
    private JButton btnAceptar;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtDni;

    public PanelAgregarPersonas() {
        super();
        initialize();
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtDni() {
        return txtDni;
    }

    private void initialize() {
        this.setBounds(100, 100, 514, 455);
        this.setLayout(null);
        
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(12, 137, 113, 23);
        add(btnAceptar);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(12, 27, 170, 14);
        add(lblNombre);
        
        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(12, 70, 113, 14);
        add(lblApellido);
        
        txtNombre = new JTextField();
        txtNombre.setColumns(10);
        txtNombre.setBounds(125, 24, 164, 20);
        add(txtNombre);
        
        JLabel lblDni = new JLabel("Dni");
        lblDni.setBounds(12, 110, 113, 14);
        add(lblDni);
        
        txtApellido = new JTextField();
        txtApellido.setColumns(10);
        txtApellido.setBounds(125, 67, 164, 20);
        add(txtApellido);
        
        txtDni = new JTextField();
        txtDni.setColumns(10);
        txtDni.setBounds(125, 107, 164, 20);
        add(txtDni);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
