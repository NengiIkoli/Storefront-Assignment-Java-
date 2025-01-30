package inventory;

import product.SalableProduct;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages the inventory of the store, allowing products to be added, removed, 
 * and checked for stock availability.
 * 
 * @author Your Name
 * @version 1.0
 */
public class InventoryManager {
    /**
     * A list of all products in the inventory.
     */
    private List<SalableProduct> products = new ArrayList<>();

    /**
     * Adds a new product to the inventory.
     *
     * @param product The product to add.
     */
    public void addProduct(SalableProduct product) {
        products.add(product);
    }

    /**
     * Removes a product from the inventory.
     *
     * @param product The product to remove.
     */
    public void removeProduct(SalableProduct product) {
        products.remove(product);
    }

    /**
     * Checks if there is enough stock of a product for a given quantity.
     *
     * @param product  The product to check.
     * @param quantity The required quantity.
     * @return True if enough stock is available, false otherwise.
     */
    public boolean checkStock(SalableProduct product, int quantity) {
        return product.getQuantity() >= quantity;
    }
}
