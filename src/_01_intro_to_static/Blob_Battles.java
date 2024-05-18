package _01_intro_to_static;
import _01_methods._5_Blob_Battles.Blob_Battles;
import processing.core.PApplet;
public class Blob_Battles extends PApplet{
	static final int WIDTH = 1920;
	static final int HEIGHT = 950;
	int x = 500;
	int y = 500;
	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;
	boolean invinc = false;


	public void settings() {
		size(WIDTH, HEIGHT);
	}

	public void draw() {
		fill(255,0,0);
		ellipse(x,y,50,50);
	}

	public void keyPressed() {

		if (keyCode == UP && y > 15) {
			// Frog Y position goes up
			// y += -20;
			movingUp = true;
		} else if (keyCode == DOWN && y < 575) {
			// Frog Y position goes down
			// y+= 20;
			movingDown = true;
		} else if (keyCode == RIGHT && x < 775) {
			// Frog X position goes right
			// x += 20;
			movingRight = true;
		} else if (keyCode == LEFT && x > 15) {
			// Frog X position goes left
			// x+= -20;
			movingLeft = true;
		} else if (keyCode == 87) {
			y -= 60;
		} else if (keyCode == 65) {
			x -= 60;
		} else if (keyCode == 83) {
			y += 60;
		} else if (keyCode == 68) {
			x += 60;
		}












































































	static public void main(String[] args) {
		PApplet.main(Blob_Battles.class.getName());
	}


}
