import java.util.List;
import java.util.Map;

public class Customer {
    private final String name;
    //private List<MovieRental> rentals;
    private Map<String, Movie> movies;

    public Customer(String name, Map<String, Movie> rentals) {
        this.name = name;
        this.movies = rentals;
    }

    public String getName() {
        return name;
    }

    /*public List<MovieRental> getRentals() {
        return rentals;
    }*/

    public Map<String, Movie> getMovies() {
        return movies;
    }
}
