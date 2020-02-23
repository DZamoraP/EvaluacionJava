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
	
	public char comprobarConsumoEnergetico(char letra){
		Character.toUpperCase(letra);
		if (letra!='A' && letra!='F') {
			return CONSUMOENERGETICO;
		}
		else {
			return letra;
		}
	}
	


	public String comprobarColor(String color) {
		if (!color.equals("blanco") &&  !color.equals("negro") && !color.equals("rojo") && !color.equals("azul") 
				&& !color.equals("gris")) {
			return COLOR;
		} else {
			return color;
		}
				
		
	}
	
	
	public double precioFinal() {
		double precio  = 0;
		if (consumoEnergetico == 'A') {
			System.out.println("Entro al A");
			precio += 100;
			System.out.println("Aumento:" + precio);
		}else if (consumoEnergetico == 'B') {
			System.out.println("Entro al B");
			precio += 80;
			System.out.println("Aumento:" + precio);
		}else if (consumoEnergetico == 'C') {
			System.out.println("Entro al C");
			precio += 60;
			System.out.println("Aumento:" + precio);
		}else if (consumoEnergetico == 'D') {
			System.out.println("Entro al D");
			precio += 50;
			System.out.println("Aumento:" + precio);
		}else if (consumoEnergetico == 'E') {
			System.out.println("Entro al E");
			precio += 30;
			System.out.println("Aumento:" + precio);
		}else if (consumoEnergetico == 'F') {
			System.out.println("Entro al F");
			precio += 10;
			System.out.println("Aumento:" + precio);
		}
		
		if (peso >=0 && peso <=19) {
			precio +=  10;
			System.out.println("Entro al Peso menor a 19");
			System.out.println("Aumento:" + precio);
		} else if (peso >=20 && peso <=49) {
			System.out.println("Entro al peso entre 20  - 49");
			precio += 50;
			System.out.println("Aumento:" + precio);
		} else if (peso >=50 && peso <=79) {
			System.out.println("Entro al peso entre 50 y 79");
			precio += 80;
			System.out.println("Aumento:" + precio);
		} else if (peso>=80) {
			System.out.println("Entro al peso entre 80 y mayores");
			precio += 100;
			System.out.println("Aumento:" + precio);
		}
		
		return precioBase + precio;
	}

	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	
	
}
