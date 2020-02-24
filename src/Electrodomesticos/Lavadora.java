package Electrodomesticos;


/**
 * Clase Lavadora que es hija de Electrodimestico que define los atributos de este objeto ademas de los metodos para calculor
 * de tipo precio. 
 * 
 * @author Daniel Zamora
 * @version 1.0
 */
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
	 * Contructor vacio.
	 */
	public Lavadora() {
	}
	
	
	
	
	
	/**
     * Constructor por defecto con 1 parametro 
     * @param carga  por defecto sera F
     */
	public Lavadora(int carga) {
		super();
		this.carga = CARGA;
	}
	
	
	
	 /**
     * Constructor por defecto con 1 parametro y 2 atributos heredados.
     * @param carga  por defecto sera F
     */
	// constructor con precio y peso, el resto por defecto
	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA;
	}
	
	
	 /**
     * contructor con carga y resto heredados
     * @param carga, el calor sera dato por teclado o por defecto en clase principal.
     */
	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico,peso);
		this.carga = carga;
	}
	

	/**
	 * Obtiente la carga de la lavadora.
	 * 
	 * @return carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Metodo Calcula que la carga sea mayor o menor a 30
	 * 
	 * @return PrecioRetorno
	 */
	public double precioFinal(){
		double precioRetorno = 0;
		if (carga>=30) {
			precioRetorno += super.getPrecioBase() + 50;
		
		}else if (carga<30) {
			precioRetorno += super.getPrecioBase() + 0;
	
		}
		
		return precioRetorno;
		
	}

	
	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Lavadora
	 */
	@Override
	public String toString() {
		return "Lavadora: Precio Base=" + getPrecioBase() + ", Color= " + getColor() + ", Consumo Energetico="
				+ getConsumoEnergetico() + ", Peso=" + getPeso() + ",carga=" + carga;
	}


	
	

}


	

