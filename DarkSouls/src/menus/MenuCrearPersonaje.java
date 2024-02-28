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
	 * mostramos el menu de creacion de personaje y le damos valor al objeto de personaje
	 */
	public static Personaje crearPersonaje() {
		String nombre;
		String sexo;
		String clase = null;
		int numClase = 0;
		System.out.println("Bienvenido a la creación de personaje:");
		System.out.println();
		System.out.println("Digame el nombre para su personaje.");
		nombre = letras.nextLine();

		System.out.println("Digame el sexo para su personaje.");
		sexo = letras.nextLine();

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
			clase = " Guerrero";
			break;
		case 2:
			System.out.println(
					"Caballero de baja categoría.\r\n" + "Altos PS, armadura sólida.\r\n" + "No es fácil de derribar.");
			clase = " Caballero";
			break;
		case 3:
			System.out.println("Peregrino sin rumbo.\r\n" + "Lleva una cimitarra.\r\n" + "Gran destreza.");
			clase = " Vagabundo";
			break;
		case 4:
			System.out.println("Con remordimientos.\r\n" + "Impactos críticos altos.\r\n" + "Tiene llave maestra.");
			clase = " Ladron";
			break;
		case 5:
			System.out.println("Bandido salvaje.\r\n" + "Gran fuerza.\r\n" + "Lleva una pesada hacha de guerra.");
			clase = " Bandio";
			break;
		case 6:
			System.out.println("Caza con arco.\r\n" + "Lucha a corta distancia.\r\n" + "No es bueno con la magia.");
			clase = " Cazador";
			break;
		case 7:
			System.out.println("De la Escuela de Dragones de Vinheim.\r\n" + "Usa magia de Almas.");
			clase = " Hechizero";
			break;
		case 8:
			System.out.println("Piromántico del Gran Pantano.\r\n" + "Tira hechizos de fuego y porta hacha de mano.");
			clase = " Piromantico";
			break;
		case 9:
			System.out.println("Clérigo peregrino.\r\n" + "Tiene una maza.\r\n" + "Hace milagros curativos");
			clase = " Clerigo";
			break;
		case 10:
			System.out.println("Enigma sin ropa.\r\n" + "Armado solo con un garrote y un viejo escudo de tablas.");
			clase = " Marginado";
			break;
		default:
			System.out.println("opcion no valida.");
		}
		System.out.println("Personaje creado!");

		// atribuimos los valores de personaje
		
		Personaje personaje = new Personaje(nombre,sexo,clase);
		return personaje;
		

	}
	public static void menuPrincipal() {
		int numMenu=0;
	}
}
