package notificationservice;

public class SMSNotification extends Notification {
    @Override
    public void notifyUser() {
        System.out.println("I am in SMSNotification: Notifying user via SMS.");
    }
}
