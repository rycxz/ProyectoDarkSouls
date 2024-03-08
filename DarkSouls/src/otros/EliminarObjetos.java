package otros;

import clases.Objetos;

public class EliminarObjetos {
	public static void eliminarDatosObjetosNombre(Objetos[] objetos,String nombreObjeto) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getNombre().equalsIgnoreCase(nombreObjeto)) {
					objetos[i] = null;
				}
				
			}
		}

	}

	public static void eliminarDatosObjetosTipo(Objetos[] objetos,String nombreTipo) {
		for (int i = 0; i < objetos.length; i++) {
			if(objetos[i] != null) {
				if(objetos[i].getTipo().equalsIgnoreCase(nombreTipo)) {
					objetos[i] = null;
				}
				
			}
		}
	}

}
