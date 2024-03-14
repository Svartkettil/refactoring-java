package src.main.java;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer("C. U. Stomer", new ArrayList<>());
    customer.pickMovie(null, 3);
    customer.pickMovie(null, 2);
    String expected = "Rental Record for C. U. Stomer\n\tLord of the ring\t3.5\n\tMatrix\t2.0\nAmount owed is 5.5\nYou earned 2 frequent points\n";
    String result0 = new RentalInfo().statement(customer);

    if (!result0.equals(expected)) {
      throw new AssertionError("Expected: " + System.lineSeparator() + String.format(expected) + System.lineSeparator() + System.lineSeparator() + "Got: " + System.lineSeparator() + result0);
    }
    System.out.println("Expected: " + System.lineSeparator() + String.format(expected) + System.lineSeparator() + System.lineSeparator() + "Got: " + System.lineSeparator() + result0);
    System.out.println("Success");
  }
}
