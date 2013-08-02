package ficha;

import static org.junit.Assert.*;

import org.junit.Test;

import ficha.Vehiculo.*;

public class CamionTest {

	//Datos de prueba
	final static String marca = "Mercedez-Benz";
	final static String modelo = "XXX";
	final static String color = "blanco";
	final static String nif = "80108213H";
	final static int aMatricula = 1998;
	final static int km = 193823;
	final static int potencia = 200;
	final static int emisiones= 32;
	final static String matricula = "M-3211-T";
	final static int bastidor = 322132;
	final static int plazas = 2;
	final static double peso = 190.2;
	final static categoria categ = categoria.camiones;
	final static int numRuedas = 4;
	final static Remolque remol = new Remolque("Mercedez-Benz", "ZZZ", "negro", "80108213H", 1990, "2192BCD", 32123, 150, 4);
	
	
	Camion miCamionRemolque = new Camion(marca, modelo, color, nif, aMatricula, km, potencia, emisiones, matricula, bastidor, plazas, peso, categ, numRuedas, remol);
	Camion miCamionSinRemolque = new Camion(marca, modelo, color, nif, aMatricula, km, potencia, emisiones, matricula, bastidor, plazas, peso, categ, numRuedas);
	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testCamionStringStringStringStringIntIntIntIntStringIntIntDoubleCategoriaInt() {
		assertNotNull("El objeto no es nulo", miCamionSinRemolque);
		
	}

	@Test
	public void testCamionStringStringStringStringIntIntIntIntStringIntIntDoubleCategoriaRemolque() {
		assertNotNull("El objeto no es nulo", miCamionRemolque);
	}

	@Test
	public void testGetRemolque() {
		assertTrue(miCamionRemolque.getRemolque()==remol);
		
	}

	@Test
	public void testSetRemolque() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetRuedas() {
				
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetRuedas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRevisionCompleta() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testVehiculoStringStringStringStringIntIntIntDoubleStringIntIntDoubleCategoria() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testVehiculo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetMarca() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetMarca() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetModelo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetModelo() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetColor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetColor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetNIF() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetNIF() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetaMatricula() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetaMatricula() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetnBastidor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetnBastidor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetnPlazas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetnPlazas() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetPeso() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetPeso() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetCateg() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetCateg() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetPotencia() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetPotencia() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetKm() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetKm() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetnEmisiones() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetnEmisiones() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetMatricula() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetMatricula() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetFreno() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetFreno() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetMotor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetMotor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetLuz() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetLuz() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetTuboE() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetTuboE() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGetDireccion() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetDireccion() {
		fail("Not yet implemented"); // TODO
	}

}
