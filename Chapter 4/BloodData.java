public class BloodData {
    private String bloodType;
    private String rhFactor;

    // Constructor that allows setting blood type and Rh factor
    public BloodData(String bloodType, String rhFactor) {
        setBloodType(bloodType);
        setRhFactor(rhFactor);
    }

    // Method to display the blood type and Rh factor
    public void displayBloodInfo() {
        System.out.println("Blood type: " + bloodType);
        System.out.println("Rh Factor: " + rhFactor);
    }

    // Setter for blood type with basic validation
    public void setBloodType(String bloodType) {
        if (bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") ||
            bloodType.equalsIgnoreCase("AB") || bloodType.equalsIgnoreCase("O")) {
            this.bloodType = bloodType.toUpperCase();
        } else {
            System.out.println("Invalid blood type. Setting to default 'O'.");
            this.bloodType = "O";
        }
    }

    // Setter for Rh factor with basic validation
    public void setRhFactor(String rhFactor) {
        if (rhFactor.equals("+") || rhFactor.equals("-")) {
            this.rhFactor = rhFactor;
        } else {
            System.out.println("Invalid Rh factor. Setting to default '+'.");
            this.rhFactor = "+";
        }
    }
} 
