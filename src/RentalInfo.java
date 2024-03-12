
public class RentalInfo {

  public String statement(Customer customer) {
    double totalAmount = 0;
    int frequentEnterPoints = 0;
    StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");
      for (MovieRental rental : customer.getRentals()) {
          // determine amount for each movie
          double thisAmount = getAmount(rental);
          //add frequent bonus points
          frequentEnterPoints++;
          // add bonus for a two day new release rental
          if (rental.getMovie().getCode().equals("new") && rental.getDays() > 2) frequentEnterPoints++;

          //print figures for this rental
          result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(thisAmount).append("\n");
          totalAmount = totalAmount + thisAmount;
      }
    // add footer lines
    result.append("Amount owed is ").append(totalAmount).append("\n");
    result.append("You earned ").append(frequentEnterPoints).append(" frequent points\n");

    return result.toString();
  }
  public double getAmount(MovieRental rental){
      double thisAmount = 0;
      int daysRented = rental.getDays();
      String code = rental.getMovie().getCode();

      switch (code) {
          case "regular":
              thisAmount = 2;
              if (daysRented > 2) {
                  thisAmount += (daysRented - 2) * 1.5;
              }
              break;
          case "new":
              thisAmount = daysRented * 3;
              break;
          case "childrens":
              thisAmount = 1.5;
              if (daysRented > 3) {
                  thisAmount += (daysRented - 3) * 1.5;
              }
              break;
      }
      return thisAmount;
  }
}
