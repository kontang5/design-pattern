package iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    private final Book[] books;
    private int count;

    public BookShelf(int capacity) {
        this.books = new Book[capacity];
    }

    public Book getBookAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return books[index];
    }

    public void appendBook(Book book) {
        if (count == books.length) {
            throw new RuntimeException();
        }
        this.books[count] = book;
        count++;
    }

    public int getLength() {
        return count;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
