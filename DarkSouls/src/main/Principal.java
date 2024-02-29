/**
 * @author Ricardo-Sorin-Almajan
 * 
 * @version  0.0
 * 
 * @since 28/02/24
 *  
 */


package main;


import java.util.Scanner;

import clases.Personaje;
import menus.MenuCrearPersonaje;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Lo primero vamos a crear tu personaje!");
		Personaje personajePrincipal = MenuCrearPersonaje.crearPersonaje();
		System.out.println();
		System.out.println();
		Scanner numerosMenuPrincipal = new Scanner(System.in);
		int numMenu=0;
		do {
		System.out.println("Opciones a elegir:");
		System.out.println("1-Combate contra jefes");
		System.out.println("2-Exploar Zonas");
		System.out.println("3-Salir");
		numMenu= numerosMenuPrincipal.nextInt();
		switch(numMenu) {
		case 1:
			
			
			
		
		
		}
		
		
		
		
		
		
		
		
		
		
		}while(numMenu!=3);
		
		
	}

}
