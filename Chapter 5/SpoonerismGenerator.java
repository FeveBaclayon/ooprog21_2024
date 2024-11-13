import java.util.Scanner;

public class SpoonerismGenerator {

    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

    public static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static void run() {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");
        
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println("These words cannot be spoonerized.");
        } else {
            String spoonerizedWord1 = word2.substring(0, vowelIndex2) + word1.substring(vowelIndex1);
            String spoonerizedWord2 = word1.substring(0, vowelIndex1) + word2.substring(vowelIndex2);

            System.out.println("Spoonerized words: " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }

    public static void main(String[] args) {
        run();
    }
}
