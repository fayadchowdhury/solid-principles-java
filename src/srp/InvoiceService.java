package srp;

public class InvoiceService {

    public void connectToDatabase()
    {
        System.out.println("Connecting to database");
        // Other relevant logic
        // Highly likely to be specific to each kind of database used
        System.out.println("Successfully connected!");
    }

    public void fetchOrders(String customerId)
    {
        System.out.println("Fetching orders for customer " + customerId);
        // Other relevant logic to fetch order data
        // Could change with the introduction of new ORM adoption or new databases etc.
        System.out.println("Successfully fetched orders!");
    }

    public void generateInvoice()
    {
        System.out.println("Generating invoice");
        // Other relevant logic
        // Could change with changes in I/O operations, invoice structure etc.
        System.out.println("Printed invoice to file!");
    }
}
