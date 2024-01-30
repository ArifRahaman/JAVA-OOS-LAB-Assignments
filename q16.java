package JAVAOOS;

// Fruit interface
interface Fruit {
    boolean hasAPeel();
}

// Vegetable interface
interface Vegetable {
    boolean hasARoot();
}

// Tomato class implementing Fruit and Vegetable interfaces
class Tomato implements Fruit, Vegetable {
    @Override
    public boolean hasAPeel() {
        return false; // Tomatoes don't have a peel
    }

    @Override
    public boolean hasARoot() {
        return true; // Tomatoes have a root
    }

    // Additional methods or properties specific to Tomato can be added here
}

public class q16 {
    public static void main(String[] args) {
        // Instantiate an object of Tomato
        Tomato tomato = new Tomato();

        // Print the details of the Tomato object
        System.out.println("Details of Tomato:");
        System.out.println("Has a peel: " + tomato.hasAPeel());
        System.out.println("Has a root: " + tomato.hasARoot());
    }
}

