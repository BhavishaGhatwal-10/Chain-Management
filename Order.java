public class Order {

    private int orderId;
    private Product product;
    private int quantity;

    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public void processOrder(Warehouse warehouse) {

        Product p = warehouse.getProduct(product.getId());

        if(p != null && p.getQuantity() >= quantity) {
            p.setQuantity(p.getQuantity() - quantity);
            System.out.println("Order processed successfully");
        } else {
            System.out.println("Insufficient stock");
        }
    }
}