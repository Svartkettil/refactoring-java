import java.util.HashMap;
import java.util.Map;

public class MovieLibrary {
    static Map<String, Movie> movies = new HashMap<>();

    public static Map<String, Movie> getLibrary() {
        movies.put("F001", new Movie("You've Got Mail", "regular"));
        movies.put("F002", new Movie("Matrix", "regular"));
        movies.put("F003", new Movie("Cars", "childrens"));
        movies.put("F004", new Movie("Fast & Furious X", "new"));
        return movies;
    }
    public static Movie getMovieFromLibrary(String id){
        return getLibrary().get(id);
    }
}
