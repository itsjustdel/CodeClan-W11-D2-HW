import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> genreHashMap;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreHashMap = new HashMap<String, Integer>();
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(!isFull())
            this.books.add(book);
    }

    public boolean isFull(){
        return !(books.size() < this.capacity);
    }

    public boolean isEmpty(){
        return books.size() == 0;
    }

    public Book removeBook(){
        return this.books.remove(0);
    }

    //Adv. Ext
    public void createHashMapByGenre(){

        //make sure it is empty before we start
        genreHashMap.clear();

        for(int i = 0; i < books.size(); i++){
            String genre = books.get(i).getGenre();
            //initialise with 1 if no dict entry, else add 1 to total
            int currentTotal = genreHashMap.get(genre) == null ? 1 : genreHashMap.get(genre) + 1;

            //add or update dictionary
            genreHashMap.put(genre, currentTotal);
        }
    }

    public int getCookCountByGenre(String genre){
        return genreHashMap.get(genre);
    }
}
