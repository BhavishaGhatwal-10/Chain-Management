public class Shipment {

    private int shipmentId;
    private String destination;

    public Shipment(int shipmentId, String destination) {
        this.shipmentId = shipmentId;
        this.destination = destination;
    }

    public void shipOrder() {
        System.out.println("Shipment ID: " + shipmentId + " shipped to " + destination);
    }
}