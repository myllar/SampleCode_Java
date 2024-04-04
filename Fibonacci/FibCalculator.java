package Fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibCalculator {
    private Scanner scanner;
    // INITIALIZE OBJECT
    public FibCalculator() {
        this.scanner = new Scanner(System.in);
    }

    // CALCULATE
    public void calculateFibonacci() {
        int n = 0;

        try {
            // READ INPUT
            System.out.println("Enter parameter for Recursive Fibonacci calculation: ");
            n = scanner.nextInt();
            // CHECK IF NEGATIVE INPUT
            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
                return;
            }
        } catch (InputMismatchException e) {
            // HANDLE NON-INT INPUT
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        // INITIALIZE SEQUENCE CALCULATION
        int a = 0, b = 1;

        System.out.println("Fibonacci recursive sequence:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(a);
            // CALCULATE NEXT
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println("Closing the scanner. ");
    }
}