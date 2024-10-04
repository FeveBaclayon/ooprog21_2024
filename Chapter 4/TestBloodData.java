import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get and validate blood type input
        System.out.print("Enter Blood Type (A, B, AB, O): ");
        String bloodType = scanner.nextLine();

        // Get and validate Rh factor input
        System.out.print("Enter Rh Factor (+ or -): ");
        String rhFactor = scanner.nextLine();

        // Create a BloodData object with user input
        BloodData bloodData = new BloodData(bloodType, rhFactor);

        // Display the user blood info
        System.out.println("\nDisplaying Blood Information:");
        bloodData.displayBloodInfo();
    }
} 
