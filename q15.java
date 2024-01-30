package JAVAOOS;

class Tollbooth {
    private int carsPassedWithoutPaying;
    private int totalCarsPassed;
    private double totalCashCollected;

    public Tollbooth() {
        carsPassedWithoutPaying = 0;
        totalCarsPassed = 0;
        totalCashCollected = 0;
    }

    public void carPasses(boolean paid) {
        totalCarsPassed++;

        if (!paid) {
            carsPassedWithoutPaying++;
        } else {
            totalCashCollected += 50; // Assuming Rs. 50 toll tax
        }
    }

    public void displayResults() {
        System.out.println("Results:");
        System.out.println("Total number of cars passed by without paying: " + carsPassedWithoutPaying);
        System.out.println("Total number of cars passed by: " + totalCarsPassed);
        System.out.println("Total cash collected: Rs. " + totalCashCollected);
    }
}

public class q15 {
    public static void main(String[] args) {
        Tollbooth tollbooth = new Tollbooth();

        // Simulating cars passing by
        tollbooth.carPasses(true);  // Car pays toll
        tollbooth.carPasses(false); // Car does not pay toll
        tollbooth.carPasses(true);  // Car pays toll
        tollbooth.carPasses(true);  // Car pays toll

        // Display results
        tollbooth.displayResults();
    }
}
