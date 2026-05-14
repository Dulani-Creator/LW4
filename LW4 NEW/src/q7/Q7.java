package q7;

import java.util.Scanner;
import java.util.Scanner;

public class Q7{

    // Method to count digits
    public static int countDigits(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        do {
            System.out.print("Enter a number (negative to stop): ");
            number = input.nextInt();

            if (number >= 0) {
                int digits = countDigits(number);
                System.out.println("Number of digits = " + digits);
            }

        } while (number >= 0);

        System.out.println("Program ended.");

        input.close();
    }
}
