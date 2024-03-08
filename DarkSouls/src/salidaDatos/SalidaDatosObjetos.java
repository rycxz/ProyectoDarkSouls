package salidaDatos;

import java.util.Scanner;

import clases.Objetos;


public class SalidaDatosObjetos {
	/**
	 * aqui buscamos los objetos para poder mostrarlos y hacemos un "for" para mostrar
	 * todos los objetos en orden
	 */
	static Scanner letras = new Scanner(System.in);
	public static void mostrarDatosObjetos(Objetos[] objetos) {
		for (int i = 0; i < objetos.length; i++) {
			if (objetos[i] != null) {
				System.out.println("---------------"
						+ "-----------------------------------------------------------------------------");
				System.out.println("El nombre del objeto es " + objetos[i].getNombre());
				System.out.println("El tipo de objeto es " + objetos[i].getTipo());
				String repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					System.out.println("El lore es: " + objetos[i].getLore());
				}
			
			}
		}

	}

	public static void mostrarDatosObjetosNombre(Objetos[] objetos,String nombreObjeto) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getNombre().equalsIgnoreCase(nombreObjeto)) {
					System.out.println(objetos[i].toString());
				}
				
			}
		}

	}

	public static void mostrarDatosObjetosTipo(Objetos[] objetos,String nombreTipo) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getTipo().equalsIgnoreCase(nombreTipo)) {
					System.out.println(objetos[i].toString());
				}
				
			}
		}
	}

}
