package presentacion.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelModificarPersona extends JPanel{
	  private JButton btnModificar;
	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField DNI;
	private JList list;
	
	public PanelModificarPersona() {
		setLayout(null);
		
		JLabel lbltitulo = new JLabel("Seleccione la persona que desea modificar");
		lbltitulo.setBounds(15, 16, 333, 20);
		add(lbltitulo);
		
		list = new JList();
		list.setBounds(15, 52, 382, 182);
		add(list);
		
		Nombre = new JTextField();
		Nombre.setBounds(12, 258, 90, 26);
		add(Nombre);
		Nombre.setColumns(10);
		
		Apellido = new JTextField();
		Apellido.setColumns(10);
		Apellido.setBounds(105, 258, 90, 26);
		add(Apellido);
		
		DNI = new JTextField();
		DNI.setColumns(10);
		DNI.setBounds(198, 258, 90, 26);
		add(DNI);
		
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(303, 258, 90, 26);
        add(btnModificar);
        

		
		
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

	public JTextField getNombre() {
		return Nombre;
	}

	public void setNombre(JTextField nombre) {
		Nombre = nombre;
	}

	public JTextField getApellido() {
		return Apellido;
	}

	public void setApellido(JTextField apellido) {
		Apellido = apellido;
	}

	public JTextField getDNI() {
		return DNI;
	}

	public void setDNI(JTextField dNI) {
		DNI = dNI;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}
}
