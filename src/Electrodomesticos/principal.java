package Electrodomesticos;

public class principal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico listaElectro[] = new Electrodomestico[10];
	
		// Datos Electrodimesticos:
		// Precio Base, Color, Consumo Energetico, Peso
		listaElectro[0]= new Electrodomestico(10,"negro",'A',18);
		listaElectro[1]= new Electrodomestico(40,"blanco",'C',25);
		listaElectro[2]= new Electrodomestico(60,"rojo",'E',60);
		
		// Precio Base, Peso, otros datos por defecto
		listaElectro[3]= new Electrodomestico(60, 50 );
		
		
		// Datos Lavadora:
		// Precio Base, Color, Consumo Energetico, Peso, Carga.
		listaElectro[4]= new Lavadora(100, "blanco", 'A', 19, 32);
		listaElectro[5]= new Lavadora(60, "rojo", 'D', 40, 8);
		
		// Precio Base, Peso , otros por defecto
		listaElectro[6]= new Lavadora(140, 30); 

	
			
		// Datos Television:
		// Precio Base, Color, Consumo Energetico, Peso,  Resolucion en Pulgadas, Sintonizador TDT.
		listaElectro[7]= new Television(45, "negro", 'A', 41, 61, true);
		listaElectro[8]= new Television(40, "negro", 'C', 31, 41, true);
		
		// Precio Base, Peso , otros por defecto
		listaElectro[9]= new Television(150, 20);
	
	
		for (int i=0; i<listaElectro.length;i++) {
			System.out.println(listaElectro[i]);
		}
		
		
		double precioTotalElectro=0;
        double precioTotalTele=0;
        double precioTotalLava=0;
 
        
        for(int i=0;i<listaElectro.length;i++){
        	
         
        	// Preguntamos si la lista es una instancia de un objeto determinado. 
 
            if(listaElectro[i] instanceof Electrodomestico){
            	double preciPorElectro = 0;
                precioTotalElectro+=listaElectro[i].precioFinal();
                preciPorElectro = listaElectro[i].precioFinal();
                System.out.println("El Precio del Electrodomestico: " + preciPorElectro);
               
                
            }
            if(listaElectro[i] instanceof Lavadora){
            	double preciPorElectro = 0;
                precioTotalLava+=listaElectro[i].precioFinal();
                preciPorElectro = listaElectro[i].precioFinal();
                System.out.println("El Precio de la Lavadora: " + preciPorElectro);
            
            }
            
            if(listaElectro[i] instanceof Television){
            	double preciPorElectro = 0;
                precioTotalTele+=listaElectro[i].precioFinal();
                preciPorElectro = listaElectro[i].precioFinal();
                System.out.println("El Precio del Television: " + preciPorElectro);
                
            }
            System.out.println("");
        }
        
        
        
        // Visualizar la suma total de los electrodomesticos
        System.out.println("El precio total de los electrodomesticos es de " + precioTotalElectro);
        System.out.println("El precio total de las lavadoras es de "+ precioTotalLava);
        System.out.println("El precio total de las televisiones es de "+precioTotalTele);
 
    }
		
		
		
		
		
	}


