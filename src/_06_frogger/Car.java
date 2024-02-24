package _06_frogger;

public class Car {
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

void display()
{
  fill(0,255,0);
  rect(x , y,  size, 50);
}







}
