package negocioImpl;

import java.util.List;
import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio {
    private PersonaDao personaDao;

    public PersonaNegocioImpl() {
        this.personaDao = new PersonaDaoImpl();
    }

    @Override
    public boolean insert(Persona persona) {
        return personaDao.insert(persona);
    }

    /*@Override
    public boolean modificar(Persona persona_modificar) {
        // Implementación de modificación aquí
        return false;
    }*/

    @Override
    public boolean delete(Persona persona_a_eliminar) {
        // Implementación de eliminación aquí
        return false;
    }

    @Override
    public List<Persona> readAll() {
        // Implementación para leer todos
        return null;
    }
}
