import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("Yobbo and Yaya","Grenwald Bigstein","Silly");
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1,borrower.getBookCount());
    }

    @Test
    public void noBooksToBorrow(){
        Library emptyLibrary = new Library(0);
        borrower.borrowBook(emptyLibrary);
        assertEquals(0,borrower.getBookCount());
    }



}
