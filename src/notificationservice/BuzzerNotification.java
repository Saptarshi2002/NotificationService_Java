package notificationservice;

public class BuzzerNotification extends Notification {
    @Override
    public void notifyUser() {
        System.out.println("I am in BuzzerNotification: Notifying user via Buzzer sound.");
    }
}
