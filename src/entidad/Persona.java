package entidad;

public class Persona {
	private int DniPersona;
	private String nombre;
	private String apellido;

	public Persona()
	{
		
	}
			
			
	public Persona(int DniPersona, String nombre, String apellido)
	{
		this.DniPersona = DniPersona;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getDniPersona() 
	{
		return this.DniPersona;
	}

	public void setIdPersona(int DniPersona) 
	{
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

	public void setTelefono(String apellido) 
	{
		this.apellido = apellido;
	}

}
