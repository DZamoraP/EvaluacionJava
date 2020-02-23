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
		double precioRetorno = 0;
		if (carga>=30) {
			precioRetorno += super.getPrecioBase() + 50;
		
		}else if (carga<30) {
			precioRetorno += super.getPrecioBase() + 0;
	
		}
		
		return precioRetorno;
		
	}

	@Override
	public String toString() {
		return "Lavadora: carga=" + carga + ", Precio Base=" + getPrecioBase() + ", Color= " + getColor() + ", Consumo Energetico="
				+ getConsumoEnergetico() + ", Peso=" + getPeso();
	}


	
	

}


	

