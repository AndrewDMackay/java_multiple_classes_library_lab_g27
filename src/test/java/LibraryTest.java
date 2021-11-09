
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

        private Library library;
        private Book book1;
        private Book book2;

    @Before
        public void before() {
            library = new Library(2);
            book1 = new Book("Lord Of The Rings", "J.R.R.Tolkien", "fiction");
            book2 = new Book("learning React, Modern Patterns For Developing React Apps", "Eve Porcello", "non-fiction");
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

}
