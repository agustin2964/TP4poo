package tp4;

public class Provincia {
	private String nombreProvincia;
	
	public Provincia (String nombre) {
		this.nombreProvincia=nombre;
	}
	public String getNombre() {
		return this.nombreProvincia;
	}
	public void setNombre(String nuevoNombre) {
		this.nombreProvincia=nuevoNombre;
	}
	public String toString() {
		return nombreProvincia;
	}
}