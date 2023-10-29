public class EmailNotification implements WeatherNotification {
    @Override
    public void sendNotification() {
        System.out.println("Sent to me weather update by Email");
    }
}
