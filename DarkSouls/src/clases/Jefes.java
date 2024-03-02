package clases;

public class Jefes {
	private  String nombre;
	private  String tipo;
	private   String informacionBreve;
	private int vida;
	private int ataque;
	
	public Jefes() {
	}
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
	public String getInformacionBreve() {
		return informacionBreve;
	}
	public void setInformacionBreve(String informacionBreve) {
		this.informacionBreve = informacionBreve;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public Jefes(String nombre, String tipo, String informacionBreve, int vida, int ataque) {

		this.nombre = nombre;
		this.tipo = tipo;
		this.informacionBreve = informacionBreve;
		this.vida = vida;
		this.ataque = ataque;
	}
	@Override
	public String toString() {
		return "Jefes [nombre=" + nombre + ", tipo=" + tipo + ", informacionBreve=" + informacionBreve + ", vida="
				+ vida + ", ataque=" + ataque + "]";
	}
	
	
	

}
