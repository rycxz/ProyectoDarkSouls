package clases;

public class Objetos {
		private String nombre;
		private String tipo;
		private String lore;
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
		public String getLore() {
			return lore;
		}
		public void setLore(String lore) {
			this.lore = lore;
		}
		public Objetos(String nombre, String tipo, String lore) {
			super();
			this.nombre = nombre;
			this.tipo = tipo;
			this.lore = lore;
		}
		@Override
		public String toString() {
			return " (Objeto al que buscas )\n Nombre " + nombre + " \n "
					+" Tipo: " + " \n" + tipo +" \n "+ " Informacion breve :"+ " \n" + lore +" \n " ;
		}
		

}
