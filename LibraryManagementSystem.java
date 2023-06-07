import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Display All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    scanner.nextLine(); // consume newline character
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    Book book = new Book(title, author, year);
                    books.add(book);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter search keyword: ");
                    scanner.nextLine(); // consume newline character
                    String keyword = scanner.nextLine();
                    searchBook(books, keyword);
                    break;
                case 3:
                    displayBooks(books);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println();
        }
    }

    public static void searchBook(List<Book> books, String keyword) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                searchResults.add(book);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("No books found matching the search keyword.");
        } else {
            System.out.println("Search Results:");
            displayBooks(searchResults);
        }
    }

    public static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publication Year: " + book.getYear());
                System.out.println();
            }
        }
    }
}
//The provided Java code represents a simple Library Management System. It allows users to add books, search for //books based on a keyword, and display all the books in the library. The program utilizes a list to store Book //objects and provides a user-friendly menu for interaction. Users can add books by providing their title, author, //and publication year. They can search for books using a keyword and view the search results. Additionally, they //can display all the books available in the library. This system offers a convenient way to manage and access //book information, providing basic functionality for a library setting.




