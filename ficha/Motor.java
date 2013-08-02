package ficha;

public class Motor extends Pieza {

	public Motor(boolean estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void revisar() {
		// TODO Auto-generated method stub
		if(super.isEstado()) {
			System.out.println("Esta en buen estado el Motor");	
		}else {
			System.out.println("NO esta en buen estado el Motor");	
		}
		
	}

}
