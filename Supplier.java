import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private String supplierName;
    private List<Product> suppliedProducts;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
        suppliedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        suppliedProducts.add(product);
    }

    public List<Product> getSuppliedProducts() {
        return suppliedProducts;
    }

    public String getSupplierName() {
        return supplierName;
    }
}