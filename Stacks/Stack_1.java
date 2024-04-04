package Stacks;

public class Stack_1 {
// STACK PROPERTIES
    private static final int STACK_SIZE = 3;
    private final int[] stackArray;
    private int stackTop = -1;

    // INITIALIZE STACK
    public Stack_1() {
        stackArray = new int[STACK_SIZE];
    }

    // ACTION PUSH
    public void push(int item) {
        // CHECK OVERFLOW
        if (stackTop >= STACK_SIZE - 1) {
            System.out.println(STR."\nOVERFLOW!! Max limit of items is: \{STACK_SIZE}");
            return;
        }
            // INCREMENT, PUSH
            stackArray[++stackTop] = item;
    }

    // ACTION POP
    public int pop() {
        // CHECK UNDERFLOW
        if (stackTop <= -1) {
            System.out.println(STR."Error, Stack is empty: \{stackTop}\n");
            return -1;
        }
        // DECREMENT, POP
        return stackArray[stackTop--];
    }

    // ACTION DISPLAY STACK
    public void displayStack() {
        if (stackTop == -1) {
            System.out.println("Stack is empty. \n");
            return;
        }
        System.out.println("Stack contents: \n");
        for (int i = stackTop; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

