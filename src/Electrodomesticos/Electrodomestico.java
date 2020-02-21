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
	
	
	private  final static int PRECIOBASE = 100000;
	private  final static String COLOR = "blanco";
	private  final static String CONSUMOENERGETICO = "F";
	private  final static int PESO = 5;
	
	
	/**
	 * Atributos por defecto.
	 */
	
		int precioBase;
		String color;
		String consumoEnergetico;
		int peso;
		
	/**
	 * Constructor por defecto.
	 */
		
	public Electrodomestico () {

	}
	
	
	 /**
     * Constructor con 4 parametros
     * @param precioBase  precio del electrodomestico
     * @param color  define color del electrodomestico
     * @param consumoEnergetico define el consumo entre A y F
     * @param peso define el peso del electrodomestico
     */
	
	public Electrodomestico(int precioBase, String color, String consumoEnergetico, int peso) {
	
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}
	
	/**
 	* Constructor con parametros, 2 se declaras en base a constante y 2 por defecto
 	* @param precioBase  se define en base a valor constante
 	* @param color  define color del electrodomestico
 	* @param consumoEnergetico define el consumo entre A y F
 	* @param peso define el peso del electrodomestico en base a atributo constante
 	*/
	
	public Electrodomestico(String color ,String consumoEnergetico) {
		
		this.precioBase = PRECIOBASE;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = PESO;
	}
	
	/**
	 * Constructor por defecto.
	 */
		

	public int getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(String consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public static int getPreciobase() {
		return PRECIOBASE;
	}





	public static String getConsumoenergetico() {
		return CONSUMOENERGETICO;
	}





	/**
	 * Metodos de la Clase 
	 */	
	
	public String comprobarConsumoEnergetico(String letra){
		return letra;
	}
	
	public String comprobarColor(String color) {
		return color;
	}
	
	
//	public precioFinal() {
//		
//	}

		
	
}
