package salidaDatos;

import java.util.Scanner;

import clases.Zonas;

public class SalidaDatosZonas {
	static Scanner letras = new Scanner(System.in);

	/**
	 * aqui buscamos los zonas para poder mostrarlos y hacemos un "for" para mostrar
	 * todos los jefes en orden
	 */
	public static void mostrarDatosZonas(Zonas[] zonas) {
		for (int i = 0; i < zonas.length; i++) {
			if (zonas[i] != null) {
				System.out.println("---------------"
						+ "-----------------------------------------------------------------------------");
				System.out.println("El nombre de la zona es " + zonas[i].getNombre());
				System.out.println("El tipo de zona es " + zonas[i].getTipo());
				String repuesta = letras.nextLine() ;
				if(repuesta.equalsIgnoreCase("Si")) {
					System.out.println("El lore es: " + zonas[i].getLore());
				}
			
			}
		}

	}

	public static void mostrarDatosZonasNombre(Zonas[] zonas,String nombreZona) {
		for (int i = 0; i < zonas.length; i++) {
			if(zonas[i] != null) {
				if(zonas[i].getNombre().equalsIgnoreCase(nombreZona)) {
					System.out.println(zonas[i].toString());
				}
				
			}
		}

	}

	public static void mostrarDatosZonasTipo(Zonas[] zonas,String nombreTipo) {
		for (int i = 0; i < zonas.length; i++) {
			if(zonas[i] != null) {
				if(zonas[i].getTipo().equalsIgnoreCase(nombreTipo)) {
					System.out.println(zonas[i].toString());
				}
				
			}
		}
	}
}