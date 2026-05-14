package q12;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Word to replace
        System.out.print("Enter the word to replace: ");
        String oldWord = input.nextLine();

        // Replacement word
        System.out.print("Enter the new word: ");

        String newWord = input.nextLine();

        // Replace word
        String result = sentence.replace(oldWord, newWord);

        // Output result
        System.out.println("Updated sentence:");
        System.out.println(result);

        input.close();
    }
}
