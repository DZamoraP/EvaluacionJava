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
	private  final static String CONSUMOENERGETICO = "F";
	private  final static int PESO = 5;
	
		
	/**
	 * Atributos
	 */
	
	private double precioBase;
	private String color;
	private String consumoEnergetico;
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
		
	public Electrodomestico(double precioBase, String color, String consumoEnergetico, int peso) {
		
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



	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}




	public int getPeso() {
		return peso;
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
	
	
	public double precioFinal(double precio) {
		return precio;
	}

		
	
}
