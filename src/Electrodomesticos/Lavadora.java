package Electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	
	/**
	 * Atributo por defecto
	 */
	
	private final static int CARGA = 5;
	

	/**
	 * Atributo
	 */
	
	
	int carga;
	
		
	/**
	 * Contructores por defecto
	 */
		
	public Lavadora(int carga) {
		super();
		this.carga = CARGA;
	}
	
	
	// constructor con precio y peso, el resto por defecto
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	
	}
	
	// contructor con carga y resto heredados
	public Lavadora(int precioBase, String color, String consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico,peso);
		this.carga = CARGA;
	
	}
	

	public int getCarga() {
		return carga;
	}

	
	
	
	
	
	
	// MEtodo Calcula que la carga sea mayor o menor a 30
	public int precioFinal(int precio){
		int precioRetorno = 0;
		if (carga>=30) {
			precioRetorno = precioRetorno + 50;
		}else if (carga<30) {
			precioRetorno = precioRetorno + 0;
		}
		return precio;
		
	}

}


	

