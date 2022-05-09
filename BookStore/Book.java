package BookStore;

public class Book {
    //details such as author, title, publisher, cost and stock position
    private String author;
    private String title;
    private String publisher;
    private double cost;
    private int stockPosition;

    //constructor
    public Book(String author, String title, String publisher, double cost, int stockPosition) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.cost = cost;
        this.stockPosition = stockPosition;
    }

    //getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStockPosition() {
        return stockPosition;
    }

    public void setStockPosition(int stockPosition) {
        this.stockPosition = stockPosition;
    }

    


}
