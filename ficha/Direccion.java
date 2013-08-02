package ficha;

public class Direccion extends Pieza {

	public Direccion(boolean estado) {
		super(estado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void revisar() {
		// TODO Auto-generated method stub
		if(super.isEstado()) {
			System.out.println("Esta en buen estado la direccion");	
		}else {
			System.out.println("NO esta en buen estado la direccion");	
		}
		
	}

}
