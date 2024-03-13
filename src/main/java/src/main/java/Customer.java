package src.main.java;

import java.util.List;

public class Customer {
    private final String name;
    private int frequentEnterPoints;
    List<MovieRental> rentals;

    public int getFrequentEnterPoints() {
        return frequentEnterPoints;
    }

    public void setFrequentEnterPoints(int frequentEnterPoints) {
        this.frequentEnterPoints += frequentEnterPoints;
    }
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
