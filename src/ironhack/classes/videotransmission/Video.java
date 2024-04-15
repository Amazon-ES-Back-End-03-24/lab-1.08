package ironhack.classes.videotransmission;

public abstract class Video {
    private String title;
    private String format;

    public Video(String title, String format) {
        this.title = title;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
