class CalculationService {
    public double calculateTotal(double subtotal, double taxRate) {
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }

    public double applyDiscount(double total, double discountRate) {
        return total * (1 - discountRate);
    }
}

class OrderCalculator {
    private final CalculationService calculationService;

    public OrderCalculator(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    public double calculateOrderTotal(double subtotal, double taxRate) {
        return calculationService.calculateTotal(subtotal, taxRate);
    }

    public double applyOrderDiscount(double total, double discountRate) {
        return calculationService.applyDiscount(total, discountRate);
    }
}

class DiscountCalculator {
    private final CalculationService calculationService;

    public DiscountCalculator(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    public double calculateDiscountedTotal(double subtotal, double taxRate, double discountRate) {
        double total = calculationService.calculateTotal(subtotal, taxRate);
        return calculationService.applyDiscount(total, discountRate);
    }
}