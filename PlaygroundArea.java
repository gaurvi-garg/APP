import java.util.Scanner;

public class PlaygroundArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and breadth as integers
        System.out.print("Enter length of the playground: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of the playground: ");
        int breadth = sc.nextInt();

        // Calculate area
        int area = length * breadth;

        // Output result
        System.out.println("   SPORTS GROUND MEASUREMENTS     ");
        System.out.println("Length   : " + length + " meters");
        System.out.println("Breadth  : " + breadth + " meters");
        System.out.println("Area     : " + area + " sq meters");
        

        sc.close();
    }
}


