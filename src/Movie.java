import java.util.HashMap;
import java.util.Map;

public class Movie {
    private String title;
    private String code;
    private Integer days;
    private static Map<String, Movie> movies;

    public Movie(String title, String code, Integer days) {
        this.title = title;
        this.code = code;
        this.days = days;
    }

    public Movie() {
        this.movies = new HashMap<>();
    }

    public Map<String, Movie> pickMovie(String id, Integer days){
        Map<String, Movie> library = new HashMap<>();
        library.put("F001", new Movie("You've Got Mail", "regular", days));
        library.put("F002", new Movie("Matrix", "regular", days));
        library.put("F003", new Movie("Cars", "childrens", days));
        library.put("F004", new Movie("Fast & furious", "new", days));
        if (movies.containsKey(id)) {
            movies.put(String.valueOf(library.get(id)), library.get(id));
            return movies;
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }


    public Integer getDays() {
        return days;
    }
}
