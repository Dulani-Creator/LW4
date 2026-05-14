package q4;

import java.util.Scanner;

public class Q4 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the year");
         int year = scanner.nextInt();

         if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
             System.out.println("LEAP YEAR");
         }
         else{
             System.out.println("NOT A LEAP YEAR");
         }
         scanner.close();
    }
}
