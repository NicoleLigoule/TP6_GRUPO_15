package presentacion.vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class vistaAgregarPersona extends JPanel {

    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textDni;

    public vistaAgregarPersona() {
        setLayout(null);

        JLabel lblNombre_1 = new JLabel("Nombre");
        lblNombre_1.setBounds(38, 66, 69, 20);
        add(lblNombre_1);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(38, 125, 69, 20);
        add(lblApellido);

        JLabel lblDni = new JLabel("DNI");
        lblDni.setBounds(38, 187, 69, 20);
        add(lblDni);

        textNombre = new JTextField();
        textNombre.setBounds(136, 63, 197, 26);
        add(textNombre);
        textNombre.setColumns(10);

        textApellido = new JTextField();
        textApellido.setBounds(136, 122, 197, 26);
        add(textApellido);
        textApellido.setColumns(10);

        textDni = new JTextField();
        textDni.setColumns(10);
        textDni.setBounds(136, 184, 197, 26);
        add(textDni);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(33, 234, 115, 29);
        add(btnAceptar);

      
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificar si algún campo está vacío
                if (textNombre.getText().trim().isEmpty() || 
                    textApellido.getText().trim().isEmpty() || 
                    textDni.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Es necesario completar todos los campos", 
                                                  "Mensaje", JOptionPane.WARNING_MESSAGE);
                } 
            }
        });

        JLabel lblId = new JLabel("ID:");
        lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
    }
}
