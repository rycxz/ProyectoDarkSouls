package otros;


public class GeneracionNumeroAleatorio {
	/**
	 * 
	 * @return numero aleatorio para la probalibilidad de acierto de un boss 
	 */
	public static double generacionNumeroAciertoBoss() {
		double aleatorio=Math.random()*101;
	     return aleatorio;
	}
	/**
	 * @return
	 * 
	 * generador de numeros aleatorios donde sacamos una posicion aleatoria de un boss 
	 */
	public static double generacionNumeroPosicionBoss() {
		double aleatorio=Math.random()*24;
	     return aleatorio;
	}

	

	

}
