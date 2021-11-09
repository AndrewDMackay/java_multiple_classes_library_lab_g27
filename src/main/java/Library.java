
import java.util.ArrayList;

public class Library {

    private int capacity;

    private ArrayList<Book> stock;

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countNumberOfBooks() {
        return this.stock.size();
    }

    public void addBookToLibrary(Book book) {
        if (this.stock.size() < this.capacity) {
            this.stock.add(book);
        } else {
            System.out.println("Sorry library at capacity..");
        }
    }
}