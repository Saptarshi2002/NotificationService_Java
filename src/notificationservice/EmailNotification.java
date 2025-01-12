package notificationservice;

public class EmailNotification extends Notification {
    @Override
    public void notifyUser() {
        System.out.println("I am in EmailNotification: Notifying user via Email.");
    }
}
