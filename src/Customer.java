import java.util.List;

public class Customer {
    private final String name;
    private int frequenEnterPoints;

    public int getFrequenEnterPoints() {
        return frequenEnterPoints;
    }

    public void setFrequenEnterPoints(int frequenEnterPoints) {
        this.frequenEnterPoints += frequenEnterPoints;
    }

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
