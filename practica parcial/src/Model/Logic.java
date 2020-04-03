package Model;

import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {
	
	 PApplet app;
	 LinkedList<Perro> perros;
	 EdadPerro edad;
	 NombrePerro nom;
	 RazaPerro raza;
	 String[] txtUno, txtDos,txtUnoSplit, txtDosSplit;
	 String razas,nombres, edades;
	 int id;
	
	
	public Logic (PApplet app) {
		this.app = app;
		this.perros = new LinkedList<Perro>();
		this.edad = new EdadPerro();
		this.nom = new NombrePerro();
		this.raza = new RazaPerro();
		
		
		//agregar txt
		txtUno = app.loadStrings("lib/imports/datosUno.txt");
		txtDos = app.loadStrings("lib/imports/datosDos.txt");
		
		//for
		for(int i=0; i < txtDos.length; i++) {
			txtDosSplit = txtDos[i].split(",");
					
			for(int j=0; j < txtUno.length; j++) {
				txtUnoSplit = txtUno[j].split(",");
				if(txtDosSplit[0].equals(txtDosSplit[0])) {
					id = Integer.parseInt(txtUnoSplit[0]);
					edades = txtUnoSplit[2];
					nombres = txtUnoSplit[1];
					razas = txtDosSplit[1];		
					perros.add(new Perro(edades, razas, nombres, id, 30,app));
				}
			}
		}
		
	}
	
		
	public void addListPerros(String edades, String razas, String nombres, int id, int py, PApplet app) {
		perros.add(new Perro(edades, razas, nombres,id, py,app));
	}
	
	
	public LinkedList<Perro> getPerros() {
		return perros;
	}
	public void setPerros(LinkedList<Perro> perros) {
		this.perros = perros;
	}
	
	
	
	
	
	
	
}
