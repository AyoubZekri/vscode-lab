import java.util.List;

class OrderProcessor {

    public void printOrderSummary(Order order) {
        double total = calculateTotal(order.getItems());
        total = applyDiscount(total, order.getCustomer().isMember());
        printSummary(order, total);
    }

    private double calculateTotal(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    private double applyDiscount(double total, boolean isMember) {
        if (isMember) {
            return total * 0.9;
        }
        return total;
    }

    private void printSummary(Order order, double total) {
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        printItems(order.getItems());
        System.out.println("Total: " + total);
    }

    private void printItems(List<Item> items) {
        System.out.println("Items:");
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}