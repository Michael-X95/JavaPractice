package JavaHomework;

public class MoviesCon {
    public static void main(String[] args) {
    Movies movies = new Movies();
    movies.bestMovies(2020);
    movies.bestMovies("The Ring");
    movies.bestMovies("Rahat", "27");
    Movies.totalMovies();


        boolean best = MoviesReturn.isTheRingTheBestMovie();
        System.out.println("Is the movie The Ring best movie of the year?");
        System.out.println(best);
    }

}
