public class OrderProcessor {
    public void processOrder(Order order) {
        // Validate order
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item");
        }
        if (order.getCustomer() == null) {
            throw new IllegalArgumentException("Order must have a customer");
        }

        // Process order
        System.out.println("Processing order for customer: " + order.getCustomer().getName());

        // Validate payment
        if (order.getPayment() == null) {
            throw new IllegalArgumentException("Order must have a payment method");
        }
        if (order.getPayment().getAmount() <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }

        // Process payment
        System.out.println("Processing payment of $" + order.getPayment().getAmount());
    }

    public void processRefund(Order order) {
        // Validate order
        if (order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Order must have at least one item");
        }
        if (order.getCustomer() == null) {
            throw new IllegalArgumentException("Order must have a customer");
        }

        // Process refund
        System.out.println("Processing refund for customer: " + order.getCustomer().getName());

        // Validate payment
        if (order.getPayment() == null) {
            throw new IllegalArgumentException("Order must have a payment method");
        }
        if (order.getPayment().getAmount() <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than 0");
        }

        // Process refund payment
        System.out.println("Refunding payment of $" + order.getPayment().getAmount());
    }
}