package ocp;

public class WhatsAppNotificationService implements NotificationInterface{

    @Override
    public void sendNewDeals()
    {
        // WhatsApp client logic
        System.out.println("There is a new deal outlined in this WhatsApp text");
    }

    @Override
    public void sendRestock(String item)
    {
        // WhatsApp client logic
        System.out.println("We are sending this WhatsApp text to inform you that " + item + " is in stock!");
    }
}
