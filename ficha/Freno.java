package ficha;

public class Freno extends Pieza {

	public Freno(boolean estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void revisar() {
		// TODO Auto-generated method stub
		if(super.isEstado()) {
			System.out.println("Esta en buen estado el freno");	
		}else {
			System.out.println("NO esta sen buen estado el freno");	
		}
		
	}

}
