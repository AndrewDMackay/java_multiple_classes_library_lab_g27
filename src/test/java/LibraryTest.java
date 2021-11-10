
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private Book book1;
        private Book book2;
        private Book book3;

    @Before
        public void before() {
            library = new Library(2);
            book1 = new Book("Lord Of The Rings", "J.R.R.Tolkien", "fiction");
            book2 = new Book("Learning React, Modern Patterns For Developing React Apps", "Eve Porcello", "non-fiction");
            book3 = new Book("The Silmarillion", "J.R.R.Tolkien", "fiction");
        }

        @Test
        public void canAddBookToLibrary(){
            library.addBookToLibrary(book1);
            assertEquals(1, library.countNumberOfBooks());
        }

        @Test
        public void canCountNumberOfBooks(){
            library.addBookToLibrary(book1);
            library.addBookToLibrary(book2);
            assertEquals(2, library.countNumberOfBooks());
        }

        @Test
        public void canOnlyAddBookIfUnderCapacity(){
            library.addBookToLibrary(book1);
            library.addBookToLibrary(book2);
            assertEquals(2, library.countNumberOfBooks());
        }

        @Test
        public void cannotAddBookIfAtCapacity(){
            library.addBookToLibrary(book1);
            library.addBookToLibrary(book2);
            library.addBookToLibrary(book3);
            assertEquals(2, library.countNumberOfBooks());
        }

}
