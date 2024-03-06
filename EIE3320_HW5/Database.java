//Lam Ching Yiu 21093734d
//VS code

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    Item searchByTitle(String theTitle)
    {
        for (Item item : items) {
            boolean matchFound = item.getTitle().equals(theTitle);
            if(matchFound)
            {
                return item;
            }
        }
        return null;
    }
    
    Item searchByTitlePattern(String pat)
    {
        Pattern pattern = Pattern.compile(pat);
        for (Item item : items) {
            Matcher matcher = pattern.matcher(item.getTitle()); 
            boolean matchFound = matcher.find();
            if(matchFound)
            {
                return item;
            }
        }
        return null;
    }

    Item searchByPattern(String pat)
    {
        Pattern pattern = Pattern.compile(pat);
        for (Item item : items) {
            Matcher matcher = pattern.matcher(item.toString());
            boolean matchFound = matcher.find();
            if(matchFound)
            {
                return item;
            }
        }
        return null;
    }
}
