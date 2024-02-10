package _04_netflix;

public class Main {
public static void main(String[] args) {

Movie shrek = new Movie("Shrek",1);
Movie aliens  = new Movie("Aliens",5);
Movie minions = new Movie("Minions",2);
Movie homeAlone3 = new Movie("Home Alone 3",3);
Movie shrek2 = new Movie("Shrek2",0);
NetflixQueue queue = new NetflixQueue();
//String shrekPrice = shrek.getTicketPrice();
//System.out.println(shrekPrice);
queue.addMovie(shrek2);
queue.addMovie(aliens);
queue.addMovie(minions);
queue.addMovie(homeAlone3);
queue.addMovie(shrek2);

queue.printMovies();

queue.sortMoviesByRating();
queue.getBestMovie();












}
}