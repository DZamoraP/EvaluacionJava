package Electrodomesticos;

public class principal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico electro = new Electrodomestico();
	
		Television tele = new Television();
		
		

		Electrodomestico listaElectro[] = new Electrodomestico[2];
	
		
		listaElectro[0]= new Electrodomestico(10,"negro",'A',19);
		listaElectro[1]= new Lavadora(100, "negro", 'A', 19, 31);
	

//		listaElectro[2]= new Television(250, 70);
//		
//		listaElectro[3]= new Television(80, false);
//		listaElectro[4]= new Electrodomestico(100,"negro",'C',60);
//		listaElectro[5]= new Electrodomestico(100,"rojo",'E',18);
//		listaElectro[6]= new Electrodomestico(100,"azul",'D',100);
//		listaElectro[7]= new Electrodomestico(100,"negro",'F',80);
//		listaElectro[8]= new Electrodomestico(100,"blanco",'E',49);
//		listaElectro[9]= new Electrodomestico(80,"gris",'F',100);
//		
	
		
		for (int i=0; i<listaElectro.length;i++) {
			System.out.println(listaElectro[i]);
		}
		
		
		double precioTotalElectro=0;
        double precioTotalTele=0;
        double precioTotalLava=0;
 
        
        for(int i=0;i<listaElectro.length;i++){
         
        	// Objeto 			intanceof	Clase
 
            if(listaElectro[i] instanceof Electrodomestico){
            	//double suma = electro.getPrecioBase();
            	//System.out.println("Muestro getPrecio" + electro.getPrecioBase());
                precioTotalElectro+=listaElectro[i].precioFinal();
            }
            if(listaElectro[i] instanceof Lavadora){
                precioTotalLava+=listaElectro[i].precioFinal();
            }
            
//            if(listaElectro[i] instanceof Television){
//                sumaTelevisiones+=listaElectro[i].precioFinal(sumaLavadoras);
//            }
        }
        System.out.println("La suma del precio de los electrodomesticos es de " + precioTotalElectro);
        System.out.println("La suma del precio de las lavadoras es de "+ precioTotalLava);
//        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
 
    }
		
		
		
		
		
	}


