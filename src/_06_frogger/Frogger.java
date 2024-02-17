package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 600;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
       
    }
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP&& y>30)
            {
                //Frog Y position goes up
            	y += -15;
            }
            else if(keyCode == DOWN&& y<570)
            {
                //Frog Y position goes down 
            	y+= 15;
            }
            else if(keyCode == RIGHT&&x<750)
            {
                //Frog X position goes right
            	x += 15;
            }
            else if(keyCode == LEFT&&x>50)
            {
                //Frog X position goes left
            	x+= -15;
            }
        }
    }
    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	 background(0,0,0);
    
    	 fill(0,255,0);
    	ellipse(x,y,30,30);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
