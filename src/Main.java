//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        FictionBook book1 = new FictionBook("The Hobbit48p", "J.R.R. Tolkien", 1937, "978-3-16-148410-0", "Fantasy", true);
        EducationalBook book2 = new EducationalBook("Calculus", "James Stewart", 2015, "978-0-321-45672-3", "Mathematics", "University", true);
        FictionBook book3 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-0-7432-7356-5", "Drama", true);
        EducationalBook book4 = new EducationalBook("History of the World", "John M. Roberts", 2009, "978-0-19-953537-5", "History", "School", true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        Reader reader1 = new Reader("Alice", 1);
        Reader reader2 = new Reader("Bob", 2);
        library.registerReader(reader1);
        library.registerReader(reader2);


        library.issueBook(reader1, book1);
        library.issueBook(reader2, book2);


        library.returnBook(reader1, book1);


        System.out.println("\nAll books in the library:");
        library.showBooks();


        System.out.println("\nSearching for Fantasy books:");
        library.searchBooks("Fantasy");

        System.out.println("\nSearching for Mathematics books:");
        library.searchBooks("Mathematics");
    }
}