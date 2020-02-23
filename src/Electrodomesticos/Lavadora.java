package Electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	
	/**
	 * Atributo por defecto
	 */
	
	private final static int CARGA = 5;
	

	/**
	 * Atributo
	 */
	
	
	private int carga;
	
		
	/**
	 * Contructores por defecto
	 */
	
	public Lavadora() {
		
	}
		
	public Lavadora(int carga) {
		super();
		this.carga = CARGA;
	}
	
	
	// constructor con precio y peso, el resto por defecto
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	
	}
	
	// contructor con carga y resto heredados
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico,peso);
		this.carga = carga;
	
	}
	

	public int getCarga() {
		return carga;
	}

	
	
	
	
	
	
	// Metodo Calcula que la carga sea mayor o menor a 30
	public double precioFinal(){
		int precioRetorno = 0;
		if (carga>=30) {
			System.out.println("Entro a lavadora Carga mayor a 30 kl");
			precioRetorno = precioRetorno + 50;
			System.out.println("Aumento: " + precioRetorno);
		}else if (carga<30) {
			System.out.println("Entro a lavadora Carga menor a 30 kl");
			precioRetorno = precioRetorno + 0;
			System.out.println("Aumento: " + precioRetorno);
		}
		
		return precioRetorno;
		
	}

	@Override
	public String toString() {
		return "Lavadora: carga=" + carga + ", Precio Base=" + getPrecioBase() + ", Color= " + getColor() + ", Consumo Energetico="
				+ getConsumoEnergetico() + ", Peso=" + getPeso();
	}


	
	

}


	

