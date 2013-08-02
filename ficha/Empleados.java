package ficha;


public class Empleados extends Persona{
	//Propiedades de los empleados
	private String idEmp;
	private String fechaAlta;

	public Empleados(String nombre, String apellidos, int nif, String fechaNac, String id, String fechaAlt ) {
		// TODO Auto-generated constructor stub 
		super(nombre, apellidos, nif, fechaNac);
		this.setIdEmp(id);
		this.setFechaAlta(fechaAlt);
	}

	public String getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(String idEmp) {
		this.idEmp = idEmp;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

}
