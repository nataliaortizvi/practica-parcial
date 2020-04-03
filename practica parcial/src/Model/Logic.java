package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	 PApplet app;
	 LinkedList<Perro> perros;
	 
	 EdadPerro edad;
	 NombrePerro nom;
	 RazaPerro raza;
	 FechaPerro fecha;
	 
	 String[] txtUno, txtDos,txtUnoSplit, txtDosSplit;
	 String razas,nombres, edades, fechas;
	 int id;
	
	
	public Logic (PApplet app) {
		this.app = app;
		this.perros = new LinkedList<Perro>();
		this.edad = new EdadPerro();
		this.nom = new NombrePerro();
		this.raza = new RazaPerro();
		this.fecha = new FechaPerro();
		
		//agregar txt
		txtUno = app.loadStrings("lib/imports/datosUno.txt");
		txtDos = app.loadStrings("lib/imports/datosDos.txt");
		
		crearPerro();
		
	}
	
	private void crearPerro() {
		//for
		for(int i=0; i < txtUno.length; i++) {
			txtUnoSplit = txtUno[i].split(",");
							
			for(int j=0; j < txtDos.length; j++) {
				txtDosSplit = txtDos[j].split(",");
				if(txtDosSplit[0].equals(txtUnoSplit[0])) {
					id = Integer.parseInt(txtUnoSplit[0]);
					edades = txtUnoSplit[2];
					nombres = txtUnoSplit[1];
					razas = txtDosSplit[1];	
					fechas = txtDosSplit[2];
					
					perros.add(new Perro(edades, razas, nombres, fechas, id,app));
				}
			}
		}	
	}
	
	public LinkedList<Perro> getPerros() {
		return perros;
	}
	public void setPerros(LinkedList<Perro> perros) {
		this.perros = perros;
	}
	
	public void sortList (char i) {
		switch (i) {
 		case 'i': 
 			//ordena el ID
 			Collections.sort(perros);
 			
 			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
 			break;
 		case 'n':
 			//ordena el nombre
 			Collections.sort(perros, nom);
 			
 			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
 			break;
 		case 'e':
 			//ordena la edad
 			Collections.sort(perros,edad);
 			
 			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
 			break;
 		case 'r':
 			//ordena la edad
 			Collections.sort(perros,raza);
 			
 			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
 			break;
 		case 'f':
 			//ordena la edad
 			Collections.sort(perros,fecha);
 			
 			try {
 				imprimir();
 			} catch (FileNotFoundException e) {
 				e.printStackTrace();
 			}
 			break;
 		}
	}
	
	public void imprimir() throws FileNotFoundException {
		PrintWriter p = new PrintWriter(new File("lib/exports/datosNuevo.txt"));
		p.print(mensaje());
		p.close();
	}

	private String mensaje() {
		String m = "";
		
		for(int i=0; i<perros.size(); i++) {
			Perro pe = perros.get(i);
			
			String mesage = pe.getId()+ " " + pe.getNom().toLowerCase()+ pe.getFecha()
			+ " " + pe.getRaza().toLowerCase() + " " + pe.getEdad();
			
			m += mesage + "\n";
		}
		
		return m;
	}

	
	
	
	
	
	
}
