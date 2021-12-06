package srp;

public class OrderService {

    // Could have other relevant order-based functionality (creating, updating, deleting orders etc.)
    public void fetchOrders(String customerId)
    {
        System.out.println("Fetching orders for customer " + customerId);
        // Other relevant logic to fetch order data
        // Could change with the introduction of new ORM adoption or new databases etc.
        System.out.println("Successfully fetched orders!");
    }
}
