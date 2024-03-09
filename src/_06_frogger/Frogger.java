package _06_frogger;

import java.util.Random;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int dashes = 3;
	int x = 400;
	int y = 600;
	int level = 1;
	int deaths = 0;
	
	Car car1;
	Car car2;
	Car car3;
	Car car4;
	Car car5;
	Car car6;
	Car car7;
	PoliceCar police1;
	boolean movingUp = false;
	boolean movingDown = false;
	boolean movingRight = false;
	boolean movingLeft = false;


	Random ran = new Random();



	@Override
	public void settings() {
		size(WIDTH, HEIGHT);

	}



	public void keyPressed() {
	
			if(keyCode == UP&& y>15)
			{
				//Frog Y position goes up
				//y += -20;
				movingUp = true;
			}
			else if(keyCode == DOWN&& y<575)
			{
				//Frog Y position goes down 
				//y+= 20;
				movingDown = true;
			}
			else if(keyCode == RIGHT&&x<775)
			{
				//Frog X position goes right
				//x += 20;
				movingRight = true;
			}
			else if(keyCode == LEFT&&x>15)
			{
				//Frog X position goes left
				//x+= -20;
				movingLeft = true;
			} 
			


	}
	public void keyReleased() {

			if(keyCode == UP)
			{
				
				//Frog Y position goes up
				//y += -20;
				movingUp = false;
			}
			else if(keyCode == DOWN)
			{
				//Frog Y position goes down 
				//y+= 20;
				movingDown = false;
			}
			else if(keyCode == RIGHT)
			{
				//Frog X position goes right
				//x += 20;
				movingRight = false;
			}
			else if(keyCode == LEFT)
			{
				//Frog X position goes left
				//x+= -20;
				movingLeft = false;
			}
		

	}
	@Override
	public void setup() {
		car1 = new Car(400,300, 80,6);
		car2 = new Car(400, 190, 80, 7);
		car3 = new Car(400, 90,80, 9);
		car4 = new Car(400, 410, 80, 6);
		car5 = new Car(400,30, 80, 11);
		car6 = new Car(400,300,80,15);
		car7 = new Car(400,400, 80, 8);
		




	}

	@Override
	public void draw() {
		background(0,0,0);
		if(y <= 30 ) {
			level++;
			x= 400;
			y= 600;
			dashes++;
		}
		fill(255,255,255);
		text("Deaths: "+ deaths,0,30);
		text("Level: "+level,0, 20);
		 
		fill(0,255,0);
		ellipse(x,y,30,30);
		car1.display();
		car1.moveLeft();
		car2.display();
		car2.moveRight();
		car3.display();
		car3.moveLeft();
		car4.display();
		car4.moveRight();
		car5.display();
		car5.moveLeft();
		car6.display();
		car6.moveRight();
		car7.display();
		car7.moveLeft();


		if(movingUp) {
			y-=5;
		}
		if(movingDown) {
			y+=5;
		}
		if(movingRight) {
			x+=5;
		}
		if(movingLeft) {
			x-=5;
		}




		if(intersects(car1)||intersects(car2)||intersects(car3)||intersects(car4)||intersects(car5)||intersects(car6)){
			x=400;
			y=600;
			deaths++;

		}

	}


	boolean intersects(Car car) {
		if ((y > car.getY() && y < car.getY()+80) &&
				(x > car.getX() && x < car.getX()+car.getSize())) {
			return true;
		}
		else  {
			return false;}
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
	class PoliceCar extends Car{
		int x;
		int y;
		int size;
		int speed;
		public PoliceCar(int x,int y, int size, int speed) {
			super(x,y,size,speed);

		}
		void display() {
			fill(0,0,255);
			rect(x,y,size,50);
		}
	}
	

		public DrunkDriver(int x,int y, int size, int speed, int drunkenness) {
			
			
		}
	}

	class Car {
		int x ;
		int y;
		int size;
		int speed;


		public Car(int x, int y, int size, int speed) {
			this.x = x;
			this.y = y;
			this.size = size;
			this.speed = speed;
		}

		int getX() {
			return x;
		}
		int getY() {
			return y;
		}
		int getSize() {
			return size;
		}

		void display()
		{
			fill(255,0,0);
			rect(x , y,  size, 50);
		}
		void moveLeft()
		{
			{
				if(x>-size) {
					x -= speed;

				}
				else {
					x=800;
					y = ran.nextInt(450)+60; 
				}
			}
		}



		void moveRight() {
			if(x<800) {
				x+= speed;   				
			}
			else {
				x=-size;
				y = ran.nextInt(450)+60; 
			}
		}


	}

}



