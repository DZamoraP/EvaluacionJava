package Electrodomesticos;


public class Television extends Electrodomestico {
	
	// atributos
	private  final static int RESOLUCION = 20;
	private  final static boolean TDT = false;
	
	private int resolucion;
	private boolean tdt;
	
	
	// contrutores
	
	public Television(int precioBase, String color, String consumoEnergetico, int peso ) {
		super();
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
	}
	
	
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
	}
	
	public Television(int resolucion, boolean tdt) {
		super();
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
		
	}

	
	
	// Getters
	
	public int getreSolucion() {
		return resolucion;
	}
	
	public boolean getTdt() {
		return tdt;
	}
	
	// El metododo
	
	public double precioFinal(double precioFinal) {
		double preBase = 0;
		if (resolucion>40 && tdt) {
			
			preBase = preBase + (getPrecioBase() * 0.3);
			preBase = preBase + 50;
				
		}

		
		return precioFinal;
	}
	
	
	
}
