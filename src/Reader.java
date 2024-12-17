public class Reader {
    public String name;
    public int id;
    public java.util.List<Book> borrowedBooks;

    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new java.util.ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable) {
            borrowedBooks.add(book);
            book.changeAvailability(false);
            System.out.println(name + " borrowed '" + book.title + "'");
        } else {
            System.out.println("'" + book.title + "' is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.changeAvailability(true);
            System.out.println(name + " returned '" + book.title + "'");
        } else {
            System.out.println(name + " does not have '" + book.title + "'.");
        }
    }
}


