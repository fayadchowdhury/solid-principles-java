package ocp;

public class EmailNotificationService implements NotificationInterface{

    @Override
    public void sendNewDeals()
    {
        // Email client logic
        System.out.println("There is a new deal outlined in this email");
    }

    @Override
    public void sendRestock(String item)
    {
        // Email client logic
        System.out.println("We are sending this email to inform you that " + item + " is in stock!");
    }
}
