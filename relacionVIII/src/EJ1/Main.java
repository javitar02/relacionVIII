package EJ1;
import java.util.Scanner;

public class Main {

	private static final int MAX_REFRANES = 5;
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcion;
		
		int numRealRefranes=0;
		Refran[] arrayRefranes=new Refran[MAX_REFRANES] ;
		
		
		do {
			opcion=mostrarMenu();
			numRealRefranes=tratarMenu(opcion,arrayRefranes,numRealRefranes);
		} while (opcion!=5);
	}

	private static int tratarMenu(int opcion, Refran[] arrayRefranes,int numRealRefranes) {
		int i;
		int popularidad;
		Refran refran;
		switch(opcion) {
			case 1: 
					
					System.out.println("Introduce un refran: ");
					for(i=0;i<arrayRefranes.length;i++) {
						refran=arrayRefranes[i];
					}
					
					System.out.println("Introduce la popularidad del refran:");
					popularidad=Integer.parseInt(teclado.nextLine());
					
					numRealRefranes++;
					break;
			
			case 2: 		
			
				}
		return numRealRefranes;
		}
		

	
	
	
	private static int mostrarMenu() {
		int opcion;
		System.out.println("--BIENVENIDO AL MENU--");
		System.out.println("1.Guardar un refran");
		System.out.println("2.Buscar un refran por un palabra");
		System.out.println("3.Mostrar la lista de refranes guardados");
		System.out.println("4.Salir");
		
		System.out.println("Introduce una opcion: ");
		opcion=Integer.parseInt(teclado.nextLine());
		
		return opcion;
	}
	

	
	
	
	
	
	
	
}
