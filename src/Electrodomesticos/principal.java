package Electrodomesticos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Electrodomestico[] arreglo  = new Electrodomestico[9];
		
		Electrodomestico arreglo[]= {new Electrodomestico(100,"negro","A",19), new Electrodomestico(100,"rojo","A",19),
				new Electrodomestico(100,"azul","A",19),new Electrodomestico(100,"gris","A",19),
				new Electrodomestico(100,"blanco","A",19),new Electrodomestico(100,"gris","A",19),
				new Electrodomestico(100,"azul","A",19),new Electrodomestico(100,"rojo","A",19),
				new Electrodomestico(100,"azul","A",19),new Electrodomestico(100,"negro","A",19)};
		
		for (int i=0; i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
		}
		
		
		
	}

}
