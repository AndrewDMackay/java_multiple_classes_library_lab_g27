
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    private Borrower Borrower;
    private Book book1;
    private Book book2;
    private Book book3;
    private Library Library;

    @Before
    public void before() {
        Borrower = new Borrower(2);
        book1 = new Book("Lord Of The Rings", "J.R.R.Tolkien", "fiction");
        book2 = new Book("learning React, Modern Patterns For Developing React Apps", "Eve Porcello", "non-fiction");
        book3 = new Book("The Silmarillion", "J.R.R.Tolkien", "fiction");
        Library = new Library(2);
    }

    @Test
    public void canAddBookToBorrower(){
        Borrower.addBookToBorrower(book1);
        assertEquals(1, Borrower.countNumberOfBooksInCollection());
    }

    @Test
    public void canCountNumberOfBooksInCollectionInCollection(){
        Borrower.addBookToBorrower(book1);
        Borrower.addBookToBorrower(book2);
        assertEquals(2, Borrower.countNumberOfBooksInCollection());
    }

    @Test
    public void canOnlyAddBookIfUnderCheckOutLimit(){
        Borrower.addBookToBorrower(book1);
        Borrower.addBookToBorrower(book2);
        assertEquals(2, Borrower.countNumberOfBooksInCollection());
    }

    @Test
    public void cannotAddBookIfAtCheckOutLimit(){
        Borrower.addBookToBorrower(book1);
        Borrower.addBookToBorrower(book2);
        Borrower.addBookToBorrower(book3);
        assertEquals(2, Borrower.countNumberOfBooksInCollection());
    }

    @Test
    public void canOnlyAddBookIfUnderCheckOutLimitAndRemoveFromLibrary(){
        Library.addBookToLibrary(book1);
        Library.addBookToLibrary(book2);
        Library.removeBookFromLibrary();
        Library.removeBookFromLibrary();
        Borrower.addBookToBorrowerAndRemoveFromLibrary(Library);
        Borrower.addBookToBorrowerAndRemoveFromLibrary(Library);
        assertEquals(2, Borrower.countNumberOfBooksInCollection());
    }
}

