package tp4;

import java.util.Scanner;
import java.util.Comparator;

public class MapaMundi {
	public static void main(String[]args) {
		MapaMundial mapa= new MapaMundial();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ingrese el nombre de un continente");
		System.out.println(mapa.getPaises(scanner.next()));
		
		System.out.println("");
		
		System.out.println("ingrese el nombre de un pais");		
		System.out.println(mapa.getProvincias(scanner.next()));
		
		System.out.println("");

		mapa.paises.sort(Comparator.comparingDouble(Pais::getSup));
		System.out.println(mapa.paisesToString());
		
		System.out.println("");
		
		System.out.println("ingrese el nombre del primer pais");		
		Pais pais1=mapa.getPais(scanner.next());
		System.out.println("ingrese el nombre del segundo pais");
		Pais pais2=mapa.getPais(scanner.next());
		if (pais1.getSup()>pais2.getSup()) {
			System.out.println(pais1.getNombre()+" es mas grande que "+ pais2.getNombre());
		}
		else {
			System.out.println(pais2.getNombre()+" es mas grande que "+ pais1.getNombre());
		}
		
		System.out.println("");

		System.out.println("ingrese el nombre de un pais para conseguir sus limitrofes");
		System.out.println(mapa.getPais(scanner.next()).getLim());
		
		scanner.close();
	};
}
