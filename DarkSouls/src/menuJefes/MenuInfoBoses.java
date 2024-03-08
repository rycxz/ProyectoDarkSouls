package menuJefes;

import java.util.Scanner;

import cargaDatos.CargaDatosJefes;
import clases.Jefes;
import salidaDatos.SalidaDatosJefes;
/**
 *  * metodo donde se muestra el menu del apartado de los boses
 * y la llamda a distintos metodos 
 * 
 * @author recur
 * 

 *
 */
public class MenuInfoBoses {
	static Scanner numerosMenu = new Scanner(System.in);
	static Scanner buscarPalabras = new Scanner(System.in);
	public static void menuBoses(Jefes[] todosJefes) {
		System.out.println();
		System.out.println("--------------------------------------"
				+ "-----------------------------------------------------------");
		int numJefes=90;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1-Infromación de todos los jefes");
			System.out.println("2-Buscar por nombre");
			System.out.println("3-Buscar por tipo");
			System.out.println("4-Salir");
			numJefes= numerosMenu.nextInt();
			switch(numJefes) {
			case 1:
				System.out.println("-----------------------------------------"
						+ "----------------------------------------------------------------------");
				SalidaDatosJefes.mostrarDatosJefes(todosJefes);
				break;
			case 2:
				System.out.println("------------------------------------"
						+ "----------------------------------------------------------------------");
				System.out.println("Jefes: ");
				for(int i = 0;i<todosJefes.length;i++) {
					System.out.println("(" + i + ") "+ todosJefes[i].getNombre() );
				}
				System.out.println("Introdce el nombre del jefe que quiere buscar: (el nombre tiene que estar completo!)");
				String nombreJefeBuscar = buscarPalabras.nextLine();
				SalidaDatosJefes.buscarJefesNombre(todosJefes, nombreJefeBuscar);
				break;
			case 3:
				System.out.println("------------------------------------------"
						+ "----------------------------------------------------------------------------------");
				System.out.println("Introdce el tipo del jefe que quiere buscar: ");
				for(int i = 0;i<todosJefes.length;i++) {
					System.out.println("(" + i + ") "+ todosJefes[i].getTipo());
				}
				String tipoJefeBuscar = buscarPalabras.nextLine();
				SalidaDatosJefes.buscarJefesTipo(todosJefes, tipoJefeBuscar);
			
			case 4:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("Opcion no valida!");
				
			}
		}while (numJefes !=0);
		
	}


}
