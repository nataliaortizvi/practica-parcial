package Model;

import processing.core.PApplet;

public class Perro implements Comparable<Perro>{
	private int px, py, id;
	private String nom, edad, raza, fecha;
	private PApplet app;
	
	public Perro(String edad, String raza, String nom, String fecha, int id,PApplet app) {
		this.app = app;
		this.px = 50;
		
		this.edad = edad;
		this.fecha = fecha;
		this.nom = nom;
		this.raza = raza;
		this.id = id;
		
	}
	
	public void pintarTexto(int py, PApplet app) {
		app.fill(0);
		app.textSize(15);
		
		app.text("ID",40,55);
		app.text(this.id, px, py);
		app.text("NOMBRE",90,55);
		app.text(this.nom, px + 50, py);
		app.text("EDAD",180,55);
		app.text(this.edad, px + 150, py);
		app.text("RAZA",260,55);
		app.text(this.raza, px + 210, py);
		app.text("FECHA",410,55);
		app.text(this.fecha,px + 350, py);
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
