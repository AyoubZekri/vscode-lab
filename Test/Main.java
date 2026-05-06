public class Main {
    public static void main(String[] args) {
        // Create the shared calculation service
        CalculationService calculationService = new CalculationService();

        // Create calculators with the shared service
        OrderCalculator orderCalculator = new OrderCalculator(calculationService);
        DiscountCalculator discountCalculator = new DiscountCalculator(calculationService);

        // Use the calculators
        double orderTotal = orderCalculator.calculateOrderTotal(100.0, 0.1); // 10% tax
        System.out.println("Order Total: " + orderTotal);

        double discountedTotal = discountCalculator.calculateDiscountedTotal(100.0, 0.1, 0.2); // 10% tax, 20% discount
        System.out.println("Discounted Total: " + discountedTotal);
    }
}
