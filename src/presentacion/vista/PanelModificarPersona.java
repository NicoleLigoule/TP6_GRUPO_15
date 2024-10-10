package presentacion.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelModificarPersona extends JPanel{

	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField DNI;
	
	public PanelModificarPersona() {
		setLayout(null);
		
		JLabel lbltitulo = new JLabel("Seleccione la persona que desea modificar");
		lbltitulo.setBounds(15, 16, 333, 20);
		add(lbltitulo);
		
		JList list = new JList();
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
		
		JButton btnModificar= new JButton("Modificar");
		btnModificar.setBounds(303, 258, 90, 26);
		add(btnModificar);

	}
}
