import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rollCount = 0;
        int die1, die2, die3;

        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

        do {
            rollCount++;
            die1 = random.nextInt(6) + 1;
            die2 = random.nextInt(6) + 1;
            die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;


            System.out.printf("%-10d%-10d%-10d%-10d%-10d\n", rollCount, die1, die2, die3, sum);

        } while (!(die1 == die2 && die2 == die3));

        System.out.println("You got a triple! All dice have the same value.");

        System.out.println("Do you want to roll again? (y/n)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            main(null);
        } else {
            System.out.println("Thank you for playing!");
        }

        scanner.close();
    }
}