
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library() {
        this.stock = new ArrayList<>();
    }

    public int countNumberOfBooks(){
        return stock.size();
    }

    public void addBookToLibrary(Book book){
        this.stock.add(book);
    }
}