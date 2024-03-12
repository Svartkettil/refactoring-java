import java.util.HashMap;
import java.util.Map;

public class Movie {
    private String title;
    private String code;
    private Integer days;
    private static Map<String, Movie> movies = new HashMap<>();

    public Movie(String id, String title, String code, Integer days) {
        this.title = title;
        this.code = code;
        this.days = days;
    }

    public Movie() {
    }

    public Movie pickMovie(String id, Integer days){
        movies.put("F001", new Movie(id, "You've Got Mail", "regular", days));
        movies.put("F002", new Movie(id, "Matrix", "regular", days));
        movies.put("F003", new Movie(id, "Cars", "childrens", days));
        movies.put("F004", new Movie(id, "Fast & furious", "new", days));
        return this;
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
