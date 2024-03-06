package clases;

public class Zonas {
	private String nombre;
	private String tipo;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Zonas(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;

	}
	@Override
	public String toString() {
		return "Estamos en " + nombre + " de tipo " + tipo + " con un pasado tan intrigante como:  "+ ;
	}
	
	
	

}
