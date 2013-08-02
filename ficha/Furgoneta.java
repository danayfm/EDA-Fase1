package ficha;



public class Furgoneta extends Coche {

	public Furgoneta(String marca, String modelo, String color, String NIF,
			int aMatricula, int km, int potencia, int nEmisiones, 
			String matricula, int nBastidor, int nPlazas, double peso,
			categoria categ) {
		
		super(marca, modelo, color, NIF, aMatricula, km, potencia, nEmisiones, matricula, nBastidor, nPlazas, peso, categ);
	}
	
	@Override
    public String toString() {
        return super.toString() + "\nadaPorAhroa";
    }

	

}
