/**
 * @author Ricardo-Sorin-Almajan
 * 
 * @version  0.0
 * 
 * @since 28/02/24
 *  
 */


package main;


import clases.Personaje;
import menus.MenuCrearPersonaje;

public class Principal {

	public static void main(String[] args) {
		Personaje personaje = MenuCrearPersonaje.crearPersonaje();
		personaje.clasesPersonajes(personaje.getClase());
		
		
	}

}
