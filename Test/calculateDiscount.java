
public double calculateDiscount(Order order) {
    if (order.getTotalAmount() <= 100) {
        return 0.0;
    }

    if (order.getCustomer().isPremium()) {
        return 0.2;
    }

    return 0.1;
}