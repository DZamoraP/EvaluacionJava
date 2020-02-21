package Electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	
	// atributos 
	
	private final static int CARGA= 5;



	/**
	 * Atributos por defecto.
	 */
	
	
		int carga;
	
		
	/**
	 * Contructores vacio
	 */
		
		
	// Constructor
		
	public Lavadora() {
		
	}
		
	public Lavadora(int precioBase, String color, String consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	public Lavadora(int precioBase, String color, String consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.super().precioBase = precioBase;
		this.super().peso = peso;
	}
	

	
		
		
		
	
	
}


	

