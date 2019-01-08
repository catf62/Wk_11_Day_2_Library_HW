import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower2;
    Book book6;

    @Before
    public void before(){
        borrower2 = new Borrower();
        book6 = new Book("Wyrd Sisters", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void doesCollectionStartAtZero(){
        assertEquals(0, borrower2.collectionCount());
    }

    @Test
    public void canAddBookToCollection(){
        borrower2.addBook(book6);
        assertEquals(1, borrower2.collectionCount());
    }
}
