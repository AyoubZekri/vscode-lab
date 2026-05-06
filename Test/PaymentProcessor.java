class PaymentProcessor {
    public void processPayment(String method, double amount) {
        if (method.equals("card")) {
            System.out.println("Card: " + amount);
        } else if (method.equals("paypal")) {
            System.out.println("PayPal: " + amount);
        }
    }
}