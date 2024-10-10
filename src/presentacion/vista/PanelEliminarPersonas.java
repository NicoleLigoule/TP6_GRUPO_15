package presentacion.vista;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class PanelEliminarPersonas extends JPanel {

    private JList<String> listaPersonas;
    private DefaultListModel<String> modeloLista;
    private JButton btnEliminar;
    private JLabel lblEliminar;

    public PanelEliminarPersonas() {
        setLayout(null);

        modeloLista = new DefaultListModel<>();
        

        listaPersonas = new JList<>(modeloLista);
        listaPersonas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaPersonas.setBounds(120, 48, 202, 199);
        add(listaPersonas);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(120, 248, 202, 30);
        add(btnEliminar);

        lblEliminar = new JLabel("Eliminar usuarios");
        lblEliminar.setBounds(121, 32, 121, 14);
        add(lblEliminar);
    }

    // Getters y setters
    public JList<String> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(JList<String> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public DefaultListModel<String> getModeloLista() {
        return modeloLista;
    }

    public void setModeloLista(DefaultListModel<String> modeloLista) {
        this.modeloLista = modeloLista;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    // Método para mostrar un mensaje de confirmación o error
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}