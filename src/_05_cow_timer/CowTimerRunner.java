package _05_cow_timer;

import javax.swing.JOptionPane;

public class CowTimerRunner {
    public static void main(String[] args) throws InterruptedException {
        /* Make a CowTimer, set its time and start it.
         * Use a short delay (seconds) when testing, then try with longer delays
         */
      CowTimer timer = new CowTimer(1);  
  timer.setTime(10);
  timer.start();
   
    
    
    }
    
}
