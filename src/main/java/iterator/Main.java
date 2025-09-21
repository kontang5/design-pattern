package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("Structure and Interpretation of Computer Programs"));
        bookShelf.appendBook(new Book("The Art of Computer Programming"));
        bookShelf.appendBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        bookShelf.appendBook(new Book("Introduction to Algorithms"));
        bookShelf.appendBook(new Book("Refactoring: Improving the Design of Existing Code"));

        // Implicit Iterator
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.title());
        }
        System.out.println();

        // Enhanced for loop
        for (Book book : bookShelf) {
            System.out.println(book.title());
        }
        System.out.println();
    }
}