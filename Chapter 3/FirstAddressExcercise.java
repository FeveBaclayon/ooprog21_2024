public class getAddress {
    public static void main(String[] args) {
        System.out.println("First Java application");

        String[] phoneBrands = {"My Phone"};

        for (String brand : phoneBrands) {
            System.out.println("Company: " + brand + "\n" + getAddress(brand));
        }
    }

    public static String getAddress(String brand) {
        String address;
        switch (brand) {
            case "My Phone":
                address = "Colon St.";
                break;
            default:
                address = "Address not found";
        }
        return address;
    }
}
