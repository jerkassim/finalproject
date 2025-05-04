import java.util.*;
import java.util.stream.*;

// Utility class with static methods for filtering, sorting, and totals
public class Utils {

    // Filter products by category using a lambda
    public static List<Product> filterByCategory(List<Product> products, String category) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // Sort products by price using a stream
    public static List<Product> sortByPrice(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

    // Calculate total price of products in the cart
    public static double cartTotal(List<Product> cart) {
        return cart.stream().mapToDouble(Product::getPrice).sum();
    }
}
