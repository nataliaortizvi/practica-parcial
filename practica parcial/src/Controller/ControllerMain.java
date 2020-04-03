package Controller;

import java.util.LinkedList;

import Model.Logic;
import Model.Perro;
import processing.core.PApplet;

public class ControllerMain {
	Logic logica;
	
	public ControllerMain(PApplet app) {
		this.logica = new Logic(app);
	}
	
	public LinkedList<Perro> perrito(){
		return logica.getPerros();
		}
	
	public void sortListControl(char i) {
		logica.sortList(i);
	}
		
	}
	

	
