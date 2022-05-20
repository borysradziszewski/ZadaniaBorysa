package Task7;

public class Main {
    public static void main(String[] args) throws noBookFoundException {
        Book book1 = new Book("1111", "Harry Potter i kamień filozficzny", "J.K.Rowling");
        Book book2 = new Book("2222", "Harry Potter i komnata tajemnic", "J.K.Rowling");
        Book book3 = new Book("3333", "Harry Potter i więzień azkabanu", "J.K.Rowling");
        Book book4 = new Book("4444", "Harry Potter i czara ognia", "J.K.Rowling");
        Book book5 = new Book("5555", "Harry Potter i zakon feniksa", "J.K.Rowling");
        Book book6 = new Book("6666", "Harry Potter i książe pół krwi", "J.K.Rowling");
        Book book7 = new Book("7777", "Harry Potter i insygnia śmierci", "J.K.Rowling");
        Book book8 = new Book("8888", null, "J.K.Rowling");
        Book book9 = new Book("9999", "Harry Potter i przeklęte dziecko", "J.K.Rowling");

        BookRepository bookRepository = new BookRepository();
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);
        bookRepository.addBook(book5);
        bookRepository.addBook(book6);
        bookRepository.addBook(book7);
        bookRepository.addBook(book8);
        bookRepository.addBook(book9);

        bookRepository.removeBook(book9);

        bookRepository.findBookByName("Harry Potter i komnata tajemnic");
        System.out.println("------------------------------------");
        //bookRepository.findBookByName("Władca pierścieni");
        System.out.println("------------------------------------");
        bookRepository.findBookByIsbn("2222");
        System.out.println("------------------------------------");
       // bookRepository.findBookByIsbn("1001");
        bookRepository.removeBookBasedOnIsbn("3333");
        System.out.println(bookRepository);
        bookRepository.removeBookBasedOnIsbn("2022");


    }
}
