import java.util.List;

public class Customer {
    private final String name;
    //private List<MovieRental> rentals;
    private List<Movie> movies;

    public Customer(String name, List<Movie> rentals) {
        this.name = name;
        this.movies = rentals;
    }

    public String getName() {
        return name;
    }

    /*public List<MovieRental> getRentals() {
        return rentals;
    }*/

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
