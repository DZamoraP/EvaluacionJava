package Electrodomesticos;

/**
 * Clase Television que es hija de Electrodimestico que define los atributos de este objeto ademas de los metodos para calculor
 * de tipo precio. 
 * 
 * @author Daniel Zamora
 * @version 1.0
 */
public class Television extends Electrodomestico {
	
	// atributos
	/**
	 * Atributo por defecto
	 */
	private  final static int RESOLUCION = 20;
	private  final static boolean TDT = false;
	
	/**
	 * Atributo
	 */
	private int resolucion;
	private boolean tdt;
	
	
	// contrutores
	
	
	
	/**
     * Constructor por defecto con dos parametros por defecto.
     * @param resolucion  por defecto sera 20
     * @param tdt por defecto sera false
     * 
     */
	public Television(int resolucion, boolean tdt) {
		super();
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
	}
	
	
	/**
     * Constructor con dos parametros y el resto por defecto.
     * @param precioBase entrega el precio base del televisor.
     * @param peso entrega el peso del televisor.
     * 
     */
	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = 	RESOLUCION;
		this.tdt = TDT;
	}
	
	
	/**
     * Constructor con resolucion y tdt y el resto de los atributos heredados.
     * @param resolucion. Entrega la resolucion en pulgadas de la TV.
     * @param tdt. Entrega False o True si hay o no sintonizador tdt en la TV.
     * 
     */
	public Television(double precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = 	resolucion;
		this.tdt = tdt;
	}
		
	
	// Getters
	
	/**
	 * Obtiente la resolucion de la Tv.
	 * 
	 * @return resolucion.
	 */	
	public int getreSolucion() {
		return resolucion;
	}
	
	/**
	 * Obtiente si tiene o no sintonizador de TDT
	 * 
	 * @return tdt
	 */
	public boolean getTdt() {
		return tdt;
	}
	
	// El metododo
	
	/**
	 * Metodo Calcula que la resolucion sea >= 40 y que tenga TDT
	 * si se cumple aumentara el precio final del producto. De lo contrario
	 * el precio no cambaira.
	 * 
	 * @return PreBase.
	 */
	public double precioFinal() {
		double preBase = 0;
		if (resolucion>=40)  {
			preBase = preBase + (super.getPrecioBase() * 1.3);
		}
			
		if (tdt==true) {
	
			preBase += 50;
		}
		
		if (resolucion<40)  {

		}
			
		if (tdt==false) {
			preBase = super.getPrecioBase() + 0;
		
		}
		
		return preBase;
		
	}
	
	/**
	 * Metodo toString
	 * 
	 * @return Muestra toString de Televisor
	 */
	@Override
	public String toString() {
		return "Television: Precio Base= " + getPrecioBase()  + ", Color=" + getColor() +  ", Consumo Energetico=" + getConsumoEnergetico() + ", Peso="
				+ getPeso() + ", Resolucion= " + resolucion + " Pulgadas "+ ", Sintonizador Tdt=" + tdt;
	}
	
	
	
}
