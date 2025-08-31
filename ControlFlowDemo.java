// Demonstrates control flow in Java
public class ControlFlowDemo {
    public static void main(String[] args) {
        int num = 5;
        // if-else
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }
        // switch
        switch (num) {
            case 1: System.out.println("One"); break;
            case 5: System.out.println("Five"); break;
            default: System.out.println("Other number");
        }
        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("For loop iteration: " + i);
        }
        // while loop
        int j = 0;
        while (j < 3) {
            System.out.println("While loop iteration: " + j);
            j++;
        }
        // do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 3);
    }
}
