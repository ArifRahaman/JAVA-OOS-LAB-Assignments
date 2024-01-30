package JAVAOOS;

import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String publisher;
    private double cost;
    private int stock;

    // Constructor to initialize the book details
    public Book(String title, String author, String publisher, double cost, int stock) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cost = cost;
        this.stock = stock;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Cost: $" + cost);
        System.out.println("Stock: " + stock + " copies");
    }

    // Method to check availability and process the order
    public void processOrder(int requiredCopies) {
        if (requiredCopies <= stock) {
            System.out.println("Book is available.");
            System.out.println("Book details:");
            displayDetails();
            double totalCost = cost * requiredCopies;
            System.out.println("Total Cost for " + requiredCopies + " copies: $" + totalCost);
        } else {
            System.out.println("Required copies not in stock.");
        }
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

public class q17 {
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 15.99, 50);

        // Input from the salesperson
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String inputTitle = scanner.nextLine();
        System.out.print("Enter the author of the book: ");
        String inputAuthor = scanner.nextLine();

        // Check if the book is available
        if (inputTitle.equals(book1.getTitle()) && inputAuthor.equals(book1.getAuthor())) {
            System.out.println("Book found!");
            System.out.print("Enter the number of copies required: ");
            int requiredCopies = scanner.nextInt();

            // Process the order
            book1.processOrder(requiredCopies);
        } else {
            System.out.println("Book not found in the inventory.");
        }

        // Close the scanner
        scanner.close();
    }
}

