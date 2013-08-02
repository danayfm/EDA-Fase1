package ficha;


public class Propietarios extends Persona{
	//Propiedades del propietario
	private String tipoCarnet;
	private String fechaObt;
	public Propietarios(String name, String lastname, int nif, String bDay, String tCarnet, String fObt) {
		// TODO Auto-generated constructor stub
		super(name, lastname, nif, bDay);
		this.setTipoCarnet(tCarnet);
		this.setFechaObt(fObt);
		
		
	}
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	public String getFechaObt() {
		return fechaObt;
	}
	public void setFechaObt(String fechaObt) {
		this.fechaObt = fechaObt;
	}

}
