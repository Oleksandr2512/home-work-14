class EducationalBook extends Book {
    public String subject;
    public String level;

    public EducationalBook(String title, String author, int year, String isbn, String subject, String level, boolean isAvailable) {
        super(title, author, year, isbn, isAvailable);
        this.subject = subject;
        this.level = level;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Subject: " + subject + ", Level: " + level;
    }
}

