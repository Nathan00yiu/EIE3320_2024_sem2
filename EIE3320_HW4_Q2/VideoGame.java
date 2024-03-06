//Lam Ching Yiu 21093734d
//VS code

public class VideoGame extends Item {

    private String platform;
    private int numberOfPlayers;

    public VideoGame(String title, String platform, int numberOfPlayers, int playingTime) {
        super(title, playingTime);
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
    }
    public void print()
    {
        System.out.println("Video Game");
        super.print();
        System.out.println("platform: " + platform);
        System.out.println("numberOfPlayers: " + numberOfPlayers);
    }
}
