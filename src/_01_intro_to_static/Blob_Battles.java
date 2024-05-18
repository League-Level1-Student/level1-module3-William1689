package _01_intro_to_static;
import _01_methods._5_Blob_Battles.Blob_Battles;
import processing.core.PApplet;
public class Blob_Battles extends PApplet{
	static final int WIDTH = 1920;
	static final int HEIGHT = 950;
	int x = 500;
	int y = 500;


	public void settings() {
		size(WIDTH, HEIGHT);
	}

	public void draw() {
		fill(255,0,0);
		ellipse(x,y,50,50);
	}














































































	static public void main(String[] args) {
		PApplet.main(Blob_Battles.class.getName());
	}


}
