class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = new String[authors.length];
        System.arraycopy(authors, 0, this.authors, 0, authors.length);
    }
}