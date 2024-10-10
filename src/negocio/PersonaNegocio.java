package negocio;

import java.util.ArrayList;
import java.util.List;

import entidad.Persona;

public interface PersonaNegocio {

	public boolean insert(Persona persona);
	public boolean modificar(Persona persona_modificar);
	public boolean delete(Persona persona_a_eliminar);
	// List<Persona> readAll();
	public ArrayList<Persona>readAll();
}
