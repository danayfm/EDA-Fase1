package ficha;



public class Motocicleta extends Vehiculo {
	
	// Añado los atributos de la pieza rueda y cuando los instancio indico el estado como true
	 private Rueda uno= new Rueda(true);
	 private Rueda dos= new Rueda(true);
	 private Cadena cadena= new Cadena(true);
	
	
	public Motocicleta(String marca, String modelo, String color, String NIF,
			int aMatricula, int km, int potencia, int nEmisiones, 
			String matricula, int nBastidor, int nPlazas, double peso,
			categoria categ) {
		
		super(marca, modelo, color, NIF, aMatricula, km, potencia, nEmisiones, matricula, nBastidor, nPlazas, peso, categ);
	
		
		if(nPlazas!=2) {
			System.out.println("Una moto tiene dos plazas, tendra dos plazas !!");
	
	       super.setnPlazas(2);
		}
		
		
	}
	
	
	// PARA MOSTRAR LOS DATOS ;)
	// El metodo toString sera modificado en casa subclase
	// para añadir las cosas que tienen de más
	// por ahora tal cual, se puede añadir más 
	@Override
    public String toString() {
        return super.toString();
    }


	public Rueda getRuedaUno() {
		return uno;
	}


	public void setRuedaUno(Rueda uno) {
		this.uno = uno;
	}


	public Rueda getRuedatDos() {
		return dos;
	}


	public void setRuedaDos(Rueda dos) {
		this.dos = dos;
	}


	public Cadena getCadena() {
		return cadena;
	}


	public void setCadena(Cadena cadena) {
		this.cadena = cadena;
	}

	

	

}
