//Lam Ching Yiu 21093734d
//VS code

public class Video extends Item
{
    private String director;

    /**
     * Constructor for objects of class Video
     */
    public Video(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /**
     * Print details about this Video to the text terminal.
     */
    public void print()
    {
        System.out.println("Video");
        super.print();
        System.out.println("Director: " + director);
    }
}
