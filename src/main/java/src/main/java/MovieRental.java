package src.main.java;

public class MovieRental {
    private int days;
    private Movie movie;

    public MovieRental(int days, Movie movie) {
        this.days = days;
        this.movie = movie;
    }

    public MovieRental() {
    }

    public MovieRental pickMovie(String id, int days){
        return new MovieRental(days, MovieLibrary.getMovieFromLibrary(id));

    }
    public int getDays() {
        return days;
    }

    public Movie getMovie() {
        return movie;
    }
}
