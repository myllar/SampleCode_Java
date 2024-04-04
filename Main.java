import Fibonacci.FibCalculator;
import Stacks.StackOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String choice;
            Scanner userInput = new Scanner(System.in);
            boolean exitMenu = false;

            while (!exitMenu) {
                System.out.println("\nWelcome to the main menu. Please select the number of required menu item and press enter: \n" +
                        "1. Fibonacci calculator. A modified exam answer. \n" +
                        "2. Stack operations. A modified exam answer.  \n" +
                        "3. Close application\n");

            choice = userInput.next();

            switch (choice) {
                case "1":
                    FibCalculator calculator = new FibCalculator();
                    calculator.calculateFibonacci();
                    break;
                case "2":
                    StackOperations stackOps = new StackOperations();
                    stackOps.stackOperations(new String[0]);
                    break;
                case "3":
                    System.out.println("Closing application. ");
                    exitMenu = true;
                    return;
                default:
                    System.out.println("Invalid choice, please select number 1, 2 or 3");
                }
            }

            userInput.close();

        } catch (Exception e) {
            System.out.println(STR."\nError: \{e.getMessage()}\n");
        }
    }
}