package ficha;


import java.util.Locale.Category;

import ficha.Vehiculo.categoria;






@SuppressWarnings("unused")
public class Test {

	ColeccionVehiculos conjuntoVehiculos=new ColeccionVehiculos(10);	//Inicializo coleccion con 10 vehiculo
	
	public Test() {
		
		
	}

	
	/*
	o un método para inicializar un objeto de la clase ColeccionVehiculos con unos cuantos
	vehículos, cada uno con características diferentes que permitan probar todos los métodos 
	solicitados en los apartados anteriores.  */
	public void addVehiculos() {
		//Test test=new Test();
		Motocicleta moto=new Motocicleta("Yamaha", "Rx", "Roja", "311", 2012, 50, 200, 30, "6404GHZ", 23, 4, 150, categoria.motocicletas );
		Motocicleta moto2=new Motocicleta("Honda", "RR", "Verde", "321", 20013, 50, 200, 30, "6404GHZ", 23, 4, 150, categoria.motocicletas );
		Coche nuevoCoche = new Coche("Skoda", "Fabia", "Rojo", "03913958W", 2008, 74000, 65, 140, "6404", 69, 5,18000, categoria.coches);
		

		//Vehiculo arraVehi=conjuntoVehiculos
		this.conjuntoVehiculos.addVehiculos(moto2);
		this.conjuntoVehiculos.addVehiculos(moto);
		this.conjuntoVehiculos.addVehiculos(nuevoCoche);
	
	};
	
	public void probarBusquedas(){
		
		   //Probamos que encuentre por DNI
				String marca="No se encuentra vehiculo"; //Si no encuentra esto es lo que devolvera
				try {
					marca=this.conjuntoVehiculos.obtenerVehiculosPorPropietario("03913958W").getMarca().toString();
				} catch (NullPointerException n){
					
				}
				System.out.println("La marca del propietarios es "+marca+"\n");
				
			//Probamos que encuentre el primer vehiculo por year de matriculacion
				String year="No se encuentra vehiculo"; //Si no encuentra esto es lo que devolvera
				try {
					year=this.conjuntoVehiculos.obtenerPrimerVehiculoPorYearMatriculacion(2012).getMatricula().toString();
				} catch (NullPointerException n){
					
				}
				System.out.println("El primer vehiculo por este year es "+year+"\n");
				
				

		
	}
	
	public void probarDistintosMetodos(){
		
		// Imprimo los datos de un vehiculo completo, este es buscado por DNI
		String InfoVehiculo="No se encuentra vehiculo"; //Si no encuentra esto es lo que devolvera
		try {
			InfoVehiculo=this.conjuntoVehiculos.obtenerVehiculosPorPropietario("03913958W").toString();
		} catch (NullPointerException n){
			
		}
		System.out.println("Informacion de un vehiculo : "+"\n "+InfoVehiculo);
		
		//Imprimo el estado de una pieza, en este caso el motor
		Boolean InfoEstadoMotor=false; 
		try {
			InfoEstadoMotor=this.conjuntoVehiculos.obtenerVehiculosPorPropietario("03913958W").getMotor().isEstado();
		} catch (NullPointerException n){
			
		}
		if(InfoEstadoMotor) {
			System.out.println("El estado del motor es correcto: "+"\n ");
		}else {
			System.out.println("El estado del motor NO es correcto: "+"\n ");
		}
		/*  INFO
		 Forma de comprobar el estado de por ejemplo el motor
				
				System.out.println(nuevoCoche.getMotor().isEstado());
				
		Forma de cambiar el estado de la pieza motor
				//nuevoCoche.getMotor().setEstado(false);
				 * 
		Para numero de plazas:
				System.out.println(moto.getnPlazas());
		
		Y simpre para saber la info de cualquier vehiculo simplemente
				System.out.println(moto.toString());   Es porque esta sobreescrito toString en la clase vehiculos
				// y esta implentado en todas las subclases
		
		*/
		
		//REVISON COMPLETA DE UN COCHE es un Void en la clase vehiculo, luego en cada pieza tiene
		// tiene implementado el metodo revisar que automaticamente imprime que se esta revisando
		
		try {
			this.conjuntoVehiculos.obtenerVehiculosPorPropietario("03913958W").revisionCompleta();
		} catch (NullPointerException n){
			
		}
		
		// Asi se revisa solo la luz, anteriormente todo el coche
		try {
			this.conjuntoVehiculos.obtenerVehiculosPorPropietario("03913958W").getLuz().revisar();
		} catch (NullPointerException n){
			
		}
				
		
		
	}
	
	//Metodo que inicializa todos los metodos anteriores para comprobarlos 
	public void test(){
		
		Test test=new Test();   //Metodo que inicializa el constructor test que inicializa un conjunto de vehiculos predefinido (10)
		test.addVehiculos();    //Metodo que add vehiculos al conjunto de vehiculos
	    test.probarBusquedas(); //Metodo para probar busquedas
	    test.probarDistintosMetodos(); // Aqui se prueba ver el estado de una pieza, el resumen de un vehiculos ....
	};
	
	
	
	
	
	

	public static void main(String[] args) {
		
		// Con esto es prueba todo, la advertencia de una motocicleta tiene dos ruedas
		// es porque pruebo con 4 ruedas para comprobar que no es posible que una motocicleta tenga mas de dos ruedas
		Test test=new Test();
		test.test();
		
	}

}
