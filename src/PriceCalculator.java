public class PriceCalculator {
    public static void main (String[] args) {
        double productPrice = 59.99;
        int amount = 8;
        double totalCost = productPrice * amount;

        System.out.printf("Total order cost: %.2f", totalCost);
    }
}
