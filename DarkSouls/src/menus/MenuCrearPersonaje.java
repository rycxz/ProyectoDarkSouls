package menus;

import java.util.Scanner;
import clases.Personaje;

public class MenuCrearPersonaje {
	static Scanner letras = new Scanner(System.in);
	static Scanner numeros = new Scanner(System.in);

	/**
	 * 
	 * @return Personaje
	 * 
	 *         mostramos el menu de creacion de personaje y le damos valor al objeto
	 *         de personaje
	 * 
	 *         y este metodo nos duevuelve el objeto Personaje con todos sus
	 *         vvalores ya creados utilzando su constructor
	 * 
	 * 
	 */
	public static Personaje crearPersonaje() {
		String nombre;
		String sexo;
		String clase = null;
		int numClase = 0;

		System.out.println("Bienvenido a la creación de personaje:");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Digame el nombre para su personaje.");
		nombre = letras.nextLine();
		boolean esNombreValido = true ;

		do {
			for (int i = 0; i < nombre.length(); i++) {
				if (nombre.toLowerCase().charAt(i) > 97 && nombre.toLowerCase().charAt(i) < 122) {
					esNombreValido = true;

				} else {
					System.out.println("El nombre no puede tener caracteres especiales ni letras !");
					System.out.println("Introduzca su nombre de nuevo : ");
					nombre = letras.nextLine();
					esNombreValido = false;
					
				}
			}
		} while (esNombreValido == false);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("Digame el sexo para su personaje.");
		sexo = letras.nextLine();
		
		boolean esSexoValido = true ;

		do {
			for (int i = 0; i < sexo.length(); i++) {
				if (sexo.toLowerCase().charAt(i) > 97 && sexo.toLowerCase().charAt(i) < 122) {
					
					esSexoValido = true;

				} else {
					System.out.println("El sexo no puede tener caracteres especiales ni letras !");
					System.out.println("Introduzca su sexo de nuevo : ");
					sexo = letras.nextLine();
					esSexoValido = false;
				}
			}
		} while (esSexoValido == false);
		
		do {
			
		System.out.println("Digame la clase para su personaje.");
		System.out.println("Las opciones son:");
		System.out.println("1-Guerrero");
		System.out.println("2-Caballero");
		System.out.println("3-Vagabundo");
		System.out.println("4-Ladron");
		System.out.println("5-Bandio");
		System.out.println("6-Cazador");
		System.out.println("7-Hechizero");
		System.out.println("8-Piromantico");
		System.out.println("9-Clerigo");
		System.out.println("10-Marginado");
		numClase = numeros.nextInt();
		
		switch (numClase) {
		case 1:
			System.out.println("Intrépido guerrero.\r\n" + "Experto en las armas.\r\n" + "Gran fuerza y destreza.");
			clase = "Guerrero";
			break;
		case 2:
			System.out.println(
					"Caballero de baja categoría.\r\n" + "Altos PS, armadura sólida.\r\n" + "No es fácil de derribar.");
			clase = "Caballero";
			break;
		case 3:
			System.out.println("Peregrino sin rumbo.\r\n" + "Lleva una cimitarra.\r\n" + "Gran destreza.");
			clase = "Vagabundo";
			break;
		case 4:
			System.out.println("Con remordimientos.\r\n" + "Impactos críticos altos.\r\n" + "Tiene llave maestra.");
			clase = "Ladron";
			break;
		case 5:
			System.out.println("Bandido salvaje.\r\n" + "Gran fuerza.\r\n" + "Lleva una pesada hacha de guerra.");
			clase = "Bandio";
			break;
		case 6:
			System.out.println("Caza con arco.\r\n" + "Lucha a corta distancia.\r\n" + "No es bueno con la magia.");
			clase = "Cazador";
			break;
		case 7:
			System.out.println("De la Escuela de Dragones de Vinheim.\r\n" + "Usa magia de Almas.");
			clase = "Hechizero";
			break;
		case 8:
			System.out.println("Piromántico del Gran Pantano.\r\n" + "Tira hechizos de fuego y porta hacha de mano.");
			clase = "Piromantico";
			break;
		case 9:
			System.out.println("Clérigo peregrino.\r\n" + "Tiene una maza.\r\n" + "Hace milagros curativos");
			clase = "Clerigo";
			break;
		case 10:
			System.out.println("Enigma sin ropa.\r\n" + "Armado solo con un garrote y un viejo escudo de tablas.");
			clase = "Marginado";
			break;
		default:
			System.out.println("opcion no valida.");
			
		}
		}while(numClase<0 || numClase>11);
		System.out.println();
		
		System.out.println("Personaje creado!");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"         .......'',,.. ........     ..    ..'..'.......                       ..               ..  ...             .                           \r\n"
						+ "...                      .......''',..  ..... ..    ...    .....'.....    .','...                      .....                ...  ...                            \r\n"
						+ ".                        .....'''',...  ..''.  . .. ...  .  .........    .lo:'.....                   ......               ..........                           \r\n"
						+ ".                      .......''''''.. ................ .. ......        .:lc,......        ..        ........  ........    ...'..                              \r\n"
						+ ".                      .....',''........................           .     .,,;,.....        ...         ....... ...............'.                                \r\n"
						+ "                       .....,''..''.......'............     ...     .......';:,. ..                   ..... .  .'.............,'.                               \r\n"
						+ "..                     .....''''','.......''.............  ....    .........':,......     .            ..   ...................;'.                              \r\n"
						+ "...                    .......'',,.... .............. ..    ..     ....................                      ..................'..                 ..           \r\n"
						+ "..                      ......'';,'................  ...         ..''.. .....''',,,'..'.                ..   ...........''.......             ..   ..    .      \r\n"
						+ ".                   .  .........'.............   ...   ..        .':c,.... ..''',;;,..,,.         .     ...............,,........         ...  .   ...   .      \r\n"
						+ "..                     ....  ...'............ ..  ...             .cc'.............. .,;.   ..          ..............',..   .... ..      ...     ...           \r\n"
						+ "...                    ....  ..''...............   ..             .,... .......','.. .,,.  .,..         .. ..........',,............             ...            \r\n"
						+ "..                     ....  .',,''.......... ..                  .'....  ..'..''''.. .....'.          ........  .,,'....   .... ...         .   ...            \r\n"
						+ ".                      ........,''..............                  .,..... ...''''.... .  ....          .......   ';,'...   ...    .              ...            \r\n"
						+ "                         ......,,'.............                   .',.... .......'.....     ..         . .. ..   .,'..........   .                ..            \r\n"
						+ "                    ...  ......,,'...........                     ..''.... ......''.. .'.    ...         ...     .'..........   ...              ..             \r\n"
						+ "            .       ....   ....,,'.............                   ........',,'.''..''..;'..   .,.        ...   ...'..'.. ....   ...                             \r\n"
						+ "          .  .      ..........','..............                    .......',,,''''''''.',,'    .,'       ...   ......... .....   .                         .    \r\n"
						+ "         ..  ...     ...... ...''.................                  .':'........'.........;;.   .,'. .    ..   ...... ... .....          ....     ....  ...    .\r\n"
						+ "             ....      ....  ........'.............. .               .'..',,,;'',.......  .,:.....:,.     ..  ... .... ........  .      ..         ...  ....   .\r\n"
						+ "                        ..       ......................             .....;;;::,'''...'...  .;,',. .:'.        .........................    ...         .....    \r\n"
						+ "                          ...      ...................             ..''':lccc,.'.''..''..  ....   .:,           ..............................          ....    \r\n"
						+ "                                   ...................     ...    ...',collo;....'....'..       ...,'      ..  ............... ...........               .      \r\n"
						+ "                                ..;llc;;::'. ...;l, ..,clc:c:.....:oo::dOOko'.'''.,clloo'  .;:;:cc,,';c:....'c;.':l:,......;:;::'..........                     \r\n"
						+ "                                  ,OKc.',o0x;. ,OWx...'kWd,l0O,  .dWk;o00Ox:.''..'dXd,:d:.oOo;,:okOc.oNx....'dl..dNd.... .o0c.,o;............      .            \r\n"
						+ "..                          ..... .k0' ...oN0,.ldOXl..'kWo.:00:...dWOdKOooc,'''..'dXKo:;.oNx'''.';OX:cNd.....lc..oNl......oKkc,.....................            \r\n"
						+ "..                          ..... .k0,....cXK:cklxNK;..xWkoKK:...'xWNXNkc:,.......':oOKO:dWx,.....xWlcXd.....l:..oNo.......:oOKk;..........  ......   ..        \r\n"
						+ ".                             ..  .k0,   .xKc:d;.'oXx..xWc.lKk, .'dN0dkK0o,......:o,..oNo;OKl'...;0O',0k.   ,o,  lNo....,::...dXl..    .     ....  .            \r\n"
						+ ".                                .:kOo;;:lc;;dl.  ,kOc;d0o..,dd;..o0d;'cOOd:.....;dxc:ll'.;xxlc::oc...,ddc;:c,  .o0d;;:ol:oo::oo'         .......  .........    \r\n"
						+ "                                 ......... .....  ...................',:ooc,.......';;'...'....'..      ....   .............''..         .......  ..    ......  \r\n"
						+ " .                                           .         .... .'.......,,;ll;..''..',;::;;;'...''...... .....  ......................       ..                .   \r\n"
						+ "...       .                            .               .,;'..;,..':;;c:lxo:..,:'...;l;.';;...::,..;'. .,.,'  .     .  ...  ............  .......                \r\n"
						+ "                                         ...        .. .............,clol;,'.'''','';;..','..'.'.......'...   .. ......       ...................      ..       \r\n"
						+ " ..                                        ........ ... .............,oo:;''''.',,,',:,.'.............                        ..               ...   .          \r\n"
						+ " ..                                           ..... ...  ...........',:c:;,;;,,'',;,;;;,,......... ...                    .   .                                 \r\n"
						+ " ...                                                 .   ...........,cdoc;,:c:;,,;;;;;,,'...........                ........                                    \r\n"
						+ " ...                                                      ..........:ddoc;:lol:,,;;;::;;,'...........    ...................                                    \r\n"
						+ "                      .. ...  .                   ..   ..........'',:ool::cxOOkc,;:lc::;'''.....................  ....    .....                                 \r\n"
						+ "                  ...........   .                     ...........'',;cl:::cx0XNOocldc::;,,'''..............       ....    .. ...       ..                       \r\n"
						+ "                 ...... ... ......                    ...........'',;:c::codkXWNNKkdcccc;,,'...'..........         .          ........                          \r\n"
						+ "       ..        .....  ...  ..               .  ..  ..........'',',;:::coO0KNWWNNKxccol;,,''..........   ...  .             ........                           \r\n"
						+ "                             ...               .....  ..........''',:cc::d0XNNWWWX0kl:cc;;;,,'.............                      .....                          \r\n"
						+ "                                               .....  ..........''',;::::ok0NWWWNNXXkc:;;;;;,,'.............        .             ....... .                     \r\n"
						+ "               ...                              .... ...........',,,,;;:cxk0XXKKXXK0xlc:;;,,,'''.............       .               ....     ..                 \r\n"
						+ "                                            ..   ................''',,;:lxkxxxoodkOOOxdc;;,,,''''............. .  ..                      ");

		// atribuimos los valores de personaje
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		Personaje personaje = new Personaje(nombre, sexo, clase);
		return personaje;

	}

}
