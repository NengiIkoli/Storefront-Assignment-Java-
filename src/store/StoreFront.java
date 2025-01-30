package store;

import cart.ShoppingCart;
import inventory.InventoryManager;
import product.SalableProduct;

/**
 * Represents the StoreFront, which initializes the store, processes purchases, 
 * and handles cancellations.
 * 
 * @author Your Name
 * @version 1.0
 */
public class StoreFront {
    /**
     * Manages the inventory of the store.
     */
    public InventoryManager inventoryManager = new InventoryManager();

    /**
     * Manages the shopping cart for the store.
     */
    public ShoppingCart shoppingCart = new ShoppingCart();

    /**
     * Initializes the store with default settings.
     */
    public void initializeStore() {
        System.out.println("Store initialized.");
    }

    /**
     * Processes the purchase of a product.
     *
     * @param product  The product to purchase.
     * @param quantity The quantity to purchase.
     */
    public void purchaseProduct(SalableProduct product, int quantity) {
        if (inventoryManager.checkStock(product, quantity)) {
            product.setQuantity(product.getQuantity() - quantity);
            shoppingCart.addToCart(product, quantity);
            System.out.println("Purchased " + quantity + " " + product.getName() + "(s).");
        } else {
            System.out.println("Not enough stock for " + product.getName() + ".");
        }
    }

    /**
     * Cancels a product purchase and updates stock.
     *
     * @param product  The product to cancel.
     * @param quantity The quantity to cancel.
     */
    public void cancelPurchase(SalableProduct product, int quantity) {
        shoppingCart.removeFromCart(product);
        product.setQuantity(product.getQuantity() + quantity);
        System.out.println("Canceled purchase of " + quantity + " " + product.getName() + "(s).");
    }
}

