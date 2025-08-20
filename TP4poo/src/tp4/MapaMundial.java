package tp4;

import java.util.ArrayList;

public class MapaMundial {
	
	ArrayList<Continente> continentes;
	ArrayList<Pais> paises;
	
	public MapaMundial() {
		this.continentes=new ArrayList<>();
		this.paises=new ArrayList<>();
		Continente america=new Continente("America");
		continentes.add(america);
		america.crearPais("Argentina",2780000);
		america.getPais("Argentina").crearProvincia("Entre Rios");
		america.getPais("Argentina").crearProvincia("Buenos Aires");
		america.getPais("Argentina").crearProvincia("Santa Fe");
		america.getPais("Argentina").crearProvincia("Corrientes");
		america.getPais("Argentina").crearProvincia("Cordoba");
		america.getPais("Argentina").crearProvincia("Salta");
		america.crearPais("Uruguay",176215);
		america.getPais("Uruguay").crearProvincia("Paysandu");
		america.getPais("Uruguay").crearProvincia("Canelones");
		america.getPais("Uruguay").crearProvincia("Rocha");
		america.getPais("Uruguay").crearProvincia("Maldonado");
		america.crearPais("Brasil",8510000);
		america.crearPais("Chile",756626);
		america.crearPais("Paraguay", 406752);
		america.crearPais("Bolivia",1099000);
		america.getPais("Argentina").agregarLim(america.getPais("Uruguay"));
		america.getPais("Argentina").agregarLim(america.getPais("Bolivia"));
		america.getPais("Argentina").agregarLim(america.getPais("Brasil"));
		america.getPais("Argentina").agregarLim(america.getPais("Chile"));
		america.getPais("Argentina").agregarLim(america.getPais("Paraguay"));
		america.getPais("Chile").agregarLim(america.getPais("Bolivia"));
		america.getPais("Brasil").agregarLim(america.getPais("Bolivia"));
		america.getPais("Brasil").agregarLim(america.getPais("Paraguay"));
		america.getPais("Paraguay").agregarLim(america.getPais("Bolivia"));
		america.getPais("Paraguay").agregarLim(america.getPais("Brasil"));
		america.getPais("Uruguay").agregarLim(america.getPais("Brasil"));
		Continente europa=new Continente("Europa");
		continentes.add(europa);
		europa.crearPais("España",506030);
		europa.crearPais("Francia",551695);
		europa.crearPais("Italia",302073);
		europa.crearPais("Portugal",92152);		
		europa.getPais("Portugal").agregarLim(europa.getPais("España"));
		europa.getPais("Francia").agregarLim(europa.getPais("España"));
		europa.getPais("Francia").agregarLim(europa.getPais("Italia"));
		Continente asia=new Continente("Asia");
		continentes.add(asia);
		Continente africa=new Continente("Africa");
		continentes.add(africa);
		Continente oceania=new Continente("Oceania");
		continentes.add(oceania);
		Continente antartida=new Continente("Antartida");
		continentes.add(antartida);
		for (Continente c:continentes) {
			
			this.paises.addAll(c.getPaisesArray());
		}
	}
	public Pais getPais(String nombrePais) {
		for (Pais p:paises) {
			if (p.getNombre().equals(nombrePais)) {
				return p;
			}
		}
		return null;
	}
	public String getPaises(String nombreContinente) {
		for (Continente c:continentes) {		
			if(c.getNombre().equals(nombreContinente)) {
				System.out.println("Paises: ");
				return c.getPaises();
			}
		}
		return null;
	}
	public String getProvincias(String nombrePais) {
		for (Pais p:paises) {
			if (p.getNombre().equals(nombrePais)) {
				System.out.println("Provincias: ");
				return p.getProvincias();
			}
		}
		return null;
	}
	public String paisesToString() {
		String s = "";	
		for(Pais p:paises) {
			s=s+p.toString();
		}
		return s;
	}
}
