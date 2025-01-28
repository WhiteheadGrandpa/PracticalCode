import java.util.Scanner;

public class DowhileEvenOddChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.println("Enter any positive integer: ");
            input = scanner.nextInt();

            if (input >= 1) {
                if (input % 2 == 0) {
                } else {
                    System.out.println(input + " is an odd number!");
                }
            }

        } while (input >= 1) ;
            System.out.println(input + " is not a valid number!");
        }
    }

