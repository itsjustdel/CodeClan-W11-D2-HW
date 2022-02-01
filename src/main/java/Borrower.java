import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<Book>();
    }

    public void borrowBook(Library library){
        //take the first book from the list if there are any books
        if(!library.isEmpty())
            this.books.add(library.removeBook());
    }

    public int getBookCount(){
        return this.books.size();
    }
}
