import java.util.Scanner;

public class SweetBoxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of sweets per box
        System.out.print("Enter the number of sweets per box: ");
        int sweetsPerBox = scanner.nextInt();

        // Input: Number of sweets consumed per day
        System.out.print("Enter the number of sweets consumed per day: ");
        int sweetsPerDay = scanner.nextInt();

        // Input: Number of days you want to live on the island
        System.out.print("Enter the number of days you want to live on the island: ");
        int numberOfDays = scanner.nextInt();

        // Calculate total sweets required
        int totalSweetsRequired = sweetsPerDay * numberOfDays;

        // Calculate number of boxes needed (round up to ensure you have enough sweets)
        int boxesRequired = (int) Math.ceil((double) totalSweetsRequired / sweetsPerBox);

        // Output the number of boxes required
        System.out.println("Total number of boxes required: " + boxesRequired);
        
        scanner.close();
    }
}
