import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int collectionCount() {
        return collection.size();
    }

    public void addBook(Book borrowedBook){
        this.collection.add(borrowedBook);
    }
}
