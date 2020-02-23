package Electrodomesticos;


public class Television extends Electrodomestico {
	
	// atributos
	private  final static int RESOLUCION = 20;
	private  final static boolean TDT = false;
	
	private int resolucion;
	private boolean tdt;
	
	
	// contrutores
	
	public Television(int resolucion, boolean tdt) {
		super();
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
	}
	
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = 	resolucion;
		this.tdt = tdt;
	}
		
	
	// Getters
	
	public int getreSolucion() {
		return resolucion;
	}
	
	public boolean getTdt() {
		return tdt;
	}
	
	// El metododo
	
	public double precioFinal() {
		double preBase = 0;
		if (resolucion>40)  {
			preBase+= super.getPrecioBase() * 1.3;
		}
		if (tdt==true) {
			preBase+= 50;
		}
		return preBase;
	}

	@Override
	public String toString() {
		return "Television: Resolucion= " + resolucion + " Pulgadas "+ ", Sintonizador Tdt=" + tdt + ", Precio Base=" + getPrecioBase()
				+ ", Color=" + getColor() + ", Consumo Energetico=" + getConsumoEnergetico() + ", Peso="
				+ getPeso();
	}
	
	
	
}
