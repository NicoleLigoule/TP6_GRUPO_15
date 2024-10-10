package presentacion.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class PanelListarPersonas extends JPanel {
	
	private JTable tablaPersonas;
	private DefaultTableModel modelPersonas;
	private String[] nombreColumnas = {"Nombre","Apellido","Dni"};
	
	public PanelListarPersonas() {
        super();
        initialize();
    }
	
	
	
	
	
	
	
	





	private void initialize() 
	{
		this.setBounds(100, 100, 514, 455);
		this.setLayout(null);
		
		modelPersonas = new DefaultTableModel(null,nombreColumnas);
		
		JScrollPane spPersonas = new JScrollPane();
		spPersonas.setBounds(46, 126, 429, 225);
		add(spPersonas);
		tablaPersonas = new JTable(modelPersonas);
		
		tablaPersonas.getColumnModel().getColumn(0).setPreferredWidth(103);
		tablaPersonas.getColumnModel().getColumn(0).setResizable(false);
		tablaPersonas.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaPersonas.getColumnModel().getColumn(1).setResizable(false);
		tablaPersonas.getColumnModel().getColumn(2).setPreferredWidth(97);
		tablaPersonas.getColumnModel().getColumn(2).setResizable(false);
		
		
		spPersonas.setViewportView(tablaPersonas);
		
	}
	
	public JTable getTablaPersonas() {
		return tablaPersonas;
	}

	public void setTablaPersonas(JTable tablaPersonas) {
		this.tablaPersonas = tablaPersonas;
	}
	
	public DefaultTableModel getModelPersonas() {
		return modelPersonas;
	}

	public void setModelPersonas(DefaultTableModel modelPersonas) {
		this.modelPersonas = modelPersonas;
	}

}
