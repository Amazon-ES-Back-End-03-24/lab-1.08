package ironhack.classes.videotransmission;

public class Movie extends Video {
    private int ticketsSold;
    private int duration;

    public Movie(String title, String format, int ticketsSold, int duration) {
        super(title, format);
        this.ticketsSold = ticketsSold;
        this.duration = duration;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
