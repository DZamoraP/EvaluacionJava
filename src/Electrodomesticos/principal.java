package Electrodomesticos;


/**
 * Clase para probar la ejecucion del proyecto.
 * 
 * @author Daniel Zamora
 * @version 1.0
 */
public class principal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/**
		 * Arreglo de Clase Electrodomesticos 
		 */
		Electrodomestico listaElectro[] = new Electrodomestico[10];
	
	
		/**
		 * Arreglo de Clase Electrodomesticos con valores de electrodomestico
		 * Precio Base, Color, Consumo Energetico, Peso
		 */
		listaElectro[0]= new Electrodomestico(10,"amarillo",'Z',18); 
		// Datos ingresados de manera incorrecta "amarillo", "Z" para probar metodos de comrpobacion. 
		listaElectro[1]= new Electrodomestico(40,"negro",'C',25);
		listaElectro[2]= new Electrodomestico(60,"rojo",'E',60);
		
		// Precio Base, Peso, otros datos por defecto
		listaElectro[3]= new Electrodomestico(60, 50 );
		
		/**
		 * Arreglo de Clase Electrodomesticos con valores de tipo Lavadora
		 * Precio Base, Color, Consumo Energetico, Peso, Carga.
		 */
		listaElectro[4]= new Lavadora(100, "blanco", 'A', 19, 32);
		listaElectro[5]= new Lavadora(60, "rojo", 'D', 40, 8);
		
		// Precio Base, Peso , otros por defecto
		listaElectro[6]= new Lavadora(140, 30); 

		
		/**
		 * Arreglo de Clase Electrodomesticos con valores de tipo Televisor
		 * Precio Base, Color, Consumo Energetico, Peso,  Resolucion en Pulgadas, Sintonizador TDT.
		 */
		listaElectro[7]= new Television(45, "negro", 'A', 41, 61, true);
		listaElectro[8]= new Television(10, "naranja", 'C', 31, 10, true);
		
		// Precio Base, Peso , otros por defecto
		listaElectro[9]= new Television(150, 20);
	
		/**
		 * Iteracion for para recorrer y mostrar los valores que se añadiron en el arreglo.
		 */
		for (int i=0; i<listaElectro.length;i++) {
			listaElectro[i].comprobarColor();
			listaElectro[i].comprobarConsumoEnergetico();
			System.out.println(listaElectro[i]);
		}
		
		// llamado a metodo para comprabar si color es correcto
	
		
		
		
		// 
		
		
		double precioTotalElectro=0;
        double precioTotalTele=0;
        double precioTotalLava=0;
 
        
        /**
		 * Iterador for que nos permite recorrer el arreglo y preguntar si es una instancia de un objeto. 
		 * luego de determinar la instancia realiza el calculo por del metodo precioFinal. 
		 */
        
        for(int i=0;i<listaElectro.length;i++){
        	
         
        	// Preguntamos si la lista es una instancia de un objeto determinado. 
        	
        	
        	/**
    		 * Arreglo de Clase Electrodomesticos con valores de tipo Televisor
    		 * Precio Base, Color, Consumo Energetico, Peso,  Resolucion en Pulgadas, Sintonizador TDT.
    		 */
 
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
        /**
		 * Visualizamos la suma total de los electrodimosticos
		 */
        System.out.println("El precio total de los electrodomesticos es de " + precioTotalElectro);
        System.out.println("El precio total de las lavadoras es de "+ precioTotalLava);
        System.out.println("El precio total de las televisiones es de "+precioTotalTele);
 
    }
		
	}


