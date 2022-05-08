package Librarian;
//Implement a class for a “Book”
class Book {
    // Book contains a title (a String), a list of authors (array of authors), number of pages (an integer), price (floating point number), publisher (a String)
    private String title;
    private String[] authors;
    private int pages;
    private double price;
    private String publisher;

    //Write suitable constructor and accessor/modifier methods
    public Book(String title, String[] authors, int pages, double price, String publisher) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

  
}