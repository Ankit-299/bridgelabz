import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        
        // Read the integer input from the user
        int number = scanner.nextInt();
        
        // Check if the number is even or odd using the modulo operator (%)
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
