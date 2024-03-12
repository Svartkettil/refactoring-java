public class Movie {
    private String id;
    private String title;
    private String code;
    private int days;

    public Movie(String id, String title, String code, int days) {
        this.id = id;
        this.title = title;
        this.code = code;
        this.days = days;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public int getDays() {
        return days;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
