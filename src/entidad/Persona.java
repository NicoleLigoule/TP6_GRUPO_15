package entidad;

public class Persona {
	private String DniPersona;
	private String nombre;
	private String apellido;

	public Persona()
	{
		
	}
			
			
	public Persona(String DniPersona, String nombre, String apellido) {
	    this.DniPersona = DniPersona;
	    this.nombre = nombre;
	    this.apellido = apellido;
	}
	
	public String getDniPersona() {
	    return this.DniPersona;
	}

	public void setDniPersona(String DniPersona) {
	    this.DniPersona = DniPersona;
	}

	public String getNombre() 
	{
		return this.nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getApellido() 
	{
		return this.apellido;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

}
