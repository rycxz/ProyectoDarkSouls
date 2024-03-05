package cargaDatos;

import clases.Jefes;
import clases.Zonas;

public class CargaDatosZonas {
		public static Zonas[] cargoZonasDatos() {
			String[] nombre = {
					"Asilo", "Santuario de Enlace de Fuego", 
					"Bosque de los No Muertos", "Ruinas de los No Muertos", 
					"Burg Undead", "Parroquia Undead", "Burg Undead Inferior", 
					"Las Profundidades", "Ciudad Infestada", "Dominio de Quelaag", 
					"Gran Hueco", "Lago de Ceniza", "Archivos del Duque", "Anor Londo", 
					"Izalith Perdida", "Altar de la Llama del Caos", "Tumba de los Gigantes", "Ciudad Anillada", 
					"Nuevo Londo", "Valle de Drakes", "Bosque Tenebroso", "Tierras Altas del Norte", "Cementerio de los No Muertos", 
					"Catacumbas", "Túneles del Demonio", "Biblioteca del Archivo", "Refugio Real de los No Muertos", "Camino del Dragón", 
					"Refugio de los No Muertos", "Sen's Fortress", "Lugar del Gran Señor", "Pintura de Ariamis", "Valle de las Dríadas", 
					"Refugio del Lago", "Camino del Blanco", "Jardines de las Raíces Oscuras", "Manantial del Bosque Real", "Depths", 
					"Área del Asilo", "Altar Negro", "Cementerio de los Gigantes", "Hundimientos del Abismo", "Túneles del Demonio", 
					"Catacumbas", "Paraje del Pacto", "Bosque Tenebroso", "Bosque Tenebroso", "Archivos del Duque", "Archivos del Duque", 
					"Altar de la Llama del Caos", "Nueva Londo", "El Vacío", "Reinado de la Oscuridad", "El Gran Hueco", "El Vacío", "Nexo Final",
					"Valle de los Dragones", "Lugar del Gran Señor", "Altar Negro", "Ruinas de los No Muertos", "Cementerio de los Gigantes",
					"Bosque Real", "Sen's Fortress", "Ciudad Anillada"};
			String[] tipo = {
					"Asilo", "Santuario de Enlace de Fuego", "Bosque", "Ruinas", "Ciudad Undead", "Parroquia", "Ciudad Undead Inferior",
					"Mazmorras", "Ciudad Infestada", "Dominio", "Hueco", "Lago", "Archivos", "Ciudad Anor Londo", "Izalith", "Altar", "Tumba",
					"Ciudad Anillada", "Nuevo Londo", "Valle", "Bosque Tenebroso", "Tierras Altas", "Cementerio", "Catacumbas", "Túneles",
					"Biblioteca", "Refugio Real", "Camino", "Refugio", "Fortaleza de Sen", "Lugar", "Pintura", "Valle", "Refugio del Lago", 
					"Camino", "Jardines", "Manantial", "Profundidades", "Asilo", "Altar", "Cementerio", "Hundimientos", "Túneles", "Catacumbas",
					"Paraje", "Bosque Tenebroso", "Bosque Tenebroso", "Archivos", "Archivos", "Altar", "Nueva Londo", "Vacío", "Reinado", 
					"Gran Hueco", "Vacío", "Nexo", "Valle", "Lugar", "Altar", "Ruinas", "Cementerio", "Bosque", "Fortaleza de Sen",
					"Ciudad Anillada"};
			String[] lore = {};

			int numeroZonas = nombre.length;

			Zonas[] zonas = new Zonas[numeroZonas];

			for (int i = 0; i < nombre.length; i++) {
				zonas[i] = new Zonas(nombre[i], tipo[i], lore[i]);

			}

			return zonas;

		}
			
		
}
