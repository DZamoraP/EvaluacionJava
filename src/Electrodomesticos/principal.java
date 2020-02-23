package Electrodomesticos;

public class principal {
	
	Electrodomestico electro = new Electrodomestico();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Electrodomestico[] arreglo  = new Electrodomestico[9];
		
		Electrodomestico arreglo[]= {new Electrodomestico(100,"negro",'A',19), new Electrodomestico(80,"rojo",'A',25),
				new Electrodomestico(50,"azul",'D',50),new Electrodomestico(80,"gris",'B',55),
				new Electrodomestico(100,"blanco",'C',60),new Electrodomestico(10,"gris",'C',18),
				new Electrodomestico(50,"azul",'D',100),new Electrodomestico(100,"rojo",'E',80),
				new Electrodomestico(10,"azul",'F',49),new Electrodomestico(80,"negro",'F',100)};
		
		for (int i=0; i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
		
		
		
		
	}

}
