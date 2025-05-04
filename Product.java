// Abstract base class representing a product
public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    protected String category;

    public Product(String id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }

    // Display product info
    @Override
    public String toString() {
        return name + " (" + category + ") - $" + price;
    }
}
