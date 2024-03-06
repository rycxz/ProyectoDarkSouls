package salidaDatos;

import java.util.Scanner;

import clases.Zonas;

public class SalidaDatosZonas {
	static Scanner numeros = new Scanner(System.in);

	/**
	 * aqui creamos los jefes para poder mostrarlos y hacemos un "for" para mostrar
	 * todos los jefes en orden
	 */
	public static void mostrarDatosZonas(Zonas[] zonas) {
		for (int i = 0; i < 23; i++) {
			if (zonas[i] != null) {
				System.out.println("---------------"
						+ "-----------------------------------------------------------------------------");
				System.out.println("El nombre de la zona es " + zonas[i].getNombre());
				System.out.println("El tipo de zona es " + zonas[i].getTipo());
				break;
			}

		}

	}

	public static void mostrarDatosZonasNombre(Zonas[] zonas,String nombreZona) {
		for (int i = 0; i < zonas.length; i++) {
			if(zonas[i] != null) {
				if(zonas[i].getNombre().equalsIgnoreCase(nombreZona)) {
					System.out.println(zonas[i]);
				}
			}
		}

	}

	public static void mostrarDatosZonasTipo(Zonas[] zonas,String nombreTipo) {
		for (int i = 0; i < zonas.length; i++) {
			if(zonas[i] != null) {
				if(zonas[i].getNombre().equalsIgnoreCase(nombreTipo)) {
					System.out.println(zonas[i]);
				}
			}
		}
	}
}