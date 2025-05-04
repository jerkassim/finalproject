import java.util.*;

// Main class to demonstrate the platform functionality
public class ECommerceDemo {
    public static void main(String[] args) {
        // Create a sample product catalog
        List<Product> catalog = Arrays.asList(
                new Electronics("E01", "Laptop", 1200),
                new Clothing("C01", "T-Shirt", 25),
                new Grocery("G01", "Milk", 3.5)
        );

        // Show filtered electronics
        System.out.println("All Electronics:");
        Utils.filterByCategory(catalog, "Electronics").forEach(System.out::println);

        // Show sorted list by price
        System.out.println("\nSorted by price:");
        Utils.sortByPrice(catalog).forEach(System.out::println);

        // Simulate a customer shopping
        Customer cust = new Customer("U01", "Alice");
        cust.addToCart(catalog.get(0)); // Laptop
        cust.addToCart(catalog.get(2)); // Milk

        // Create and display an order
        Order order = new Order("O01", cust);
        System.out.println("\n" + order);
    }
}

