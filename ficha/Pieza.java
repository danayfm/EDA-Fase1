package ficha;

public abstract class Pieza {
	
	private boolean estado;
	
	

	public Pieza(boolean estado) {
		this.estado=estado;
	}
	
	
	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	
	public void revisar() {
		
		
	}

}
