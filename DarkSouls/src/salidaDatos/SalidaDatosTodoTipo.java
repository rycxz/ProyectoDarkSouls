package salidaDatos;

import java.util.Scanner;

import clases.Jefes;

public class SalidaDatosTodoTipo {
	static Scanner numeros = new Scanner(System.in);
	/**
	 * aqui creamos los jefes para poder motrarlos y hacemos un for para mostrar
	 * todos los jefes
	 */
	public static void mostrarDatosJefes(Jefes[] todosJefes) {
		for (int i = 0; i < 23; i++) {
			if (todosJefes[i] != null) {
				System.out.println(
						"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("El nombre del jefe es " + todosJefes[i].getNombre());
				System.out.println("El tipo de jefe es " + todosJefes[i].getTipo());
					System.out.println("Quieres ver la historia de este jefe?");
					System.out.println("1-Si");
					System.out.println("2-No");
					int numMuestroDatos;
					numMuestroDatos = numeros.nextInt();
					switch (numMuestroDatos) {
					case 1:

						System.out.println(
								"----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("El lore :");
						System.out.println(todosJefes[i].getInformacionBreve());
						System.out.println();
						break;

					case 2:
						System.out.println("Ha acabado!");
						break;
					default:
						System.out.println("opcion no valida!");
					}
				}
					
				
			
		}

		// creacion de mostrar tu personaje
		// creacion mostrar info clases personajes
		// copiar y pegar con zonas y objetos

	}
	

}
