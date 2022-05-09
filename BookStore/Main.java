package BookStore;
// import java.util.Scanner;
import java.util.Scanner;
public class Main {
    //books array
    private static Book[] books = new Book[5];

    //create search books with title and author
    public static void searchBooks(String title, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title) && books[i].getAuthor().equals(author)) {
                    System.out.println("Book found: " + books[i].getTitle() + " by " + books[i].getAuthor());
                    return;
                }
            }
        }
    }

    
        System.out.println("Book not found!");
    }
    //main function
    public static void main(String[] args) {
        //create 5 books
        books[0] = new Book("J.K. Rowling", "Harry Potter and the Sorcerers Stone", "Bloomsbury", 10.00, 1);
        books[1] = new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", "Bloomsbury", 10.00, 2);
        books[2] = new Book("J.K. Rowling", "Harry Potter and the Prisoner of Azkaban", "Bloomsbury", 10.00, 3);
        books[3] = new Book("J.K. Rowling", "Harry Potter and the Goblet of Fire", "Bloomsbury", 10.00, 4);
        books[4] = new Book("J.K. Rowling", "Harry Potter and the Order of the Phoenix", "Bloomsbury", 10.00, 5);

        //search a book
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book you want to search: ");
        String title = scanner.nextLine();
        search(title);

    }

}
