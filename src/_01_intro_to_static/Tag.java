package _01_intro_to_static;
import javax.swing.JOptionPane;

//import _01_methods._5_Blob_Battles.Blob_Battles;
import processing.core.PApplet;
public class Tag extends PApplet{
	static final int WIDTH = 1920;
	static final int HEIGHT = 950;
	Platform platform1;
	//	int x = 500;
	//	int y = 500;
	Blob blob1;
	Blob blob2;
	//	boolean movingUp = false;
	//	boolean movingDown = false;
	//	boolean movingRight = false;
	//	boolean movingLeft = false;
	//	boolean canJump = true;

	int platformX = 200;
	int platformWidth =  WIDTH-platformX*2;

	int platformHeight = 100;
	int platformY = HEIGHT-platformHeight*3;

	//	int yVelocity = 0;
	//	int gravity = 1;
	//



	public void settings() {
		size(WIDTH, HEIGHT);
		blob1 = new Blob(500,500, false, false, false, false, true, 0,1);
		blob2 = new Blob(600,500, false, false , false, false , true , 0,1);
	}

	public void draw() {
		
		background(10, 224, 240);
		blob1.display();
		blob2.display2();
		blob1.updateBlob();
		blob2.updateBlob();
		fill(27, 199, 8);
		rect(platformX,platformY,platformWidth,platformHeight);

	}






		public void keyPressed() {
	
			if (keyCode == UP && blob1.y > 15) {
				// Frog Y position goes up
				// y += -20;
				blob1.movingUp = true;
			} else if (keyCode == DOWN && blob1.y < 925) {
				// Frog Y position goes down
				// y+= 20;
				blob1.movingDown = true;
			} else if (keyCode == RIGHT && blob1.x < 1895) {
				// Frog X position goes right
				// x += 20;
				blob1.movingRight = true;
			} else if (keyCode == LEFT && blob1.x > 15) {
				// Frog X position goes left
				// x+= -20;
				blob1.movingLeft = true;
			}
			
			
			
			if (keyCode == 87 && blob2.y > 15) {
				// Frog Y position goes up
				// y += -20;
				blob2.movingUp = true;
			} else if (keyCode == 83 && blob2.y < 925) {
				// Frog Y position goes down
				// y+= 20;
				blob2.movingDown = true;
			} else if (keyCode == 68 && blob2.x < 1895) {
				// Frog X position goes right
				// x += 20;
				blob2.movingRight = true;
			} else if (keyCode == 65 && blob2.x > 15) {
				// Frog X position goes left
				// x+= -20;
				blob2.movingLeft = true;
			}
		
		
		}
		
		public void keyReleased() {
	
			if (keyCode == UP) {
	
				// Frog Y position goes up
				// y += -20;
				blob1.movingUp = false;
			} else if (keyCode == DOWN) {
				// Frog Y position goes down
				// y+= 20;
				blob1.movingDown = false;
			} else if (keyCode == RIGHT) {
				// Frog X position goes right
				// x += 20;
				blob1.movingRight = false;
			} else if (keyCode == LEFT)
	
			{
				// Frog X position goes left
				// x+= -20;
				blob1.movingLeft = false;
			}
	
		
		
			if (keyCode == 87) {
				
				// Frog Y position goes up
				// y += -20;
				blob2.movingUp = false;
			} else if (keyCode == 83) {
				// Frog Y position goes down
				// y+= 20;
				blob2.movingDown = false;
			} else if (keyCode == 68) {
				// Frog X position goes right
				// x += 20;
				blob2.movingRight = false;
			} else if (keyCode == 65)
	
			{
				// Frog X position goes left
				// x+= -20;
				blob2.movingLeft = false;
			}
		
		
		}
	
	


	static public void main(String[] args) {
		PApplet.main(Tag.class.getName());


	}




	class Platform{
		int platformX;
		int platformWidth;
		int platformHeight;
		int platformY;

		public Platform(int platformX, int platformWidth, int platformHeight, int platformY) {
			this.platformX = platformX;
			this.platformWidth = platformWidth;
			this.platformHeight = platformHeight;
			this.platformY = platformY;
		}

	}
	class Blob{
		int x;
		int y;
		boolean movingUp;
		boolean movingDown;
		boolean movingRight;
		boolean movingLeft;
		boolean canJump ;
		int yVelocity;
		int gravity;


		public Blob(int x, int y, boolean movingUp, boolean movingDown, boolean movingRight, boolean movingLeft, boolean canJump, int yVelocity, int gravity) {
			this.x = x;
			this.y = y;
			this.movingUp = movingUp;
			this.movingDown = movingDown;
			this.movingLeft = movingLeft;
			this.movingRight = movingRight;
			this.yVelocity = yVelocity;
			this.gravity = gravity;
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


		void display() {
			fill(54, 14, 232);
			ellipse(x, y, 50, 50);

		}

		void display2() {
			fill(232, 14, 14);
			ellipse(x,y,50,50);
		}

		










	}


}










