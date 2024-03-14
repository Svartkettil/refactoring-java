import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.Customer;
import src.main.java.RentalInfo;

import java.util.ArrayList;

public class TestRentalService {

    private RentalInfo rentalInfo;
    private Customer customer;

    @BeforeEach
    public void init(){
        rentalInfo = new RentalInfo();
        customer = new Customer("Lasse Åberg", new ArrayList<>());
    }

    @Test
    public void rentingAMovieForZeroDaysShouldReturnAmountOwedZeroAndZeroFrequentEnterPoints(){
        customer.pickMovie("F001", 0);
        customer.pickMovie("F002", 0);
        String expected = "Rental Record for Lasse Åberg\n\tLord of the ring\t0.0\n\tMatrix\t0.0\nAmount owed is 0.0\nYou earned 0 frequent points\n";
        String result0 = rentalInfo.statement(customer);
        System.out.println(result0);
        Assertions.assertEquals(expected, result0);
    }
    @Test
    public void rentingOneMovieWithCodeNewForMoreThanTwoDaysGivesTwoFrequentEnterPoints(){
        customer.pickMovie("F004", 3);
        rentalInfo.statement(customer);
        int resultPoints = customer.getFrequentEnterPoints();
        int expectedPoints = 2;
        Assertions.assertEquals(expectedPoints, resultPoints);
    }
    @Test void addingAnInvalidIdReturnsStringWithMessage(){
        customer.pickMovie("invalid id", 1);
        String expectedString = "Please enter the id of the movie";
        String result = rentalInfo.statement(customer);
        Assertions.assertEquals(expectedString, result);
    }
    @Test void addingNullValueAsIdReturnsStringWithMessage(){
        customer.pickMovie(null, 1);
        String expectedString = "Please enter the id of the movie";
        String result = rentalInfo.statement(customer);
        Assertions.assertEquals(expectedString, result);
    }

}
