import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        int basic = sc.nextInt();

        System.out.print("Enter allowance: ");
        int allowance = sc.nextInt();

        int totalSalary = basic + allowance;

        System.out.println("Total Salary: " + totalSalary);

        sc.close();
    }
}



