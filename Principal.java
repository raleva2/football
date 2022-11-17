package footballResult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		Resultados resultados1 = new Resultados("Uruguay","Italy", 6, 6);
		Resultados resultados2 = new Resultados("Spain","Brazil", 10, 2);
		Resultados resultados3 = new Resultados("Mexico","Canada", 0, 5);
		Resultados resultados4 = new Resultados("Argentina","Australia", 3, 1);
		Resultados resultados5 = new Resultados("Germany","France", 2, 2);

		ArrayList<Resultados> listaResultado = new ArrayList<Resultados>();
		
		listaResultado.add(resultados1);
		listaResultado.add(resultados2);
		listaResultado.add(resultados3);
		listaResultado.add(resultados4);
		listaResultado.add(resultados5);
		
		
		String equipo1;
		String equipo2;
		int res1;
		int res2;
		
		boolean salir = false;
		boolean salir2 = false;
	    int opcion; //Guardaremos la opcion del usuario
		
		
		try {
			
			do{
				System.out.println("1. Empezar");
		           System.out.println("2. Mostrar resultado");
		           System.out.println("3. Actulizar resultados");
		           System.out.println("4. Finalizar encuentro");
		           System.out.println("5. Salir");
		           System.out.println("Selecciona una de las opciones");
		           opcion = leer.nextInt();
		           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado empezar");
	                   System.out.println("EMPIEZA EL JUEGO");
	       			
		       			System.out.println("Introduzca el nombre equipo 1");
		       			equipo1=leer.next();
		       			
		       			System.out.println("Introduzca el nombre equipo 2");
		       			equipo2=leer.next();
		       			
		       			
		       			Resultados resultados = new Resultados(equipo1,equipo2);
		       			listaResultado.add(resultados);
		       			
	                   break;
	               case 2:
	            	   System.out.println("Has seleccionado mostrar resultados");
	                   System.out.println("\n");
	                   
	                   listaResultado.sort(Comparator.comparing(Resultados::getNow));
	                   
	                   
	                   for(int i = 0; i < listaResultado.size(); i++) {
	                        System.out.println(listaResultado.get(i).getNombre1()+" "+listaResultado.get(i).getNombre2()+" "
	                	+listaResultado.get(i).getResultado1()+" - "+listaResultado.get(i).getResultado2());
	                    }
	                   
	                   System.out.println("\n");
	                   
	                   break;
	                case 3:
	                	int puntos1;
	                	int puntos2;
	                	int posicion;
	                   System.out.println("Has seleccionado actulizar resultados");
	                   System.out.println("\n");
	                   
	                   
	                   for(int i = 0; i < listaResultado.size(); i++) {
	                        System.out.println(i+"-"+listaResultado.get(i).getNombre1()+" "+listaResultado.get(i).getNombre2()+" "
	                	+listaResultado.get(i).getResultado1()+" - "+listaResultado.get(i).getResultado2());
	                    }
	                  
	                   System.out.println("\n");
	                   
	                   do{
	                	   System.out.println("Seleccione la posicion del equipo a editar la puntación de la lista");
		                   posicion =leer.nextInt();
	                	   
	                   }while(posicion >-1 && posicion >= listaResultado.size());
	                   
	                   System.out.println("Introduzca puntos del equipo 1");
		       		   puntos1 =leer.nextInt();
		       		   
		       		   System.out.println("Introduzca puntos del equipo 2");
		       		   puntos2 =leer.nextInt();
	                   
	                   listaResultado.get(posicion).setResultado1(puntos1);
	                   listaResultado.get(posicion).setResultado2(puntos2);
	                   
	                   
	                   break;
	                case 4:
	                	int posicionBorrar;
	                	
		            	   System.out.println("Has seleccionado finalizar encuentro, esto borrar un encuentro");
		                   System.out.println("\n");
		                   
		                   for(int i = 0; i < listaResultado.size(); i++) {
		                        System.out.println(i+"-"+listaResultado.get(i).getNombre1()+" "+listaResultado.get(i).getNombre2()+" "
		                	+listaResultado.get(i).getResultado1()+" - "+listaResultado.get(i).getResultado2());
		                    }
		                   
		                   do{
		                	   System.out.println("Seleccione la posicion del equipo a borrar de la lista");
			                   posicionBorrar =leer.nextInt();
		                	   
		                   }while(posicionBorrar >-1 && posicionBorrar >= listaResultado.size());
		                   
		                   listaResultado.remove(posicionBorrar);
		                   
		                   break;
	                case 5:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
		       }
		       while(!salir);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static Resultados actualizar(Scanner leer) {
		int res1;
		int res2;
		
		System.out.println("Introduzca el resultado del equipo 1");
		res1=leer.nextInt();
		
		System.out.println("Introduzca el resultado del equipo 2");
		res2=leer.nextInt();
		
		return null;
	}

}
