import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private Integer capacity;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<>();
    }

    public int stockCount() {
        return stock.size();
    }

    public void addBook(Book newBook) {
        if (!this.stockIsAtCapacity()) {
            this.stock.add(newBook);
        }
    }

    public boolean stockIsAtCapacity(){
        if (this.stock.size() >= this.capacity){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkBookInStock(Book searchedBook) {
        if (this.stock.contains(searchedBook)){
            return true;
        }
        else {
            return false;
        }
    }

    public Book removeBook(Book thisBook) {
        if (this.checkBookInStock(thisBook)) {
            this.stock.remove(thisBook);
        }
        return thisBook;
        }


    public void lendBook(Book lentBook) {
        if (this.checkBookInStock(lentBook)){
            this.removeBook(lentBook);

        }
    }

}

