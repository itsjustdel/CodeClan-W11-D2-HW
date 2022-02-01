import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book0;
    private Book book1;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(2);

        book0 = new Book("Dark Place","Garth Meringue","Dark Horror");
        book1 = new Book("Light Place","Garth Meringue","Light Horror");

        borrower = new Borrower();
    }

    @Test
    public void canAdd2Books(){
        library.addBook((book0));
        library.addBook((book1));
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void hashMapCreated()
    {
        Library bigLibrary = new Library(10);
        bigLibrary.addBook((book0));
        bigLibrary.addBook((book0));
        bigLibrary.addBook((book1));

        bigLibrary.createHashMapByGenre();
        assertEquals(2, bigLibrary.getCookCountByGenre("Dark Horror"));
        assertEquals(1, bigLibrary.getCookCountByGenre("Light Horror"));
    }
}
