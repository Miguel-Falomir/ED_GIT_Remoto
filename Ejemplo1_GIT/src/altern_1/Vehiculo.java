package altern_1;
/**
 * 
 * OBJECTS SHEET
 *
 */

public class Vehiculo {
	// ATTRIBUTES
	public String 	marca = "Seat";
	public String 	modelo = "Leon";
	public int 		cilindrada = 2000;
	public int 		potencia = 150;
	public int 		anyos = 15;
	
	// DEFAULT CONSTRUCTORS
	Vehiculo(){
		
	}
	
	// PARAMETERIZED CONSTUCTORS
	Vehiculo(	String marca_,
				String modelo_,
				int cilindrada_,
				int potencia_,
				int anyos_
				){
		this.marca = marca_;
		this.modelo = modelo_;
		this.cilindrada = cilindrada_;
		this.potencia = potencia_;
		this.anyos = anyos_;
	}
	
	// METHODS
	public String toString() {
		return	"Marca:\t\t"	+ this.marca		+ "\n" +
				"Modelo:\t\t"	+ this.modelo		+ "\n" +
				"Cilindrada:\t" + this.cilindrada	+ "\n" +
				"Potencia:\t"	+ this.potencia		+ "\n" +
				"Anyos:\t\t"	+ this.anyos		;
	}
}
