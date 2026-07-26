import java.util.Scanner;

public class SwapRollNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (a) Using a temporary variable
        System.out.println("=== (a) SWAPPING WITH A TEMP VARIABLE ===");
        System.out.print("Enter Student 1 Roll No: ");
        int roll1 = sc.nextInt();

        System.out.print("Enter Student 2 Roll No: ");
        int roll2 = sc.nextInt();

        System.out.println("Before Swap: Roll 1 = " + roll1 + ", Roll 2 = " + roll2);

        int temp = roll1;
        roll1 = roll2;
        roll2 = temp;

        System.out.println("After Swap : Roll 1 = " + roll1 + ", Roll 2 = " + roll2);


        // (b) Without using a temporary variable
        System.out.println("\n=== (b) SWAPPING WITHOUT A TEMP VARIABLE ===");
        System.out.print("Enter Student 1 Roll No: ");
        int a = sc.nextInt();

        System.out.print("Enter Student 2 Roll No: ");
        int b = sc.nextInt();

        System.out.println("Before Swap: Roll 1 = " + a + ", Roll 2 = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap : Roll 1 = " + a + ", Roll 2 = " + b);

        sc.close();
    }
}

