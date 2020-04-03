package Model;

import java.util.Comparator;

public class NombrePerro implements Comparator<Perro>{

	public int compare(Perro o1, Perro o2) {
		return o1.getNom().compareTo(o2.getNom());
	}

}
