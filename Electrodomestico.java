package Electrodomestico;

public class Electrodomestico {
	
	private  final static int PRECIOBASE = 100000;
	private  final static String COLOR = "blanco";
	private  final static String CONSUMOENERGETICO = "F";
	private  final static int PESO = 5;
	
		// Creacion de Atributos 
		int precioBase;
		String color;
		String consumoEnergetico;
		int peso;
		
	
	public Electrodomestico(int precioBase, String color, String consumoEnergetico, int peso) {
	
			this.precioBase = PRECIOBASE;
			this.color = COLOR;
			this.consumoEnergetico = CONSUMOENERGETICO;
			this.peso = PESO;
		}
	
	public Electrodomestico(String color ,String consumoEnergetico) {
		
		this.precioBase = PRECIOBASE;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = PESO;
	}
	
	public Electrodomestico () {
		
	}
	
	public String comprobarConsumoEnergetico(String letra){
		return letra;
	}
	
	public String comprobarColor(String color) {
		return color;
	}

		
	
}
