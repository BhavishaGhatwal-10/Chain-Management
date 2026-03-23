import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<Integer, Product> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    public void updateStock(int productId, int quantity) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setQuantity(p.getQuantity() + quantity);
        }
    }

    public void displayInventory() {
        for(Product p : inventory.values()) {
            System.out.println(p.getName() + " : " + p.getQuantity());
        }
    }

    public Product getProduct(int id) {
        return inventory.get(id);
    }
}