package product;

/**
 * Represents a salable product in the store with its details such as name, 
 * description, price, and available quantity.
 * 
 * @author Your Name
 * @version 1.0
 */
public class SalableProduct {
    /**
     * The name of the product.
     */
    private String name;

    /**
     * The description of the product.
     */
    private String description;

    /**
     * The price of the product.
     */
    private double price;

    /**
     * The quantity of the product in stock.
     */
    private int quantity;

    /**
     * Creates a new SalableProduct with the specified attributes.
     *
     * @param name        The name of the product.
     * @param description A brief description of the product.
     * @param price       The price of the product.
     * @param quantity    The initial quantity in stock.
     */
    public SalableProduct(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for product properties with comments
    /**
     * Retrieves the name of the product.
     * 
     * @return The product's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the name of the product.
     * 
     * @param name The new name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the product description.
     * 
     * @return The product's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Updates the product description.
     * 
     * @param description The new description of the product.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the product price.
     * 
     * @return The product's price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Updates the product price.
     * 
     * @param price The new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Retrieves the quantity in stock.
     * 
     * @return The quantity of the product in stock.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Updates the stock quantity of the product.
     * 
     * @param quantity The new quantity in stock.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

