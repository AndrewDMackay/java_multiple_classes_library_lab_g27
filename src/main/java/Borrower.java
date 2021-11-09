
import java.util.ArrayList;

public class Borrower {
    
    private int checkOutLimit;

    private ArrayList<Book> collection;

    public Borrower(int checkOutLimit) {
        this.collection = new ArrayList<>();
        this.checkOutLimit = checkOutLimit;
    }

    public int getcheckOutLimit() {
        return this.checkOutLimit;
    }

    public int countNumberOfBooks() {
        return this.collection.size();
    }

    public void addBookToBorrower(Book book) {
        if (this.collection.size() < this.checkOutLimit) {
            this.collection.add(book);
        } else {
            System.out.println("Sorry Borrower at book check out limit..");
        }
    }
}