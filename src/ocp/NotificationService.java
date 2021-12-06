package ocp;

public class NotificationService {

    public void sendNewDeals()
    {
        // Email client logic
        System.out.println("There is a new deal outlined in this email");
    }

    public void sendRestock(String item)
    {
        // Email client logic
        System.out.println("We are sending this email to inform you that " + item + " is in stock!");
    }

    // Would require duplicated functions within the same class
    // to implement similar functions for other media (SMS, WhatsApp etc.)
}
