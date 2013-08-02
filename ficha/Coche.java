package ficha;



public class Coche extends Vehiculo {

	public Coche(String marca, String modelo, String color, String NIF,
			int aMatricula, int km, int potencia, int nEmisiones, 
			String matricula, int nBastidor, int nPlazas, double peso,
			categoria categ) {
		
		super(marca, modelo, color, NIF, aMatricula, km, potencia, nEmisiones, matricula, nBastidor, nPlazas, peso, categ);
	
		//capacidad de plazas entre dos y siete
		if(nPlazas<2||nPlazas>7) {
			System.out.println("Un coche tiene entre dos plazas y siete, tendra dos plazas !!");
	
	       super.setnPlazas(2);
		}
	}
	
	// Añado los atributos de la pieza rueda y cuando los instancio indico el estado como true
		 private Rueda uno= new Rueda(true);
		 private Rueda dos= new Rueda(true);
		 private Rueda tres= new Rueda(true);
		 private Rueda cuatro= new Rueda(true);
	
	@Override
    public String toString() {
        return super.toString() + "\nadaPorAhroa";
    }

	public Rueda getUno() {
		return uno;
	}

	public void setUno(Rueda uno) {
		this.uno = uno;
	}

	public Rueda getDos() {
		return dos;
	}

	public void setDos(Rueda dos) {
		this.dos = dos;
	}

	public Rueda getTres() {
		return tres;
	}

	public void setTres(Rueda tres) {
		this.tres = tres;
	}

	public Rueda getCuatro() {
		return cuatro;
	}

	public void setCuatro(Rueda cuatro) {
		this.cuatro = cuatro;
	}

}
