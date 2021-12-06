package ocp;

public class SMSNotificationService implements NotificationInterface{
    @Override
    public void sendNewDeals()
    {
        // SMS client logic
        System.out.println("There is a new deal outlined in this SMS");
    }

    @Override
    public void sendRestock(String item)
    {
        // SMS client logic
        System.out.println("We are sending this SMS to inform you that " + item + " is in stock!");
    }
}
