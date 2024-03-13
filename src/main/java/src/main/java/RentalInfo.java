package src.main.java;

public class RentalInfo {

  public String statement(Customer customer) {
    double totalAmount = 0;
    StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "\n");
      for (MovieRental rental : customer.getRentals()) {
          double thisAmount = getAmount(rental);
          addFrequentPoints(customer, rental);
          result.append("\t")
                  .append(rental.getMovie().getTitle())
                  .append("\t").append(thisAmount)
                  .append("\n");
          totalAmount += thisAmount;
      }
    // add footer lines
    result.append("Amount owed is ").append(totalAmount).append("\n");
    result.append("You earned ").append(customer.getFrequentEnterPoints()).append(" frequent points\n");

    return result.toString();
  }

    private void addFrequentPoints(Customer customer, MovieRental rental) {
      if(rental.getDays() == 0)
          customer.setFrequentEnterPoints(0);
      else {
          customer.setFrequentEnterPoints(1);
          if (rental.getMovie().getCode().equals("new") && rental.getDays() > 2)
              customer.setFrequentEnterPoints(1);
      }
    }

    public double getAmount(MovieRental rental){
      double thisAmount = 0;
      if (rental.getDays() == 0)
          return thisAmount;
      else {
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
}
