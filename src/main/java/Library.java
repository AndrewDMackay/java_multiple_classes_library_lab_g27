
import java.util.ArrayList;

public class Library {

    private int capacity;

    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int countNumberOfBooks() {
        return stock.size();
    }

    public void addBookToLibrary(Book book) {
        if (this.getCapacity() <= 2) {
            this.stock.add(book);
        } else {
            System.out.println("Sorry library at capacity..");
        }
    }
}