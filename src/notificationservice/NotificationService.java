package notificationservice;

public class NotificationService {
    public static NotificationFactory getFactory(String type) {
        NotificationFactory factory = null;
        switch (type) {
            case "SMS":
                factory = new SMSNotificationFactory();
                break;
            case "Email":
                factory = new EmailNotificationFactory();
                break;
            case "Push":
                factory = new PushNotificationFactory();
                break;
            case "Buzzer":
                factory = new BuzzerNotificationFactory();
                break;
        }
        return factory;
    }

    public static void main(String[] args) {
        String notificationType = "Buzzer";
        NotificationFactory factory = getFactory(notificationType);
        if (factory != null) {
            Notification notification = factory.createNotification();
            notification.notifyUser();
        } else {
            System.out.println("Invalid notification type.");
        }
    }
}
