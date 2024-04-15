package ironhack.classes.videotransmission;

public class TvSeries extends Video {
    private int season;
    private int episode;

    public TvSeries(String title, String format, int season, int episode) {
        super(title, format);
        this.season = season;
        this.episode = episode;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
}
