package ficha;

import ficha.Vehiculo.categoria;



@SuppressWarnings("unused")
public class ColeccionVehiculos {

	
	private Vehiculo[] arrayVehiculos; // Creo un array de vehiculos sin inicializar
	

	// En el constructor como parametro un int para inicializar el arrayVehiculos con la capacidad que queramos
	public ColeccionVehiculos(int a) {
		

	//Implementar la clase ColeccionVehiculos. Usar un array de tama�o fijo H definido en el momento de crearlo. 		
	this.arrayVehiculos=new Vehiculo[a];
			
	}
	

	public void setArrayVehiculos(Vehiculo[] arrayVehiculos)  {
		
		this.arrayVehiculos = arrayVehiculos;
	}

	public  void addVehiculos(Vehiculo vehi){
		
		int cont=0;
		for(int i=0;i<arrayVehiculos.length;i++) {
			if(arrayVehiculos[i]==null && cont==0) cont=i; 
			arrayVehiculos[cont]=vehi;
		}
		
	}
	
	/*
	Escribir los siguientes metodos:
	
	o un metodo que devuelva el primer  vehiculo que tiene un determinado year de 
	matriculacion (o null si no lo hubiera): obtenerPrimerVehiculoPorYearMatriculacion().
	*/
	
	public Vehiculo obtenerPrimerVehiculoPorYearMatriculacion(int year) throws NullPointerException {
		
		for(int i=0;i<this.arrayVehiculos.length;i++) {
			 if(this.arrayVehiculos[i].getaMatricula()==year) return this.arrayVehiculos[i];
		 }
		 return null;
	}
	
	//Los vehiculos de un determinado propietario: obtenerVehiculosPorPropietario().
	   //EL HECHO DE PONER LA EXCEPCION NULLPOINTER ES POR SI SE BUSCA POR UN DNI QUE NO EXISTE
	   // PARA QUE NO DE LA EXCEPCION DE NULL, QUE ES LO QUE DA SI NO EXISTE
	  
	  public Vehiculo obtenerVehiculosPorPropietario(String dniPropietario) throws NullPointerException {
		 
		 for(int i=0;i<this.arrayVehiculos.length;i++) {
			 if(this.arrayVehiculos[i].getNIF()==dniPropietario) return this.arrayVehiculos[i];
		 }
		 
		 return null; 
	 }
	
	
	//(Las piezas de un cierto tipo de todos los vehiculos: obtenerPiezasPorTipos()
			//EL HECHO DE PONER LA EXCEPCION NULLPOINTER ES POR SI SE BUSCA POR UN DNI QUE NO EXISTE
			 // PARA QUE NO DE LA EXCEPCION DE NULL, QUE ES LO QUE DA PORQUE SI NO EXISTE
	   //Aqui lo que hago es devolver el vehiculo completo depend, luego en el metodo test imprimo todas las piezas
	  // mas que nada
	public Vehiculo obtenerPiezasPorTipos(Vehiculo.categoria categoria) throws NullPointerException {
		
		for(int i=0;i<this.arrayVehiculos.length;i++) {
			 if(this.arrayVehiculos[i].getCateg()==categoria) return this.arrayVehiculos[i];
		 }
		 
		return null;
	}
	
	//Los  vehIculos cuyos propietarios tienen una edad comprendida dentro de un rango (por ejemplo, entre 25 y 35): obtenerVehiculosPorRangoEdad().
	//EL HECHO DE PONER LA EXCEPCION NULLPOINTER ES POR SI SE BUSCA POR UN RANGO  QUE NO EXISTE
	// PARA QUE NO DE LA EXCEPCION DE NULL, QUE ES LO QUE DA PORQUE SI NO EXISTE
	
	// Este metodo falta por hacer por que falta la parte de personas, se debe buscar un personas
	// por su edad y luego con el dni de esas persos utilizar el metodo anteriro de vehiculos
	//por dni devolverlos
	public Vehiculo obtenerVehiculosPorRangoEdad(int a, int b) throws NullPointerException{
		
		for(int i=0;i<this.arrayVehiculos.length;i++) {
			
		 }
		 
		 return null; 
		
		
	}
	
	
	

}
