import java.util.*;

// Customer is a type of user who can add products to their cart
public class Customer extends User {
    private List<Product> cart = new ArrayList<>();

    public Customer(String userId, String name) {
        super(userId, name);
    }

    // Add a product to the cart
    public void addToCart(Product product) {
        cart.add(product);
    }

    // Get current cart
    public List<Product> getCart() {
        return cart;
    }
}

