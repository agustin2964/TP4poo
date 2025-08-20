package tp4;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	private String nombrePais;
	private Provincia capital;
	private double superficie;
	private ArrayList<Provincia> provincias;
	private ArrayList<Pais> limitrofes;
	
	public Pais (String nombre, double superficie) {
		this.nombrePais=nombre;
		this.superficie=superficie;
		this.provincias=new ArrayList<>();
		this.limitrofes=new ArrayList<>();
	}
	public void agregarLim(Pais lim) {
		this.limitrofes.add(lim);
		lim.limitrofes.add(this);
	}
	public void elimLim(String lim) {
		limitrofes.removeIf(p->p.getNombre().equals(lim));
	}
	public String getLim() {
		String l="";
		for (Pais p:limitrofes) {
			l=l+p.getNombre()+" ";
		}
		return l;
	}
	public String toString() {
		return nombrePais+"{superficie: "+superficie+"} ";
	}
	public void crearProvincia(String nombreProvincia) {
		this.provincias.add(new Provincia(nombreProvincia));	
	}
	
	public String getNombre() {
		return this.nombrePais;
	}
	
	public void setNombre(String nombre) {
		this.nombrePais=nombre;
	}
	
	public String getCapital() {
		return capital.getNombre();
	}
	public void setCapital(Provincia cap) {
		this.capital=cap;
	}
	public void setSup(double sup) {
		this.superficie=sup;
	}
	public double getSup() {
		return this.superficie;
	}
	
	public String getProvincias() {
		String prov="";
		for (Provincia p: provincias) {
			if (prov==""){
					prov=p.toString();
					}
					else {
						prov=prov+" "+p.toString();
					}
		}
		return prov;
	}
	public Provincia getProvincia(String prov) {
		for (Provincia p:provincias) {
			if (p.getNombre()==prov) {
				return p;
			}
		}
		return null;
	}
}