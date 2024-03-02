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

import cargaDatos.CargaDatosJefes;
import clases.Jefes;
import clases.Personaje;
import menus.MenuCrearPersonaje;
import menus.MenuInfoBoses;


public class Principal {

	public static void main(String[] args) {
		Scanner numerosMenuPrincipal = new Scanner(System.in);
		System.out.println("Lo primero vamos a crear tu personaje!");
		Personaje personajePrincipal = MenuCrearPersonaje.crearPersonaje();
		System.out.println();
		//damos de alta todos los jefes
		Jefes[] todosJefes = CargaDatosJefes.cargarContenidoJefes();
		System.out.println();
		for (int i = 0; i < 23; i++) {
			todosJefes[i].toString();
		}
	
		
		int numMenu=0;
		do {
		System.out.println("Opciones a elegir:");
		System.out.println("1-Combate contra jefes");
		System.out.println("2-Infromacion zonas");
		System.out.println("3-Infromacion jefes");
		System.out.println("4-Informacion objetos");
		System.out.println("5-Salir");
		numMenu= numerosMenuPrincipal.nextInt();
		switch(numMenu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			//acabr metodo, falta cosas
			
			MenuInfoBoses.menuBoses(todosJefes);
			
			break;
		case 4:
			break;
		case 5:
			System.out.println("Ha salido!");
			System.out.println();
			System.out.println("\r\n" + 
					"                                                             ..                                                                                                                     \r\n" + 
					"                                                            ...                                                                                                                     \r\n" + 
					"                                                             ..                                                                                                                     \r\n" + 
					"                                                              .                                                                                                                     \r\n" + 
					"                                                              ..                                                                                                                    \r\n" + 
					"                                                             ...                                                                                                                    \r\n" + 
					"                                                             .'.                                                                                                                    \r\n" + 
					"                                                             .....                                                                                                                  \r\n" + 
					"                                                           .......                                                                                                                  \r\n" + 
					"                                                            ......                                                                                                                  \r\n" + 
					"                                                              .::.                                                                                                                  \r\n" + 
					"                                                               .'.                                                                                                                  \r\n" + 
					"                                                               ...                                                                                                                  \r\n" + 
					"                                                              .'..                                                                                                                  \r\n" + 
					"                                                               ',.  .                                                                                                               \r\n" + 
					"                                                                .. ..                                                                                                               \r\n" + 
					"                                                                .....                                                                                                               \r\n" + 
					"                                                                ..',.                                                                                                               \r\n" + 
					"                                                               ...;;...                                                                                                             \r\n" + 
					"                                                               ...;l;..                                                                                                             \r\n" + 
					"                                                                ..:dl'.                                                                                                             \r\n" + 
					"                                                                ..;ll,..                                                                                                            \r\n" + 
					"                                                               ...',;,..                                                                                                            \r\n" + 
					"                                                           .....'''.''...                                                                                                           \r\n" + 
					"                                                          ...';cllc::loc'.                                                                                                          \r\n" + 
					"                                                          .':ccoddlclddo:'.                                                                                                         \r\n" + 
					"                                                          .,c::clllc:cccc:,..                                                                                                       \r\n" + 
					"                                                         .',,,,;:cc:;;;;;,''..                                                                                                      \r\n" + 
					"                                                      ...,,,,,',;,,;;;,,,'.''................                                                                                       \r\n" + 
					"                                          ...............,;,''',;;;;;;;,,,,,''.',,,'''.........                                                                                     \r\n" + 
					"                                    .......',,;;,'.''.''''''',,,,;;;;,;;;,,,,,,'',;:c:;;,'.....                                                                                     \r\n" + 
					"                               .........',,;:::;,'.''',,'.','',,,;,;;,,,,;,'.',,,;:::cc:;;,,''...                                                                                   \r\n" + 
					"                           .........'''',,;:c::;'..'''''.',;,,,,;;,,;:;,,;;;,,,,',;;;:ccc:;;,'....                                                                                  \r\n" + 
					"                             .......''',,,,;::;;;,,''',,,,,;;;,,;;;,;;;;;;;:::;;;,',,,;;;,,''....                                                                                   \r\n" + 
					"                                 ..........''''',,;::;;;;,;::;,;:c:;;;::ccc::cc:;;,,,''.......                                                                                      \r\n" + 
					"                                   ...............'',,;;;;;;:::;::::::;;;;,'',,.....                                                                                                \r\n" + 
					"                                                 .....',,,,,''''........                                                                                                            \r\n" + 
					"                                                  ................                                                                                                                  \r\n" + 
					"");
			break;
			default:
				System.out.println("opcion no valida!");
		}

		}while(numMenu!=3);
		
		
	}

}
