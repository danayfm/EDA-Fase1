package ficha;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenaTest {

	final static boolean estado = true;
	Cadena miCadena = new Cadena(estado);
	
	@Test
	public void testCadena() {
		assertNotNull("El objeto no es nulo", miCadena);
		//fail("Not yet implemented");
	}

}
