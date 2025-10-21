// Save this file as Main.java
import java.util.Scanner;

public class Main {

    // Method to check if a number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    // Main method — entry point of Java program
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Basic Java Program =====");

        // Input name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");

        // Input a number
        System.out.print("Enter a number to check even/odd: ");
        int num = sc.nextInt();

        // Call method
        checkEvenOdd(num);

        // Close scanner
        sc.close();

        System.out.println("Program finished successfully!");
    }
}
