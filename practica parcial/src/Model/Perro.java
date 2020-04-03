package Model;

import processing.core.PApplet;

public class Perro implements Comparable<Perro>{
	private int px, py, id;
	private String nom, edad, raza, fecha;
	private PApplet app;
	
	public Perro(String edad, String raza, String nom, String fecha, int id,PApplet app) {
		this.app = app;
		this.px = 40;
		
		this.edad = edad;
		this.fecha = fecha;
		this.nom = nom;
		this.raza = raza;
		this.id = id;
		
	}
	
	public void pintarTexto(int py, PApplet app) {
		app.fill(250);
		app.noStroke();
		app.rect(25,35,450,30);
		
		app.fill(60,123,130);
		app.text("ID",40,55);
		app.text("Nombre",90,55);
		app.text("Edad",180,55);
		app.text("Raza",260,55);
		app.text("Fecha",410,55);
		
		app.fill(250);
		app.textSize(15);
		app.text(this.id, px, py);
		app.text(this.nom, px + 50, py);
		app.text(this.edad, px + 150, py);
		app.text(this.raza, px + 210, py);
		app.text(this.fecha,px + 350, py);
		
		app.text("Organizar ID: oprimir tecla i", 160,440);
		app.text("Organizar Nombre: oprimir tecla n", 160,460);
		app.text("Organizar Edad: oprimir tecla e", 160,480);
		app.text("Organizar Raza: oprimir tecla r", 160,500);
		app.text("Organizar Fecha: oprimir tecla f", 160,520);
	}
	
	public int compareTo(Perro o) {
		return this.id - o.getId();
	}
	
	
	
	
	
	//getters y setters
	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	
	

}
