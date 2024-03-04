package acciones;

import clases.Jefes;
import clases.Personaje;
import menus.MenuOpcionesCombateBoses;

public class Combates {
/**
 * 
 * @param todosJefes
 * @param personajePrincipal
 * 
 * hacemos un metodo para tener organizado el sistema de combate, este metodo 
 * solo nos muestra los atributos de nuestra clase y llama a otro donde esta el menu
 */
	public static void combatesContraJefes(Jefes[] todosJefes, Personaje personajePrincipal) {
		System.out.println("Bienvenido a los combates " + personajePrincipal.getNombre());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Antes de comenzar te recuerdo, tu clase es " +personajePrincipal.getClase()+
				" ,tienes un da�o de  " + personajePrincipal.getAtaque() + " y tienes " +personajePrincipal.getVida()  + " puntos de vida.");
		System.out.println();
		MenuOpcionesCombateBoses.combateBosesOpciones(todosJefes, personajePrincipal);
		
		
	}


}
