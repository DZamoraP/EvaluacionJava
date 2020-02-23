/* Definicion de la Clase Electrodomestico
 *Declaracion de atributos constante.
 *Creacion de constructores por cada atributo 
 * inicializamos los atributos segun lo pedido en la hoja guia
 * creacion de tres metodos
 */

/**
 * Clase padre	que definira atributos comunes de todos los tipos de Electrodomesticos
 * @author DAniel Z.
 * @version 1.0
 */

package Electrodomesticos;


public class Electrodomestico {
	
	
	private  final static double PRECIOBASE = 100;
	private  final static String COLOR = "blanco";
	private  final static char CONSUMOENERGETICO = 'F';
	private  final static int PESO = 5;
	
		
	/**
	 * Atributos
	 */
	
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;
		
	 /**
     * Constructor por defect con 4 parametros
     * @param precioBase  precio del electrodomestico
     * @param color  define color del electrodomestico
     * @param consumoEnergetico define el consumo entre A y F
     * @param peso define el peso del electrodomestico
     */
	
	public  Electrodomestico() {
	
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}
	
	/**
 	* Constructor con parametros, 2 se declaras en base a constante y 2 por defecto
 	* @param precioBase  se define en base a valor constante
 	* @param color  define color del electrodomestico por defecto como blanco
 	* @param consumoEnergetico define el consumo entre A y F por defecto como F
 	* @param peso define el peso del electrodomestico en base a atributo constante
 	*/
	
	public Electrodomestico(double precioBase, int peso) {
		
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
	}
	
	/**
	 * Constructor con todos los atributos.
	 */
		
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
	/**
	 * Se defienen todos los Getters.
	 */
	
	
	
	public double getPrecioBase() {
		return precioBase;
	}




	public String getColor() {
		return color;
	}



	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}




	public int getPeso() {
		return peso;
	}


	/**
	 * Metodos de la Clase 
	 */	
	
	public boolean comprobarConsumoEnergetico(char letra){
		char consumo = Character.toUpperCase(letra);
		
		if (consumo>='A' && consumo<='F') {
			return true;
		}
		else {
			return false;
		}
	}
	


	public boolean comprobarColor(String color) {
		color.toLowerCase();
		switch (color.toLowerCase()){
		case "blanco": return true;
		case "negro": return true;
		case "rojo": return true;
		case "azul": return true;
		case "gris": return true;
		default : return false;
		}
		
	}
	
	
	public double precioFinal(double precioFinal) {
		double precio  = 0;
		if (consumoEnergetico == 'A') {
			precio = precio + 100;
		}else if (consumoEnergetico == 'B') {
			precio = precio + 80;
		}else if (consumoEnergetico == 'C') {
			precio = precio + 60;
		}else if (consumoEnergetico == 'D') {
			precio = precio + 50;
		}else if (consumoEnergetico == 'E') {
			precio = precio + 30;
		}else if (consumoEnergetico == 'F') {
			precio = precio + 10;
		} else if (peso >0 && peso <19) {
			precio = precio + 10;
		} else if (peso >20 && peso <49) {
			precio = precio + 50;
		} else if (peso >50 && peso <79) {
			precio = precio + 80;
		} else if (peso>=80) {
			precio = precio + 100;
		}
		
		return precio;
	}

	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	
	
}
