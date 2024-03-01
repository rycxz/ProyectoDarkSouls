package muestroDatos;

import java.util.Scanner;

import cargaDatos.CargaDatosJefes;
import clases.Jefes;

public class SalidaDatos {
		static Scanner numeros = new Scanner(System.in);
		
		/**
		 * aqui creamos los jefes para poder motrarlos y hacemos un for para mostrar todos los jefes
		 */
		public static void mostrarDatosJefes() {
			Jefes[] mostrarInfoJefes = CargaDatosJefes.cargarContenidoJefes();
			for(int i =0;i<mostrarInfoJefes.length;i++) {
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("El nombre del jefe es " + mostrarInfoJefes[i].getNombre() );
			System.out.println("El tipo de jefe es " +  mostrarInfoJefes[i].getTipo());
			System.out.println("Quieres ver la historia de este jefe?");
			System.out.println("1-Si");
			System.out.println("2-No");
			int numMuestroDatos = numeros.nextInt();
			if(numMuestroDatos==1) {
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("El lore :");
				System.out.println( mostrarInfoJefes[i].getInformacionBreve());
				System.out.println();
			}
			else {
				System.out.println("Ha acabado!");
			}
		}
		}
		//creacion de mostrar tu personaje
		//creacion mostrar info clases personajes
		//copiar y pegar con zonas y objetos
		
}
