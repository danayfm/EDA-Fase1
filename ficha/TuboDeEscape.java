package ficha;

public class TuboDeEscape extends Pieza {

	public TuboDeEscape(boolean estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void revisar() {
		// TODO Auto-generated method stub
		if(super.isEstado()) {
			System.out.println("Esta en buen estado el tubo de escape");	
		}else {
			System.out.println("NO esta en buen estado el tubo de escape");	
		}
		
	}

}
