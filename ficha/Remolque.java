package ficha;



//Este  no es un vehiculo por lo que no extend de vehiculo, por esto tampoco tiene categoría enum
public class Remolque  {

	
	//Se le añade el atribuo de carga

	private double carga;
	private boolean inspeccionado;
	
	
	private int numeroRuedas;
	//Creo un array de 4 ruedas por defecto (en el constructor si es incorrecto el numero seran 4 ruedas)
	private Rueda[] ruedas=new Rueda[numeroRuedas];
	
	
	// Obiamente no son un vehiculo, por eso no heredan de vehiculo
	// y por eso no tienen todos sus atributos como capacidad, potencia....
	public Remolque(String marca, String modelo, String color, String NIF,
			int aMatricula,  
			String matricula, int nBastidor, double peso, int numeroRuedas) {
	
		if(numeroRuedas<4||numeroRuedas>10) {
			System.out.println("El remolque debe tener entre 4 y 10 ruedas, TENDRA 4");
			this.numeroRuedas=4;
		}else {

			this.numeroRuedas=numeroRuedas;
			
		}
		
	}

	public double getCarga() {
		return carga;
	}


	public void setCarga(double carga) {
		this.carga = carga;
	}

	//Al estar en arrays para comprobar su estado se deben de recorrer con un for en el test 
	//las ruedas

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public boolean isInspeccionado() {
		return inspeccionado;
	}

	public void setInspeccionado(boolean inspeccionado) {
		this.inspeccionado = inspeccionado;
	}
	
	

}
