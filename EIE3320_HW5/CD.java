//Lam Ching Yiu 21093734d
//VS code

public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getTracks()
    {
        return numberOfTracks;
    }

    public String toString()
    {
        return super.toString() + " " + artist  + " " + numberOfTracks;
    }

    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        System.out.println("CD");
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("No. of tracks: " + numberOfTracks);
        System.out.println();
    }
}
