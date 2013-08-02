package ficha;

public abstract class Persona {

	private String nombre;
	private String apellidos;
	private int NIF;
	private String fechaNa;
//Constructor Personas
	public Persona( String name, String lastname, int nif, String bDay){
		this.setNombre(name);
		this.setApellidos(lastname);
		this.setNIF(nif);
		this.setFechaNa(bDay);
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getNIF() {
		return NIF;
	}
	public void setNIF(int nIF) {
		NIF = nIF;
	}
	public String getFechaNa() {
		return fechaNa;
	}
	public void setFechaNa(String bDay) {
		this.fechaNa = bDay;
	}
	
}
