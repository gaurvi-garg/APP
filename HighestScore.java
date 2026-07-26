import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input scores for 3 students
        System.out.print("Enter score for Student 1: ");
        int score1 = sc.nextInt();

        System.out.print("Enter score for Student 2: ");
        int score2 = sc.nextInt();

        System.out.print("Enter score for Student 3: ");
        int score3 = sc.nextInt();

        if (score1 >= score2 && score1 >= score3) {
            System.out.println("\nStudent 1 has the highest score: " + score1);
            
        } else if (score2 >= score1 && score2 >= score3) {
            System.out.println("\nStudent 2 has the highest score: " + score2);
            
        } else {
            System.out.println("\nStudent 3 has the highest score: " + score3);
        }

        sc.close();
    }
}
