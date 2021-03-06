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

/**
 * Clase padre	que definira atributos comunes de todos los tipos de electrodomesticos
 * @author Daniel Zamora
 * @version 1.0
 */
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
	 * Constructor con todos los atributos heredados.
	 */
	
	
	 /**
     * Constructor por defecto con 4 parametros
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
	 * Constructor con todos los atributos heredados.
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
	
	
	/**
	 * Obtiente el Precio Base del Electrodomestico.
	 * 
	 * @return precioBase. Retorna PrecioBase del Electrodomestico.
	 */
	public double getPrecioBase() {
		return precioBase;
	}


	/**
	 * Obtiente el Color del Electrodomestico.
	 * 
	 * @return Color. Retorna color del Electrodomestico.
	 */
	public String getColor() {
		return color;
	}


	/**
	 * Obtiente el Consumo Energetico del Electrodomestico.
	 * 
	 * @return ConsumoEnergetico. Retorna Consumo Energetico del Electrodomestico.
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	/**
	 * Obtiente el Peso del Electrodomestico.
	 * 
	 * @return peso. Retorna el peso del Electrodomestico.
	 */
	public int getPeso() {
		return peso;
	}


	// Metodos de la Clase Electrodomestico
	
	/**
	 * Metodo que comprueba el Consumo Energetico sea una letra entre A y F.
	 * 
	 * @return letra.
	 */
	protected char comprobarConsumoEnergetico(){
		Character.toUpperCase(consumoEnergetico);
		if (consumoEnergetico!='A' && consumoEnergetico!='B' && consumoEnergetico!='C' && consumoEnergetico!='D' 
				&& consumoEnergetico!='E' && consumoEnergetico!='F') {
			return consumoEnergetico = CONSUMOENERGETICO;
		}
		else {
			return consumoEnergetico;
		}
	}
	
	/**
	 * Metodo que comprueba el Color del electrodomestico.
	 * 
	 * @return color
	 */
	protected String comprobarColor() {
		if (color !="blanco" &&  color !="negro" && color !="rojo" && color !="azul" 
				&& color !="gris") {
			return color = COLOR;
		} else {	
			return this.color;
		}
	}
	
	/**
	 * Metodo que segun el consumo energetico y el peso calcula el precio final.
	 * 
	 * @return PrecioFinal.
	 */
	protected double precioFinal() {
		double precio  = 0;
		if (this.consumoEnergetico == 'A') {
			precio += 100;
		}else if (this.consumoEnergetico == 'B') {
			precio += 80;
		}else if (this.consumoEnergetico == 'C') {
			precio += 60;
		}else if (this.consumoEnergetico == 'D') {
			precio += 50;
		}else if (this.consumoEnergetico == 'E') {
			precio += 30;
		}else if (this.consumoEnergetico == 'F') {
			precio += 10;
		}
		
		if (this.peso >=0 && this.peso <=19) {
			precio +=  10;
		} else if (this.peso >=20 && this.peso <=49) {
			precio += 50;
		} else if (this.peso >=50 && this.peso <=79) {
			precio += 80;
		} else if (this.peso>=80) {
			precio += 100;
		}
		
		return precioBase + precio;
	}

	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Electrodomestico
	 */
	@Override
	public String toString() {
		return "Electrodomestico: Precio Base=" + precioBase + ", color=" + color + ", Consumo Energetico="
				+ consumoEnergetico + ", Peso=" + peso;
	}

	
	
}
