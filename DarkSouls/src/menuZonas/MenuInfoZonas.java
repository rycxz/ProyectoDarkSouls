package menuZonas;

import java.util.Scanner;

import clases.Zonas;
import comprobacionEntrada.Comprobaciones;
import salidaDatos.SalidaDatosZonas;

public class MenuInfoZonas {
	/**
	 * 
	 *
	 * @param zonas
	 * 
	 * menu que muestra las opciones e las zonas
	 */
	public static void infoZonas(Zonas[] zonas) {
		Scanner numeros = new Scanner(System.in);
		Scanner letras = new Scanner(System.in);
		System.out.println("Bienvenido al apartado de zonas!");
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("Tienes varias opciones:");
		int numEleccionZonas = 0;
		String busquedad ;
		do {
			System.out.println("1-Mostrar Informacion de todas las zonas");
			System.out.println("2-Buscar Zonas");
			System.out.println("3-Buscar por tipo");
			System.out.println("4-Salir");
			switch(numEleccionZonas) {
			case 1:
				SalidaDatosZonas.mostrarDatosZonas(zonas);
				break;
			case 2:
				System.out.println("Digame el nombre por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				for(int i =0;i<zonas.length;i++) {
					System.out.println(i+". " + zonas[i].getNombre());
				}
				
				busquedad=letras.nextLine();
				Comprobaciones.comprobacionNombre(busquedad);
				SalidaDatosZonas.mostrarDatosZonasNombre(zonas,busquedad);
				break;
			case 3:
				System.out.println("Digame el tipo por el cual quiere buscar! ");
				System.out.println("Las opciones que tiene son: ");
				for(int i =0;i<zonas.length;i++) {
					System.out.println(i+". " + zonas[i].getTipo());
				}
				
				busquedad=letras.nextLine();
				Comprobaciones.comprobacionNombre(busquedad);
				SalidaDatosZonas.mostrarDatosZonasTipo(zonas,busquedad);
				break;
			case 4:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("opcion no valida");
			}
		}while(numEleccionZonas !=4);

	}

}
