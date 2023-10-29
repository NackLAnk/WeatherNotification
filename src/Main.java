public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display = new WeatherDisplay();
        weatherStation.registerObserver(display);

        weatherStation.setTemperature(22.2);

        EmailNotificationFactory emailFactory = new EmailNotificationFactory();
        WeatherNotification emailNotification = emailFactory.createNotification();
        emailNotification.sendNotification();

        SMSNotificationFactory smsFactory = new SMSNotificationFactory();
        WeatherNotification smsNotification = smsFactory.createNotification();
        smsNotification.sendNotification();
    }
}