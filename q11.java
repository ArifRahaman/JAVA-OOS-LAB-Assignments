package JAVAOOS;

class Date {
    private int day;
    private int month;
    private int year;

    // Constructors
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day) {
        this.day = day;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Method to get the next day
    public Date getNextDay() {
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > getDaysInMonth(month, year)) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        return new Date(nextDay, nextMonth, nextYear);
    }

    // Method to get the previous day
    public Date getPreviousDay() {
        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;

        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }
            prevDay = getDaysInMonth(prevMonth, prevYear);
        }

        return new Date(prevDay, prevMonth, prevYear);
    }

    // Method to print the date
    public void printDate() {
        System.out.printf("%02d/%02d/%04d\n", day, month, year);
    }

    // Helper method to get the number of days in a month
    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            default:
                return 31;
        }
    }
}

public class q11 {
    public static void main(String[] args) {
        // Create a date object using the default constructor
        Date currentDate = new Date();
        System.out.println("Current Date:");
        currentDate.printDate();

        // Get and print the next day
        Date nextDay = currentDate.getNextDay();
        System.out.println("\nNext Day:");
        nextDay.printDate();

        // Get and print the previous day
        Date prevDay = currentDate.getPreviousDay();
        System.out.println("\nPrevious Day:");
        prevDay.printDate();

        // Create a date object with specific values
        Date customDate = new Date(25, 12, 2022);
        System.out.println("\nCustom Date:");
        customDate.printDate();
    }
}

