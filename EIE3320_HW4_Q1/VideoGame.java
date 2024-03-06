package EIE3320_HW4_Q1;

//Lam Ching Yiu 21093734d
//VS code

public class VideoGame {
    private String title;
    private String platform;
    private int numberOfPlayers;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public VideoGame(String title, String platform, int numberOfPlayers, int playingTime) {
        this.title = title;
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
        this.playingTime = playingTime;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    public boolean getOwn()
    {
        return gotIt;
    }

    public void print()
    {
        System.out.println("Video Game");
        System.out.println("Title: " + title);
        if(gotIt) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + playingTime);
        System.out.println("Comment: " + comment);
        System.out.println("platform: " + platform);
        System.out.println("numberOfPlayers: " + numberOfPlayers);
    }
}
