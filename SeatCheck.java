public class SeatCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat number: ");
        int seatNo = sc.nextInt();

        if (seatNo % 2 == 0) {
            System.out.println("Seat " + seatNo + " is EVEN go to Counter A");
        } else {
            System.out.println("Seat " + seatNo + " is ODD go to Counter B");
        }

        sc.close();
    }
}
