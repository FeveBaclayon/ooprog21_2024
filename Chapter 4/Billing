class Billing {

    public double computeBill(double price) {
        return price + (price * 0.08); 
    }

    public double computeBill(double price, int quantity) {
        double total = price * quantity;
        return total + (total * 0.08); 
    }

    public double computeBill(double price, int quantity, int coupon) {
        double total = price * quantity;
        double discount = total - coupon;
        return discount + (discount * 0.08);
    }

    public static void main(String[] args) {
        Billing bill = new Billing();

        System.out.println("The total price for the bill is: $" + bill.computeBill(23.2));
        System.out.println("The total price for the bill is: $" + bill.computeBill(23.2, 2));
        System.out.println("The total price for the bill is: $" + bill.computeBill(23.2, 3, 10));
    }
} 
