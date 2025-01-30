package store;

import product.SalableProduct;

/**
 * Test class for the StoreFront application to demonstrate functionality.
 * 
 * @author Your Name
 * @version 1.0
 */
public class StoreFrontTest {
    public static void main(String[] args) {
        StoreFront storeFront = new StoreFront();

        // Initialize the store
        storeFront.initializeStore();

        // Create products
        SalableProduct laptop = new SalableProduct("Laptop", "A powerful laptop", 1200.0, 10);
        SalableProduct phone = new SalableProduct("Phone", "A smartphone", 800.0, 15);

        // Add products to inventory
        storeFront.inventoryManager.addProduct(laptop);
        storeFront.inventoryManager.addProduct(phone);

        // Test purchasing products
        storeFront.purchaseProduct(laptop, 2);
        storeFront.purchaseProduct(phone, 20); // Exceeds stock, should fail

        // Test canceling purchase
        storeFront.cancelPurchase(laptop, 1);

        // Display remaining stock
        System.out.println("\nRemaining Stock:");
        System.out.println(laptop.getName() + ": " + laptop.getQuantity() + " units");
        System.out.println(phone.getName() + ": " + phone.getQuantity() + " units");
    }
}
