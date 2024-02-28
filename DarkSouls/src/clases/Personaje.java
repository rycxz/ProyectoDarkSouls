/**
 * el jugador dara valor a todos los atributos y el atributo vida se le dara un valor segun las clases que tenga.
 * 
 * el estado es un atributo el cual el jugador no tendra acceso y no podra modifcar
 */


package clases;

public class Personaje {
	private String nombre;
	private String sexo;
	private String clase;
	private int vida;
	
	public Personaje(String nombre, String sexo, String clase) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.clase = clase;
	}
	/**
	 * 
	 * @param clases
	 * 
	 * al metodo le entra las clases para saber la vida que va a tener nuestro personaje
	 */
	public  void clasesPersonajes(String clases) {
		String[] clasesPersonaje = {"Guerrero","Caballero","Vagabundo","Ladron","Bandio","Cazador","Hechizero","Piromantico","Clerigo","Marginado"};
		int[] vidaClases =  {300,500,250,275,400,350,150,350,200,500};
		for(int i =0;i<vidaClases.length;i++) {
			if(clasesPersonaje[i].equals(clases)) {
				vida=vidaClases[i];
			}
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	@Override
	public String toString() {
		return "Los atributos de tu personaje son nombre=" + nombre + ", sexo=" + sexo + ", clase=" + clase + ", vida=" + vida ;
	} 
	
	
	
	

}
