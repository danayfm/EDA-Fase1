package ficha;






public class Camion extends Vehiculo {

	private Remolque remolque;
	private int numeroRuedas;
	//Creo un array de 6 ruedas por defecto (en el constructor si es incorrecto el numero seran 6 ruedas)
	private Rueda[] ruedas=new Rueda[numeroRuedas];
	
	
	//Sin remolque
	public Camion(String marca, String modelo, String color, String NIF,
			int aMatricula, int km, int potencia, int nEmisiones, 
			String matricula, int nBastidor, int nPlazas, double peso,
			categoria categ, int numeroRuedas) {
		
		super(marca, modelo, color, NIF, aMatricula, km, potencia, nEmisiones, matricula, nBastidor, nPlazas, peso, categ);
	
		if(numeroRuedas<4||numeroRuedas>10) {
			System.out.println("El camion debe tener entre 4 y 10 ruedas, TENDRA 6");
			this.numeroRuedas=6;
		}else {

			this.numeroRuedas=numeroRuedas;
			
		}
	}
	
	//Con remolque
	public Camion(String marca, String modelo, String color, String NIF,
			int aMatricula, int km, int potencia, int nEmisiones, 
			String matricula, int nBastidor, int nPlazas, double peso,
			categoria categ, int numeroRuedas, Remolque remol) {
		
		super(marca, modelo, color, NIF, aMatricula, km, potencia, nEmisiones, matricula, nBastidor, nPlazas, peso, categ);
		this.setRemolque(remol);
		if(numeroRuedas<4||numeroRuedas>10) {
			System.out.println("El camion debe tener entre 4 y 10 ruedas, TENDRA 6");
			this.numeroRuedas=6;
		}else {

			this.numeroRuedas=numeroRuedas;
			
		}
	}
	
	
	@Override
    public String toString() {
        return super.toString() + "\nadaPorAhroa";
    }

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

}
