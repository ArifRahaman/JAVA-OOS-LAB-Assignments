package JAVAOOS;

import java.util.Scanner;

class Books {
    private String title;
    private String author;
    private String publisher;
    private double cost;
    private int stock;

    // Constructor to initialize the Books details
    public Books(String title, String author, String publisher, double cost, int stock) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.cost = cost;
        this.stock = stock;
    }
    public String getAuthor() {
        return author;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Method to display Books details
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
            System.out.println("Books is available.");
            System.out.println("Books details:");
            displayDetails();
            double totalCost = cost * requiredCopies;
            System.out.println("Total Cost for " + requiredCopies + " copies: $" + totalCost);
        } else {
            System.out.println("Required copies not in stock.");
        }
    }
}

public class q10 {
    public static void main(String[] args) {
        // Create an instance of the Books class
        Books Books1 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 15.99, 50);

        // Input from the salesperson
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the Books: ");
        String inputTitle = scanner.nextLine();
        System.out.print("Enter the author of the Books: ");
        String inputAuthor = scanner.nextLine();

        // Check if the Books is available
        if (inputTitle.equals(Books1.getTitle()) && inputAuthor.equals(Books1.getAuthor())) {
            System.out.println("Books found!");
            System.out.print("Enter the number of copies required: ");
            int requiredCopies = scanner.nextInt();

            // Process the order
            Books1.processOrder(requiredCopies);
        } else {
            System.out.println("Books not found in the inventory.");
        }

        // Close the scanner
        scanner.close();
    }
}



