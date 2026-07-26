import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Getting student info
        System.out.println("Enter College Name:");
        String collegeName = sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Register Number:");
        String regNo = sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        System.out.println("Enter Year of Study:");
        int year = sc.nextInt();

        // Printing the details
        System.out.println("       STUDENT INFORMATION         ");
        System.out.println("College Name    : " + collegeName);
        System.out.println("Student Name    : " + name);
        System.out.println("Register Number : " + regNo);
        System.out.println("Department      : " + dept);
        System.out.println("Year of Study   : " + year);

        sc.close();
    }
}

