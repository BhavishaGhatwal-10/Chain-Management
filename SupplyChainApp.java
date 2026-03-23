public class SupplyChainApp {

    public static void main(String[] args) {

        Supplier supplier = new Supplier("ABC Supplier");

        Product p1 = new Product(1, "Laptop", 50);
        Product p2 = new Product(2, "Phone", 100);

        supplier.addProduct(p1);
        supplier.addProduct(p2);

        Warehouse warehouse = new Warehouse();

        warehouse.addProduct(p1);
        warehouse.addProduct(p2);

        System.out.println("Warehouse Inventory:");
        warehouse.displayInventory();

        Order order = new Order(101, p1, 5);
        order.processOrder(warehouse);

        Shipment shipment = new Shipment(5001, "Mumbai");
        shipment.shipOrder();

        System.out.println("\nInventory After Order:");
        warehouse.displayInventory();
    }
}