package tp4;

import java.util.ArrayList;

public class Continente {
	
	private String nombreContinente;
	private ArrayList<Pais> paises;

	public Continente (String nombre) {
		this.nombreContinente=nombre;
		this.paises=new ArrayList<>();
	}
	public String getPaises() {
		String pstring="";
		for (Pais p: paises) {
			if (pstring==""){
					pstring=p.getNombre();
					}
					else {
						pstring=pstring+" "+p.getNombre();
					}
		}
		return pstring;
	}
	public ArrayList<Pais> getPaisesArray(){
		return this.paises;
	}
	public String toString() {
		return nombreContinente+" {paises: "+getPaises()+"}";
	}
	public void crearPais(String nPais, double supPais) {
		this.paises.add(new Pais(nPais,supPais));
	}
	public Pais getPais(String nombrePais) {
		for (Pais p:paises) {
			if (p.getNombre().equals(nombrePais)) {
				return p;
			}
		}
		return null;
	}
	public String getNombre() {
		return this.nombreContinente;
	}
	public void setNombre(String nombre) {
		this.nombreContinente=nombre;
	}
}