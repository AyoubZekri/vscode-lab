public double calculateDiscount(Order order) {
    double discount = 0.0;
    if (order.getTotalAmount() > 100) {
        if (order.getCustomer().isPremium()) {
            discount = 0.2;
        } else {
            discount = 0.1;
        }
    }
    return discount;
}