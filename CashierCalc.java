
import java.util.Scanner;

public class CashierCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking prices of two products as input
        System.out.print("Enter price of Product 1: ");
        int price1 = sc.nextInt();

        System.out.print("Enter price of Product 2: ");
        int price2 = sc.nextInt();

        // Performing arithmetic operations
        int total = price1 + price2;
        int difference = price1 - price2;
        int product = price1 * price2;
        int quotient = price1 / price2;
        int remainder = price1 % price2;

        // Displaying the results
        System.out.println("         BILL SUMMARY             ");
        System.out.println("Price 1          : " + price1);
        System.out.println("Price 2          : " + price2);
        System.out.println("Total (Sum)      : " + total);
        System.out.println("Difference       : " + difference);
        System.out.println("Product          : " + product);
        System.out.println("Quotient         : " + quotient);
        System.out.println("Remainder (Mod)  : " + remainder);
        

        sc.close();
    }
}

