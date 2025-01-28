import java.util.Scanner;

public class EvenOddcChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any positive integer: ");
        int input = scanner.nextInt();

        while (input >= 1) {
            if (input % 2 == 0) {
                System.out.println(input + " is an even number!");
            }
            else {
                System.out.println(input + " is an odd number!");
            }
            System.out.println("Enter any positive interger: ");
            input = scanner.nextInt();
        }
            System.out.println(input + " is not a valid number!");
    }
}
