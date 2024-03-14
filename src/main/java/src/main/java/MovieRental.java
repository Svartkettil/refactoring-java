package src.main.java;

public class MovieRental {
    private final int days;
    private final Movie movie;

    public MovieRental(int days, Movie movie) {
        this.days = days;
        this.movie = movie;
    }


    public int getDays() {
        return days;
    }

    public Movie getMovie() {
        return movie;
    }
}
