package notificationservice;

public class BuzzerNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new BuzzerNotification();
    }
}
