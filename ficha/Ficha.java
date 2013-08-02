package ficha;



public class Ficha {

	/*
	 * En estas fichas está incluido la matrícula, 
	 * marca, modelo, el bastidor, 
	 * la fecha de primera matriculación, propietario, 
	 * fecha de revisión y empleado que ha creado la ficha.
	 */
	private String matricula;
	private String marca;
	private String modelo;
	private int nBastidor;
	private String pMatri;
	private int owner; /*nif del dueño*/
	private String fecRev;
	private String idEmpleado;
	public Ficha(String matricula, String marca,  String modelo, int nBastidor, String pMatri, int owner, String fecRev, String empleado){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.nBastidor = nBastidor;
		this.pMatri = pMatri;
		this.owner = owner;
		this.fecRev = fecRev;
		this.idEmpleado = empleado;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getnBastidor() {
		return nBastidor;
	}
	public void setnBastidor(int nBastidor) {
		this.nBastidor = nBastidor;
	}
	public String getpMatri() {
		return pMatri;
	}
	public void setpMatri(String pMatri) {
		this.pMatri = pMatri;
	}
	public int getOwner() {
		return owner;
	}
	public void setOwner(int owner) {
		this.owner = owner;
	}
	public String getFecRev() {
		return fecRev;
	}
	public void setFecRev(String fecRev) {
		this.fecRev = fecRev;
	}
	public String getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
}
