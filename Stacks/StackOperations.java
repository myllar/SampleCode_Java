package Stacks;

import java.util.Scanner;

public class StackOperations {
    public static void stackOperations(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack_1 examStack = new Stack_1();

        try {
            while (true) {
                // INSTRUCTIONS
                System.out.print("Enter 'push <number>', 'pop', 'display', or '//' to close: \n");
                String input = scanner.nextLine();

                if (input.equals("//")) {
                // TERMINATE
                    System.out.println("\nClosing the scanner. \n");
                    break;

                } else if (input.startsWith("push")) {
                    // PUSH
                    try {
                        int number = Integer.parseInt(input.substring(5).trim());
                        examStack.push(number);
                        System.out.println(STR."SUCCESS! \{number} pushed to the stack. \n");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number after 'push'. \n");
                    }

                } else if (input.equals("pop")) {
                    // POP
                    int popped = examStack.pop();
                    if (popped != -1) {
                        System.out.println(STR."Popped: \{popped}\n");
                    }

                } else if (input.equals("display")) {
                    // DISPLAY
                    examStack.displayStack();

                } else {
                    // INVALID
                    System.out.println("\nInvalid input. Please enter 'push <number>', \n'pop', \n'display', or \n'//' to close. \n");
                }
            }

        } catch (Exception e) {
            System.out.println(STR."\nAn unexpected error occurred: \{e.getMessage()}\n");
        }
    }
}
