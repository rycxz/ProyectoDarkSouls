package cargaDatos;

import clases.Jefes;

public class CargaDatosJefes {
		static String[] nombre = { "Asylum Demon", "Taurus Demon", "Bell Gargoyles", "Capra Demon", "Gaping Dragon", "Quelaag",
			"Ceaseless Discharge", "Iron Golem", "Ornstein y Smough", "Sif, el Gran Lobo Gris", "Pinwheel",
			"Nito, Señor de los Muertos", "Cuatro Reyes", "Seath el Descamado", "Firesage Demon", "Demonio Centinela",
			"Árbol del Caos", "Artorias el Caminante del Abismo", "Guardián del Santuario", "Manus, Padre del Abismo",
			"Caballero Artorias", "Kalameet, el Dragón Negro", "Gwyn, Señor de la Ceniza" };
		static String[] tipo = { "Demonio", "Demonio", "Gárgolas", "Demonio", "Dragón", "Araña/Demonio", "Demonio",
			"Gólem de Hierro", "Caballeros", "Lobo", "Necrómaco", "Señor de los Muertos", "Espíritus oscuros", "Dragón",
			"Demonio", "Demonio", "Entidad caótica", "Caballero corrompido", "Quimera", "Ser del Abismo",
			"Caballero corrompido", "Dragón", "Señor de la Ceniza" };
		static String[] informacionBreve = {
			"Abandonado en el asilo, sus cadenas forjan su resentimiento. Un presagio ardiente de las adversidades venideras",
			"Tauro, el implacable, protege la Ciudadela con furia y poder. Una barrera inicial, anunciando la cruda realidad",
			"Guardianes de la campana, testigos del intruso. Sus ojos escudriñan con cautela, mientras las llamas del combate arden en el tejado de la catedral.",
			" Capra y sus mastines guardan un pasaje vital. El enfrentamiento en el caos de callejones estrechos, una danza mortal entre acero y furia.",
			"El Gaping Dragon, grotesco y hambriento, emerge de las profundidades. Una creación de excesos, un recordatorio de la distorsión",
			"Quelaag, mitad mujer, mitad araña, custodia el acceso a Izalith. Su fuego caótico nace de una tragedia compartida.",
			"Ceaseless Discharge, afligido por la pérdida, vela en solitario sobre la tumba de sus hermanas. Su ira ardiente es una prueba de lealtad y dolor",
			" Guardián de Anor Londo, el Iron Golem protege el paso hacia los dioses. Un coloso de hierro, vigilante de la ciudad dorada.",
			"Ornstein y Smough, pareja temida, defienden la sala del trono. Una prueba de resistencia ante los guardianes de la diosa.",
			"Sif, el leal compañero de Artorias, protege su tumba. Un lamento silencioso en la oscuridad del Bosque Real.",
			"Pinwheel, desgarrado por la tristeza y la desesperación, busca desafiar la muerte misma. Un alma dividida, tejiendo engaños en las sombras.",
			"Nito, señor de la muerte, gobierna el reino de la oscuridad. Su presencia es la esencia misma de la mortalidad.",
			" Los Cuatro Reyes, monarcas de las profundidades oscuras, emergen en un reino de sombras. El desafío yace en enfrentar la soledad del abismo.",
			"Seath el Descamado, traicionado por su falta de escamas, busca inmortalidad en la investigación y el sufrimiento. Una figura trágica en el Archivo del Duque.",
			" Firesage Demon, hermano de los demonios caídos, guarda las ruinas del Caos. Una sombra ardiente en la oscuridad.",
			" Centinela, vigilante del lecho de llamas, enfrenta a los intrusos con ferocidad. Un guardián infernal, protector del corazón del Caos.",
			"El Árbol del Caos, una entidad caótica que distorsiona la naturaleza. Sus raíces se extienden como tentáculos, un reflejo de la desesperación.",
			"Artorias el Caminante del Abismo, héroe corrompido, luchó valientemente contra la oscuridad. Ahora yace en la locura del abismo.",
			" El Guardián del Santuario, quimera feroz en el bosque real, protege con fiereza su territorio. Un desafío en la maleza de Oolacile.",
			" Manus, Padre del Abismo, desata la oscuridad y la locura en Oolacile. Un ser ancestral, la raíz del caos que consume.",
			" Caballero Artorias, sacrificado por el bien, ahora lucha en la corrupción. Su legado perdido en las sombras del abismo.",
			"Kalameet, el Dragón Negro, desafía incluso a los dioses en el Valle Real. Un símbolo de desafío y ferocidad.",
			"Gwyn, el último dios, se sacrifica para mantener viva la llama. Un señor que arde en la eternidad, marcando el fin de una era." };
		static int[] vida = { 1000, 1200, 1400, 800, 1800, 2000, 1600, 2500, 3000, 1800, 1200, 2200, 2500, 2800, 1500, 1800, 2000,
				2800, 2000, 3000, 2800, 3000, 4000 };
		static int[] ataque = { 15, 20, 25, 40, 60, 70, 75, 85, 110, 120, 130, 135, 145, 155, 165, 200, 220,
				230, 250, 260, 275, 280, 400 };

		static int numeroJefes = nombre.length;
/**
 * 
 * @return jefesTotales
 * 
 * para este metodo he creado nombre,tipo,informacionBreve,vida y aqtaque en orden asi se facilita la isercion de datos para la creacion del obejto
 * priermo comprbomnos que el espacio este vacio y depues usamos el ocnstructor creado para la ifnoramcion y depues le atribuyimo la vida y el atque para el combate
 */
	public static Jefes[] cargarContenidoJefes() {
		Jefes[] jefesTotales = new Jefes[numeroJefes];
		for(int i = 0;i<numeroJefes;i++) {
			if(jefesTotales[i]!=null) {
				jefesTotales[i] = new Jefes(nombre[i],tipo[i],informacionBreve[i]);
				jefesTotales[i].setVida(vida[i]);
				jefesTotales[i].setAtaque(ataque[i]);
				break;
						
			}
		}
		return jefesTotales;

	}

}
