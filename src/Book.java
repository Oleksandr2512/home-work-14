public class Book {
   public String title;
   public String author;
   public int year;
   public String isbn;
   public boolean isAvailable;

    public Book(String title, String author, int year, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", ISBN: " + isbn + ", Available: " + isAvailable;
    }

    public void changeAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

