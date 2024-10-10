package presentacion.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class vistaEliminarPersona extends JPanel {

    private JList<String> listaPersonas;
    private DefaultListModel<String> modeloLista;
    private JButton btnEliminar;

    public vistaEliminarPersona() {
        setLayout(null);

        modeloLista = new DefaultListModel<>();
        modeloLista.addElement("Jose Casas 7800900");
        modeloLista.addElement("Roberto Fernandez 3221103");

        listaPersonas = new JList<>(modeloLista);
        listaPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPersonas.setBounds(120, 48, 202, 199);
        add(listaPersonas);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(120, 248, 202, 30);
        add(btnEliminar);
        
        JLabel lblNewLabel = new JLabel("Eliminar usuarios");
        lblNewLabel.setBounds(121, 32, 121, 14);
        add(lblNewLabel);

       // btnEliminar.addActionListener(new ActionListener() {
         //   @Override
           // public void actionPerformed(ActionEvent e) {
             //   int selectedIndex = listaPersonas.getSelectedIndex();
              //  if (selectedIndex != -1) {
                  //  String selectedValue = listaPersonas.getSelectedValue();

                   // eliminarDeBaseDatos(selectedValue);

                 //   modeloLista.remove(selectedIndex);

                //    JOptionPane.showMessageDialog(null, "El elemento ha sido eliminado correctamente.");
              //  } else {
              //      JOptionPane.showMessageDialog(null, "Por favor, selecciona un elemento.");
               // }
           // }
       // });
   }
}
