import java.util.*;

// Represents an order made by a customer
public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        // Copy products from customer's cart into the order
        this.products = new ArrayList<>(customer.getCart());
    }

    // Calculates total with discount, tax, and shipping using basic rules
    public double calculateTotal() {
        double subtotal = products.stream().mapToDouble(Product::getPrice).sum();

        // Apply 10% discount if subtotal is over $100
        double discount = subtotal > 100 ? 0.10 : 0.0;
        double afterDiscount = subtotal * (1 - discount);

        // 8% tax
        double tax = afterDiscount * 0.08;

        // Shipping fee is $5 if after-discount is less than $50
        double shipping = afterDiscount < 50 ? 5.0 : 0.0;

        return afterDiscount + tax + shipping;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order by " + customer.getName() + " | Total: $" + String.format("%.2f", calculateTotal());
    }
}
