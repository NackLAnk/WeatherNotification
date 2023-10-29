public class SMSNotification implements WeatherNotification {
    @Override
    public void sendNotification() {
        System.out.println("Sent to me weather update by SMS");
    }
}
