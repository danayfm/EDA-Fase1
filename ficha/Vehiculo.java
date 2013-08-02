package ficha;



public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private String NIF;
	private int aMatricula;
	private int km;
	private int potencia;
	private double nEmisiones;
	private String matricula;
	private int nBastidor;
	private int nPlazas;
	private double peso;
	protected enum categoria {coches, motocicletas,furgonetas,camiones};
	private categoria categ;
	
	/*
	 *Creación de las piezas 
	 *Motor, Freno, Cadena(SOLO EN MOTO), Rueda (MEJOR POR CADA VEHICULO, POR EL NUMERO DE ELLAS)
	 *Luz, TuboDeEscape y Direccion 
	 *
	 *----> Cuando se crea una clase, esta su estado default sera TRUE, ya que es nuevo ;)
	 */
	
	private Freno freno=new Freno(true);
	private Motor motor=new Motor(true);
	private Luz luz=new Luz(true);
	private TuboDeEscape tuboE=new TuboDeEscape(true);
	private Direccion direccion=new Direccion(true);
	
	/*
	
	 * Para cambiar el estado de una pieza, hay un ejemplo en la clase static test :
	 * 
	 *     CREANDO UN NUEVO COCHE
		Coche nuevoCoche = new Coche("Skoda", "Fabia", "Rojo", "03913958W", hoy, 74000, 65, 140, "6404", 69, 5,18000, categoria.coches);
	 * 
	 * 
	 * // Forma de comprobar el estado de por ejemplo el motor
		System.out.println(nuevoCoche.getMotor().isEstado());
	 * 
	 * // Forma de cambiar el estado de la pieza motor
		nuevoCoche.getMotor().setEstado(false);
	 */ 
	 
	
	
	
	
	
	 /* Metodo que hace una revision completa del vehiculo
	 * es decir imprimira por pantalla que se esta revisando
	 * al igual que hara un return del estado de la piezas,
	 * es decir hara un
	 * 			"La pieza x esta siendo revisada"
	 * 			y ademas un true o un false
	 */
	
	
	public void revisionCompleta() {
		
		freno.revisar();
		motor.revisar();
		luz.revisar();
		tuboE.revisar();
		direccion.revisar();
	}
	
	
	//Constructor Vehiculo
	
	public Vehiculo(String marca, String modelo, String color, String NIF,
			int aMatricula, int km, int potencia, double nEmisiones,
			String matricula, int nBastidor, int nPlazas, double peso,
			categoria categ) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.NIF = NIF;
		this.aMatricula = aMatricula;
		this.km=km;
		this.potencia=potencia;
		this.nEmisiones=nEmisiones;
		this.matricula=matricula;
		this.nBastidor = nBastidor;
		this.nPlazas = nPlazas;
		this.peso = peso;
		this.categ = categ;
	}

	//sobrecarga del constructor sin hace nada
	public Vehiculo() {
		
	}

	
	// Sobreescribo el metodo toString para que de la info
	// de las propiedades del vehiculo
	@Override
	public String toString() {
        
		
		return "marca=" + marca + "\nmodelo=" + modelo 
                + "\ncolor=" + color + "\nNIF=" + NIF
                + "\nAno de Matriculacion =" + aMatricula + "\nKm=" + km 
                + "\nPotencia =" + potencia + "\nNumero de Emisiones=" + nEmisiones
                + "\nMatricula=" + matricula + "\nBastidor=" + nBastidor
                + "\nPlazas=" + nPlazas + "\nPeso=" + peso + "\nCategoria=" + categ;
        
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String NIF) {
		this.NIF = NIF;
	}

	public int getaMatricula() {
		return aMatricula;
	}

	public void setaMatricula(int aMatricula) {
		this.aMatricula = aMatricula;
	}

	public int getnBastidor() {
		return nBastidor;
	}

	public void setnBastidor(int nBastidor) {
		this.nBastidor = nBastidor;
	}

	public int getnPlazas() {
		return nPlazas;
	}

	public void setnPlazas(int nPlazas) {
		this.nPlazas = nPlazas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public categoria getCateg() {
		return categ;
	}

	public void setCateg(categoria categ) {
		this.categ = categ;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getnEmisiones() {
		return nEmisiones;
	}

	public void setnEmisiones(int nEmisiones) {
		this.nEmisiones = nEmisiones;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Freno getFreno() {
		return freno;
	}

	public void setFreno(Freno freno) {
		this.freno = freno;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Luz getLuz() {
		return luz;
	}

	public void setLuz(Luz luz) {
		this.luz = luz;
	}

	public TuboDeEscape getTuboE() {
		return tuboE;
	}

	public void setTuboE(TuboDeEscape tuboE) {
		this.tuboE = tuboE;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	
	 
	    
	
	
	
	
	

}
