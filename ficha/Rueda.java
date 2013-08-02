package ficha;

public class Rueda extends Pieza {

	public Rueda(boolean estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void revisar() {
		// TODO Auto-generated method stub
		if(super.isEstado()) {
			System.out.println("Esta en buen estado la rueda");	
		}else {
			System.out.println("NO en buen estado la la rueda");	
		}
		
	}

}
