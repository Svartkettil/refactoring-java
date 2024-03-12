import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RentalInfo {

  public String statement(Customer customer) {
    /*HashMap<String, Movie> movies = new HashMap();
    movies.put("F001", new Movie("You've Got Mail", "regular"));
    movies.put("F002", new Movie("Matrix", "regular"));
    movies.put("F003", new Movie("Cars", "childrens"));
    movies.put("F004", new Movie("Fast & Furious X", "new"));*/

    double totalAmount = 0;
    int frequentEnterPoints = 0;
    String result = "Rental Record for " + customer.getName() + "\n";
      for (Movie movie : customer.getMovies().values()) {
          double thisAmount = 0;

          // determine amount for each movie
          if (movie.getCode().equals("regular")) {
              thisAmount = 2;
              if (movie.getDays() > 2) {
                  thisAmount = ((movie.getDays() - 2) * 1.5) + thisAmount;
              }
          }
          if (movie.getCode().equals("new")) {
              thisAmount = movie.getDays() * 3;
          }
          if (movie.getCode().equals("childrens")) {
              thisAmount = 1.5;
              if (movie.getDays() > 3) {
                  thisAmount = ((movie.getDays() - 3) * 1.5) + thisAmount;
              }
          }

          //add frequent bonus points
          frequentEnterPoints++;
          // add bonus for a two day new release rental
          if (movie.getCode().equals("new") && movie.getDays() > 2) frequentEnterPoints++;

          //print figures for this rental
          result += "\t" + movie.getTitle() + "\t" + thisAmount + "\n";
          totalAmount = totalAmount + thisAmount;
      }
    // add footer lines
    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentEnterPoints + " frequent points\n";

    return result;
  }
}
