package dao;

import java.util.List;

import entidad.Persona;

public interface PersonaDao {
	
	public boolean insert(Persona persona);
	public boolean modificar(Persona persona_modificar);
	public boolean delete(Persona persona_a_eliminar);
	public List<Persona> readAll();
}
