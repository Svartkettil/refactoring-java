
public class RentalInfo {

  public String statement(Customer customer) {
    double totalAmount = 0;
    int frequentEnterPoints = 0;
    String result = "Rental Record for " + customer.getName() + "\n";
      for (MovieRental rental : customer.getRentals()) {
          // determine amount for each movie
          double thisAmount = getAmount(rental);
          //add frequent bonus points
          frequentEnterPoints++;
          // add bonus for a two day new release rental
          if (rental.getMovie().getCode().equals("new") && rental.getDays() > 2) frequentEnterPoints++;

          //print figures for this rental
          result += "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
          totalAmount = totalAmount + thisAmount;
      }
    // add footer lines
    result += "Amount owed is " + totalAmount + "\n";
    result += "You earned " + frequentEnterPoints + " frequent points\n";

    return result;
  }
  public double getAmount(MovieRental rental){
      double thisAmount = 0;
      if (rental.getMovie().getCode().equals("regular")) {
          thisAmount = 2;
          if (rental.getDays() > 2) {
              thisAmount = ((rental.getDays() - 2) * 1.5) + 2;
          }
          return thisAmount;
      }
      if (rental.getMovie().getCode().equals("new")) {
          return rental.getDays() * 3;
      }
      if (rental.getMovie().getCode().equals("childrens")) {
          thisAmount = 1.5;
          if (rental.getDays() > 3) {
              thisAmount = ((rental.getDays() - 3) * 1.5) + 1.5;
          }
          return thisAmount;
      }
      return thisAmount;
  }
}
