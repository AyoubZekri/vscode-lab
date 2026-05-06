interface PaymentStrategy {
    void pay(double amount);
}

class CardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Card: " + amount);
    }
}

class PaypalPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("PayPal: " + amount);
    }
}

class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(double amount) {
        strategy.pay(amount);
    }
}