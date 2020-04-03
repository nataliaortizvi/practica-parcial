package Model;

import processing.core.PApplet;

public class Perro implements Comparable<Perro>{
	private int px, py, id;
	private String nom, edad, raza;
	private PApplet app;
	
	public Perro(String edad, String raza, String nom, int id, int py, PApplet app) {
		this.app = app;
		this.py = py;
		
		this.edad = edad;
		this.nom = nom;
		this.raza = raza;
		this.id = id;
		
	}
	
	public void pintarTexto(int px, PApplet app) {
		app.fill(0);
		
		app.text(edad, px, py);
		app.text(raza, px, py+50);
		app.text(nom, px, py+100);
		app.text(id, px, py+150);
	}
	
	public int compareTo(Perro o) {
		return this.id - o.getId();
	}
	

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
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

	
	
	
	

}
