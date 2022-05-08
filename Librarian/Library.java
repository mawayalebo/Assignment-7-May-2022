package Librarian;

public class Library {
    // library contains a list of books (array of Book).
    private Book[] books = new Book[6];

    //Write add (to add a book) and remove (to delete a book) methods for library
    public void add(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void remove(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i] = null;
                break;
            }
        }
    }

    //Write a main() function to create a “Library” and add five “Book” to library. Print the total price of all books.
    public static void main(String[] args) {
        
        Library library = new Library();

        //instances of books
        Book book1 = new Book("Javascript", new String[] {"B Eich"}, 500, 609.0, "NetSpace");
        Book book2 = new Book("ES6", new String[] {"L Regnarson"}, 80, 100.0, "Facebook Inc");
        Book book3 = new Book("Digital Marketing", new String[] {"Jason"}, 100, 410.0, "Gold wave publishing");
        Book book4 = new Book("Blender 3D", new String[] {"Xing Xao"}, 400, 109.0, "xeon R series");
        Book book5 = new Book("Harry Potter", new String[] {"J.K. Rowling"}, 500, 390.0, "Blodhaven");
        
        //add books to library
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        //initiate price
        double totalPrice = 0;

        //print price
        for (int i = 0; i < library.books.length; i++) {
            if (library.books[i] != null) {
                totalPrice += library.books[i].getPrice();
            }
        }
        System.out.println("the total price for all books is: " + totalPrice);
    }
}
