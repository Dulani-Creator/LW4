package q5;

import java.util.Scanner;

public class Q5{

    public static void displayMenu() {
        System.out.println("=== MyJava Lo-Fat Burgers Menu ===");

        System.out.println("\nEntree:");
        System.out.println("1. Tofu Burger      - $3.49");
        System.out.println("2. Cajun Chicken    - $4.59");
        System.out.println("3. Buffalo Wings    - $3.99");
        System.out.println("4. Rainbow Fillet   - $2.99");

        System.out.println("\nSide Dish:");
        System.out.println("1. Rice Cracker     - $0.79");
        System.out.println("2. No-Salt Fries    - $0.69");
        System.out.println("3. Zucchini         - $1.09");
        System.out.println("4. Brown Rice       - $0.59");

        System.out.println("\nDrink:");
        System.out.println("1. Cafe Mocha       - $1.99");
        System.out.println("2. Cafe Latte       - $1.90");
        System.out.println("3. Espresso         - $2.49");
        System.out.println("4. Oolong Tea       - $0.99");
    }

    public static double getEntreePrice(int choice) {
        switch (choice) {
            case 1: return 3.49;
            case 2: return 4.59;
            case 3: return 3.99;
            case 4: return 2.99;
            default: return 0;
        }
    }

    public static double getSidePrice(int choice) {
        switch (choice) {
            case 1: return 0.79;
            case 2: return 0.69;
            case 3: return 1.09;
            case 4: return 0.59;
            default: return 0;
        }
    }

    public static double getDrinkPrice(int choice) {
        switch (choice) {
            case 1: return 1.99;
            case 2: return 1.90;
            case 3: return 2.49;
            case 4: return 0.99;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu();

        // User input
        System.out.print("\nSelect an entree (1-4): ");
        int entree = scanner.nextInt();

        System.out.print("Select a side dish (1-4): ");
        int side = scanner.nextInt();

        System.out.print("Select a drink (1-4): ");
        int drink = scanner.nextInt();

        // Calculate total
        double total = getEntreePrice(entree)
                + getSidePrice(side)
                + getDrinkPrice(drink);

        // Output
        System.out.println("\n=== Order Summary ===");
        System.out.printf("Total Price: $%.2f\n", total);

        scanner.close();
    }
}
