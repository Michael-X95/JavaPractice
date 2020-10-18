package JavaHomework;

public class Movies {

    public static void main(String[] args) {
        Movies movies = new Movies();
        totalMovies();
        bestMovies("Fast and Furious");
        bestMovies("asdasd");
        bestMovies("asdasd", "21321");
        movies.bestMovies(2);

    }

    public static void totalMovies() {
        System.out.println("Total Movies: " + 2);
    }

    public static void bestMovies(String nameOfMovie) {
        System.out.println("Best Action Movie: " + nameOfMovie);

    }

    public static void bestMovies(String nameOfMovie, String year) {
        System.out.println("Best Horror Movie: " + nameOfMovie + " " + year);

    }

    public void bestMovies(int rate) {
        int bestMovie = 8;
        int totalRate = bestMovie + rate;
        System.out.println("Both Movie Rate: " + totalRate);
    }
}

