package DigitalLibrary;

public class sistemaBiblioteca {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("El principito", "Antoine de Saint");
        Book book2 = new Book("Don quijote de la mancha", "Cervantes");
        Book book3 = new Book("La Odisea", "Homero");
        Book book4 = new Book("hamlet", "Shakespeare");
        Book book5 = new Book("Robinson Crusoe", "Defoe");
        Book book6 = new Book("Oliver Twist", "Dickens");
        Book book7 = new Book("Cumbres borroscosas", "Bronte");
        Book book8 = new Book("Alicia en el pais de las maravillas", "Carroll");
        Book book9 = new Book("El viejo y el mas", "Hemingway");

        library.add_book(book1);
        library.add_book(book2);
        library.add_book(book3);
        library.add_book(book4);
        library.add_book(book5);
        library.add_book(book6);
        library.add_book(book7);
        library.add_book(book8);
        library.add_book(book9);

        library.search_books("");

        library.lend_Book("");

        library.return_book("");

        library.return_book("");

        library.search_books("");

    }
}
