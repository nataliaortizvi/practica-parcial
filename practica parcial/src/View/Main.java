package View;

import Controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControllerMain controllerM;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		controllerM = new ControllerMain(this);
	}
	
	public void draw() {
		background(160,223,230);
		
		fill(0);
		for(int i=0; i < controllerM.perrito().size(); i++) {
			controllerM.perrito().get(i).pintarTexto((i*(30))+100, this);
		}
		
	}
	
	public void keyPressed() {
		controllerM.sortListControl(key);
	}

}
