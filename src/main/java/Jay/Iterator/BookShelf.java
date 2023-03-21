package Jay.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
    private List<Book> books = new ArrayList<Book>();
    private int last = 0;
    public Iterator iterator() {
        return null;
    }

    public int getLast() {
        return last;
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
        last++;
    }
}
