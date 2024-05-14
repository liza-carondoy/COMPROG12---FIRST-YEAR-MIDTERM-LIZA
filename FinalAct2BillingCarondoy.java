public class FinalAct2BillingCarondoy {

    // Method to compute bill with a single parameter (price)
    public double computeBill(double price) {
        final double TaxRate = 0.08;
        double total = price + (price * TaxRate);
        return total;
    }

    // Method to compute bill with two parameters (price, quantity)
    public double computeBill(double price, int quantity) {
        final double TaxRate = 0.08;
        double total = (price * quantity) + ((price * quantity) * TaxRate);
        return total;
    }

    // Method to compute bill with three parameters (price, quantity, coupon value)
    public double computeBill(double price, int quantity, double couponValue) {
        final double TaxRate = 0.08;
        double totalBeforeTax = (price * quantity) - couponValue;
        double total = totalBeforeTax + (totalBeforeTax * TaxRate);
        return total;
    }

    public static void main(String[] args) {
        FinalAct2BillingCarondoy billing = new FinalAct2BillingCarondoy();

        // Test the first method
        double total1 = billing.computeBill(50.0);
        System.out.println("Total for one photo book: $" + total1);

        // Test the second method
        double total2 = billing.computeBill(50.0, 3);
        System.out.println("Total for three photo books: $" + total2);

        // Test the third method
        double total3 = billing.computeBill(50.0, 3, 20.0);
        System.out.println("Total for three photo books with $20 coupon: $" + total3);
    }
}