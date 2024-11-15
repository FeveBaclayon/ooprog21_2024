import java.util.Scanner;

public class PalindromeChecker {

    // This method checks if a string is a palindrome
    public static boolean isPalindrome(String input) {
        // Remove spaces, punctuation, and make the string lowercase for comparison
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string and compare it with the original
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        // If both the cleaned string and its reverse are the same, it's a palindrome
        return cleanedInput.equals(reversedInput);
    }

    public static void main(String[] args) {
        // Create a scanner to get the user's input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Check if the entered string is a palindrome
        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
