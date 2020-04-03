package Model;

import java.util.Comparator;

public class EdadPerro implements Comparator<Perro>{

	public int compare(Perro o1, Perro o2) {
		return o1.getEdad().compareTo(o2.getEdad());
	}

}
