package View;

import Controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControllerMain controller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("View.Main");

	}
	
	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		controller = new ControllerMain(this);
	}
	
	public void draw() {
		background(160,223,230);
		
		fill(0);
		for(int i=0; i < controller.perrito().size(); i++) {
			controller.perrito().get(i).pintarTexto(20, this);
		}
		
	}

}
