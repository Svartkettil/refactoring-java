import java.util.List;
import java.util.Map;

public class Customer {
    private final String name;
    List<MovieRental> rentals;


    public Customer(String name,  List<MovieRental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }
    public String getName() {
        return name;
    }
    public List<MovieRental> getRentals() {
        return rentals;
    }
}
