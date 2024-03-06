package cargaDatos;

import clases.Zonas;

public class CargaDatosZonas {
	/**
	 * 
	 * @return Zonas[]
	 * 
	 * metodo que rellena solo el vector de objetos que se va a usar en el programa, mediante el constructor ya creado
	 */
		public static Zonas[] cargoZonasDatos() {
			String[] nombre = {
					"Asilo", "Santuario de Enlace de Fuego", "Bosque de los No Muertos", "Ruinas de los No Muertos", 
					"Burg Undead", "Parroquia Undead", "Burg Undead Inferior", "Las Profundidades", "Ciudad Infestada", 
					"Dominio de Quelaag", "Gran Hueco", "Lago de Ceniza", "Archivos del Duque", "Anor Londo", "Izalith Perdida", 
					"Altar de la Llama del Caos", "Tumba de los Gigantes", "Ciudad Anillada", "Nuevo Londo", "Valle de Drakes",
					"Bosque Tenebroso", "Tierras Altas del Norte", "Cementerio de los No Muertos", "Catacumbas", "Túneles del Demonio", 
					"Biblioteca del Archivo", "Refugio Real de los No Muertos", "Camino del Dragón", "Refugio de los No Muertos", "Sen's Fortress", 
					"Lugar del Gran Señor", "Pintura de Ariamis", "Valle de las Dríadas", "Refugio del Lago", "Camino del Blanco",
					"Jardines de las Raíces Oscuras", "Manantial del Bosque Real", "Depths", "Área del Asilo", "Altar Negro", 
					"Cementerio de los Gigantes", "Hundimientos del Abismo", 
					"Paraje del Pacto", "Bosque Real", "Nueva Londo", "El Vacío", "Reinado de la Oscuridad", "Nexo Final", "Valle de los Dragones"};
			String[] tipo = {
					"Desconocido", "Santuario", "Bosque", "Ruinas", "Burg", "Parroquia", "Burg", "Profundidades", "Ciudad", 
					"Dominio", "Hueco", "Lago", "Archivos", "Anor", "Izalith", "Altar", "Tumba", "Ciudad", "Nuevo", "Valle", 
					"Bosque", "Tierras", "Cementerio", "Catacumbas", "Túneles", "Biblioteca", "Refugio", "Camino", "Refugio",
					"Sen's", "Lugar", "Pintura", "Valle", "Refugio", "Camino", "Jardines", "Manantial", "Depths", "Área", "Altar",
					"Cementerio", "Hundimientos", "Túneles", "Catacumbas", "Paraje", "Bosque", "Bosque", "Archivos", "Archivos"};

			int numeroZonas = nombre.length;

			Zonas[] zonas = new Zonas[numeroZonas];

			for (int i = 0; i < nombre.length; i++) {
				zonas[i] = new Zonas(nombre[i], tipo[i]);

			}

			return zonas;

		}
			
		
}
