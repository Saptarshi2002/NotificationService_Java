package notificationservice;

public class PushNotification extends Notification {
    @Override
    public void notifyUser() {
        System.out.println("I am in PushNotification: Notifying user via Push Notification.");
    }
}
