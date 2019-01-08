import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Book book5;
    Borrower borrower1;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Lords and Ladies", "Terry Pratchett", "Fantasy");
        book2 = new Book("The 5 Second Rule", "Mel Robbins", "Pop Psychology");
        book3 = new Book("A Thousand Splendid Suns", "Khaled Hosseini", "Drama");
        book4 = new Book("The Opposite of Hate", "Sally Kohn", "Pop Psychology");
        book5 = new Book("Knowledge is Beautiful", "David McCandles", "Reference Work");
        borrower1 = new Borrower();
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void canCheckIfStockIsAtCapacityStockNotFull(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
        assertEquals(false, library.stockIsAtCapacity());
    }

    @Test
    public void canCheckIfStockIsAtCapacityStockIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.stockCount());
        assertEquals(true, library.stockIsAtCapacity());
    }

    @Test
    public void checkBookInStockBookInStock(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.stockCount());
        assertEquals(true, library.checkBookInStock(book2));
    }

    @Test
    public void checkBookInStockBookNotInStock(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.stockCount());
        assertEquals(false, library.checkBookInStock(book5));
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.stockCount());
        library.removeBook(book3);
        assertEquals(3, library.stockCount());
    }


    @Test
    public void canLibraryLendBookToBorrower(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(4, library.stockCount());
        library.lendBook(book1);
        assertEquals(3, library.stockCount());
        assertEquals(1, borrower1.collectionCount());
    }

}
