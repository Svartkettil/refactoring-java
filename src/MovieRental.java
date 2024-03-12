public class MovieRental {
    private String movieId;
    private int days;
    private Movie movie;

    public MovieRental(String movieId, int days, Movie movie) {
        this.movieId = movieId;
        this.days = days;
        this.movie = movie;
    }

    public MovieRental() {
    }

    public MovieRental pickMovie(String id, int days){
        return new MovieRental(id, days, MovieLibrary.getMovieFromLibrary(id));

    }
    public int getDays() {
        return days;
    }

    public Movie getMovie() {
        return movie;
    }
}
