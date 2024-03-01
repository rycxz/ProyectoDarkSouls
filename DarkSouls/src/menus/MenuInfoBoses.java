package menus;

import java.util.Scanner;

import muestroDatos.SalidaDatos;

public class MenuInfoBoses {
	static Scanner numerosMenu = new Scanner(System.in);
	public static void menuBoses() {
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		int numJefes=90;
		do {
			System.out.println("Que quieres hacer?");
			System.out.println("1-Informacion de todos los jefes");
			System.out.println("2-Buscar por nombre");
			System.out.println("3-Buscar por tipo");
			System.out.println("4-Salir");
			numJefes= numerosMenu.nextInt();
			switch(numJefes) {
			case 1:
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					SalidaDatos.mostrarDatosJefes();
				break;
			case 2:
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				break;
			case 3:
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				break;
			case 4:
				System.out.println("Ha salido!");
				break;
				default:
					System.out.println("Opcion no valida!");
				
			}
		}while (numJefes !=0);
	}

}
