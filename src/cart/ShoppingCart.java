package cart;

import product.SalableProduct;
import java.util.HashMap;
import java.util.Map;

/**
 * Manages the shopping cart, allowing products to be added, removed, and 
 * the total cost to be calculated.
 * 
 * @author Your Name
 * @version 1.0
 */
public class ShoppingCart {
    /**
     * Maps products to their quantities in the cart.
     */
    private Map<SalableProduct, Integer> cartItems = new HashMap<>();

    /**
     * Adds a product to the cart with a specified quantity.
     *
     * @param product  The product to add.
     * @param quantity The quantity to add.
     */
    public void addToCart(SalableProduct product, int quantity) {
        cartItems.put(product, quantity);
    }

    /**
     * Removes a product from the cart.
     *
     * @param product The product to remove.
     */
    public void removeFromCart(SalableProduct product) {
        cartItems.remove(product);
    }

    /**
     * Calculates the total cost of items in the cart.
     * 
     * @return The total cost of the cart.
     */
    public double calculateTotal() {
        return cartItems.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrice() * entry.getValue())
                .sum();
    }
}
