package Model;

import java.util.Comparator;

public class FechaPerro implements Comparator<Perro>{

	public int compare(Perro o1, Perro o2) {
		return o1.getFecha().compareTo(o2.getFecha());
	}
	
	

}
