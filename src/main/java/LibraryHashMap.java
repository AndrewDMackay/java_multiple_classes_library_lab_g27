
import java.util.HashMap;

public class LibraryHashMap {

    public static void main(String[] args) {

        HashMap booksByGenre = new HashMap<String, Integer>();
        booksByGenre.put("Lord Of The Rings", "J.R.R.Tolkien", "fiction");
        booksByGenre.put("The Silmarillion", "J.R.R.Tolkien", "fiction");
        booksByGenre.put("Learning React, Modern Patterns For Developing React Apps", "Eve Porcello", "non-fiction");

        System.out.println(booksByGenre.get("Lord Of The Rings"));
        System.out.println(booksByGenre.get("The Silmarillon"));
        System.out.println(booksByGenre.get("Learning React, Modern Patterns For Developing React Apps"));

        System.out.println("All books, and genre are " + booksByGenre.values());

        System.out.println("The key set is " + booksByGenre.keySet());
    }
}