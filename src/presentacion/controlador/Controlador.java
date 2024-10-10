package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import entidad.Persona;
import negocio.PersonaNegocio;
import presentacion.vista.PanelEliminarPersonas;
import presentacion.vista.PanelListarPersonas;
import presentacion.vista.PanelModificarPersona;
import presentacion.vista.VentanaPrincipal;
import presentacion.vista.PanelAgregarPersonas;


public class Controlador implements ActionListener {

	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregarPersonas pnlIngresoPersonas;
	private PanelEliminarPersonas pnlEliminarPersonas;
	private PanelModificarPersona pnlModificarPersonas;
	private PanelListarPersonas pnlListarPersonas;
	private PersonaNegocio pNeg;
	private ArrayList<Persona> personasEnTabla;
	
	
	//Constructor
	public Controlador(VentanaPrincipal vista, PersonaNegocio pNeg)
	{
		//Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		this.pNeg = pNeg;
		
		//Instancio los paneles
		this.pnlIngresoPersonas = new PanelAgregarPersonas();
		this.pnlEliminarPersonas = new PanelEliminarPersonas();
		this.pnlModificarPersonas = new PanelModificarPersona();
		this.pnlListarPersonas = new PanelListarPersonas();
		
		//Enlazo todos los eventos
		
		//Eventos menu del Frame principal llamado Ventana
		this.ventanaPrincipal.getMenuAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		this.ventanaPrincipal.getMenuEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
		this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
		this.ventanaPrincipal.getMenuListar().addActionListener(a->EventoClickMenu_AbrirPanel_ListarPersona(a));

		//Eventos PanelAgregarPersonas
		 this.pnlIngresoPersonas.getBtnAceptar().addActionListener(a->EventoClickBoton_AgregarPesona_PanelAgregarPersonas(a));
		
		 
			
		//Eventos PanelEliminarPersonas
		 this.pnlEliminarPersonas.getBtnEliminar().addActionListener(s->EventoClickBoton_BorrarPesona_PanelEliminarPersonas(s));
		 
		}
	
	//EventoClickMenu abrir PanelAgregarPersonas
	public void  EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a)
	{		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlIngresoPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	//EventoClickMenu abrir PanelEliminarPersonas
	public void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a)
	{		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(pnlEliminarPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	//EventoClickMenu abrir panelListarPersonas
		public void EventoClickMenu_AbrirPanel_ListarPersona(ActionEvent a)
		{		
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlListarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}
		
		//EventoClickMenu abrir PanelModificarPersonas
		public void EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a)
		{		
			personasEnTabla = pNeg.readAll();
			
			 // array con los datos de las personas para el JList
		    String[] personasArray = new String[personasEnTabla.size()];
		    for (int i = 0; i < personasEnTabla.size(); i++) {
		        Persona persona = personasEnTabla.get(i);
		        
		        //Mostramos en Jlist
		        personasArray[i] = persona.getApellido() +" " + persona.getDniPersona() +" " +persona.getNombre();
		        
		    }
		    // Cargar los datos en el JList del panel pnlModificarPersonas
		    pnlModificarPersonas.getList().setListData(personasArray);
		    
		    
		 // Añadimos el listener  para actualizar los campos de texto
		    pnlModificarPersonas.getList().addListSelectionListener(new ListSelectionListener() {
		        @Override
		        public void valueChanged(ListSelectionEvent e) {
		            
		            if (!e.getValueIsAdjusting()) {
		                int selectedIndex = pnlModificarPersonas.getList().getSelectedIndex();
		                if (selectedIndex != -1) {
		                	
		                    // Obtengo la persona seleccionada
		                    Persona personaSeleccionada = personasEnTabla.get(selectedIndex);

		                    //campos de texto con los datos de la persona
		                    pnlModificarPersonas.getNombre().setText(personaSeleccionada.getApellido());
		                    pnlModificarPersonas.getApellido().setText(personaSeleccionada.getDniPersona());
		                    pnlModificarPersonas.getDNI().setText(personaSeleccionada.getNombre());
		                }
		            }
		        }
		    });
		    
		    
			ventanaPrincipal.getContentPane().removeAll();
			ventanaPrincipal.getContentPane().add(pnlModificarPersonas);
			ventanaPrincipal.getContentPane().repaint();
			ventanaPrincipal.getContentPane().revalidate();
		}

	//EventoClickBoton agregar persona en PanelAgregarPersonas
	private void EventoClickBoton_AgregarPesona_PanelAgregarPersonas(ActionEvent a) {
		
		String nombre = this.pnlIngresoPersonas.getTxtNombre().getText();
		String apellido = this.pnlIngresoPersonas.getTxtApellido().getText();
		String dni = this.pnlIngresoPersonas.getTxtDni().getText();
		Persona nuevaPersona = new Persona(nombre, apellido, dni);
		
		boolean estado = pNeg.insert(nuevaPersona);
		String mensaje;
		if(estado==true)
		{
			mensaje="Persona agregada con exito";
			this.pnlIngresoPersonas.getTxtNombre().setText("");
			this.pnlIngresoPersonas.getTxtApellido().setText("");
			this.pnlIngresoPersonas.getTxtDni().setText("");
		}
		else
			mensaje="Persona no agregada, complete todos los campos";
		
		this.pnlIngresoPersonas.mostrarMensaje(mensaje);
	
	}

	
	
	
	//EventoClickBoton borrar persona en PanelEliminarPersonas
	public void EventoClickBoton_BorrarPesona_PanelEliminarPersonas(ActionEvent s) {
	    // Obtener el elemento seleccionado de la lista
	    String personaSeleccionada = this.pnlEliminarPersonas.getListaPersonas().getSelectedValue();
	    
	    if (personaSeleccionada != null) { // Verifica que hay una selección
	        // Extraer el ID de la persona seleccionada
	        String[] partes = personaSeleccionada.split(" "); // Suponiendo que el formato es "Nombre Apellido (DNI)"
	        String dni = partes[partes.length - 1].replace("(", "").replace(")", ""); // Obtiene el DNI sin paréntesis

	        Persona persona = new Persona();
	        persona.setDniPersona(dni); // Asegúrate de que setIdPersona acepte el tipo de dato correcto
	        
	        boolean estado = pNeg.delete(persona);
	        String mensaje;
	        if (estado) {
	            mensaje = "Persona eliminada con éxito";
	        } else {
	            mensaje = "ID inexistente";
	        }

	        // Limpiar la selección
	        this.pnlEliminarPersonas.getListaPersonas().clearSelection();
	        this.pnlEliminarPersonas.mostrarMensaje(mensaje);
	    } else {
	        this.pnlEliminarPersonas.mostrarMensaje("Seleccione una persona para eliminar");
	    }
	}

		



	
	public void inicializar()
	{
		this.ventanaPrincipal.setVisible(true);;
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
