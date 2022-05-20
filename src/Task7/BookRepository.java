package Task7;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {


    List<Book> listOfBooks = new ArrayList<>();


    public void addBook(Book book) {
        if (book.getAuthor() != null) {
            if (book.getIsbn() != null) {
                if (book.getTitle() != null) {
                    listOfBooks.add(book);
                }
            }
        }
    }

    public void removeBook(Book book) {
        listOfBooks.remove(book);
    }

    public Book findBookByName(String title) throws noBookFoundException {
        for (Book book : listOfBooks) {
            if (book.getTitle().equals(title)) {
                System.out.println("Książka o tytule: " + title + "jest w systemie");
                return book;
            }
        }
        throw new noBookFoundException("Nie ma książki o tytule " + title + " w bibliotece");
    }

    public Book findBookByIsbn(String isbn) throws noBookFoundException {
        for (Book book : listOfBooks) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Książka o numerze isbn: " + isbn + " jest w systemie");
                return book;
            }
        }
        throw new noBookFoundException("Nie ma książki o numerze ISBN wynoszącym: " + isbn + " w systemie");
    }

    public void  removeBookBasedOnIsbn(String isbn) throws noBookFoundException {
        Book bookByIsbn = findBookByIsbn(isbn);
        listOfBooks.remove(bookByIsbn);

    }


    public void showBooksInLibrary() {
        System.out.println(listOfBooks);
    }

    @Override
    public String toString() {
        return "BookRepository{" + "listOfBooks=" + listOfBooks + '}';
    }
}
