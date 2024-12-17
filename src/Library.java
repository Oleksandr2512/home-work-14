public class Library {
    public java.util.List<Book> books;
    public java.util.List<Reader> readers;

    public Library() {
        this.books = new java.util.ArrayList<>();
        this.readers = new java.util.ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("'" + book.title + "' added to the library.");
    }

    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Reader " + reader.name + " registered.");
    }

    public void issueBook(Reader reader, Book book) {
        if (books.contains(book) && book.isAvailable) {
            reader.borrowBook(book);
        } else {
            System.out.println("Book '" + book.title + "' is unavailable.");
        }
    }

    public void returnBook(Reader reader, Book book) {
        reader.returnBook(book);
    }

    public void showBooks() {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }

    public void searchBooks(String searchTerm) {
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (((FictionBook) book).genre.equals(searchTerm)) {
                    System.out.println(book.getInfo());
                }
            } else if (book instanceof EducationalBook) {
                if (((EducationalBook) book).subject.equals(searchTerm)) {
                    System.out.println(book.getInfo());
                }
            }
        }
    }
}
