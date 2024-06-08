package _01_intro_to_static;
//import _01_methods._5_Blob_Battles.Blob_Battles;
import processing.core.PApplet;
public class Tag extends PApplet{
	static final int WIDTH = 1920;
	static final int HEIGHT = 950;
	int x = 500;
	int y = 500;
	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;
	boolean canJump = true;
		int platformX = 200;
		int platformWidth =  WIDTH-platformX*2;
		
		int platformHeight = 100;
	int platformY = HEIGHT-platformHeight*3;
	
	int yVelocity = 0;
	int gravity = 1;

	public void settings() {
		size(WIDTH, HEIGHT);
		
	}

	public void draw() {
		background(10, 224, 240);
		updateBlob();
		fill(158, 66, 255);
		ellipse(x,y,50,50);
		fill(34, 199, 39);
		rect(platformX,platformY,platformWidth,platformHeight);
		
	}
	
	void updateBlob() {
		yVelocity += gravity;
		y+=yVelocity;
		if(yVelocity > 0 && x+25>platformX && x -25 < platformX + platformWidth && y+25 >= platformY) {
			y = platformY-25;
			yVelocity = 0;
			canJump = true;
		
			
		}
		
		
		
		
		if(movingUp&&canJump) {
			yVelocity=-22;
			canJump = false;
		}
//		if(movingDown) {
//			y+=10;
//		}
		if(movingLeft) {
			x-=10;
		}
		if(movingRight) {
			x+=10;
		}
	}
	
	
	public void keyPressed() {

		if (keyCode == UP && y > 15) {
			// Frog Y position goes up
			// y += -20;
			movingUp = true;
		} else if (keyCode == DOWN && y < 925) {
			// Frog Y position goes down
			// y+= 20;
			movingDown = true;
		} else if (keyCode == RIGHT && x < 1895) {
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
	
	}

	public void keyReleased() {

		if (keyCode == UP) {

			// Frog Y position goes up
			// y += -20;
			movingUp = false;
		} else if (keyCode == DOWN) {
			// Frog Y position goes down
			// y+= 20;
			movingDown = false;
		} else if (keyCode == RIGHT) {
			// Frog X position goes right
			// x += 20;
			movingRight = false;
		} else if (keyCode == LEFT)

		{
			// Frog X position goes left
			// x+= -20;
			movingLeft = false;
		}

	}




	static public void main(String[] args) {
		PApplet.main(Tag.class.getName());
	}


}

