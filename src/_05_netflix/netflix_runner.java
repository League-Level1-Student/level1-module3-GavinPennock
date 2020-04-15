package _05_netflix;

public class netflix_runner {
public static void main(String[] args) {
	Movie movie=new Movie("titanic",4);
	Movie movie1=new Movie("bob the builder",2);
	Movie movie2=new Movie("apollo 13",5);
	Movie movie3=new Movie("jumanji",3);
	Movie movie4=new Movie("wolverine",4);
	System.out.println(movie2.getTicketPrice());
	NetflixQueue netflix=new NetflixQueue();
	netflix.addMovie(movie);
	netflix.addMovie(movie1);
	netflix.addMovie(movie2);
	netflix.addMovie(movie3);
	netflix.addMovie(movie);
	netflix.printMovies();
	System.out.println("the best movie is "+netflix.getBestMovie());
	System.out.println("the second best movie is"+netflix.getSecondBestMovie());
}
}
